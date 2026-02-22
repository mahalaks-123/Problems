import java.util.*; 
//import java.io.*;

class Space{ public static void main(String []argh){ Scanner in = new Scanner(System.in);

    int t=in.nextInt();
    for(int j=0;j<t;j++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int result = a;
        for(int i=0; i<n; i++){

            result += (Math.pow(2, i)*b); 
            System.out.print(result+" ");
        }
        System.out.println();
    }
    in.close();
}
}
