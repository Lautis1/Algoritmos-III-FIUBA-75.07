package Test;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import modelo.CapacidadDeSalamandraExcedidaError;
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
    public void testCasaConEstufaLosaYCercoDeberiaDevolverGastoDe11100Pesos(){
        Casa casa =  new Casa();

        ComponenteHogareño estufaDelBanio = new Estufa(1000,1); //de 1000 calorias

        casa.agregarComponenteACasa(estufaDelBanio);

        ComponenteHogareño losaComedor = new LosaRadiante(100); //100 metros cuadrados

        casa.agregarComponenteACasa(losaComedor);

        ComponenteHogareño cercoFondo = new CercoElectrico(10); //para 10 metros

        casa.agregarComponenteACasa(cercoFondo);

        org.junit.Assert.assertEquals(11100, casa.getGastoTotal());
    }
    
    @Test
    public void testCasaConSalamandraAQuebrachoParaCubrir10M2DeberiaDevolverGastoDe400() throws CapacidadDeSalamandraExcedidaError{
    	Casa casa2  = new Casa();
    	Salamandra salamandraAQuebracho = new Salamandra(10);
    	salamandraAQuebracho.agregarMadera(new Quebracho(2));
    	casa2.agregarComponenteACasa(salamandraAQuebracho);
    	org.junit.Assert.assertEquals(80, casa2.getGastoTotal());
    }
    
    @Test
    public void testCasaConSalamandraA16KGDePinoDeberiaLanzarExcepcion() throws CapacidadDeSalamandraExcedidaError{
    	Casa casa3 = new Casa();
    	Salamandra salamandraAPino = new Salamandra(32);
    	salamandraAPino.agregarMadera(new Pino(16));
    	casa3.agregarComponenteACasa(salamandraAPino);
    	assertThrows(CapacidadDeSalamandraExcedidaError.class, () -> {casa3.getGastoTotal();});
    }
}
