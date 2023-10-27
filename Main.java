import java.util.Scanner;

public class Main {


    public static void mostrarMenu() {
        System.out.println("1 <-- Comprar un juego");
        System.out.println("2 <-- Vender un juego");
        System.out.println("3 <-- Ver cantidad de juegos");
        System.out.println("4 <-- Ver dinero");
        System.out.println("5 <-- Sacar dinero");
        System.out.println("6 <-- Salir");
    }

    /**
     * Funcion que muestra las opciones del menu
     */
    public static boolean comprarJuego(float monederoMedac, float precioJuegos) {
        boolean exitoVenta = true;

        if (monederoMedac < precioJuegos) {
            System.out.println("No tienes suficiente dinero");
            exitoVenta = false;

        } else {
            System.out.println("Enhorabuena! Has comprado un juego");
            exitoVenta = true;
        }
        return exitoVenta;
    }

    /**
     * Funcion que muestra las opciones del menu
     */
    public static boolean venderJuego(int cantidadJuegos, float monederoMedac, float reventaJuego) {
        boolean sepuede = false;

        if (cantidadJuegos > 0) {
            //Podemos vender el juego
            sepuede = true;
            System.out.println(" Has vendido un juego" + " y te has ganado " + reventaJuego + "$");
        }
        return sepuede;
    }

    /**
     * Funcion que muestra las opciones del menu
     */

    public static void main(String[] args) {

        //Cosas para el menú
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine();
        int opcion;



        float precioJuegos = 60; // Lo que cuestan los juegos.
        float reventaJuego = 200; // Lo que me pagan por vender el juego.

        //Mis datos
        float monederoMedac = 100; //Dinero que tenemos
        int cantidadjuegos = 0;
        String[] juegos = new String[20]; //Mis juegos

        //Mensaje de bienvenida
        System.out.println("=======================");
        System.out.println(" BIENVENIDO A MEDACGAMES " + nombre + "!");
        System.out.println("=======================");



        //Un menú
        while (!salir) {
            //Mostrar las opciones
            mostrarMenu();
            opcion = teclado.nextInt();
            if (opcion == 1) {
                if (comprarJuego(monederoMedac, precioJuegos)) {
                    monederoMedac -= precioJuegos;
                }
            }
            if (opcion == 2) {
                venderJuego(cantidadjuegos, monederoMedac, reventaJuego);
                monederoMedac += reventaJuego;

            }
            if (opcion == 3) {
                System.out.println("Su biblioteca es: " + cantidadjuegos);
                cantidadjuegos++;
            }
            if (opcion == 4) {
                System.out.println("Tienes: " + monederoMedac);
            }
            if (opcion == 6) {
                salir = true;

            }

        }

    }
}