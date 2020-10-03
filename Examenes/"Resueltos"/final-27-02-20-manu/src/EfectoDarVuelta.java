public class EfectoDarVuelta {

    public String aplicarA(String unaCadena) throws CadenaVaciaException {
        if (unaCadena.equals("")) {
            throw new CadenaVaciaException();
        }

        return new StringBuffer(unaCadena).reverse().toString();
    }

}
