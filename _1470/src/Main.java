import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

    public static int[] shuffle(int[] nums, int n) {
        var result = new int[n*2];

        int counter = 0;
        for(int i = 0; i < n; i++){
            result[counter] = nums[i];
            result[counter+1] = nums[i + n];
            counter+=2;
        }
        return result;
    }



    public static void main(String[] args) {
        var input1 = new int[]{2, 5, 1, 3, 4, 7};
        var input2 = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        var input3 = new int[]{1,1,2,2};

        Consumer<int[]> arrayConsumer = array ->  {
            Arrays.stream(array).forEach(element -> System.out.printf(element + " "));
            System.out.println("");
        };

        arrayConsumer.accept(shuffle(input1, 3));
        arrayConsumer.accept(shuffle(input2, 4));
        arrayConsumer.accept(shuffle(input3, 2));
    }
}