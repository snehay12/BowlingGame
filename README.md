# BowlingGame

BowlingInterface : Bowling Interface defines the basic functionality roll() and score() methods. Any Bowling Game should implement this interface.

BowlingFrame: BolwingFrame Class represents a Frame i.e. First Roll, Second Roll and Frame Score. Also has isStrike() and isSpare() methods used to calculate the bonus scores. Framescore is sum of First, Second and Bonus score.

Bowling: Bowling Class is the actual implementation of bowling game.
         roll() : Method used to roll.
                  Validates input.
                  Populates First Roll or Second Roll
                  Calculate bonus and adds to frameScore
              
         score(): Iterate through each frame and find the total score using frameScore
         
         performStrikeOrSpareCalcualtion(): Method to Calculate bonus score with reference to previous frame
         
         moveToNextFrame(): Method to create new frame and add to ArrayList
         
         getCurrentFrame(): Method to return the Current Frame
         
         getPreviousFrame(): Method to return the Previous Frame

#How to Run the Code:

1. Run the Test Cases in BowlingTest.java

2. Run the Game Class main method()
