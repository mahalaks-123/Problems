public class Endoff {

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);

    int i=1;
    String str = "";
    while(in.hasNext()){
        str += "" + (i++) + " " + in.nextLine() + "\n";
    }
    System.out.println(str);
}
}

