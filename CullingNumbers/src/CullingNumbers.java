import java.util.ArrayList;

public class CullingNumbers {
    int size;
    int[] cullNum;

    public int[] getCullNum(int[] input){
        cullNum = new int[input.length];
        cullNum[0] = input[0];
        size = 1;
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
        return cullNum;
    }

    public String toString(){
        String string = "";
        for (int i=0; i<size; i++){
            string += cullNum[i] + " ";
        }
        return string;
    }

}
