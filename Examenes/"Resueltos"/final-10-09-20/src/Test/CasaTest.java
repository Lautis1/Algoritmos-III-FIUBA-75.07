package Test;


import org.junit.jupiter.api.Test;

import Excepciones.CapacidadDeSalamandraExcedidaError;
import modelo.Casa;
import modelo.CercoElectrico;
import modelo.ComponenteHogareño;
import modelo.Estufa;
import modelo.LosaRadiante;
import modelo.Pino;
import modelo.Quebracho;
import modelo.Salamandra;

public class CasaTest {

    @Test
    public void testCasaConEstufaLosaYCercoDeberiaDevolverGastoDe11100Pesos() throws Exception {
        Casa casa =  new Casa();

        ComponenteHogareño estufaDelBanio = new Estufa(1000); //de 1000 calorias

        casa.agregarComponenteACasa(estufaDelBanio);

        ComponenteHogareño losaComedor = new LosaRadiante(100); //100 metros cuadrados

        casa.agregarComponenteACasa(losaComedor);

        ComponenteHogareño cercoFondo = new CercoElectrico(10); //para 10 metros

        casa.agregarComponenteACasa(cercoFondo);

        org.junit.Assert.assertEquals(11100, casa.getGastoTotal());
    }
    
    @Test
    public void testCasaConSalamandraAQuebrachoParaCubrir10M2DeberiaDevolverGastoDe400() throws Exception{
    	Casa casa2  = new Casa();
    	ComponenteHogareño salamandraAQuebracho = new Salamandra(10);
    	((Salamandra) salamandraAQuebracho).agregarMadera(new Quebracho());
    	casa2.agregarComponenteACasa(salamandraAQuebracho);
    	org.junit.Assert.assertEquals(400, casa2.getGastoTotal());
    }
    
    @Test
    public void testCasaConSalamandraAPinoParaCubrirMasDe30M2DeberiaLanzarExcepcion() throws Exception{
    	Casa casa3 = new Casa();
    	ComponenteHogareño salamandraAPino = new Salamandra(32);
    	((Salamandra) salamandraAPino).agregarMadera(new Pino());
    	casa3.agregarComponenteACasa(salamandraAPino);
    	casa3.getGastoTotal();
    	org.junit.Assert.fail();
    }
}
