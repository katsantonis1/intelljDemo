package OldExam2020Resit;

public class TVSeries extends AbstractEntry{

    private int episodes;

    /**
     * @requires title != null
     * @ensures  getTitle() == title && getEpisodes() == 1
     */
    public TVSeries(String title){
        super(title);
        this.episodes=1;
    }

    /**
     * gets the number of episodes from the series
     * @ensures result>0
     */
    public int getEpisodes(){

        return this.episodes;
    }

    /**
     * adds an episode to the series
     * @requires getEpisodes== old.getEpisodes+1
     */
    public void addEpisodes(){
        episodes++;
    }
}
