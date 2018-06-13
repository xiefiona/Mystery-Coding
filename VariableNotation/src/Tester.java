import java.util.Scanner;

public class Tester {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        VariableNotation function = new VariableNotation();

        System.out.println("Enter number: ");
        int input = reader.nextInt();

        System.out.println("Enter string: ");
        String string = reader.next();

        if (input == 0){
            System.out.println(function.getCamcelCase(string));
        } else if (input ==  1){
            System.out.println(function.getSnakeCase(string));
        } else if (input == 2){
            System.out.println(function.getCapSnakeCase(string));
        }
    }
}
