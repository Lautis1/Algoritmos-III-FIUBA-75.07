package modelo;


import org.junit.Assert;
import org.junit.Test;

public class EfectosTest {

    @Test
    public void testAgregarCincoAlFinal() {
    	Efecto efecto = new EfectoNumero("5");
        String cadena = efecto.aplicarA("algo");
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {
    	Efecto efecto = new EfectoNumero("8");
        String cadena = efecto.aplicarA("ALGO");
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
    	Efecto efectoDecorador = new VoltearYMayuscula(new EfectoMayuscula(), new EfectoVoltear());
        String cadena = efectoDecorador.aplicarA("algo");
        Assert.assertEquals("Ogla", cadena);
    }

   /* @Test
    public void testPrimeraMayuscula() {
        String cadena = FabricaDeEfectos.CrearEfectoPrimeraMayuscula().aplicarA("algo");
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        String cadena = FabricaDeEfectos.CrearEfectoPrimeraMayusculaYAgregarOcho().aplicarA("algo");
        Assert.assertEquals("Algo8", cadena);
    }

    @Test
    public void testEfectoAgregarCincoAlFinalNoSeAplicaACadenaVacia() {
        try {
            String cadena = FabricaDeEfectos.CrearEfectoAgregarCincoAlFinal().aplicarA("");
            Assert.fail("no se arrojo exception al aplicar en cadena vacia");
        } catch (RuntimeException exception) {
            Assert.assertEquals("no se puede aplicar efecto a cadena vacia", exception.getMessage());
        }
    }*/

}
