package modelo;
public class FabricaDeEfectos {

    public static EfectoNumero CrearEfectoAgregarCincoAlFinal() {
        return new EfectoNumero("5");
    }

    public static EfectoNumero CrearEfectoAgregarOchoAlFinal() {
        return new EfectoNumero("8");
    }

    public static EfectoVoltearYPrimeraMayuscula CrearEfectoDarVueltaYPrimeraMayuscula() {
        return new EfectoVoltearYPrimeraMayuscula(new EfectoVoltearString());
    }

    public static EfectoMayusculaInicial CrearEfectoPrimeraMayuscula() {
        return new EfectoMayusculaInicial();
    }

    public static EfectoMayusculaYNumero CrearEfectoPrimeraMayusculaYAgregarOcho() {
        return new EfectoMayusculaYNumero(CrearEfectoPrimeraMayuscula(),"8");
    }

}
