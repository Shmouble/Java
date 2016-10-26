package classes.partA.parts;

import classes.partA.parts.City;

public class District {
    private String name;
    private int size;
    private String cityName;
    private String capitalName;
    private boolean capitalDistrict;
    private boolean areaCenter;

    public District(){

    }

    public District(String name){
        this.name = name;
    }

    public District(String name, int size) {
        this.name = name;
        this.size = size;
    }


    // GET AND SET

    public void setName(String name){
        this.name = name;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setCapital(String city){
        this.capitalDistrict = true;
        this.cityName = city;
        this.capitalName = city;
        this.areaCenter = true;
    }

    public void setArea(City city){
        this.cityName = city.getName();
        if(city.getCapital()){
            this.capitalName = city.getName();
            this.capitalDistrict = true;
            this.areaCenter = true;
        }
        if(city.getAreaCenter()){
            this.areaCenter = true;
        }
    }

    public boolean ifCapital(){
        return capitalDistrict;
    }

    public String getCapitalName(){
        return this.capitalName;
    }

    public int getSize(){
        return this.size;
    }

    public String getName(){
        return this.name;
    }

    public boolean getAreaCenter(){
        return this.areaCenter;
    }

    public String getCityName(){
        return  this.cityName;
    }
}
