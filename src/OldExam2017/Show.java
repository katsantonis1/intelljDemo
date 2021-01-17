package OldExam2017;

public interface Show {

    public enum Genre{
        COMEDY,MUSICAL,WESTERN,ROMANCE,;
    }

    /**
     * @pure
     * @ensures result>=0
     */
    public double getPrice();//

    /**
     * @pure
     * @ensures result>=0 && result<=100
     */
    public double getDiscount();

    /**
     * @requires discount>=0 && discount<=100
     * @ensures getDiscount()==discount
     */
    public void setDiscount(int discount);

    /**
     * @pure
     * @ensures result=getPrice()*(100-getDiscount())/100
     */
    public double getDiscountPrice();

    /**
     * @pure
     * @ensures result!=null
     */
    public Location getLocation();

    /**
     * @pure
     * @ensures result==getLocation().capacity
     */
    public int getCapacity();


}
