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
        //Main Menu
        System.out.println("Welcome to the Genshin Reactions Assignment \n[1] Start Game \n[2] Quit");
        String menu = input.nextLine();
        if(menu.equals("1")){
            System.out.println("What Reaction would you like to use!   \n[1] Vaporize           (Amber and Xingqiu) \n" +
                                                                        "[2] Melt               (Amber and Kaeya) \n" +
                                                                        "[3] Overloaded         (Amber and Lisa)\n" +
                                                                        "[4] Superconduct       (Kaeya and Lisa) \n" +
                                                                        "[5] Frozen             (Kaeya and Xingqiu) \n" +
                                                                        "[6] Electro-Charged    (Lisa and Xingqiu)");
            String reaction = input.nextLine();
            switch (reaction){
                case "1":
                    System.out.println(characters[1]);
                    System.out.println(characters[3]);
                case "2":
                    System.out.println();
                    System.out.println(Kaeya);
                case "3":
                    System.out.println(Amber);
                    System.out.println(Lisa);
                case "4":
                    System.out.println(Kaeya);
                    System.out.println(Lisa);
                case "5":
                    System.out.println(Kaeya);
                    System.out.println(Xingqiu);
                case "6":
                    System.out.println(Lisa);
                    System.out.println(Xingqiu);
                default:
                    System.out.println("Please Pick a usable option!");
            }
        }
        if (menu.equals("2")){
            System.out.println("Thank you for playing!");
        }
    }
}