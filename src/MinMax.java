import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MinMaxResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = Integer.MAX_VALUE;
        long max = 0;
        long sum = 0;
        for (int i = 0; i <arr.size() ; i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
            if (min > arr.get(i)){
               min = arr.get(i);
            }
            sum +=arr.get(i);
        }

        System.out.print(sum - max);
        System.out.print(" ");
        System.out.print(sum - min);
    }

}

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MinMaxResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
