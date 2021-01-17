package OldExam2020;

import java.util.*;

public class Portfolio {

    private Set<Property> offers = new HashSet<Property>();
    private int value;

    /** Returns all properties from the offer. */
    public Set<Property> getOffers() {
        return offers;
    }

    /** Returns the value of the portfolio. */
    public int getValue() {
        return value;
    }

    /**
     * Returns a map containing the properties grouped according
     * to the number of rooms.
     */
    public Map<Integer, Set<Property>> groupInRooms() {
    Map<Integer,Set<Property>> result = new HashMap<>();
        for(Property p:offers){
            int rooms=p.getRooms();
            if(result.containsKey(rooms))
                result.get(rooms).add(p);
            else{
                Set<Property> properties=new HashSet<>();
                properties.add(p);
                result.put(rooms,properties);
            }
        }

        return result;
    }

    /**
     * Returns a sorted list of Properties in this portfolio
     * from low to high price.
     */
    public List<Property> sortByPrice() {
        List<Property> result = new ArrayList<>();
        for (Property o : offers)
            result.add(o);

            for (int i = 0; i < result.size(); i++) {
                for (int j = 0; j < result.size() - 1; j++) {

                    if(result.get(j).getPrice()>result.get(j+1).getPrice()){
                        Property temp=result.get(j);
                        result.set(j,result.get(j+1));
                        result.set((j+1),temp);

                    }
                }
            }
        return result;
    }
    public void addProperty (Property p) {
        offers.add(p);
        value += p.getPrice();
    }

    public void removeProperty(Property p) throws RemovePropertyException{
        if(offers.contains(p)){
            offers.remove(p);
            value=value- (int) p.getPrice();
        }else{

            throw new RemovePropertyException();
        }

    }

    public Set<Property> removeProperties(Set<Property> ps){

        Set<Property> result=new HashSet<>();
        for (Property q : ps){
            try{
                removeProperty(q);
            }
            catch(RemovePropertyException ex){
                result.add(q);
            }
        }
    return result;
    }





}


