import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter integers: ");
        String[] splitArr = reader.next().split(" ");
        int[] arrNums = new int[splitArr.length];
        for (int i=0; i<splitArr.length; i++){
            arrNums[i] = Integer.parseInt(splitArr[i]);
        }
        CullingNumbers function = new CullingNumbers();
        int[] cullNum = function.getCullNum(arrNums);
        System.out.println(function.toString());
    }
}
