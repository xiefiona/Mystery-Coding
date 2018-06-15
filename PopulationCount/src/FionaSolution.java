import java.util.Scanner;

public class Population {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int num = reader.nextInt();
        System.out.println(getPopulationCount(num));
    }

    public static int getPopulationCount(int binaryNum){
        int count = 0;
        while (binaryNum > 0){
            if (binaryNum % 10 == 1){
                count++;
            }
            binaryNum /= 10;
        }
        return count;
    }
}
