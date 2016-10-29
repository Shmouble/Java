package chapter.tasks;



public class Film {
    private String title;
    private FilmInfo info;

    public Film(String title){
        this.title = title;
    }

    public Film(String title, int duration, String genre, String director){
        this.title = title;

        this.info = new FilmInfo(duration, genre, director);
    }

    public Film(){
        super();

        this.info = new FilmInfo();
    }

    public class FilmInfo{
        private int duration;
        private String genre;
        private String director;

        public FilmInfo(int duration, String genre, String director){
            this. duration = duration;
            this.genre = genre;
            this.director = director;
        }

        public FilmInfo(){
            super();
        }

        public void setDuration(int duration){
            this.duration = duration;
        }

        public void setGenre(String genre){
            this.genre = genre;
        }

        public void setDirector(String director){
            this.director = director;
        }

        public int getDuration(){
            return this.duration;
        }

        public String getGenre(){
            return this.genre;
        }

        public String getDirector(){
            return this.director;
        }
    }


    public String toString(){
        return "Title: " + this.getTitle() + "\n" + this.getInfo();
    }

    //getters and setters
    public void setInfo(int duration, String genre, String director){
        if (info == null){
            info = new FilmInfo(duration, genre, director);
        } else {
            info.setDirector(director);
            info.setDuration(duration);
            info.setGenre(genre);
        }
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public String getInfo(){
        if (this.info != null){
            return ("Genre: " + info.getGenre() + "\nDuration: " + info.getDuration() + "\nDirector: " + info.getDirector());
        } else {
            return "There is no info!1!!1!";
        }
    }

}
