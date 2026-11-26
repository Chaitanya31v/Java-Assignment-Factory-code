import java.util.HashSet;
import java.util.Scanner;

public class hii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet set =  new HashSet<>();

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            s.charAt(i);
        }

        if(set.size() % 2 == 0){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }
    }
}
