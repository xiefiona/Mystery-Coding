import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number: ");
        int input = reader.nextInt();

        System.out.println("Enter string: ");
        reader.nextLine();
        String string = reader.nextLine();

        if (input == 0){
            System.out.println(getCamcelCase(string));
        } else if (input ==  1){
            System.out.println(getSnakeCase(string));
        } else if (input == 2){
            System.out.println(getCapSnakeCase(string));
        }
    }

    public static String getCamcelCase(String input){
        ArrayList<String> arrLet = new ArrayList<>();
        for (int i=0; i < input.length(); i++){
            arrLet.add(input.substring(i,i+1));
        }

        for (int i=0; i < arrLet.size(); i++){
            if (arrLet.get(i).equals(" ")){
                arrLet.remove(i);
                arrLet.set(i,arrLet.get(i).toUpperCase());
            }
        }

        String string = "";
        for (int i=0; i < arrLet.size(); i++){
            string += arrLet.get(i);
        }

        return string;
    }

    public static String getSnakeCase(String input){
        ArrayList<String> arrLet = new ArrayList<>();
        for (int i=0; i < input.length(); i++){
            arrLet.add(input.substring(i,i+1));
        }

        for (int i=0; i < arrLet.size(); i++){
            if (arrLet.get(i).equals(" ")){
                arrLet.set(i,"_");
            }
        }

        String string = "";
        for (int i=0; i < arrLet.size(); i++){
            string += arrLet.get(i);
        }

        return string;
    }

    public static String getCapSnakeCase(String input){
        return (getSnakeCase(input)).toUpperCase();
    }
}
