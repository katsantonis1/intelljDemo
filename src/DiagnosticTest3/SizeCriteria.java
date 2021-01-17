package DiagnosticTest3;

import java.util.HashSet;
import java.util.Set;

public class SizeCriteria implements SearchCriteria{
private double min;
private double max;

public SizeCriteria(double min,double max){

    this.min=min;
    this.max=max;
}

    @Override
    public Set<Room> matches(Building b) {
        Set<Room> result= new HashSet<>();
        for(Room a: b.getRooms()){
            if(a.getSize()>=min && a.getSize()<=max){
                result.add(a);
            }
        }
   return result;
    }

    public static Set<Room> bestPricedRooms(Set<Room> rooms){

   Set<Room> result=new HashSet<>();
   double lowestPrice=-1;
   for(Room p :rooms){
       if(lowestPrice<0 || p.getPrice()<lowestPrice){

           lowestPrice=p.getPrice();
           result.clear();
       }

       if(lowestPrice==p.getPrice()){

           result.add(p);
       }
   }
   return result;

    }
}
