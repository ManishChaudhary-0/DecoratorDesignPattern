package decoratordesignpattern;
/*
The Warrior class assigns the variable values for the Warrior Player
 */
public class Warrior extends Player {
    /*
    The Warrior Constructor declares the variables with the associated class values
     */
    public Warrior(String name){
        this.name = name;
        this.intellect  = 2;
        this.attack = 8;
        this.defense = 5;
        this.weapon = "Sword";
        this.armor = "Breast Plate";
    }

    /*
     Concatenate "Warrior: " to the toString in the Player Class.
     */
    public String toString(){
        return "Warrior: " + super.toString();

    }


}
