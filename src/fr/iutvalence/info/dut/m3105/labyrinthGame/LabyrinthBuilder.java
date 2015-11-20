package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;

public class LabyrinthBuilder
{
	private int width;
	
	private int height;
	
	private Position exitPosition;
	
	private HashSet<Position> forbiddenCellPositions;
	
	public LabyrinthBuilder setWidth(int width)
	{
		this.width = width;
		return this;
	}
	
	public LabyrinthBuilder setHeight(int height)
	{
		this.height = height;
		return this;
	}
	
	public LabyrinthBuilder setExitPodition(Position exitPosition)
	{
		this.exitPosition = exitPosition;
		return this;
	}
	
	// Optional
	public LabyrinthBuilder addForbiddenCellPosition(Position forbiddenPosition)
	{
		this.forbiddenCellPositions.add(forbiddenPosition);
		return this;
	}

	public Labyrinth getLabyrinth()
	{
		return new Labyrinth(width, height, forbiddenCellPositions, exitPosition);
	}
	
	
}
