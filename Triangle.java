public class Triangle{

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    double side1 = v1.distanceTo(v2);
    double side2 = v2.distanceTo(v3);
    double side3 = v3.distanceTo(v1);

    return side1 + side2 + side3;
  }

  public double getArea(){
    double semiPerimeter = getPerimeter()/2;
    double side1 = v1.distanceTo(v2);
    double side2 = v2.distanceTo(v3);
    double side3 = v3.distanceTo(v1);

    return (Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3)));
  }

  public String classify(){
    double side1 = Math.round(v1.distanceTo(v2) * Math.pow(10, 4))/Math.pow(10, 4);
    double side2 = Math.round(v2.distanceTo(v3) * Math.pow(10, 4))/Math.pow(10, 4);
    double side3 = Math.round(v3.distanceTo(v1) * Math.pow(10, 4))/Math.pow(10, 4);

    if (side1 == side2 && side2 == side3){
      return "equilateral";
    }
    else{
      if (side1 == side2 || side1 == side3 || side2 == side3){
        return "isosceles";
      }
    }
    return "scalene";
  }

}
