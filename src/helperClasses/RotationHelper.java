package helperClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import states.DirectionState;
import states.DrinkLayoutState;

public class RotationHelper {
	
	public static DrinkLayoutState moveInDirection(DrinkLayoutState stateAt, DirectionState direction) {
		
		if (direction == DirectionState.FORWARD) {
			switch (stateAt) {
				case START:
					//rotate motor to get to container 1;
					return DrinkLayoutState.CONTAINER1;
				case CONTAINER1:
					//rotate motor to get to container 2;
					return DrinkLayoutState.CONTAINER2;
				case CONTAINER2:
					//rotate motor to get to container 3;
					return DrinkLayoutState.CONTAINER3;
				case CONTAINER3:
					//rotate motor to get to container 4;
					return DrinkLayoutState.CONTAINER4;
				case CONTAINER4:
					//rotate motor to get to container 5;
					return DrinkLayoutState.CONTAINER5;
				case CONTAINER5:
					//rotate motor to get to container 6;
					return DrinkLayoutState.CONTAINER6;
				case CONTAINER6:
					//rotate motor to get to container 7;
					return DrinkLayoutState.CONTAINER7;
				case CONTAINER7:
					//rotate motor to get to container 8;
					return DrinkLayoutState.CONTAINER8;
				case CONTAINER8:
					//rotate motor to get to container 9;
					return DrinkLayoutState.CONTAINER9;
				case CONTAINER9:
					//rotate motor to get to container 10;
					return DrinkLayoutState.CONTAINER10;
				case CONTAINER10:
					//rotate motor to get to Cooling;
					return DrinkLayoutState.COOLING;
				case COOLING:
					// Do nothing
					return DrinkLayoutState.COOLING;
			} 
		} else {
			switch (stateAt) {
				case START:
					// Do nothing
					return DrinkLayoutState.START;
				case CONTAINER1:
					//rotate motor to get to Start;
					return DrinkLayoutState.START;
				case CONTAINER2:
					//rotate motor to get to container 1;
					return DrinkLayoutState.CONTAINER1;
				case CONTAINER3:
					//rotate motor to get to container 2;
					return DrinkLayoutState.CONTAINER2;
				case CONTAINER4:
					//rotate motor to get to container 3;
					return DrinkLayoutState.CONTAINER3;
				case CONTAINER5:
					//rotate motor to get to container 4;
					return DrinkLayoutState.CONTAINER4;
				case CONTAINER6:
					//rotate motor to get to container 5;
					return DrinkLayoutState.CONTAINER5;
				case CONTAINER7:
					//rotate motor to get to container 6;
					return DrinkLayoutState.CONTAINER6;
				case CONTAINER8:
					//rotate motor to get to container 7;
					return DrinkLayoutState.CONTAINER7;
				case CONTAINER9:
					//rotate motor to get to container 8;
					return DrinkLayoutState.CONTAINER8;
				case CONTAINER10:
					//rotate motor to get to container 9;
					return DrinkLayoutState.CONTAINER9;
				case COOLING:
					//rotate motor to get to container 10;
					return DrinkLayoutState.CONTAINER10;
				
			}		
		}
		return stateAt;
	}
	
	public static DrinkLayoutState returnToStart(DrinkLayoutState currentDrinkState) {
		ArrayList<DrinkLayoutState> stateList = new ArrayList<DrinkLayoutState>(Arrays.asList(DrinkLayoutState.values()));
		Collections.reverse(stateList);
		
		int index = 0;
		for (DrinkLayoutState state : stateList) {
			if (currentDrinkState == state) {
				break;
			} else {
				index++;
			}
		}
		
		List<DrinkLayoutState> subList = stateList.subList(index, stateList.size() - 1);
		
		DrinkLayoutState finalState = DrinkLayoutState.START;
		
		for (DrinkLayoutState state : subList) {
			finalState = RotationHelper.moveInDirection(state, DirectionState.BACKWARD);
		}
		
		return finalState;
	}
	
}
