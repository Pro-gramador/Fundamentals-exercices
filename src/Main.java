import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        int numeroif = 0;

        if(numeroif > 0){
            System.out.println("Numero es positivo");

        } else if (numeroif == 0) {
            System.out.println("Numero es igual a: "+numeroif);
        }else{
            System.out.println("Numero es negativo");
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.

        int numerowhile = 0;

        while (numerowhile < 3) {
            System.out.println("La cantidad es: " + numerowhile);
            numerowhile = numerowhile + 1;

        }
        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        do {
            System.out.println("La cantidad dowhile es: "+numerowhile);
            numerowhile++;
        }while (numerowhile == 3);{

        } //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        int numerofor = 0;

        for ( numerofor = 0; numerofor <=3; ){
            System.out.println("La cantidad de buclefor es: "+numerofor);
            numerofor++;

        }//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

        String estación = "verano";

        switch (estación){
            case ("invierno"):
                System.out.println("Estámos en invierno"); break;
            case ("otoño"):
                System.out.println("Estámos en otoño"); break;
            case ("primavera"):
                System.out.println("Estámos en primavera"); break;
            case ("verano"):
                System.out.println("Estámos en verano"); break;
            default:
                System.out.println("Esto no es una estación"); break;
        }


    }
}