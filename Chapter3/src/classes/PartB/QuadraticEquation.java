package classes.PartB;


import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    private double x1;
    private double x2;

    private double x0;
    private double y0;

    public static double min1;
    public static double min2;
    public static double max1;
    public static double max2;

    public static List<QuadraticEquation> equationsArray = new ArrayList<QuadraticEquation>();

    public static void addEquation(QuadraticEquation equation){
        equationsArray.add(equation);
    }

    public static void findMinAndMaxRoots(List<QuadraticEquation> list){
        for (QuadraticEquation l : list){
            l.getRoots();
        }
        min1 = list.get(0).x1;
        min2 = list.get(0).x2;
        max1 = list.get(0).x1;
        max2 = list.get(0).x2;

        for(int i=1; i<list.size(); i++){
            if(min1>list.get(i).x1){
                min1 = list.get(i).x1;
            }
            if(min2>list.get(i).x2){
                min2 = list.get(i).x2;
            }


            if(max1<list.get(i).x1){
                max1 = list.get(i).x1;
            }
            if(max2>list.get(i).x2){
                max2 = list.get(i).x2;
            }
        }

        System.out.println("Minimum roots: x1="+ min1 + " x2=" + min2);
        System.out.println("Maximum roots: x1="+ max1 + " x2=" + max2);
    }



    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getRoots(){
        if(this.findDiscriminant() < 0){
            System.out.println("No roots");
        } else if(findDiscriminant() == 0) {
            this.x1 = (-this.b) / (2 * this.a);
            this.x2 = (-this.b) / (2 * this.a);
            System.out.println("x1=x2 = " + this.x1);
        } else {
            this.x1 = (-b+Math.sqrt(this.findDiscriminant()))/(2*a);
            this.x2 = (-b-Math.sqrt(this.findDiscriminant()))/(2*a);

            System.out.println("x1=" + this.x1 + "\n" + "x2="+ this.x2);
        }
    }

    public double findDiscriminant(){
        return (this.b*this.b - 4*this.a*this.c);
    }

    public String findExtremum(){
        if(this.a!=0) {
            this.x0 = -this.b / (2 * this.a);
            this.y0 = -(this.b * this.b - 4 * this.a * this.c) / (4 * this.a);
            if (this.a < 0) {
                return ("Max point: x=" + this.x0 + " y=" + this.y0);
            } else {
                return ("Min point: x=" + this.x0 + " y=" + this.y0);
            }
        } else {
            return("This equation is not quadratic");
        }
    }

    public void getExtremum(){
        System.out.println(this.findExtremum());
    }

    public String findInterval(){
        this.findExtremum();
        if(this.a>0){
            return "Decrease Interval: (-(infinite);" + this.x0 + ")\n" + "Increase Interval: (" + this.x0 + ";+(infinite))";
        }  else {
            return "Increase Interval: (-(infinite);" + this.x0 + ")\n" + "Decrease Interval: (" + this.x0 + ";+(infinite))";
        }
    }

    public void getInterval(){
        System.out.println(this.findInterval());
    }


}