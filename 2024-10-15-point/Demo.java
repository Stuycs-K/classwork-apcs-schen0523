public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double xDiff = a.getX() - b.getX();
    double yDiff = a.getY() - b.getY();
    return Math.sqrt((xDiff * xDiff) + (yDiff*yDiff)) ;
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p1);
    System.out.println(p1);
    System.out.println(p4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( distance(p3,p2));
    System.out.println( Point.distance(p3,p2));
    System.out.println( p3.distanceTo(p2));

    //equilateral triangle
    Point t1 = new Point (0,0);
    Point t2 = new Point (1,0);
    Point t3 = new Point (0.5 , Math.sqrt(3) / 2);
    System.out.println( t1.distanceTo(t2));
    System.out.println( t1.distanceTo(t3));
    System.out.println( t2.distanceTo(t3));
  }
}
