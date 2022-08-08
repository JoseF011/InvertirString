package invertirstring;

public class InvertirString {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(invertir("Hola"));
    }

    public static String invertir(String entradaTexto) {
        String resultado;
        char textoArray[] = entradaTexto.toCharArray();
        char textoResultado[] = entradaTexto.toCharArray();
        int cont = 0;
        for (int x = 0; x < textoArray.length / 2; x++) {
            if ((textoArray[x] >= 65 && textoArray[x] <= 90) || (textoArray[x] >= 97 && textoArray[x] <= 122)) {

                for (int y = cont; y < (textoArray.length / 2); y++) {
                    int posInv = textoArray.length - y - 1;

                    if ((textoArray[posInv] >= 65 && textoArray[posInv] <= 90) || (textoArray[posInv] >= 97 && textoArray[posInv] <= 122)) {
                        System.out.println(posInv);
                        char letraTemp = textoArray[posInv];
                        textoResultado[posInv] = textoArray[x];
                        textoResultado[x] = letraTemp;
                        cont++;
                        break;
                    }
                }
            }
        }
        System.out.println(textoResultado);
        resultado = textoResultado.toString();
        return resultado;
    }
}
