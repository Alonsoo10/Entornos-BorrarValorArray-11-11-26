import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            //Explicado en pasos para entenderlo mejor

        //1Paso Definir Array
        int[] arrayInicial = {1,5,9,3,45,23,45,12,87,9,6,5};

        //2Paso Imprimir ArrayInicial(solo para que aparezca)
        System.out.println("Elemento a borrar: " );
        System.out.println("Array Inicial ");

        for (int i = 0; i < arrayInicial.length; i++) {
            System.out.print(arrayInicial[i] + "--");

        }
        System.out.println();

       //3Paso pedir numero al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres borrar");
        int valorBuscado = scanner.nextInt();

        //4Paso Imprimir ArrayInicial(Con Valor buscado)
        System.out.println("Elemento a borrar: " + valorBuscado);
        System.out.println("Array Inicial ");

        for (int i = 0; i < arrayInicial.length; i++) {
            System.out.print(arrayInicial[i] + "--");

        }
        System.out.println();

        //4Paso Crear ArrayFinal(STRING)

        String[] arrayFinal = new String[arrayInicial.length];
        for (int i = 0; i < arrayInicial.length; i++) {
            if (arrayInicial[i] == valorBuscado){
                arrayFinal[i] = "--";
            }else{
                arrayFinal[i] = String.valueOf(arrayInicial[i]);
            }
            
        }

        //5Paso Imprimir ArrayFinal
        System.out.println("Array Final : ");
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.print(arrayFinal[i] + "--");

        }
        System.out.println();

    }
}