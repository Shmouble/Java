import chapter.tasks.Film;

public class Chapter5 {
    public static void main(String [] args){
        Film ivan = new Film("Ivan the Terrible: Back to the future");
        ivan.setInfo(93, "Comedy", "Gaidai");
        System.out.println(ivan.toString());
    }
}
