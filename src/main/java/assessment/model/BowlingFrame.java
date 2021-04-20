package assessment.model;

/*
 * A BolwingFrame represents a Frame : 2 Rolls and Frame Score.
 * Also has isStrike() and isSpare() methods to help calculate the bonus scores
 */
public class BowlingFrame {
	
	private Integer firstRoll;
	private Integer secondRoll;
	private Integer frameScore=0;
	
	public boolean isStrike()
	{
		//If the first roll is equal to 10, its a strik
		if(firstRoll==10)
			return true;
		return false;
	}
	
	public boolean isSpare()
	{
		//If its not a strike and frameScore is equal to 10
		if(!isStrike() && firstRoll+secondRoll==10)
			return true;
		return false;
	}

	public Integer getFirstRoll() {
		return firstRoll;
	}

	public void setFirstRoll(Integer firstRoll) {
		this.firstRoll = firstRoll;
		//Calculate frameScore each time its rolled
		this.frameScore+=firstRoll;
	}

	public Integer getSecondRoll() {
		return secondRoll;
	}

	public void setSecondRoll(Integer secondRoll) {
		this.secondRoll = secondRoll;
		//Calculate frameScore each time its rolled
		this.frameScore+=secondRoll;
	}

	public Integer getFrameScore() {
		return frameScore;
	}
	//Setter method to add bonus scores
	public void setFrameScore(Integer score) {
		 this.frameScore+=score;
	}

}
