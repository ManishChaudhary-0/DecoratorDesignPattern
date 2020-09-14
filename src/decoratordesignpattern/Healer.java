package decoratordesignpattern;
/*
The Healer class assigns the variable values for the Healer Player
 */
public class Healer extends Player{

    /*
    The Healer Constructor declares the variables with the associated class values
     */
    public Healer(String name){
        this.name = name;
        this.intellect  = 8;
        this.attack = 2;
        this.defense = 3;
        this.weapon = "Staf";
        this.armor = "Robe";
    }

    /*
    Concatenating "Healer: " onto the parent class toString
     */
    public String toString() {
        return "Healer: " + super.toString();
    }


}
