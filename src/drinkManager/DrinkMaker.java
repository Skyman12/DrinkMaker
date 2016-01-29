package drinkManager;
import java.util.ArrayList;

import drinkTypes.Drink;
import drinkTypes.EmptyDrink;
import helperClasses.PourHelper;
import helperClasses.RotationHelper;
import states.DirectionState;
import states.DrinkLayoutState;

public class DrinkMaker {
	
	ArrayList<DrinkContainer> drinkLayout;
	DrinkLayoutState currentDrinkState;
	
	public DrinkMaker (int numberOfContainers) {
		buildDefaultDrinkContainers(numberOfContainers);
		currentDrinkState = DrinkLayoutState.START;
	}
	
	public void buildDefaultDrinkContainers(int numberOfContainers) {
		drinkLayout = new ArrayList<DrinkContainer>();
		
		for (int i = 0; i < numberOfContainers; i++) {
			drinkLayout.add(new DrinkContainer(new EmptyDrink(i), new DrinkAmount(0.0, Unit.LITER)));
		}
	}
	
	public void buildDrink(DrinkRecipe recipe) {
		currentDrinkState = RotationHelper.returnToStart(currentDrinkState);
		fillDrink(recipe);
		mixDrink();
		currentDrinkState = RotationHelper.returnToStart(currentDrinkState);
	}

	private void fillDrink (DrinkRecipe recipe) {
		int container = 1;
		
		//visit all of the containers
		for (DrinkLayoutState state : DrinkLayoutState.values()) {
			
			// If our state is a drink container
			if (state != DrinkLayoutState.START && state != DrinkLayoutState.COOLING) {
			
				// Move to the drink state and update the current drinkState
				currentDrinkState = RotationHelper.moveInDirection(state, DirectionState.FORWARD);
				
				// If the recipe contains this drink
				Drink drinkToPour = drinkLayout.get(container).getDrink();
				if (recipe.getIngredients().containsKey(drinkToPour)) {
					// The state we are at, with the recipes amount for that drink
					PourHelper.pourDrink(currentDrinkState, recipe.getIngredients().get(drinkToPour));
				}
				
				container++;
			} else {
				// Otherwise, just move to the next state and update.
				currentDrinkState = RotationHelper.moveInDirection(state, DirectionState.FORWARD);
			}
		}
	}
	
	private void mixDrink() {
		// TODO Tell the PI to mix

	}

	public void loadDrinkContainer(DrinkContainer drinkToLoad, int containerNumber) {
		drinkLayout.set(containerNumber - 1, drinkToLoad);
	}

	public void refillDrinkContainer(int containerNumber) {
		drinkLayout.get(containerNumber - 1).setCurrentAmount(drinkLayout.get(containerNumber - 1).getSize());
	}
	
	public boolean containsDrink(Drink drink) {
		for (DrinkContainer dc : drinkLayout) {
			if (drink.equals(dc.getDrink())) {
				return true;
			}
		}
		return false;
	}

	public boolean hasRequiredAmount(Drink d, Double amount) {
		//TODO need scaling
		return true;
	}

}
