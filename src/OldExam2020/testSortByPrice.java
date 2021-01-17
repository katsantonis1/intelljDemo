package OldExam2020;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class testSortByPrice {

    Portfolio pf= new Portfolio();
    void setUp() throws Exception{
        pf.addProperty(new Studio(12, "", 10));
        pf.addProperty(new Apartment(23, "", 4, 15));
        pf.addProperty(new Apartment(4, "", 2, 3));
        pf.addProperty(new Studio(0, "", 12));
        pf.addProperty(new Apartment(12, "", 3, 20));
    }

public void testSortByPrice(){
    List<Property> testResult=pf.sortByPrice();
    // Initially test if the two lists the same size
    assertEquals(testResult.size(),pf.getOffers().size());

    // Now test if it is sorted
    for(int i =0; i<=testResult.size();i++){
        assertTrue(testResult.get(i-1).getPrice()<=testResult.get(i).getPrice());
    }

    //test if every offer in the portofolio is in the List
    for(Property p: pf.getOffers()){
        assertTrue(testResult.contains(p));
    }
    }
}
