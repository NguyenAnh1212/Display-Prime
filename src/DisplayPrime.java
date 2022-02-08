import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n ; i++) {
            if(isPrimeNumber(i)){
                System.out.println(" " + i);
            }
        }
    }



    private static boolean isPrimeNumber(int x) {
        if(x<2){
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if(x%i == 0){
                    return false;
                }
            }
        }return true;
    }
}
