import java.util.Scanner;

public class ReverseFactorial {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = reader.nextInt();
        int num = reverseFact(input);
        if (num == -1){
            System.out.println(input + "   NONE");
        } else {
            System.out.println(input + " = " + num + "!");
        }
    }

    public static int reverseFact(int num){
        int divide = 2;
        if (num == 1){
            return 0;
        }
        while (num>=1){
            if (num % divide == 0){
                num /= divide;
            } else {
                return -1;
            }
            if (num == 1){
                return divide;
            } else {
                divide++;
            }
        }
        return -1;
    }
}
