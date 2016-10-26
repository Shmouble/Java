package classes.partA.parts;




import java.util.ArrayList;
import java.util.List;


public class Area {
    private String name;
    private int size;
    private boolean capitalArea;
    private String capitalName;

    private List<District> districts = new ArrayList<District>();

    public Area(String name){
        this.name = name;
    }

    public Area(String name, District... areaDistricts){
        this.name = name;

        for(District district : areaDistricts){
            districts.add(district);
        }
    }

    public void setCapital(){
        for(District district : districts){
            if(district.ifCapital()){
                this.capitalArea = true;
                this.capitalName = district.getCapitalName();
            }
        }
    }


    public void setSize(List<District> districts){
        for(District district : districts){
            this.size += district.getSize();
        }
    }

    public int getSize(){
        calcSize();
        return this.size;
    }

    public boolean ifCapital(){
        return this.capitalArea;
    }

    public String getCapitalName(){
        return this.capitalName;
    }

    public List<District> getDistrictList(){
        return this.districts;
    }

    public void addDistrict(District district){
        districts.add(district);
    }

    public void calcSize(){
        for (District district : districts){
            this.size += district.getSize();
        }
    }

    public String getName(){
        return this.name;
    }
}
