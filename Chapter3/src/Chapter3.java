

import classes.PartA.House;
import classes.PartA.Arraying;
import classes.PartB.QuadraticEquation;
import sun.security.util.Cache;

public class Chapter3 {
    public static void main(String[] args){

        /* A
        House house1 = new House(1, 23, (short)3);
        House house2 = new House(2, 56, (short)3);
        House house3 = new House(3, 72, (short)1);
        House house4 = new House(4, 94, (short)3);
        House house5 = new House(4, 102, (short)4);
        Arraying.addApartment(house1);
        Arraying.addApartment(house2);
        Arraying.addApartment(house3);
        Arraying.addApartment(house4);
        Arraying.addApartment(house5);
        house1.setRoomsNumber((short)2);
        house2.setRoomsNumber((short)1);
        house3.setRoomsNumber((short)3);
        house4.setRoomsNumber((short)3);
        house5.setRoomsNumber((short)4);
        house5.setSize(42);
        house4.setSize(39);
        house3.setSize(55);
        house2.setSize(56);
        house1.setSize(77);
        Arraying.numberOfRooms(Arraying.apartments, (short)3);
        System.out.println();
        Arraying.roomsAndFlats(Arraying.apartments, (short)3, (short)3, (short)5);
        System.out.println();
        Arraying.apartmentSize(Arraying.apartments, 55);
        */

        QuadraticEquation qe1 = new QuadraticEquation((double)8, (double)20, (double)7);

        qe1.getRoots();
        qe1.getExtremum();
        qe1.getInterval();

        QuadraticEquation qe2 = new QuadraticEquation((double)12, (double)9, (double)2);
        QuadraticEquation qe3 = new QuadraticEquation((double)8, (double)30, (double)4);
        QuadraticEquation qe4 = new QuadraticEquation((double)6, (double)21, (double)8);

        QuadraticEquation.addEquation(qe1);
        QuadraticEquation.addEquation(qe2);
        QuadraticEquation.addEquation(qe3);
        QuadraticEquation.addEquation(qe4);

        QuadraticEquation.findMinAndMaxRoots(QuadraticEquation.equationsArray);
    }
}





