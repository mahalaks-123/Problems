import java.util.Scanner;

public class Out {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d",s1,x);


            // printf() = an optional method to control, format, and display text to the console window
            // two arguments = format string + (object/variable/value)
            // % [flags] [precision] [width] [conversion-character]

            System.out.println(" ");
        }
        System.out.println("================================");

}
}
