public class Enemy {
    int hp;
    String auraElement = ("");
    Double auraGU = 0.0;
    public Enemy(int hp){
        this.hp = hp;
    }
    public int checkHp(){
        return hp;
    }
    public void takedmg(int dmg){
        hp -= dmg;
    }
    public void addElement(String element){
        if (auraElement.isEmpty()){
            auraElement = element;
        }
    }
    public void clearAura(){
        auraElement = "";
    }
}
