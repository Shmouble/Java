package classes.partA;

import classes.partA.parts.Area;
import classes.partA.parts.City;
import classes.partA.parts.District;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class State {
    private String name;
    private int size;
    private String capital;
    private int areasNumber;

    public List<Area> areas = new ArrayList<Area>();
    public List<String> areaCenters = new ArrayList<String>();

    public State(String name){
        this.name = name;
    }

    public void addAreas(Area area){
        areas.add(area);
    };



    //equals, hashCode, toString
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }

        State other = (State) obj;

        if(this.name !=other.name){
            return false;
        }
        if(this.size !=other.size){
            return false;
        }
        if(this.capital !=other.capital){
            return false;
        }
        if(this.areasNumber != other.areasNumber){
            return false;
        }
        if(!this.areas.equals(other.areas)){
            return false;
        }
        if(this.name == null){
            if(other.name !=null){
                return false;
            }else if(!this.name.equals(other.name)){
                return false;
            }
        }
        if(this.capital == null){
            if(other.capital !=null){
                return false;
            }else if(!this.capital.equals(other.capital)){
                return false;
            }
        }

        return true;
    }


    public int hashCode(){
        return (int) 29*areas.size() + this.size + ((this.name==null)? 0: name.hashCode()) + ((this.capital==null)? 0: capital.hashCode());
    }

    public String toString(){
        String ret = getClass().getName() + "@name" + name + "\nAreas: ";
        for(Area area : areas){
            ret += area.getName();
            ret += "\n";
        }
        if (capital != null){
            ret += "\nCapital: " + getCapital();
        } else {
            setCapital();
            ret += "\nCapital: " + getCapital();
        }
        return ret;
    }









    public void calcSize(){
        for(Area area : areas){
            this.size += area.getSize();
        }
    }

    public void setCapital(){
        for(Area area : areas){
            if(area.ifCapital()){
                this.capital = area.getCapitalName();
            }
        }
    }


    public void setName(String name){
        this.name = name;
    }

    public int getSize(){
        calcSize();
        return this.size;
    }


    public int getAreasNumber(){
        this.areasNumber = areas.size();
        return this.areasNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getCapital(){
        return this.capital;
    }

    public void getAreaCenters(){
        for(Area area : areas){
            for(District district : area.getDistrictList()){
                if(district.getAreaCenter()){
                    areaCenters.add(district.getCityName());
                }
            }
        }
    }
}
