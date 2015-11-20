package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 */
	public static void main(String[] args)
	{
	
		Labyrinth labyrinth = new LabyrinthBuilder()
									.setHeight(4)
									.setWidth(4)
									.setExitPodition(new Position(3,1))
									.addForbiddenCellPosition(new Position(2,0))
									.addForbiddenCellPosition(new Position(3,0))
									.addForbiddenCellPosition(new Position(0,1))
									.addForbiddenCellPosition(new Position(0,2))
									.addForbiddenCellPosition(new Position(1,2))
									.addForbiddenCellPosition(new Position(3,2))
									.addForbiddenCellPosition(new Position(3,3))
									.getLabyrinth();
		
		new LabyrinthGame(labyrinth, new LesserDumbBotArtificialIntelligence()).play();
	}
}
