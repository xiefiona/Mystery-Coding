public class SubsetSum {

    public boolean isSum(int[] input){
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
