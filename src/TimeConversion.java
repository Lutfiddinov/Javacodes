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

class TimeConversionResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        char date = s.charAt(s.length() - 2);
        String time = s.substring(0, s.length() - 2);
        int hh = Integer.parseInt(time.substring(0, 2));
        if (date == 'A') {
            if (hh == 12) {
                time = "00" + time.substring(2);
            }
        }
        if (date == 'P') {
            if (hh != 12) {
                hh = hh + 12;
                time = String.valueOf(hh) + time.substring(2);
            }
        }
        return time;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = TimeConversionResult.timeConversion(s);
        System.out.println(result);
        bufferedReader.close();

    }
}
