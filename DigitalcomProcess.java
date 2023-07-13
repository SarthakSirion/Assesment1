// Author: Sarthak Shrivastava

import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("====================================");
            System.out.println("Main Menu");
            System.out.println("1. Register New User");
            System.out.println("2. View Games");
            System.out.println("3. Search by Author");
            System.out.println("4. Exit");
            int option = sc.nextInt();
            try {
                if (option == 1) {
                    System.out.println("Enter User ID:");
                    String userID = sc.next();
                    System.out.println("Enter Password:");
                    String password = sc.next();
                    User.addUser(userID, password);
                } else if (option == 2) {
                    List<Game> gamesList = GameService.viewAll();
                    for (Game g : gamesList) {
                        System.out.println(g);
                    }
                } else if (option == 3) {
                    System.out.println("Enter Author Name:");
                    String author = sc.next();
                    String res = GameService.authorSearch(author);
                    System.out.println(res);
                } else if (option == 4) {
                    System.out.println("Thanks for visiting.");
                    break;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        sc.close();
        return;
    }

}
