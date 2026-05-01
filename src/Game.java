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
    public int count = 0;
    int hp = 100;

    public Boolean run(){
        return (ruinguard.checkHp()<0);
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
                showStatus();
                break;
            case "2":
                chosenChars[0] = Amber;
                chosenChars[1] = Kaeya;
                showStatus();
                break;
            case "3":
                chosenChars[0] = Amber;
                chosenChars[1] = Lisa;
                showStatus();
                break;
            case "4":
                chosenChars[0] = Kaeya;
                chosenChars[1] = Lisa;
                showStatus();
                break;
            case "5":
                chosenChars[0] = Kaeya;
                chosenChars[1] = Xingqiu;
                showStatus();
                break;
            case "6":
                chosenChars[0] = Lisa;
                chosenChars[1] = Xingqiu;
                showStatus();
                break;
            default:
                System.out.println("Please pick a viable option");
                elementSelect();

        }
    }
    public void fight(){
        System.out.println("Which character will go first [1] " + chosenChars[0].checkname() + " [2] " + chosenChars[1].checkname());
        String goFirst = input.nextLine();
        count += 1;
        System.out.println("Turn "+ count);
        switch (goFirst){
            case "1":
                attackOne();
                showStatus();
                break;
            case "2":

                showStatus();
                break;
            default:
                System.out.println("please pick a viable option!");
                showStatus();
        }

    }
    public void showStatus(){
        System.out.println(chosenChars[0]);
        System.out.println(chosenChars[1]);
        System.out.println(chosenChars[0].checkname()+" Energy: "+chosenChars[0].checkEnergy());
        System.out.println(chosenChars[1].checkname()+ " Energy: "+chosenChars[1].checkEnergy());
        System.out.println("Player HP: "+hp);
        System.out.println("Enemy HP: "+ruinguard.checkHp());
        fight();
    }
    public void attackOne(){
        System.out.println("Character 1\n[1] Normal Attack (Physical, 10 dmg, +5)\n[2] Elemental Skill ("+ chosenChars[0].checkElement() +", 2U, 20 dmg, +10 burst)\n[3] Elemental Burst ("+ chosenChars[0].checkElement()+", 2U 30 dmg, requires "+chosenChars[0].checkMaxeneg()+")");
        String attack = input.nextLine();
        switch (attack){
            case "1":
                System.out.println(chosenChars[0].checkname() + " uses Normal Attack! (Physical, 10 dmg)");
                ruinguard.takedmg(10);
                if (ruinguard.checkHp()<0){
                    System.out.println("Ruin Guard Defeated!!!");
                }
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                System.out.println("Please put a viable option!");
        }
    }
    public void attackTwo(){
        System.out.println("Character 2\n[1] Normal Attack (Physical, 10 dmg, +5)\n[2] Elemental Skill ("+ chosenChars[1].checkElement() +", 2U, 20 dmg, +10 burst)\n[3] Elemental Burst ("+ chosenChars[1].checkElement()+", 2U 30 dmg, requires "+ chosenChars[1].checkMaxeneg() +")");
        String attackTwo = input.nextLine();
        switch (attackTwo){
            case "1":
                System.out.println(chosenChars[0].checkname() + " uses Normal Attack! (Physical, 10 dmg)");
                ruinguard.takedmg(10);
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                System.out.println("Please put a viable option!");
        }
    }
}
