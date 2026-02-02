public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
    
        greet();
        int doubled = doubleNumber(5);
        System.out.println("Doubled value: " + doubled);
       
        Book myBook = new Book("SpaceCase");
        System.out.print(myBook);
    }

    public static void greet() {
        System.out.println("Hello from a static void method!");
    }

    public static int doubleNumber(int num) {

        return num * 2;
    }
}