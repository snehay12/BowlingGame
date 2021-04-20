package assessment;

import java.util.ArrayList;
import java.util.List;

import assessment.interfaces.BowlingInterface;
import assessment.model.BowlingFrame;

public class Bowling implements BowlingInterface {

	//Define Dynamic Array of bowling frames
	List<BowlingFrame> frames = new ArrayList<>();

	//Start the game by adding the first frame
	Bowling() {
		frames.add(new BowlingFrame());
	}

	//Roll method which takes number of pins down
	public void roll(int numOfPinsDown) {

		//If the number of pins down is invalid, print error message and return
		System.out.println(" Frame : "+frames.size());
		if(numOfPinsDown>10)
		{
			System.out.println("Invalid Pin number down");
			return;
		}
		//Get the current frame
		BowlingFrame currentFrame = getCurrentFrame();
		//Calculate bonus score with reference to previous frame
		performStrikeOrSpareCalcualtion(numOfPinsDown);
		//Add first roll number
		if (null == currentFrame.getFirstRoll()) {
			System.out.println(" First Roll : "+numOfPinsDown);
			currentFrame.setFirstRoll(numOfPinsDown);
			//If first roll is a strike, move to next frame
			if (currentFrame.isStrike())
				if(!moveToNextFrame())
					System.out.println("Game Over!!!!");
		} 
		//If second roll, set the roll and recalculate frame score 
		else {
			System.out.println(" Second Roll : "+numOfPinsDown);
			currentFrame.setSecondRoll(numOfPinsDown);
			//move to next frame, if the 10th frame is reached and no strike/spare, end the game
			if(!moveToNextFrame())
				System.out.println("Game Over!!!!");
		}
	}
	
	// Score() to return total score
	public int score() {
		Integer totalScore = 0;
		//Iterate through each frame and find the total score using frameScore
		for (int i = 0; i < frames.size(); i++) {
			totalScore += frames.get(i).getFrameScore();
		}
		return totalScore;
	}
	//Method to Calculate bonus score with reference to previous frame
	private void performStrikeOrSpareCalcualtion(int numOfPinsDown) {

		//If there two or more frames
		if (frames.size() > 1) {
			//Find previous frame
			BowlingFrame previousFrame = getPreviousFrame();
			//If previous frame is strike, add both the rolls. No roll check.
			if (previousFrame.isStrike())
				getCurrentFrame().setFrameScore(numOfPinsDown);
			//If its a spare, and its a first roll, recalculate the frameScore
			else if (previousFrame.isSpare() && getCurrentFrame().getFirstRoll() == null)
				getCurrentFrame().setFrameScore(numOfPinsDown);
		}
	}

	//Method to create new frame and add to ArrayList
	private boolean moveToNextFrame() {
		// Check if the max frame size is reached and there is strike or spare, run one more frame extra
		if (frames.size() < FRAME_NUMBER ) {
			frames.add(frames.size(), new BowlingFrame());
			return true;
		}
		else if (frames.size() >= FRAME_NUMBER && (getCurrentFrame().isSpare() || getCurrentFrame().isStrike())) {
			frames.add(frames.size(), new BowlingFrame());
			return true;
		}  
		return false;
	}

	//Method to return the Current Frame
	private BowlingFrame getCurrentFrame() {
		return frames.get(frames.size() - 1);
	}

	//Method to return the Previous Frame
	private BowlingFrame getPreviousFrame() {
		return frames.get(frames.size() - 2);
	}

}
