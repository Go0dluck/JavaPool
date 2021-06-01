import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;


        while (num != 42){
            if (!sc.hasNextInt()){
                System.err.println("not integer");
                System.exit(-1);
            }
            num = sc.nextInt();
            if (isPrime(sumNum(num)))
                sum++;
        }
        System.out.println("Count of coffee-request - " + sum);
    }

    static int sumNum(int num){
        int sum = 0;

        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static boolean isPrime(int num){
        if (num <= 1){
            System.err.println("Illegal Argument");
            System.exit(-1);
        }
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
