public class Character {
    String name;
    String element;
    String wepType;
    int energy;
    int maxEnergy;
    double skillGu;
    int skillCooldown;
    public Character(String name,String element, String wepType, int maxEnergy){
        this.name = name;
        this.element = element;
        this.wepType = wepType;
        this.maxEnergy= maxEnergy;
        energy = maxEnergy/2;
    }
    public String toString(){
        return ("Name: " + name + " Element: " +  element + " Weapon: " + wepType + " Max Energy: " + maxEnergy);
    }
}