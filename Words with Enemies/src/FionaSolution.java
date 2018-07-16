import java.util.Scanner;

public class FionaSolution {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter words:");
        String ArrSplit[] = reader.nextLine().split(" ");
        String word1[] = ArrSplit[0].split("");
        String word2[] = ArrSplit[1].split("");

        for(int i=0; i< word1.length; i++){
            for (int x=0; x<word2.length; x++){
                if (word1[i].equals(word2[x])){
                    word1[i] = ".";
                    word2[x] = ".";
                }
            }
        }

        int num=0;
        for(int i=0; i<word1.length; i++){
            if (word1[i].equals(".")){
                num++;
            }
        }

        if (word1.length-num > word2.length - num){
            System.out.println("left side wins");
        } else if (word1.length-num < word2.length - num){
            System.out.println("right side wins");
        } else {
            System.out.println("tie");
        }
    }
}
