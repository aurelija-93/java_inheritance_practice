import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Pam", "ABC456", 11111.22);
    }

    @Test
    public void hasName() {
        assertEquals("Pam", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("ABC456", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(11111.22, databaseAdmin.getSalary(), 0.001);
    }
}
