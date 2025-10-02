package com.pluralsight;

public class PowerpuffGirl {

    private String name;
    private int health;
    private String outfitColor;
    private int attackDamage;
    private int power;



    // Constructor
    public PowerpuffGirl(String _name, String _outfitColor) {
        this.name = _name;
        this.outfitColor = _outfitColor;
        this.power = 100;
        this.health = 100;
        this.attackDamage = 100;
    }
    public String getName() {
        return this.name;

    }

    public int getHealth() {
        return this.health;

    }

    public void setHealth(int _newHealth){
            if (_newHealth > 0 && _newHealth < 100) {
                this.health = _newHealth;
            }
            System.out.println("not possible");
        }


    public void Heal(int _howMuchHealth){
            System.out.println("drinking potion");
            //We can't let health be above 100


            int newHealth = this.health + _howMuchHealth;
            if (newHealth >= 100) {
                this.setHealth(100);
                System.out.println("Fully recovered");
            }
            setHealth(newHealth);
        }



    }


