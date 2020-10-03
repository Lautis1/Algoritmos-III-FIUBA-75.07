package test;
import org.junit.Assert;
import org.junit.Test;

import modelo.Buscador;
import modelo.BuscadorPorCategoria;
import modelo.BuscadorPorNombre;
import modelo.BuscadorPorPrecio;
import modelo.BusquedaAproximada;
import modelo.BusquedaExacta;
import modelo.Producto;


import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

public class BuscadorTest {

    @Test
    public void testBusquedaPorNombreExactoMaximo5ResultadosDevuelveResultadoCorrecto() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new BuscadorPorNombre();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);

        List<Producto> resultados = buscador.buscarPorNombre("lapiz", new BusquedaExacta(),5);

        Assert.assertEquals(Arrays.asList(lapiz), resultados);
    }

    @Test
    public void testBusquedaPorNombreAproximadoMaximo5ResultadosDevuelveResultadoCorrecto() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new BuscadorPorNombre();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);

        List<Producto> resultados = buscador.buscarPorNombre("pelo", new BusquedaAproximada(),5);

        Assert.assertEquals(Arrays.asList(pelota, pelopincho), resultados);
    }

    @Test
    public void testBusquedaPorCategoriaAproximadaMaximo1ResultadoLanzaExcepcion() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new BuscadorPorCategoria();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);

        List<Producto> resultado = buscador.buscarPorCategoria("aire",new BusquedaAproximada(),1);
        Assert.assertEquals(Arrays.asList(pelota), resultado);
        
    }

    @Test
    public void testBusquedaPorPrecioMaximo3ResultadosDevuelveValoresCorrectos() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new BuscadorPorPrecio();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);

        List<Producto> resultados = buscador.buscarPorPrecio(30, 600,3);

        Assert.assertEquals(Arrays.asList(pelota, lapiz), resultados);
    }

}
