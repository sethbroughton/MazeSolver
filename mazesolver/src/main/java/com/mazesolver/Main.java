package com.mazesolver;

public class Main {

	public static void main(String[] args) {
		int[][] maze = new int[][] { 
			{ 1, 1, 0, 0, 0 }, 
			{ 1, 1, 1, 1, 0 }, 
			{ 1, 1, 1, 0, 0 }, 
			{ 1, 1, 1, 0, 1 } };

		Backtrack solver = new Backtrack();
		boolean path = solver.backtrack(maze);
		///printMaze(maze);

	}

	// Print out maze
	public static void printMaze(int[][] path) {
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path.length; j++) {
				System.out.print(path[i][j]);
			}
			System.out.println();
		}

	}

}
