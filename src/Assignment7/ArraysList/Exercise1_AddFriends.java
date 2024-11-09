package Assignment7.ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1_AddFriends {
    public static void AddFriends(){
        ArrayList<String>friend=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for ( int i = 1; i < 6 ;i++){
            System.out.print("Enter friend'name ["+i+"]: ");
            String fen = sc.nextLine();
            friend.add(fen);
        }
        for (String fen: friend){
            System.out.println(fen);
        }
    }
    public static void main(String[] args) {
        Exercise1_AddFriends.AddFriends();
    }
}
