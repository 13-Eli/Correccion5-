// El programa clasifica un número como afortunado si contiene más dígitos 3, 7, 8 o 9 que otros dígitos. 

import java.util.Scanner; //agregué la paquetería 

public class Codigo5 {
  public static void main(String[] args) {//agregué el método main
	    Scanner s = new Scanner();
	    System.out.print("Introduzca un número:"); cambie la comilla simple a comilla doble
	    String ni = s.nextLine();
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	            while (c > 0) {//Cambie el bucle while para que use c en lugar de ni y arregle la división de c
            int digito = c % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            c /= 10;
        }

        if (afo > noAfo) {//Corregí el método println en la salida.
            System.out.println("El " + ni + " es un número afortunado.");
        } else {
            System.out.println("El " + ni + " no es un número afortunado.");
        }
    }
}
