package com.yaksh.chandrayaan3TDD;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;

public class GalacticSpaceCraftControllerTest {

	GalacticSpaceCraftController spacecraft;

	@After
	public void destroy() {
		spacecraft = null;
	}

	// Move Forward Test Cases

	@Test
	public void testMoveForwardWithInitDirectionD() {
		spacecraft = new GalacticSpaceCraftController(0, 0, -1, "D");
		assertEquals("(0,0,-2)-D", spacecraft.executeCommands("f"));
	}

	@Test
	public void testMoveForwardWitInitDirectionS() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 0, "S");
		assertEquals("(0,-1,0)-S", spacecraft.executeCommands("f"));
	}

	@Test
	public void testMoveForwardWithInitDirectionE() {
		spacecraft = new GalacticSpaceCraftController(0, 2, 0, "E");
		assertEquals("(1,2,0)-E", spacecraft.executeCommands("f"));
	}

	@Test
	public void testMoveForwardWithInitDirectionW() {
		spacecraft = new GalacticSpaceCraftController(0, 9, 0, "W");
		assertEquals("(-1,9,0)-W", spacecraft.executeCommands("f"));
	}

	@Test
	public void testMoveForwardWithInitDirectionN() {
		spacecraft = new GalacticSpaceCraftController(0, -1, 0, "N");
		assertEquals("(0,0,0)-N", spacecraft.executeCommands("f"));
	}

	@Test
	public void testMoveForwardWithInitDirectionU() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 0, "U");
		assertEquals("(0,0,1)-U", spacecraft.executeCommands("f"));
	}

	// Move Backward Test Cases

	@Test
	public void testMoveBackwardWithInitDirectionD() {
		spacecraft = new GalacticSpaceCraftController(3, 8, 0, "D");
		assertEquals("(3,8,1)-D", spacecraft.executeCommands("b"));
	}

	@Test
	public void testMoveBackwardWithInitDirectionS() {
		spacecraft = new GalacticSpaceCraftController(9, -1, 0, "S");
		assertEquals("(9,0,0)-S", spacecraft.executeCommands("b"));
	}

	@Test
	public void testMoveBackwardWitInitDirectionE() {
		spacecraft = new GalacticSpaceCraftController(1, -1, 0, "E");
		assertEquals("(0,-1,0)-E", spacecraft.executeCommands("b"));
	}

	@Test
	public void testMoveBackwardWithInitDirectionN() {
		spacecraft = new GalacticSpaceCraftController(0, -1, 0, "N");
		assertEquals("(0,-2,0)-N", spacecraft.executeCommands("b"));
	}

	@Test
	public void testMoveBackwardWitInitDirectionW() {
		spacecraft = new GalacticSpaceCraftController(1, -1, 0, "W");
		assertEquals("(2,-1,0)-W", spacecraft.executeCommands("b"));
	}

	@Test
	public void testMoveBackwardWithInitDirectionU() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 0, "U");
		assertEquals("(0,0,-1)-U", spacecraft.executeCommands("b"));
	}

	// Turning Left Test Cases

	@Test
	public void testTurningLeftWithInitDirectionE() {
		spacecraft = new GalacticSpaceCraftController(10, -9, 1, "E");
		assertEquals("(10,-9,1)-N", spacecraft.executeCommands("l"));
	}

	@Test
	public void testTurningLeftWithInitDirectionS() {
		spacecraft = new GalacticSpaceCraftController(4, -1, 0, "S");
		assertEquals("(4,-1,0)-E", spacecraft.executeCommands("l"));
	}

	@Test
	public void testTurningLeftWithInitDirectionW() {
		spacecraft = new GalacticSpaceCraftController(0, -1, 5, "W");
		assertEquals("(0,-1,5)-S", spacecraft.executeCommands("l"));
	}

	@Test
	public void testTurningLeftWithInitDirectionN() {
		spacecraft = new GalacticSpaceCraftController(0, 9, 10, "N");
		assertEquals("(0,9,10)-W", spacecraft.executeCommands("l"));
	}

	@Test
	public void testTurningLeftWithInitDirectionD() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 0, "D");
		assertEquals("(0,0,0)-S", spacecraft.executeCommands("l"));
	}

	@Test
	public void testTurningLeftWithInitDirectionU() {
		spacecraft = new GalacticSpaceCraftController(10, 0, 7, "U");
		assertEquals("(10,0,7)-N", spacecraft.executeCommands("l"));
	}

	// Turning Right Test Cases

	@Test
	public void testTurningRightWithInitDirectionD() {
		spacecraft = new GalacticSpaceCraftController(9, 8, 4, "D");
		assertEquals("(9,8,4)-N", spacecraft.executeCommands("r"));
	}

	@Test
	public void testTurningRightWithInitDirectionS() {
		spacecraft = new GalacticSpaceCraftController(9, -10, 0, "S");
		assertEquals("(9,-10,0)-W", spacecraft.executeCommands("r"));
	}

	@Test
	public void testTurningRightWithInitDirectionE() {
		spacecraft = new GalacticSpaceCraftController(4, -5, 0, "E");
		assertEquals("(4,-5,0)-S", spacecraft.executeCommands("r"));
	}

	@Test
	public void testTurningRightWithInitDirectionN() {
		spacecraft = new GalacticSpaceCraftController(0, -1, 0, "N");
		assertEquals("(0,-1,0)-E", spacecraft.executeCommands("r"));
	}

	@Test
	public void testTurningRightWithInitDirectionW() {
		spacecraft = new GalacticSpaceCraftController(0, -1, 0, "W");
		assertEquals("(0,-1,0)-N", spacecraft.executeCommands("r"));
	}

	@Test
	public void testTurningRightWithInitDirectionU() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 0, "U");
		assertEquals("(0,0,0)-S", spacecraft.executeCommands("r"));
	}

