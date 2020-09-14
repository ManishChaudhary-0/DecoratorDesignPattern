package decoratordesignpattern;
public class Skill extends PlayerDecorator{
    /*
    Declaring private object player
     */
    private Player player;

    /*
    The Skill Constructor declares the variables to the object
     */
    public Skill(Player player){
        this.player = player;
        this.name = player.name;
        this.intellect = player.intellect;
        this.defense = player.defense;
        this.attack = player.attack;
        this.weapon = player.weapon;
        this.armor = player.armor;
        this.defense  = player.defense;

    }

    /*
    Concatenate "Gained a new skill" to the toString in the Player Class.
     */
    public String toString(){
        return player.toString() + "\nGained a new Skill";
    }

    public double getPower(){
        return player.getPower() + 2;
    }


}
