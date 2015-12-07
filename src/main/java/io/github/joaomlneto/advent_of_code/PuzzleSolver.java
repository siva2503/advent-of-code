package io.github.joaomlneto.advent_of_code;

public abstract class PuzzleSolver {

	public abstract String getFirstAnswer();

	public abstract String getSecondAnswer();

	public abstract String toString();

	public String getName() {
		return getClass().getSimpleName();
	}
}
