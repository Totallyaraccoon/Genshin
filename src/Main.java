import java.util.ArrayList;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class Main {
    public static void main(String[] args) {
        //Objects arrays and such
        Scanner input = new Scanner(System.in);
        Character Kaeya = new Character("Kaeya", "Cryo", "Sword", 60);
        Character Amber = new Character("Amber", "Pyro", "Bow", 60);
        Character Lisa = new Character("Lisa", "Electro", "Grimoire", 60);
        Character Xingqiu = new Character("Xingqiu", "Hydro", "Sword", 80);
        Character[] characters = new Character[]{Kaeya, Amber, Lisa, Xingqiu};
        Enemy ruinguard = new Enemy(200);
        //Main Menu
        System.out.println("""
                               Welcome to the Genshin Reactions Assignment
                               [1] Start Game
                               [2] Quit""");
        String menu = input.nextLine();
        if(menu.equals("1")){
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            System.out.println("""
                               What Reaction would you like to use!
                               [1] Vaporize           (Amber and Xingqiu)
                               [2] Melt               (Amber and Kaeya)
                               [3] Overloaded         (Amber and Lisa)
                               [4] Superconduct       (Kaeya and Lisa)
                               [5] Frozen             (Kaeya and Xingqiu)
                               [6] Electro-Charged    (Lisa and Xingqiu)""");
            String reaction = input.nextLine();
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            switch (reaction){
                case "1":
                    System.out.println(Amber);
                    System.out.println(Xingqiu);
                    break;
                case "2":
                    System.out.println(Amber);
                    System.out.println(Kaeya);
                    break;
                case "3":
                    System.out.println(Amber);
                    System.out.println(Lisa);
                    break;
                case "4":
                    System.out.println(Kaeya);
                    System.out.println(Lisa);
                    break;
                case "5":
                    System.out.println(Kaeya);
                    System.out.println(Xingqiu);
                    break;
                case "6":
                    System.out.println(Lisa);
                    System.out.println(Xingqiu);
                    break;
                default:
                    System.out.println("Please pick a viable option");
            }
        }
        if (menu.equals("2")){
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            System.out.println("Thank you for playing!");
        }
    }
}