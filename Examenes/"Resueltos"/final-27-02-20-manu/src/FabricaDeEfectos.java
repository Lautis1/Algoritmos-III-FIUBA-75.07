public class FabricaDeEfectos {

    private static CadenaConEfecto getCadenaConEfecto(String cadena) {
        return new CadenaConEfecto(cadena);
    }

    public static String efectoPrimeraMayuscula(String cadena) throws CadenaVaciaException {
        return getCadenaConEfecto(cadena).primeraMayuscula().getCadena();
    }

    public static String efectoDarVueltaYPrimeraMayuscula(String cadena) throws CadenaVaciaException {
        return getCadenaConEfecto(cadena).darVuelta().primeraMayuscula().getCadena();
    }

    public static String efectoAgregarCincoAlFinal(String cadena) throws CadenaVaciaException {
        return getCadenaConEfecto(cadena).agregarCadenaAlFinal("5").getCadena();
    }

    public static String efectoAgregarOchoAlFinal(String cadena) throws CadenaVaciaException {
        return getCadenaConEfecto(cadena).agregarCadenaAlFinal("8").getCadena();
    }

    public static String efectoPrimeraMayusculaYAgregar8(String cadena) throws CadenaVaciaException {
        return getCadenaConEfecto(cadena).primeraMayuscula().agregarCadenaAlFinal("8").getCadena();
    }

    public static String efectoAgregarTresYPrimeraMinuscula(String cadena) throws CadenaVaciaException {
        return getCadenaConEfecto(cadena).agregarCadenaAlFinal("3").primeraMinuscula().getCadena();
    }

    public static String efectoDarVueltaPrimeraMinusculaYAgregarCuatro(String cadena) throws CadenaVaciaException {
        return getCadenaConEfecto(cadena).darVuelta().primeraMinuscula().agregarCadenaAlFinal("4").getCadena();
    }

}
