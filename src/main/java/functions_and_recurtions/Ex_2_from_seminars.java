package functions_and_recurtions;

public class Ex_2_from_seminars {
    public static void main (String[] args) {
        findPath("Left", 0);

    }
    public static void findPath (String path, int count) {
        if (count == 5) return;
        System.out.println("сходил " + path);
        findPath("Left", count+1);
        findPath("Right", count+1);
    }
}
