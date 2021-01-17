package OldExam2020Resit;

public class Movie extends AbstractEntry{
    private int releaseYear;


    public Movie(String title,int releaseYear){
        super(title);
        this.releaseYear=releaseYear;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }

}
