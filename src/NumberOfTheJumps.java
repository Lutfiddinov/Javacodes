import java.io.*;

import static java.util.stream.Collectors.joining;




public class NumberOfTheJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        if ((x1 < x2 && v1 < v2) || (x1 > x2 && v1 > v2) ){
            return "NO";
        }
        else if (((x1 == x2 && (v1 < v2 ||v1 > v2 ) ) || ((x1 > x2||x1 < x2)  && v1 == v2) )){
            return "NO";
        }
        if ((x1 - x2) % (v1 - v2) == 0){
            return "YES";
        }
        return "NO";



    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

        bufferedReader.close();

    }


}
