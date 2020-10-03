public class CadenaConEfecto {
    String cadena;

    public CadenaConEfecto(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public CadenaConEfecto darVuelta() throws CadenaVaciaException {
        EfectoDarVuelta efecto = new EfectoDarVuelta();
        this.cadena = efecto.aplicarA(this.cadena);
        return this;
    }

    public CadenaConEfecto agregarCadenaAlFinal(String cadenaAgregada) throws CadenaVaciaException {
        EfectoAgregarCadenaAlFinal efecto = new EfectoAgregarCadenaAlFinal();
        this.cadena = efecto.aplicarA(this.cadena, cadenaAgregada);
        return this;
    }

    public CadenaConEfecto primeraMayuscula() throws CadenaVaciaException {
        EfectoPrimeraMayuscula efecto = new EfectoPrimeraMayuscula();
        this.cadena = efecto.aplicarA(this.cadena);
        return this;
    }

    public CadenaConEfecto primeraMinuscula() throws CadenaVaciaException {
        EfectoPrimeraMinuscula efecto = new EfectoPrimeraMinuscula();
        this.cadena = efecto.aplicarA(this.cadena);
        return this;
    }

}
