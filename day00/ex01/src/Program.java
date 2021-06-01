import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int out = 1;

        if (!sc.hasNextInt()){
            System.err.println("not integer");
            System.exit(-1);
        }
        num = sc.nextInt();
        if (num <= 1){
            System.err.println("Illegal Argument");
            System.exit(-1);
        }
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                System.out.println("false " + out);
                System.exit(0);
            }
            out++;
        }
        System.out.println("true " + out);
    }
}
