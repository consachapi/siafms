package pe.gob.cusco.siafms.core;

public class Utils {
    public static String formatClasificador(String clasificador) {
        String tipoTransaccion = "";
        String generica = "";
        String subGenerica = "";
        String subGenericaDetalle = "";
        String especifica = "";
        String especificaDetalle = "";
        tipoTransaccion = Character.toString(clasificador.charAt(0));
        generica = Character.toString(clasificador.charAt(1));
        if (clasificador.charAt(2) == ' ') {
            subGenerica = Character.toString(clasificador.charAt(3));
        } else {
            subGenerica = clasificador.charAt(2) + Character.toString(clasificador.charAt(3));
        }

        if (clasificador.charAt(4) == ' ') {
            subGenericaDetalle = Character.toString(clasificador.charAt(5));
        } else {
            subGenericaDetalle = clasificador.charAt(4) + Character.toString(clasificador.charAt(5));
        }

        if (clasificador.charAt(6) == ' ') {
            especifica = Character.toString(clasificador.charAt(7));
        } else {
            especifica = clasificador.charAt(6) + Character.toString(clasificador.charAt(7));
        }

        if (clasificador.charAt(8) == ' ') {
            especificaDetalle = Character.toString(clasificador.charAt(9));
        } else {
            especificaDetalle = clasificador.charAt(8) + Character.toString(clasificador.charAt(9));
        }

        String resultClasficador = tipoTransaccion + "." + generica + "." + subGenerica + "." + subGenericaDetalle + "." + especifica + "." + especificaDetalle;
        return resultClasficador;
    }
}
