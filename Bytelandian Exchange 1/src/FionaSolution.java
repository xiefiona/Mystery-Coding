import java.util.Scanner;

public class FionaSolution {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = reader.nextInt();
        System.out.println(Coin(n));
    }

    public static int Coin(int N){
        if (N == 0){
            return 1;
        }
        return Coin(N/2) + Coin(N/3) + Coin(N/4);
    }
}
