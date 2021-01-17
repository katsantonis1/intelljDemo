package OldExam2020Resit;
import static org.junit.jupiter.api.Assertions.*;

public class TVSeriesTest {

    TVSeries b1 = new TVSeries("Wheel of Time");
    void setUp() throws Exception{
        b1.rate(4);
        b1.addEpisodes();
        b1.addEpisodes();

    }

    public void Test(){
        b1.rate(4);
        b1.rate(4);
        b1.rate(4);
        b1.rate(4);

        assertEquals((4+4+4+4)/4,b1.getAverrageRating());
        assertEquals(4,b1.getNumberOfRating());

        assertEquals(1,b1.getEpisodes());
        b1.addEpisodes();
        b1.addEpisodes();

        assertEquals(3,b1.getEpisodes());
    }
}
