package classes.PartA;


import java.util.ArrayList;
import java.util.List;

public class Arraying {
    public static List<House> apartments = new ArrayList<House>();

    public static void addApartment(House apartment){
        apartments.add(apartment);
    }

    public static void numberOfRooms(List<House> ap, short n){
        for (House a : ap){
            if(a.getRoomsNumber() == n){
                System.out.println(a.toString() + ", rooms: " + n);
            }
        }
    }

    public static void roomsAndFlats(List<House> ap, short n, short minFloor, short maxFloor){
        for (House a : ap){
            if(a.getRoomsNumber() == n && a.getFloor()>=minFloor && a.getFloor()<=maxFloor){
                System.out.println(a.toString() + ", rooms: " + n);
            }
        }
    }

    public static void apartmentSize(List<House> ap, int sizee){
        for (House a : ap){
            if(a.getSize() > sizee){
                System.out.println(a.toString() + ", size: " + a.getSize());
            }
        }
    }
}
