package classes.partB;


import classes.partB.Exceptions.NumberInputException;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the variant: \n" +
                "1 - Add new flower;\n" +
                "2 - See your bouquet;\n" +
                "3 - Find flower by height;\n" +
                "4 - sort by oldness"
        );

        System.out.print("Enter the number: ");

        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println();
            System.out.println("Bom-Bom");
            System.out.println("Invalid input");
            System.out.println("Only integer");
            System.out.println();
        }
        checkInput(input);
        input = 0;
    }

    public static void checkInput(int input){
        int min;
        int max;
        Scanner scanner = new Scanner(System.in);
        switch (input){
            case 1:
                Bouquet.newFlower();
                break;
            case 2:
                System.out.println("Your flowers:");
                for(Flower flower : Bouquet.flowers){
                    System.out.println(flower.kind);
                }
                System.out.println();
                Menu.showMenu();
                break;
            case 3:
                System.out.println("Enter min height");
                min = scanner.nextInt();
                System.out.println("Enter max height");
                max = scanner.nextInt();

                for (Flower flower : Bouquet.flowers){
                    if(flower.getHight()>min && flower.getHight()<max) {
                        System.out.println(flower.kind);
                    }
                }
                System.out.println();
                Menu.showMenu();
                break;
            case 4:
                Collections.sort(Bouquet.flowers, new Comparator<Flower>() {
                    @Override
                    public int compare(Flower o1, Flower o2) {
                        if (o1.getDaysOld()<o2.getDaysOld()){
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                });
                for (Flower flower : Bouquet.flowers){
                    System.out.println("Flower: " + flower.kind + "; Days old: " + flower.getDaysOld());
                }
            default:
                System.out.println("Try again");
                showMenu();
        }
    }

}
