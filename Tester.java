public class Tester{
  public static void main(String[] args){

    //distanceTo() TESTS
    Point A = new Point(0.0, 0.0);
    Point B = new Point(4.0, 3.0);
    System.out.println(A.distanceTo(B));

    System.out.println();

    //equals() TESTS
    Point C = new Point(A);
    System.out.println(A.equals(B)); //FALSE
    System.out.println(C.equals(C)); //TRUE
    System.out.println(A.equals(C)); //TRUE
    System.out.println(C.equals(A)); //TRUE
    System.out.println(B.equals(C)); //FALSE


    //CONSTRUCTOR TESTS
    Point D = new Point(4, 0);
    Triangle E = new Triangle(A, B, D);
    Triangle F = new Triangle(0,0,4,3,4,0);

    System.out.println();

    //getPerimeter() TESTS
    System.out.println(E.getPerimeter());
    System.out.println(F.getPerimeter());

    System.out.println();

    //getArea() TESTS
    System.out.println(E.getArea());
    System.out.println(F.getArea());
  }
}
