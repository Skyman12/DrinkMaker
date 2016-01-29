package drinkManager;
import java.util.Map;

import drinkTypes.Drink;

public class DrinkRecipe {
	private Map<Drink, DrinkAmount> ingredients;
	
	String drinkName;
	
	public DrinkRecipe(String drinkName, Map<Drink, DrinkAmount> ingredientMap) {
		this.drinkName = drinkName;
		this.ingredients = ingredientMap;
	}

	public Map<Drink, DrinkAmount> getIngredients() {
		return ingredients;
	}
	
	public String toString() {
		String temp = drinkName + "\n";
		temp += "--------\n";
		for (Drink d : ingredients.keySet()) {
			temp += d.toString() + " - " + ingredients.get(d).toString() + "%\n";
		}
		return temp;
	}

}
