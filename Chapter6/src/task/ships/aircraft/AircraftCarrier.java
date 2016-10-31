package task.ships.aircraft;


import task.ships.MilitaryShip;

public class AircraftCarrier extends MilitaryShip {
    private int numberOfPlanes;

    public AircraftCarrier(String name, int planes){
        this.name = name;
        this.numberOfPlanes = planes;
    }

    public AircraftCarrier(String name){
        this.name = name;
    }

    public String toString(){
        String s = "";
        s += "Name: " + this.getName() + "\n";

        if(numberOfPlanes > 0){
            s += "Number of planes: " + this.getNumberOfPlanes() + "\n";
        } else {
            s += "Number of planes not set\n";
        }

        if(engineWorking){
            s += "Engine: on\n";
        } else {
            s += "Engine: off\n";
        }

        if(speed > 0){
            s += "Speed: " + this.getSpeed() + "\n";
        } else {
            s += "Speed: 0\n";
        }

        if (this.destination != null){
            s += "Destination: " + this.getDestination() + "\n";
        } else {
            s += "Destination not set";
        }

        return s;
    }

    public void setNumberOfPlanes(int planes){
        this.numberOfPlanes = planes;
    }

    public int getNumberOfPlanes(){
        return  this.numberOfPlanes;
    }
}
