public class SistemaMedida {
    public static void main(String[] args) {
        // SWITCH-CASE
        // importante habilitar o BREAK;, senão todos os cases seguintes do executado
        // serão executados também
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }

    }
}