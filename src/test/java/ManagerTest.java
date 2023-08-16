import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Michael Scott", "ABC123", 12345.67, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("Michael Scott", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("ABC123", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(12345.67, manager.getSalary(), 0.001);
    }

    @Test
    public void hasDept() {
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(0.33);
        assertEquals(12346.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canCalculateBonus() {
        assertEquals(123.46, manager.payBonus(), 0.001);
    }
}
