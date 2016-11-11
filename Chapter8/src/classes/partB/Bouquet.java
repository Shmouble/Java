package classes.partB;


import classes.partB.Rose.RedRose;
import classes.partB.Rose.WhiteRose;
import classes.partB.Tulip.VioletTulip;
import classes.partB.Tulip.YellowTulip;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Bouquet {
    public static List<Flower> flowers = new ArrayList<Flower>();

    public static void newFlower(){
        Scanner scanner = new Scanner(System.in);
        String type;
        String color;
        double price;
        int height;
        Random rn = new Random();
        YellowTulip yt;
        VioletTulip vt;
        RedRose rr;
        WhiteRose wr;

        System.out.println("Do tou want TULIP or ROSE?");
        type = scanner.nextLine();
        type = type.toLowerCase();

        switch(type){
            case "tulip":
                System.out.println("YELLOW or VIOLET tulip:");
                color = scanner.nextLine();
                color.toLowerCase();
                switch (color){
                    case "yellow":
                        System.out.println("Enter the prise: ");
                        price = scanner.nextDouble();
                        System.out.println("Enter the height: ");
                        height = scanner.nextInt();
                        yt = new YellowTulip(price, height, rn.nextInt(3)+1);
                        flowers.add(yt);
                        break;
                    case "violet":
                        System.out.println("Enter the prise: ");
                        price = scanner.nextDouble();
                        System.out.println("Enter the height: ");
                        height = scanner.nextInt();
                        vt = new VioletTulip(price, height, rn.nextInt(3)+1);
                        flowers.add(vt);
                        break;
                    default:
                        System.out.println("Try again");
                        Bouquet.newFlower();
                }
                break;
            case "rose":
                System.out.println("RED or WHITE rose:");
                color = scanner.nextLine();
                color.toLowerCase();
                switch (color){
                    case "red":
                        System.out.println("Enter the prise: ");
                        price = scanner.nextDouble();
                        System.out.println("Enter the height: ");
                        height = scanner.nextInt();
                        rr = new RedRose(price, height, rn.nextInt(3)+1);
                        flowers.add(rr);
                        break;
                    case "white":
                        System.out.println("Enter the prise: ");
                        price = scanner.nextDouble();
                        System.out.println("Enter the height: ");
                        height = scanner.nextInt();
                        wr = new WhiteRose(price, height, rn.nextInt(3)+1);
                        flowers.add(wr);
                        break;
                    default:
                        System.out.println("Try again");
                        Bouquet.newFlower();
                }
                break;
            default:
                System.out.println("try again");
                newFlower();
        }

        Menu.showMenu();
    };
}
