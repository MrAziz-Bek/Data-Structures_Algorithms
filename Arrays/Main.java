import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Array numbers = new Array(3);
        // numbers.insert(10);
        // numbers.insert(20);
        // numbers.insert(30);
        // numbers.insert(40);
        // numbers.insert(50);
        // numbers.removeAt(0);
        // System.out.println(numbers.indexOf(40));
        // numbers.print();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.remove(0);
        System.out.println(numbers);
    }
}