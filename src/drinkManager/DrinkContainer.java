package drinkManager;
import drinkTypes.Drink;

public class DrinkContainer {
	// The Drink in the container.
	private Drink drink;
	
	// The size of the drink container.
	private DrinkAmount size;
	
	// The current amount of drink in the container.
	private DrinkAmount currentAmount;
	
	public DrinkContainer(Drink drink, DrinkAmount size) {
		this.setDrink(drink);
		this.drink = drink;
		this.size = size;
		this.currentAmount = size.copy();
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public DrinkAmount getSize() {
		return size;
	}
	
	public void setSize(DrinkAmount size) {
		this.size = size;
	}

	public DrinkAmount getCurrentAmount() {
		return currentAmount;
	}
	
	public void setCurrentAmount(DrinkAmount amount) {
		this.currentAmount = amount;
	}
	
	public String toString() {
		return drink.toString() + " - s " + size + " - ca " + currentAmount;
	}
	
	
	
}
