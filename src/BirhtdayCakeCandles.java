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
public class BirhtdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = birthdayCakeCandles(candles);

        System.out.println(result);
        bufferedReader.close();

    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = 0;
        int count = 0;
        for (int i = 0; i <candles.size() ; i++) {
            if (max < candles.get(i)){
                max = candles.get(i);
                count = 1;
            }else if (max == candles.get(i)){
                count++;
            }
        }
//        for (int i = 0; i <candles.size() ; i++) {
//            if (max = g)
//        }
        return count;

    }
}
