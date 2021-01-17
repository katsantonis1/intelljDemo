package DiagnosticTest3;

public interface Room {

    /**
    ensures: result !=null;
     */
    public String getRoomNumber();

    /**
    ensures: result==true || result==false
     */
    public boolean hasLock();

    /**
     * ensures: result>=0
     */
    public int getCapacity();

    /**
     *ensures: result>=0;
     */
    public int getWindows();

    /**
     *ensures: result>=0;
     */
    public double getPrice();

    /**
     * ensures: result>=0;
     */
    public double getSize();


}
