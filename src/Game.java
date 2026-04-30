import java.util.Scanner;

public class Game {
    Character Kaeya = new Character("Kaeya", "Cryo", "Sword", 60);
    Character Amber = new Character("Amber", "Pyro", "Bow", 60);
    Character Lisa = new Character("Lisa", "Electro", "Grimoire", 60);
    Character Xingqiu = new Character("Xingqiu", "Hydro", "Sword", 80);
    Character[] characters = new Character[]{Kaeya, Amber, Lisa, Xingqiu};
    Character[] chosenChars = new Character[2];
    Scanner input = new Scanner(System.in);
    Enemy ruinguard = new Enemy(200);
    int hp = 100;

    public void game(){

    }

    public void startMenu(){
        System.out.println("""
                               Welcome to the Genshin Reactions Assignment
                               [1] Start Game
                               [2] Quit""");
        String menu = input.nextLine();
        switch (menu){
            case("1"):
                elementSelect();
                break;
            case("2"):
                break;
            default:
                System.out.println("Please Pick a Viable Option!");
                startMenu();
        }
    }
    public void elementSelect(){
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
                chosenChars[0] = Amber;
                chosenChars[1] = Xingqiu;
                fight();
                break;
            case "2":
                chosenChars[0] = Amber;
                chosenChars[1] = Kaeya;
                fight();
                break;
            case "3":
                chosenChars[0] = Amber;
                chosenChars[1] = Lisa;
                fight();
                break;
            case "4":
                chosenChars[0] = Kaeya;
                chosenChars[1] = Lisa;
                fight();
                break;
            case "5":
                chosenChars[0] = Kaeya;
                chosenChars[1] = Xingqiu;
                fight();
                break;
            case "6":
                chosenChars[0] = Lisa;
                chosenChars[1] = Xingqiu;
                fight();
                break;
            default:
                System.out.println("Please pick a viable option");
                elementSelect();

        }
    }
    public void fight(){
        showStatus();
    }
    public void showStatus(){
        System.out.println(chosenChars[0]);
        System.out.println(chosenChars[1]);
        System.out.println(chosenChars[0].checkEnergy());
        System.out.println(chosenChars[1].checkEnergy());
        System.out.println(hp);
        System.out.println(ruinguard.checkHp());
    }
}
