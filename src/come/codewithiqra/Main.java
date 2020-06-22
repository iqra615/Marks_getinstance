package come.codewithiqra;

public class Main {

    public static void main(String[] args) {
     Test obj = new Test();
     Test obj1 = new Test();
     obj.roll = 12;
      obj.marks = 100;
      obj1.marks =300;
      obj1.roll = 400;

        System.out.println("Roll = " + obj.roll);
        System.out.println("Marks = " + obj.marks);
        System.out.println("Roll =" + obj1.roll);
        System.out.println("Marks = "+ obj1.marks);

    }
}
class Test {
    int roll = 0;
    int marks = 100;


}
