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

        assertEquals(6.0,c.sumarNumeros());
    }


}
