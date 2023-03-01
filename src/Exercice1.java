import java.util.Arrays;
import java.util.List;

public class Exercice1 {

    /*
        The forEach() is primarily used to operate over the streams due to its functional nature.
        Use the stream object to traverse the Array elements using forEach() method.
    */
    public static void execute() {
        int[] arr = {2, 5, 36, 9, 8};

        List.of(arr).forEach(System.out::println);
    }
}
