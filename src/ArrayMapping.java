import java.util.Arrays;
import java.util.function.Function;

public class ArrayMapping {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        var res = arrayMapping(numbers, a -> a * 2);
        System.out.println(Arrays.toString(res));
    }

    public static Integer[] arrayMapping(Integer[] array, Function<Integer, Integer> func) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = func.apply(array[i]);
        }

        return result;
    }
}
