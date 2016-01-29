package drinkManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import defaultConfiguration.DefaultDrinkInitializer;
import drinkTypes.Drink;
import drinkTypes.EmptyDrink;

public class DrinkManager {
	DrinkMaker drinkMaker;
	
	Map<String, DrinkRecipe> recipeMap;
	Map<String, Drink> drinkMap;
	
	int userID;
	
	public DrinkManager(int userID) {
		this.drinkMaker = new DrinkMaker(10);
		this.userID = userID;
		loadDrinksForTesting();
		loadRecipesForTesting();
		loadContainersForTesting();
//		displayRecipeMap();
//		System.out.println("Avaliable Drinks");
//		displayAvaliableDrinks();
	}
	
	private void loadDrinksForTesting() {
		drinkMap = DefaultDrinkInitializer.buildDefaultDrinks();
	}
	
	private void loadRecipesForTesting() {
		recipeMap = DefaultDrinkInitializer.buildDefaultRecipes(drinkMap);
	}
	
	private void loadContainersForTesting() {
		DefaultDrinkInitializer.buildDefaultContainers(drinkMap, drinkMaker);
	}
	
	// for internal testing only
	private void displayRecipeMap() {
		for (DrinkRecipe dr : recipeMap.values()) {
			System.out.println(dr.toString());
		}
	}
	
	// for internal testing only
	private void displayAvaliableDrinks() {
		for (DrinkRecipe dr : getAvaliableDrinks().values()) {
			System.out.println(dr.toString());
		}
	}
	
	public Map<String, DrinkRecipe> getAvaliableDrinks() {
		Map<String, DrinkRecipe> newMap = new HashMap<String, DrinkRecipe>();
		
		boolean drinkAbleToBeMade = true;
		
		for (String s : recipeMap.keySet()) {
			for (Drink d : recipeMap.get(s).getIngredients().keySet()) {
				if (!drinkMaker.containsDrink(d) && 
						drinkMaker.hasRequiredAmount(d, recipeMap.get(s).getIngredients().get(d).getStandardAmount())) {
					drinkAbleToBeMade = false;
					break;
				}
			}
			if (drinkAbleToBeMade) {
				newMap.put(s, recipeMap.get(s));
			} 
			drinkAbleToBeMade = true;
		}
		
		// Add the custom option 
		newMap.putAll(addCustomOption());
		return newMap;
	}
	
	public Map<String, DrinkRecipe> addCustomOption() {
		Map<String, DrinkRecipe> customOption = new HashMap<>();
		
		String drinkName = "Custom Drink";
		Map<Drink, DrinkAmount> ingredientMap = new HashMap<Drink, DrinkAmount>();
		for (DrinkContainer d : drinkMaker.drinkLayout) {
			if (d.getDrink().getClass() != EmptyDrink.class) {
				ingredientMap.put(d.getDrink(), new DrinkAmount(0.0, Unit.LITER));
			}
		}
		
		customOption.put(drinkName, new DrinkRecipe(drinkName, ingredientMap));
		
		return customOption;
	}
	
	public void insertNewDrinkContainer(DrinkContainer drinkToLoad, int containerNumber) {
		drinkMaker.loadDrinkContainer(drinkToLoad, containerNumber);
	}
	
	public void refillDrinkContainer(int containerNumber) {
		drinkMaker.refillDrinkContainer(containerNumber);
	}
	
	public ArrayList<DrinkContainer> getContainerLayout () {
		return drinkMaker.drinkLayout;
	}
	
	public Map<String, Drink> getDrinkMap() {
		return drinkMap;
	}

}
