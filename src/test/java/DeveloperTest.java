import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jim", "ABC789", 22222.33);
    }

    @Test
    public void hasName() {
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("ABC789", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(22222.33, developer.getSalary(), 0.001);
    }
}
