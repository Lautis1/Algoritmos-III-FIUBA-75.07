public class EfectoPrimeraMinuscula {

    public String aplicarA(String unaCadena) throws CadenaVaciaException {
        if (unaCadena.equals("")) {
            throw new CadenaVaciaException();
        }

        return unaCadena.substring(0,1).toLowerCase() + unaCadena.substring(1);
    }

}
