import java.util.ArrayList;

public class Calculate {

    public double getShannonEntropy(String input){
        boolean unique = true;
        ArrayList<String> arrUnique = new ArrayList<>();
        arrUnique.add(input.substring(0,1));
        for (int i=1; i<input.length(); i++){
            for (int x=0; x<arrUnique.size(); x++){
                if (input.substring(i,i+1) == arrUnique.get(x)){
                    unique = false;
                    break;
                }
            }
            if (unique){
                arrUnique.add(input.substring(i,i+1));
            }
        }

        int[] frequency = new int[arrUnique.size()];
        for (int i=0; i<arrUnique.size(); i++){
            int count=0;
            for (int x=0; x<input.length(); x++){
                if(arrUnique.get(i)==input.substring(x,x+1)){
                    count++;
                }
            }
            frequency[i] = count;
        }

        double entropy = 0.0;
        for(int i =0; i<arrUnique.size(); i++){
            entropy += ((frequency[i]/input.length())*(Math.log(frequency[i]/input.length())/Math.log(2)));
        }

        entropy = (int)(100000*entropy);
        entropy /= 100000;
        return entropy;
    }
}
