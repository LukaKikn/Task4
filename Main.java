package ge.ufc.homework4;

public class Main {

    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle(21);
//        Rectangle r2 = new Rectangle(12,6);
//        Rectangle r3 = new Rectangle();

        Rectangle r1 = new Rectangle(10,10);
        Rectangle r2 = new Rectangle(11,10);
        Rectangle r3 = new Rectangle(12,10);
        Rectangle r4 = new Rectangle(13,10);




        Rectangle[] arr = {r1,r2,r3,r4};

        System.out.println(Rectangle.maxArea(arr));

    }
}
