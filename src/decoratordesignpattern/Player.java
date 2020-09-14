package decoratordesignpattern;

public abstract class Player {

    protected String name;
    protected int intellect;
    protected int defense;
    protected int attack;
    protected String weapon;
    protected String armor;

    /*
    Returns the name, weapon, and armor for the player
     */
    public String toString(){
        return  name + "\nCarries a " + weapon + ", and wears a " + armor;
    }

    /*
    Calculates the value of the variable power
     */
    public double getPower(){
        return  attack * 3 + defense + (intellect / 2);
    }



}
