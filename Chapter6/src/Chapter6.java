import task.ships.aircraft.AircraftCarrier;

public class Chapter6 {
    public  static  void main(String[] args){
        AircraftCarrier oscarAustin = new AircraftCarrier("Oscar Austin", 2);

        oscarAustin.setDestination("Iraq");
        oscarAustin.startEngine();
        oscarAustin.setMovementSpeed(12);

        System.out.println(oscarAustin.toString());
    }

}
