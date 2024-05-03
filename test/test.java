import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class cocheTest {

    @Test
    public void testCrearCoches() {
        CocheParking parking = new CocheParking();
        parking.crearCoches("Toyota", "ABC123");

        assertNotNull(parking.getCoches("ABC123"));
    }

    @Test
    public void testCambiarVelocidad() {
        CocheParking parking = new CocheParking();
        parking.crearCoches("Toyota", "ABC123");
        parking.cambiarVelocidad("ABC123", 100);

        assertEquals(100, parking.getVelocidad("ABC123"));
    }

    @Test
    public void testGetCoches() {
        CocheParking parking = new CocheParking();
        parking.crearCoches("Toyota", "ABC123");

        assertNotNull(parking.getCoches("ABC123
