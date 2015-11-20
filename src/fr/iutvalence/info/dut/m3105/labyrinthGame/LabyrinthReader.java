package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;

public class LabyrinthReader
{

	public static Labyrinth readLabyrinth(Reader reader)
	{
		int height;
		int width;
		HashSet<Position> forbiddenCellPositions;
		String line = null;
		BufferedReader bufferedReader = new BufferedReader(reader);
		try
		{
			line = bufferedReader.readLine();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		width = line.length()-1;
		
		while(line != null)
		{
		}
		return null;
	}
}
