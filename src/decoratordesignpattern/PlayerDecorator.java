package decoratordesignpattern;
/*
Holds the two abstract variables used in the ArmorUpgrade, WeaponUpgrade, and Skill Classes
 */
public abstract class PlayerDecorator extends Player {
    public abstract String toString();
    public abstract double getPower();
}
