import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Eric", "bla", 15000, "IT", 1000000);
    }

    @Test
    public void hasABudget(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }
}
