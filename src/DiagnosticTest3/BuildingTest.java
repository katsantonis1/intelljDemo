package DiagnosticTest3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class BuildingTest {////

    private Building building;


    void setUp() throws Exception {
        building=new Building();
        building.addRoom(new PrivateOfficeRoom("10.1",10));
        building.addRoom(new OfficeRoom("10.2",true,20,15));
        building.addRoom(new OfficeRoom("10.3",false,7,3));
        building.addRoom(new PrivateOfficeRoom("10.4",12));
        building.addRoom(new OfficeRoom("10.5",false,20,20));

    }

    public void testSortByPrice(){
        List<Room> testResult = building.sortBySize();

        //test if 2 lists are the same size
        assertEquals(testResult.size(),building.getRooms().size());

        // test if its sorted
        for(int i=1; i<testResult.size();i++){
            assertTrue(testResult.get(i-1).getPrice() <=testResult.get(i).getPrice());
        }

        //test if every offer in the portofolio is in the List
        for(Room p:building.getRooms()){
            assertTrue(testResult.contains(p));

        }

    }


}
