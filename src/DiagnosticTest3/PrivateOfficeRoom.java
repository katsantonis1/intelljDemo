package DiagnosticTest3;

public class PrivateOfficeRoom extends OfficeRoom{



    public PrivateOfficeRoom(String roomNumber, double price) {
        super(roomNumber, true, price, 10);
    }

    @Override
    public int getCapacity(){
        return 1;
    }


}
