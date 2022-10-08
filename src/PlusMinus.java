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

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double plus = 0;
        double mines = 0;
        double nol = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                plus++;
            } else if (arr.get(i) < 0) {
                mines++;
            } else nol++;
        }
        System.out.println(String.format("%.6f",plus/arr.size()));
        System.out.println(String.format("%.6f",mines/arr.size()));
        System.out.println(String.format("%.6f",nol/arr.size()));



    }

}



public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinusResult.plusMinus(arr);

        bufferedReader.close();
    }

}
