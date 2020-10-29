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

    System.out.println();

    //classifyJ() TESTS
    Triangle G = new Triangle(0,0,2,0,1,Math.sqrt(3));
    Triangle H = new Triangle(-4,0,4,0,0,4 * Math.sqrt(3));
    Triangle I = new Triangle(0,0,3,Math.sqrt(3),3,-Math.sqrt(3));
    System.out.println(G.classify());
    System.out.println(H.classify());
    System.out.println(I.classify());
    System.out.println();
    Triangle J = new Triangle(2,6,8,2,11,13);
    Triangle K = new Triangle(-2,3,2,-1,-5,-4);
    Triangle L = new Triangle(4,2,8,2,6,7);
    System.out.println(J.classify());
    System.out.println(K.classify());
    System.out.println(L.classify());
    System.out.println();
    Triangle M = new Triangle(0,0,5,0,0,1);
    Triangle N = new Triangle(-5,0,-1,0,-2,5);
    Triangle O = new Triangle(10,5,12,15,3,5);
    System.out.println(M.classify());
    System.out.println(N.classify());
    System.out.println(O.classify());

    System.out.println();

    //toString() TESTS
    System.out.println(G.toString());
    System.out.println(H.toString());
  }
}
