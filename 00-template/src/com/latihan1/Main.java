package com.latihan1;

import com.latihan1.Weapon;

//player
class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
    this.name = name;
    this.health = health;
}
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
      }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("\nname : "+ this.name);
        System.out.println("Health " + this.health +"hp");
        this.weapon.display();
        this.armor.display();
    }
}

//senjata
class Weapon{
    double AttackPower;
    String name;

    Weapon (String name, double AttackPower){
        this.AttackPower = AttackPower;
        this.name = name;
    }
    void display(){
        System.out.println("Weapon : " + this.name + "Power : " + this.AttackPower);

}
}
//armor
class Armor{
    double defencePower;
    String name;

    Armor(String name,double defencePower){
        
        this.defencePower = defencePower;
        this.name = name;
    }
    void display(){
        System.out.println("Armor : " + this.name + "Defence : " + this.defencePower);

}
    
    
}

public class Main {

    public static void main(String[] args) {
        //membuat objek player
        Player player1 = new Player("ucup", 100);
        Player player2= new Player("Otong", 50);
        
        // objek wepon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon Ketapel = new Weapon("Ketapel", 1);
        //objek Armor
        Armor bajuBesi1 = new Armor("baju besi ",10);
        Armor Kaos = new Armor("Kaos  ",0);

        // equip senjata dan armor\
        //player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi1);
        player1.display();
    
    
        player2.equipWeapon(Ketapel);
        player2.equipArmor(Kaos);
        player2.display();
    }
}
