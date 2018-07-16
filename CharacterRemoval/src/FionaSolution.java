import java.util.ArrayList;
import java.util.Scanner;

public class CharacterRemoval {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String string1 = reader.nextLine();
        System.out.println("Enter string 2: ");
        String string2 = reader.nextLine();

        System.out.println(removeCharacter(string1,string2));
    }

    public static String removeCharacter(String initial, String remove){
        ArrayList<String> arrLet = new ArrayList<>();
        for (int i=0; i < initial.length(); i++){
            arrLet.add(initial.substring(i,i+1));
        }

        for (int i=0; i < remove.length(); i++){
            for (int x=0; x < arrLet.size(); x++){
                if (arrLet.get(x).equals(remove.substring(i,i+1))){
                    arrLet.remove(x);
                    x--;
                }
            }
        }
        String string = "";
        for (int i=0; i < arrLet.size(); i++){
            string += arrLet.get(i);
        }
        return string;
    }
}
