package OldExam2020;

public class Apartment implements Property{

    private double price;
    private String address;
    private int rooms;
    private double area;

    public Apartment(double price,String address,int rooms,double area){
        this.price=price;
        this.address=address;
        this.rooms=rooms;
        this.area=area;

    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getAddress(){
        return address;
    }

    @Override
    public int getRooms(){
        return rooms;
    }

    @Override
    public double getLivingArea(){
        return area;
    }

    @Override
    public double getTotalArea(){
        return area;
    }

}
