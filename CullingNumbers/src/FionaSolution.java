import java.util.ArrayList;
import java.util.Scanner;

public class CullingNumbers {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter integers: ");
        String[] splitArr = reader.nextLine().split(" ");

        int[] arrNums = new int[splitArr.length];
        for (int i=0; i<splitArr.length; i++){
            arrNums[i] = Integer.parseInt(splitArr[i]);
        }

        getCullNum(arrNums);
    }

    public static void getCullNum(int[] input){
        int[] cullNum = new int[input.length];
        cullNum[0] = input[0];
        int size = 1;
        boolean unique = true;
        for (int i=1; i<input.length; i++){
            for (int x=0; x<size; x++){
                if (cullNum[x]==input[i]){
                    unique = false;
                    break;
                }
            }
            if (unique){
                cullNum[size] = input[i];
                size++;
            }
        }

        String string = "";
        for (int i=0; i<size; i++){
            string += cullNum[i] + " ";
        }
        System.out.println(string);
    }
}
