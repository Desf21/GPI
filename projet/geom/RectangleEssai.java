package GPI.projet.geom;

import GPI.projet.geom.Rectangle;
import GPI.projet.geom.Coordonnees;

public class RectangleEssai {
  public static void main (String[] args){
    Rectangle rect1 = new Rectangle();
    Coordonnees coord = new Coordonnees(2,5);
    Rectangle rect2 = new Rectangle(coord);
    Rectangle rect3 = new Rectangle(3,5);
    Rectangle rect4 = new Rectangle(3,5,coord);
    System.out.println(rect1);
    System.out.println(rect2);
    System.out.println(rect3);
    System.out.println(rect4);

  }
}
