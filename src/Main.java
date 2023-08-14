import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 100));
        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (Integer numbers2 : numbers) {
            if (numbers2 % 2 == 0) {
                evenNumbers.add(numbers2);
            }
        }
        System.out.println("Чётные числа: " + evenNumbers);
        for (Integer numbers2 : numbers) {
            if (numbers2 % 2 != 0) {
                oddNumbers.add(numbers2);
            }
        }
        System.out.println("Нечётные числа: "+oddNumbers);
    }
}