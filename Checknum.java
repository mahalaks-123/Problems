import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Checknum { public static void main(String[] args) throws IOException { BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    bufferedReader.close();

    if(n%2!=0) {
        System.out.println("Weird");
    } else if(n>=2 && n<=5 && n%2==0) {
        System.out.println("Not Weird");
    } else if(n>=6 && n<=20 && n%2==0) {
        System.out.println("Weird");
    } else if(n>20 && n%2==0) {
        System.out.println("Not Weird");
    } 
}
}
