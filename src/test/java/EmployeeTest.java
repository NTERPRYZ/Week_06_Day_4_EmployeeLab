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

}
