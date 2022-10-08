import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;


public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = DiagonalResult.diagonalDifference(arr);
        System.out.println(result);

        bufferedReader.close();

    }

    private static class DiagonalResult {
        public static int diagonalDifference(List<List<Integer>> arr) {
            // Write your code here
            Integer left = 0;
            Integer right = 0;
            for (int i = 0; i <arr.size() ; i++) {
                for (int j = 0; j <arr.get(i).size() ; j++) {
                    if (i == j){
                        left += arr.get(i).get(j);
                    }
                    if (i == arr.get(i).size() - 1 - j) {
                        right +=  arr.get(i).get(j);
                    }
                }
            }
           int sum = Math.abs(left - right);
            return sum;
        }

    }
}

