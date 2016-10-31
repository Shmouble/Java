package task.ships;

import task.impementing.Ship;



public abstract class MilitaryShip implements Ship {
    protected double speed;
    protected boolean engineWorking;
    protected String destination;
    protected String name;

    public void startEngine(){
        this.engineWorking = true;
    }

    public void stopEngine(){
        this.engineWorking = false;
    }

    public void setMovementSpeed(double speed){
        if (this.engineWorking){
            this.speed = speed;
        } else {
            System.out.println("Двигатель выключен!");
        }
    }

    public void setDestination(String dest){
        this.destination = dest;
    }

    public void setName(String name){
        this.name = name;
    }

    public String  getDestination(){
        return this.destination;
    }

    public double getSpeed(){
        return this.speed;
    }

    public String getName(){
        return this.name;
    }
}
