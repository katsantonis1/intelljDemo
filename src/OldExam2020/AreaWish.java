package OldExam2020;

import java.util.HashSet;
import java.util.Set;

public class AreaWish implements CustomerWish{
    private double min;
    private double max;

    public AreaWish(double min,double max){
        this.min=min;
        this.max=max;
    }

    public Set<Property> matches(Portfolio p){
        Set<Property> result =new HashSet<>();
        for(Property o: p.getOffers()){
            if(o.getTotalArea()>=min &&o.getTotalArea()<=max){
                result.add(o);
            }
        }
        return result;
    }

    public Set<Property>  bestPricedProperties(Set<Property> ps) {
        Set<Property> result = new HashSet<>();
        double lowestPrice = -1;
        for (Property p : ps) {
            if (lowestPrice < 0 || p.getPrice() < lowestPrice) {
                lowestPrice = p.getPrice();
                result.clear();
            }

            if (p.getPrice() == lowestPrice){
                result.add(p);

            }
        }
    return result;
    }
    }
