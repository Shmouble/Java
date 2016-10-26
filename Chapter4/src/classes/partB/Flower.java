package classes.partB;




public class Flower {
    protected int height;
    protected double price;
    protected int daysOld;
    public String kind;
/*
    public  Flower(int height, double price, int days, String kind){
        this.height = height;
        this.price = price;
        this. daysOld = days;
        this.kind = kind;
    }
*/
    public void setHight(int hight){
        this.height = hight;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDaysOld(int days){
        this.daysOld = days;
    }


    public int getHight(){
        return this.height;
    }

    public double getPrice(){
        return this.price;
    }

    public int getDaysOld(){
        return this.daysOld;
    }
}
