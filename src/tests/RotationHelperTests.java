package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helperClasses.RotationHelper;
import states.DirectionState;
import states.DrinkLayoutState;

public class RotationHelperTests {
	
	@Test
	public void moveForwardFromStateStart() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.START, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER1, state);
    }
	
	@Test
	public void moveForwardFromStateContainer1() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER1, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER2, state);
    }
	
	@Test
	public void moveForwardFromStateContainer2() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER2, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER3, state);
    }
	
	@Test
	public void moveForwardFromStateContainer3() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER3, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER4, state);
    }
	
	@Test
	public void moveForwardFromStateContainer4() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER4, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER5, state);
    }
	
	@Test
	public void moveForwardFromStateContainer5() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER5, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER6, state);
    }
	
	@Test
	public void moveForwardFromStateContainer6() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER6, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER7, state);
    }
	
	@Test
	public void moveForwardFromStateContainer7() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER7, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER8, state);
    }
	
	@Test
	public void moveForwardFromStateContainer8() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER8, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER9, state);
    }
	
	@Test
	public void moveForwardFromStateContainer9() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER9, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.CONTAINER10, state);
    }
	
	@Test
	public void moveForwardFromStateContainer10() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER10, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.COOLING, state);
    }
	
	@Test
	public void moveForwardFromStateCooling() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.COOLING, DirectionState.FORWARD);
	    assertEquals(DrinkLayoutState.COOLING, state);
    }
	
	@Test
	public void moveBackwardsFromStateStart() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.START, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.START, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer1() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER1, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.START, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer2() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER2, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER1, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer3() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER3, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER2, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer4() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER4, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER3, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer5() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER5, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER4, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer6() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER6, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER5, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer7() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER7, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER6, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer8() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER8, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER7, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer9() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER9, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER8, state);
    }
	
	@Test
	public void moveBackwardFromStateContainer10() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.CONTAINER10, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER9, state);
    }
	
	@Test
	public void moveBackwardFromStateCooling() {
		DrinkLayoutState state = RotationHelper.moveInDirection(DrinkLayoutState.COOLING, DirectionState.BACKWARD);
	    assertEquals(DrinkLayoutState.CONTAINER10, state);
    }
	
	@Test
	public void testMoveBackToStart() {
		DrinkLayoutState state = RotationHelper.returnToStart(DrinkLayoutState.START);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER1);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER2);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER3);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER4);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER5);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER6);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER7);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER8);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER9);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.CONTAINER10);
	    assertEquals(DrinkLayoutState.START, state);
	    
	    state = RotationHelper.returnToStart(DrinkLayoutState.COOLING);
	    assertEquals(DrinkLayoutState.START, state);
    }
}
