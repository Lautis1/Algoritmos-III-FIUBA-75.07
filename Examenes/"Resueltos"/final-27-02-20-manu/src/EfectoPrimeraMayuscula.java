public class EfectoPrimeraMayuscula {

    public String aplicarA(String unaCadena) throws CadenaVaciaException {
        if (unaCadena.equals("")) {
            throw new CadenaVaciaException();
        }

        return unaCadena.substring(0,1).toUpperCase() + unaCadena.substring(1);
    }

}
