import java.util.Scanner;

public class SubsetSum {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter list: ");
        String[] arrSplit = reader.nextLine().split(" ");
        int[] arrNums = new int[arrSplit.length];
        for (int i=0; i<arrSplit.length; i++){
            arrNums[i] = Integer.parseInt(arrSplit[i]);
        }

        System.out.println(isSum(arrNums));

    }

    public static boolean isSum(int[] input){
        for(int i=0; i<input.length; i++){
            if(input[i]==0){
                return true;
            }
            for (int x=i+1; x<input.length; x++){
                if (input[i] == -1 * input[x]){
                    return true;
                }
            }
        }
        int num=0;
        for(int i=0; i<input.length; i++){
            num+=input[i];
        }
        if(num==0){
            return true;
        }
        return false;
    }
}
