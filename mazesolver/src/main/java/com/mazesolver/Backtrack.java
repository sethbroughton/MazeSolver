package com.mazesolver;

public class Backtrack {
	
	public boolean backtrack(int[][] maze){
		
		for(int row = 0; row<maze.length; row++) {
			for(int col = 0; col<maze.length; col++)
				if(maze[row][col] == 1) {
					if(checkDown(row,col,maze)) {
						if(backtrack(maze)) {
							return true;
						} else {maze[row][col] = 0;}
						}
		}
		}
		return false;
	}
	
	public boolean checkDown(int row, int col, int[][] maze) {
		if(maze[row+1][col] == 1) {
			return true;
			}
		return false;
		}
	
	public boolean checkRight(int row, int col, int[][] maze) {
		if(maze[row][col+1] == 1) {
			return true;
			}
		return false;
		}
	
	public boolean checkLeft(int row, int col, int[][] maze) {
		if(maze[row][col-1] == 1) {
			return true;
			}
		return false;
		}
		
}
