package com.chainsys.bestpractice.abstractdemo;

public class ScoreBoard {
	public int TargetScore =215;
	private ScoreBoard() {
		System.out.println("object created for ScoreBoard");
	}
	public static ScoreBoard createObject() {
		return new ScoreBoard();
	}
}
