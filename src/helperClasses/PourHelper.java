package helperClasses;

import drinkManager.DrinkAmount;
import states.DrinkLayoutState;

public class PourHelper {
	
	public static void pourDrink(DrinkLayoutState stateAt, DrinkAmount amount) {
		
		switch (stateAt) {
			case CONTAINER1:
				//TODO tell valve one to release for amount
				break;
			case CONTAINER2:
				//TODO tell valve two to release for amount
				break;
			case CONTAINER3:
				//TODO tell valve three to release for amount
				break;
			case CONTAINER4:
				//TODO tell valve four to release for amount
				break;
			case CONTAINER5:
				//TODO tell valve five to release for amount
				break;
			case CONTAINER6:
				//TODO tell valve six to release for amount
				break;
			case CONTAINER7:
				//TODO tell valve seven to release for amount
				break;
			case CONTAINER8:
				//TODO tell valve eight to release for amount
				break;
			case CONTAINER9:
				//TODO tell valve nine to release for amount
				break;
			case CONTAINER10:
				//TODO tell valve ten to release for amount
				break;
			default:
				break;
		}
				
	}
}
