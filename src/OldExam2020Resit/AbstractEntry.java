    package OldExam2020Resit;

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;

    abstract public class AbstractEntry implements Entry, Comparable<Entry>{

    private String title;
    private List<Integer> ratings;
    private int sum;

    public AbstractEntry(String title){
        this.title=title;
        this.ratings=new ArrayList<>();
        this.sum=0;
    }

    public String getTitle(){
        return title;
    }

    public double getAverrageRating(){
        return ((double)sum) /this.ratings.size();
    }

    public int getNumberOfRating(){
        return this.ratings.size();
    }

    public void rate(int rate){
       this.ratings.add(rate);
       sum=sum+rate;
    }

        public int compareTo(Entry other){
        double myAverage=this.getAverrageRating();
        double othersAverage=other.getAverrageRating();
        return Double.compare(myAverage,othersAverage);
        }


    }