//	Turning Down Test Cases

	@Test
	public void testTurningDownWithInitDirectionS() {
		spacecraft = new GalacticSpaceCraftController(3, -1, 7, "S");
		assertEquals("(3,-1,7)-D", spacecraft.executeCommands("d"));
	}

	@Test
	public void testTurningDownWithInitDirectionE() {
		spacecraft = new GalacticSpaceCraftController(0, -1, 0, "E");
		assertEquals("(0,-1,0)-D", spacecraft.executeCommands("d"));
	}

	@Test
	public void testTurningDownWithInitDirectionN() {
		spacecraft = new GalacticSpaceCraftController(19, -10, 0, "N");
		assertEquals("(19,-10,0)-D", spacecraft.executeCommands("d"));
	}

	@Test
	public void testTurningDownWithInitDirectionW() {
		spacecraft = new GalacticSpaceCraftController(3, -3, 3, "W");
		assertEquals("(3,-3,3)-D", spacecraft.executeCommands("d"));
	}

	@Test
	public void testTurningDownWithInitDirectionU() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 7, "U");
		assertEquals("(0,0,7)-D", spacecraft.executeCommands("d"));
	}

	@Test
	public void testTurningDownWithInitDirectionD() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 0, "D");
		assertEquals("(0,0,0)-D", spacecraft.executeCommands("d"));
	}

//	Turning Up Test Cases

	@Test
	public void testTurningUpWithInitDirectionS() {
		spacecraft = new GalacticSpaceCraftController(0, -1, 0, "S");
		assertEquals("(0,-1,0)-U", spacecraft.executeCommands("u"));
	}

	@Test
	public void testTurningUpWithInitDirectionE() {
		spacecraft = new GalacticSpaceCraftController(18, -10, 0, "E");
		assertEquals("(18,-10,0)-U", spacecraft.executeCommands("u"));
	}

	@Test
	public void testTurningUpWithInitDirectionN() {
		spacecraft = new GalacticSpaceCraftController(3, -3, 3, "N");
		assertEquals("(3,-3,3)-U", spacecraft.executeCommands("u"));
	}

	@Test
	public void testTurningUpWithInitDirectionW() {
		spacecraft = new GalacticSpaceCraftController(0, -1, 0, "W");
		assertEquals("(0,-1,0)-U", spacecraft.executeCommands("u"));
	}

	@Test
	public void testTurningUpWithInitDirectionU() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 7, "U");
		assertEquals("(0,0,7)-U", spacecraft.executeCommands("u"));
	}

	@Test
	public void testTurningUpWithInitDirectionD() {
		spacecraft = new GalacticSpaceCraftController(0, 0, 0, "D");
		assertEquals("(0,0,0)-U", spacecraft.executeCommands("u"));
	}
	
	
//	Complex Test Cases
	
//	Initial Position-(0,0,0)-N Final-(0,1,-1)-N command-"frubl"
	@Test
    public void complexTestCase1() {
        spacecraft = new GalacticSpaceCraftController(0,0,0,"N");
        assertEquals("(0,1,-1)-N", spacecraft.executeCommands("frubl"));
	}
	
//	Initial Position-(0,0,0)-N Final-(0,2,-2)-U,command="ffrubb"
	@Test
    public void complexTestCase2() {
        spacecraft = new GalacticSpaceCraftController(0,0,0,"N");
        assertEquals("(0,2,-2)-U", spacecraft.executeCommands("ffrubb"));
	}

}
