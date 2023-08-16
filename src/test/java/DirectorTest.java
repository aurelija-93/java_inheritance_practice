import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before() {
        director = new Director("Jan", "DEF123", 23456.78, "Regional", 123456.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jan", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("DEF123", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(23456.78, director.getSalary(), 0.001);
    }

    @Test
    public void hasDept() {
        assertEquals("Regional", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(123456.00, director.getBudget(), 0.001);
    }

    @Test
    public void canChangeName() {
        director.setName("Michael");
        assertEquals("Michael", director.getName());
    }

    @Test
    public void cannotSetNullName() {
        director.setName(null);
        assertEquals("Jan", director.getName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(0.22);
        assertEquals(23457.00, director.getSalary(), 0.001);
    }

    @Test
    public void cannotLowerSalary() {
        director.raiseSalary(-10.00);
        assertEquals(23456.78, director.getSalary(), 0.001);
    }

    @Test
    public void canCalculateBonus() {
        assertEquals(469.14, director.payBonus(), 0.001);
    }
}
