package by.yura;

import hello.HelloWorld;
import java.util.Scanner;
import java.util.Random;


public class MyClass {
    public static void main(String[] args){
        HelloWorld.main(args);
        /* A1
        System.out.println("Введите ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();*/

        /* A2
        System.out.println(args.length);

        for (int i=args.length-1; i>=0; i--){
            System.out.println(args[i]);
        } */

        /* A3
        Random rand = new Random();

        System.out.println("Введите количество чисел: ");
        Scanner scan = new Scanner(System.in);
        String numb = scan.next();
        int r = Integer.parseInt(numb);
        for(int i=0; i<r; i++){
            System.out.println(rand.nextInt(50));
        }
        for(int i=0; i<r; i++){
            System.out.print(rand.nextInt(50) + " ");
        } */

        /* A4
        String pass = "kkk";
        System.out.println("Введите пароль: ");
        Scanner scan = new Scanner(System.in);
        String enteredPass = scan.next();

        if(pass.equals(enteredPass)){
            System.out.println("Пароль верный!");
        } else {
            System.out.println("Пароль неверный");
        } */

        /* A5
        int sum = 0;
        int sumElement;
        for(int i=0; i<args.length; i++){
            sumElement = Integer.parseInt(args[i]);
            sum = sum + sumElement;
        }
        System.out.println(sum);
        */


    }
}
