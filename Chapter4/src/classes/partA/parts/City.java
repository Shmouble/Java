package classes.partA.parts;

import classes.partA.parts.District;
import classes.partA.parts.Area;



public class City {
    private String name;
    private boolean areaCenter;
    private boolean capital;

    public City(String name){
        this.name = name;
    }

    public City(String name, boolean center, boolean capital){
        this.name = name;
        this.areaCenter = center;
        this.capital = capital;
    }


    // GET AND SET

    public void setAreaCenter(boolean center){
        this.areaCenter = center;
    }

    public void setCapital(boolean capital){
        this.capital = capital;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean getAreaCenter(){
        return this.areaCenter;
    }

    public boolean getCapital(){
        return this.capital;
    }
}
