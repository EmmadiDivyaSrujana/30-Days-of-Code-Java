import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";	
        Scanner scan = new Scanner(System.in);
        int int_input=scan.nextInt();
        double double_input=scan.nextDouble();
        scan.nextLine();
        String string_input= scan.nextLine();
        System.out.println(i+int_input);
        System.out.println(d+double_input);
        System.out.println(s+string_input);

        scan.close();
    }
}
