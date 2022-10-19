import java.util.Scanner;

public class Menu {

    public static void lanzador(String[] args, Object carrera) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        do {

            System.out.println("1. Numero de caballos");
            System.out.println("3. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        carrera.controlador(args);
                        break;
                    case 2:
                        salir = true;
                        System.out.println("Gracias por utilizar nuestro código");
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
            }
            sn.close();
        }while(sn.nextInt()!=3);

    }

}
