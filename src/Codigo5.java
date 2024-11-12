import java.util.Scanner;

//Importar la clase scanner


//Programa para numeros afortunados, regresa el
public class Codigo5 {
    //Pasar parametro system.in a scanner
    Scanner s = new Scanner(System.in);

    public void lucky() {
        //Igualar las comillas utilizadas.
	    System.out.print("Introduzca un número: ");
        String ni = null;
        int c = 0;

        do{
        try {
            ni = s.nextLine();
            c = Integer.parseInt(ni);
        } catch (NumberFormatException e) {
            System.out.println("Por favor introduce un numero valido");
        }
        }while(c==0);

        int afo = 0;
    int noAfo = 0;

    //Modificar variable en el bucle de ni a c
	    while (c > 0) {
        int digito = (c % 10);
        if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
            afo++;
            //agregado el cambio a c para evitar loop infinito
            c /= 10;
        } else {
            noAfo++;

            c /= 10;
        }

    }
        if (afo > noAfo) {
            //Corregir error en println
            System.out.println("El " + Integer.parseInt(ni) + " es un número afortunado.");
        } else {
            System.out.println("El " + Integer.parseInt(ni) + " no es un número afortunado.");
        }
}
}
