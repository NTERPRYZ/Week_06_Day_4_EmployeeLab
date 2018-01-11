import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Robert", "JW243546N", 12000);
    }

    @Test
    public void managereHasAName(){
        assertEquals("Robert", manager.getName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals("JW243546N", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(12000, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(100);
        assertEquals(12100, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(120, manager.payBonus(), 0.01 );
    }
}
