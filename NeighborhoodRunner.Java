import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
/*
Instanstiates the Mural Painter and then calls the method paintBackground in order to paint the 
entirety of the background a beige neutral color
*/
MuralPainter IanBackground= new MuralPainter();
    IanBackground.paintBackground("beige",16);
/*
Creates a BasketballPainter object and calls methods to move the basketball painter to 
its starting position and then paints the basketball
*/
    BasketballPainter Ian = new BasketballPainter();
    Ian.startPosition();
    Ian.paintBasketball("chocolate");
  }
}