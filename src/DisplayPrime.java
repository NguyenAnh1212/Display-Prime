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

    private static boolean isPrimeNumber(int i) {
        if(i<2){
            return false;
        }
        else {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if(i%j == 0){
                    return false;
                }
            }
        }return true;
    }
}
