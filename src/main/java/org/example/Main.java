package org.example;

public class Main {
    public static void main(String[] args) {
      /*  Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance()); */

        Player player = new Player("Berkay",100,Weapon.SWORD);
        System.out.println("Health Remeaining:" +player.healthRemaining());
        Player player2 = new Player("Emre",100,Weapon.DAGGER);
        System.out.println("Health Remeaining:" +player2.healthRemaining());
        player2.loseHealth(player2.getWeapon().getDamage());
        System.out.println("Health Remeaining:" +player2.healthRemaining());
    }
}