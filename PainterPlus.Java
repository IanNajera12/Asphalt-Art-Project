import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // creates a turn right method
 public void turnRight( ) {
      turnLeft();
      turnLeft();
      turnLeft();
}
// takes all paint when on a bucket
public void takeAllPaint() {
    while (isOnBucket()) {
        takePaint();
    }
}
  // moves as long as nothing obstructs the path
public void moveFast() {
    while (canMove()) {
move();
    }
}
  //uses all the paint in the bucket
public void paintToEmpty(){
while(hasPaint()){
paint("white");
move();
}
}
}