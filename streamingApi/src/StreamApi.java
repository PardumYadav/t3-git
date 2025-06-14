import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {


    public static void main(String[] args) {

        System.out.println("Hello world");
                List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1, 4, 6);

                List<Integer> result = numbers.stream()
                        .filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(result);

       List<String> words = Arrays.asList("apple", "banana", "avocado", "lemon", "grape");

        long count = words.stream()
               .filter(word -> word.startsWith("a"))
                .count();

        System.out.println("Words starting with 'a': " + count);




            }
}