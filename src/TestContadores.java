import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestContadores {
    
    @Test
    public void testContador(){
        Contador c = new Contador(2,2,6);
    }

    @Test
    public void testIncremental(){
        Contador c = new Contador(2,2,10);

        assertEquals(2.0,c.sumarNumeros());
    }

    @Test
    public void testReseteo(){
        Contador c = new Contador(2,6,29);
        assertEquals(29, c.resetearNumeros());
    }


}
