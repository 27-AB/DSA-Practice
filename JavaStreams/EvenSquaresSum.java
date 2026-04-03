import java.util.*;

public class EvenSquaresSum {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)     // keep even numbers
                .map(n -> n * n)             // square each number
                .reduce(0, Integer::sum);   // sum all values

        System.out.println(result);
    }
}