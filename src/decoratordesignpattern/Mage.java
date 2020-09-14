package decoratordesignpattern;
/*
The Mage class assigns the variable values for the Mage Player
 */
public class Mage extends Player{

    /*
    The Mage Constructor declares the variables with the associated class values
     */
    public Mage(String name){
        this.name = name;
        this.intellect  = 7;
        this.attack = 3;
        this.defense = 4;
        this.weapon = "Staf";
        this.armor = "Robe";
    }


    /*
      Concatenating "Mage: " onto the parent class toString
     */
    public String toString(){
        return "Mage: " + super.toString();
    }

}
