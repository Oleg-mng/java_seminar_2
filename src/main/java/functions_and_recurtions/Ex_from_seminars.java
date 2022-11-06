package functions_and_recurtions;

public class Ex_from_seminars {
    public static void main (String[] args) {
        sayHello(0);
        }
    public static void sayHello (int count) {
        if (count == 500) {
            return;
        }
        System.out.printf("Hello" + count + "time");
        System.out.println();
        sayHello(count+1);
    }
}
