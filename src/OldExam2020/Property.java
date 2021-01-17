package OldExam2020;

public interface Property {

    /**
     *
     * @ensures result>=0
     */
    public double getPrice();

    /**
     *
     * @ensures result!=null
     */
    public String getAddress();

    /**
     *
     * @ensures result>=1
     */
    public int getRooms();

    /**
     *
     * @ensures result>=0
     */
    public double getLivingArea();

    /**
     *
     * @ensures result>=getLivingArea()
     */
    public double getTotalArea();
}
