public class Population {

    public int getPopulationCount(int binaryNum){
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
