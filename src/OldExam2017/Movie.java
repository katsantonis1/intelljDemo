package OldExam2017;

import java.util.HashSet;
import java.util.Set;

public class Movie implements TypedShow{

    private final Set<Genre> genres;
    private final double price;
    private final Location location;
    private int discount;


    public Movie(double price,Location location){
        this.genres=new HashSet<>();
        this.price=price;
        this.location=location;
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public double getDiscount(){
        return discount;
    }

    @Override
    public void setDiscount(int discount){
        this.discount=discount;
    }
    @Override
    public double getDiscountPrice(){
        return getPrice()*(100-getDiscount())/100;
    }

    @Override
    public Location getLocation(){
        return location;
    }

    @Override
    public int getCapacity(){
        return getLocation().capacity;
    }

    @Override
    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    @Override
    public Set<Genre> getGenre(){
        return genres;
    }
}
