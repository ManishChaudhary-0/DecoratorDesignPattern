package decoratordesignpattern;
/*
The ArmorUpgrade class return "Upgraded armor" for the player,
 and add three to the power.
 */
public class ArmorUpgrade extends PlayerDecorator {
    /*
    Declaring private object player
     */
    private Player player;
    /*
     ArmorUpgrade constructor declaring the variables to the object
     */
    public ArmorUpgrade(Player player){
        this.player = player;
        this.name = player.name;
        this.intellect = player.intellect;
        this.defense = player.defense;
        this.attack = player.attack;
        this.weapon = player.weapon;
        this.armor = player.armor;
        this.defense = player.defense;
    }

    /*
    Concatenate "Upgraded armor" to the toString in the Player Class.
    */
    public String toString(){
        return player.toString() + "\nUpgraded armor";
    }

    /*
    Return the value of power from the getPower Method in the Player class and adds 3.
    */
    public double getPower() {
        return player.getPower() + 3;
    }

}
