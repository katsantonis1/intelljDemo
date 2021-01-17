package DiagnosticTest3;

public class OfficeRoom implements Room {

    private String roomNumber;
    private boolean lock;
    private double price;
    private double size;
    private int SQUARE_METERS_PER_PERSON= 7;



    public OfficeRoom(String roomNumber,boolean lock,double price,double size){
        this.roomNumber=roomNumber;
        this.lock=lock;
        this.price=price;
        this.size =size;
    }

    @Override
    public String getRoomNumber(){
        return this.roomNumber;
    }

    @Override
    public boolean hasLock(){
        return this.lock;
    }

    @Override
    public int getCapacity(){
        return (int)getSize() /SQUARE_METERS_PER_PERSON;
    }

    @Override
    public int getWindows(){
        return 1;
    }

    @Override
    public double getPrice(){
        return this.price;
    }

    @Override
    public double getSize(){
        return this.size;
    }

}
