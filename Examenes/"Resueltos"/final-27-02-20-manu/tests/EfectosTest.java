import org.junit.Assert;
import org.junit.Test;

public class EfectosTest {

    @Test
    public void testAgregarCincoAlFinal() {
        String cadena = null;
        try {
            cadena = FabricaDeEfectos.efectoAgregarCincoAlFinal("algo");
        } catch (CadenaVaciaException e) {
            Assert.fail();
        }
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {
        String cadena = null;
        try {
            cadena = FabricaDeEfectos.efectoAgregarOchoAlFinal("ALGO");
        } catch (CadenaVaciaException e) {
            Assert.fail();
        }
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
        String cadena = null;
        try {
            cadena = FabricaDeEfectos.efectoDarVueltaYPrimeraMayuscula("algo");
        } catch (CadenaVaciaException e) {
            Assert.fail();
        }
        Assert.assertEquals("Ogla", cadena);
    }

    @Test
    public void testPrimeraMayuscula() {
        String cadena = null;
        try {
            cadena = FabricaDeEfectos.efectoPrimeraMayuscula("algo");
        } catch (CadenaVaciaException e) {
            Assert.fail();
        }
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        String cadena = null;
        try {
            cadena = FabricaDeEfectos.efectoPrimeraMayusculaYAgregar8("algo");
        } catch (CadenaVaciaException e) {
            Assert.fail();
        }
        Assert.assertEquals("Algo8", cadena);
    }

    @Test
    public void testEfectoAgregarCincoAlFinalNoSeAplicaACadenaVacia() {
        try {
            String cadena = FabricaDeEfectos.efectoAgregarCincoAlFinal("");
            Assert.fail();
        } catch (Exception exception) {
            Assert.assertEquals(CadenaVaciaException.class, exception.getClass());
        }
    }

    @Test
    public void testEfectoAgregar3AlFinalYPrimeraMinuscula() {
        String cadena = null;
        try {
            cadena = FabricaDeEfectos.efectoAgregarTresYPrimeraMinuscula("ALGO");
        } catch (CadenaVaciaException e) {
            Assert.fail();
        }

        Assert.assertEquals("aLGO3", cadena);
    }

    @Test
    public void testEfectoDarVueltaPrimeraMinusculaYAgregar4AlFinal() {
        String cadena = null;
        try {
            cadena = FabricaDeEfectos.efectoDarVueltaPrimeraMinusculaYAgregarCuatro("ALGO");
        } catch (CadenaVaciaException e) {
            Assert.fail();
        }

        Assert.assertEquals("oGLA4", cadena);
    }

}
