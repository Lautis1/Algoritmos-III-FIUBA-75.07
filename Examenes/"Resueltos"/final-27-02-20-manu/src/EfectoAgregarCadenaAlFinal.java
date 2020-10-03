public class EfectoAgregarCadenaAlFinal {
    public String aplicarA(String cadenaOriginal, String cadenaAgregada) throws CadenaVaciaException {
        if (cadenaOriginal.equals("")) {
            throw new CadenaVaciaException();
        }

        return cadenaOriginal + cadenaAgregada;
    }
}
