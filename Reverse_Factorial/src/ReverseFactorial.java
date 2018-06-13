public class ReverseFactorial {

    public int reverseFact(int num){
        int divide = 2;
        if (num == 1){
            return 0;
        }
        while (num>=1){
            if (num % divide == 0){
                num /= divide;
            } else {
                return -1;
            }
            if (num == 1){
                return divide;
            } else {
                divide++;
            }
        }
        return -1;
    }
}
