import classes.partA.State;
import classes.partA.parts.Area;
import classes.partA.parts.District;
import classes.partA.parts.City;
import classes.partB.Menu;

import java.util.Scanner;

public class Chapter4 {
    public static  void main(String[] args){
        Menu.showMenu();
    }
}


/* patr A
        State Terra = new State("Terra");

        City city1 = new City("Hamburg", false, false);
        City city2 = new City("Athens", true, true);
        City city3 = new City("St. Petersburg", true, false);
        City city4 = new City("Paris", false, false);

        District d1 = new District("d1", 23);
        d1.setArea(city1);
        District d2 = new District("d2", 12);
        d2.setArea(city2);
        District d3 = new District("d3", 14);
        d3.setArea(city3);
        District d4 = new District("d4", 17);
        d3.setArea(city4);

        Area area1 = new Area("A1", d1, d2);
        area1.setCapital();
        Area area2 = new Area("A2", d3, d4);
        area2.setCapital();

        Terra.addAreas(area1);
        Terra.addAreas(area2);

        Terra.setCapital();
        System.out.println(Terra.getCapital());
        System.out.println("Number of areas: " + Terra.getAreasNumber());
        System.out.println("Size: " + Terra.getSize());
        Terra.getAreaCenters();
        System.out.println("Area centers: ");
        for(String center : Terra.areaCenters){
            System.out.println(center);
        }

        System.out.print(Terra.toString());
        */