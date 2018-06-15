import java.util.ArrayList;
import java.util.Scanner;

public class CalculateEntropy {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter input: ");
        System.out.println(getShannonEntropy(reader.nextLine()));
    }

    public static double getShannonEntropy(String input){
        boolean unique = true;
        ArrayList<String> arrUnique = new ArrayList<>();
        arrUnique.add(input.substring(0,1));
        for (int i=1; i<input.length(); i++){
            for (int x=0; x<arrUnique.size(); x++){
                if (input.substring(i,i+1).equals(arrUnique.get(x))){
                    unique = false;
                    break;
                }
            }
            if (unique){
                arrUnique.add(input.substring(i,i+1));
            }
            unique = true;
        }

        int[] frequency = new int[arrUnique.size()];
        for (int i=0; i<arrUnique.size(); i++){
            int count=0;
            for (int x=0; x<input.length(); x++){
                if(arrUnique.get(i).equals(input.substring(x,x+1))){
                    count++;
                }
            }
            frequency[i] = count;
        }

        double entropy = 0.0;
        System.out.println(input.length());
        for(int i =0; i<arrUnique.size(); i++){
            entropy += (((double)(frequency[i])/input.length())*(Math.log((double)(frequency[i])/input.length())/Math.log(2)));
        }

        entropy = (int)(100000*entropy);
        entropy /= 100000;
        return -entropy;
    }
}
