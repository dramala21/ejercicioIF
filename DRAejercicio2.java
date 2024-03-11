public class DRAejercicio2 {
    public static void main(String[] args) {
            String frase = "En el bosque boreal las auroras son maravillosas";
            String resultado = "";
    
            for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);
    
                if (!(caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                      caracter == 'o' || caracter == 'u' || caracter == 'A' ||
                      caracter == 'E' || caracter == 'I' || caracter == 'O' ||
                      caracter == 'U')) {
                    resultado += caracter;
                }
            }
            System.out.println("Frase original: " + frase);
            System.out.println("Frase sin vocales: " + resultado);
        }
    }