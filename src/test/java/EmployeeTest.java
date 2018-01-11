import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

 Employee employee;


    @Before
    public void before(){
        employee = new Employee("Alison", "JT027305X", 9000);

    }

    @Test
    public void employeeHasAName(){
        assertEquals("Alison", employee.getName());
    }

    @Test
    public void employeeHasNiNumber(){
        assertEquals("JT027305X", employee.getNiNumber());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(9000, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(100);
        assertEquals(9100, employee.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(90, employee.payBonus(), 0.01 );
    }

}
