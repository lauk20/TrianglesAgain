public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x = X;
    y = Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x = p.x;  //private access in the same file is allowed!
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    double x1 = this.x;
    double y1 = this.y;
    double x2 = other.x;
    double y2 = other.y;

    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

}
