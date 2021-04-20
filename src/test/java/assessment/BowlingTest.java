package assessment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingTest {

	Bowling bowlingGame;
	@Before
	public void setup()
	{
		bowlingGame=new Bowling();
	}
	@Test
	public void testBowling() {
		
		bowlingGame.roll(1);
		bowlingGame.roll(2);
		
		bowlingGame.roll(7);
		bowlingGame.roll(1);
		
		bowlingGame.roll(4);
		bowlingGame.roll(3);
		
		bowlingGame.roll(5);
		bowlingGame.roll(2);
		
		bowlingGame.roll(6);
		bowlingGame.roll(1);
		
		bowlingGame.roll(2);
		bowlingGame.roll(6);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		System.out.println(bowlingGame.score());
		assertEquals(48, bowlingGame.score());
	}
	

	@Test
	public void testStrikes() {
		
		bowlingGame.roll(10);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(10);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		System.out.println(bowlingGame.score());
		assertEquals(42, bowlingGame.score());
	}

	@Test
	public void testSpare() {
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(5);
		bowlingGame.roll(5);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(1);
		bowlingGame.roll(1);
		
		bowlingGame.roll(5);
		bowlingGame.roll(5);
		
		bowlingGame.roll(1);
		
		System.out.println(bowlingGame.score());
		assertEquals(39, bowlingGame.score());
	}
	
	@Test
	public void testAllSpares() {
		
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		System.out.println(bowlingGame.score());
		assertEquals(122, bowlingGame.score());
	}

}
