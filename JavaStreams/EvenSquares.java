import java.util.*;
public class EvenSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenSquares = numbers.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n*n)
        .reduce(0, (a, b) -> a + b)
        
        System.out.println(evenSquares);
    }
}