import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TestContadores {

    @Test
    public void siExiste(){
        Contador c = new Contador(0,15,1);

        assertNotNull(c);
    }

    @Test
    public void testIncremental(){
        Contador c = new Contador(2,2,10);
        c.sumarNumeros();

        assertEquals(2,c.getValorIncremental());
    }

    @Test
    public void testReseteo(){
        Contador c = new Contador(2,6,29);
        c.sumarNumeros();
        c.resetearNumeros();

        assertEquals(2,c.getValorInicial());
    }

    @Test
    public void valorActual(){

        Contador c = new Contador(2,2,10);

        assertEquals(10,c.sumarNumeros());
    }

    @Test
    public void valoresError(){
        Contador c = new Contador(2,3,2);

        c.sumarNumeros();

        assertEquals(2,c.getValorActual());
    }


}
