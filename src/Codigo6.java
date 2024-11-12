import java.util.Scanner;

public class Codigo6 {

    Scanner sc = new Scanner(System.in);

    //Genera la funcion mult
    public void mult() {

        //agregar new
    int[] n = new int[20];

        // step del contador i++
	for (int i = 0; i < 20; i++) {
        n[i] = (int)(Math.random() * 381) + 20;
        //Arregla sintaxis system.out
        System.out.print(n[i] + " ");
    }



    //Modificado a un scanner que lea el proximo entero
        int opcion = 0;

        //agregado un bloque do while try catch para verificar que se ingresen datos correctos
        do{
            //arreglar sintaxis println
            System.out.println("\n¿Qué números quiere resaltar? ");
            System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        try {
            opcion = (sc.nextInt());
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Introduce una opcion valida.");
            sc.nextLine();
            opcion = 0;
        }}
        while(!(opcion==1 || opcion==2));

        // arreglado signos de comparacion logica
    int multiplo = (opcion == 1) ? 5 : 7;

    //modificado de foreach a for y cambiado tipo de dato a int
    for (int e : n) {
        if (e % multiplo == 0) {
            System.out.print("[" + e + "] ");
        //agregada la llave faltante
        }
	       else {
               //system out para imprimir en pantalla
                System.out.print(e + " ");
            }
        }
}
    }