package classes.PartA;

public class House {
    private int id;
    private int apartmentNumber;
    private int size;
    private short floor;
    private short roomsNumber;
    private String street;
    private String type;
    private int serviceTerm;

    public House(int id, int apartmentNumber, short floor){
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.floor = floor;
    }

    public House(){
        super();
    }


    public String toString(){
        return "id: "+this.id + ", apartment number: " + this.apartmentNumber + ", floor: " + this.floor;
    }



    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }


    public void setApartmentNumber(int apartmentNumber){
        this.apartmentNumber = apartmentNumber;
    }
    public int getApartmentNumber(){
        return this.apartmentNumber;
    }


    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }


    public void setFloor(short floor){
        this.floor = floor;
    }
    public short getFloor(){
        return this.floor;
    }


    public void setRoomsNumber(short roomsNumber){
        this.roomsNumber = roomsNumber;
    }
    public short getRoomsNumber(){
        return this.roomsNumber;
    }


    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return this.street;
    }


    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }


    public void setServiceTerm(int serviceTerm){
        this.serviceTerm = serviceTerm;
    }
    public int getServiceTerm(){
        return this.serviceTerm;
    }
}
