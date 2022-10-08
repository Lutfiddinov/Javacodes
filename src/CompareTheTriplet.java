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

public class CompareTheTriplet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);
        for (Integer each: result) {
            System.out.println(each);
        }
         bufferedReader.close();

    }

    private static class Result {
        public static List<Integer> compareTriplets(List<Integer> alist, List<Integer> blist) {
                List<Integer> returnlist = new ArrayList<>();
            int a = 0;
            int b = 0;

            for (int i = 0; i <alist.size() ; i++) {
                if (alist.get(i) > blist.get(i)){
                    a++;
                } else if (alist.get(i) < blist.get(i)) {
                    b++;
                }
            }
            returnlist.add(a);
            returnlist.add(b);
            return returnlist;
        }
    }
}
