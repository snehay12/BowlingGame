package assessment.interfaces;

/*
 * Bowling Interface defines the basic functionality roll() and score() methods.
 * Any Bowling Game should implement this interface.
 */
public interface BowlingInterface {
	
	static int FRAME_NUMBER = 10;

	void roll(int numOfPinsDown);
	
	int score();
}
