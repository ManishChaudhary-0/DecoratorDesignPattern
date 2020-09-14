package decoratordesignpattern;
/*
WeaponUpgrade will upgrade the players weapon and outputs "Weapon Upgrade"
and adds 5 to the power of the player
 */
public class WeaponUpgrade extends PlayerDecorator{
    private Player player;

    /*
    WeaponUpgrade Constructor declaring the variables to the object
     */
    public WeaponUpgrade(Player player){
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
     Concatenate "Upgraded Weapon" to the toString in the Player Class.
     */
    public String toString(){
        return player.toString() + "\nUpgraded Weapon";
    }

    /*
    Return the value of power from the getPower Method in the Player class and adds 5.
     */
    public double getPower(){
        return player.getPower() + 5;
    }

}
