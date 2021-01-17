package OldExam2020Resit;

public interface Entry {

    /**
     * Get title of the entry
     * @ensures result != null;
     */
    public String getTitle();

    /**
     *  Get average rating
     * @ensures result>=1 && result<=10
     */
    public double getAverrageRating();

    /**
     * Get total number of ratings
     * @ensures result>=0
     */
    public int getNumberOfRating();

    /**
     * add an entry
     * @requires rating>=1 && rating<=10
     *
     */
    public void rate(int rate);
}
