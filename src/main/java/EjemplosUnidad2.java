import java.util.Scanner;

public class EjemplosUnidad2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion_marcado;

        do {
            limpiarPantalla();

            System.out.println("=====================================");
            System.out.println("        Ejemplos - Unidad 2");
            System.out.println("=====================================");
            System.out.println("1. CONFIGURACIÓN ELECTRÓNICA");
            System.out.println("2. EL ÁTOMO");
            System.out.println("3. ELECTRÓN DIFERENCIAL");
            System.out.println("4. MODELOS ATÓMICOS");
            System.out.println("5. NÚMEROS CUÁNTICOS");
            System.out.println("6. PRINCIPIO DE AUFBAU");
            System.out.println("7. TABULACIÓN DE LOS NÚMEROS CUÁNTICOS");
            System.out.println("0. Regresar al menú principal");
            System.out.println("-------------------------------------");
            System.out.print("Elige una opción: ");

            opcion_marcado = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            limpiarPantalla();

            switch (opcion_marcado) {

                case 1:
                    System.out.println("===== CONFIGURACIÓN ELECTRÓNICA =====");
                    System.out.println("Ejemplo: El sodio (Na, Z=11)");
                    System.out.println("- 1s² 2s² 2p^6 3s¹");
                    System.out.println("- Termina en 3s¹, lo que indica que su electrón diferencial está en 3s.");
                    esperarEnter(sc);
                    break;

                case 2:
                    System.out.println("===== EL ÁTOMO =====");
                    System.out.println("Ejemplo: Representación atómica del carbono (C)");
                    System.out.println("- 6 protones, 6 neutrones, 6 electrones.");
                    System.out.println("- Su masa atómica es ≈12 uma (protones + neutrones).");
                    esperarEnter(sc);
                    break;

                case 3:
                    System.out.println("===== ELECTRÓN DIFERENCIAL =====");
                    System.out.println("Ejemplo: En el magnesio (Z=12)");
                    System.out.println("- 1s² 2s² 2p^6 3s²");
                    System.out.println("- El electrón diferencial está en 3s, por eso Mg pertenece al grupo 2 y periodo 3.");
                    esperarEnter(sc);
                    break;

                case 4:
                    System.out.println("===== MODELOS ATÓMICOS =====");
                    System.out.println("Ejemplo comparativo:");
                    System.out.println("- Dalton: átomo sólido indivisible.");
                    System.out.println("- Thomson: modelo del pudín con pasas.");
                    System.out.println("- Rutherford: núcleo positivo con espacio vacío.");
                    System.out.println("- Bohr: órbitas circulares para electrones.");
                    System.out.println("- Cuántico: nube electrónica probabilística.");
                    esperarEnter(sc);
                    break;

                case 5:
                    System.out.println("===== NÚMEROS CUÁNTICOS =====");
                    System.out.println("Ejemplo: electrón 3p²: n=3, l=1, m=-1, s=+1/2");
                    System.out.println("- n indica nivel 3");
                    System.out.println("- l=1 subnivel p");
                    System.out.println("- m=-1 orientación espacial");
                    System.out.println("- s=+1/2 giro del electrón");
                    esperarEnter(sc);
                    break;

                case 6:
                    System.out.println("===== PRINCIPIO DE AUFBAU =====");
                    System.out.println("Ejemplo práctico: Oxígeno (Z=8)");
                    System.out.println("- 1s² 2s² 2p^4");
                    System.out.println("- Se llenan primero los orbitales de menor energía (1s antes que 2s y 2p).");
                    esperarEnter(sc);
                    break;

                case 7:
                    System.out.println("===== TABULACIÓN DE LOS NÚMEROS CUÁNTICOS =====");
                    System.out.println("Ejemplo: Oxígeno (O): 1s² 2s² 2p^4");
                    System.out.println("- Los electrones 2p se tabulan con: n=2, l=1, m=-1,0,+1, s=+1/2 o -1/2");
                    System.out.println("- Se acomodan primero con giros positivos (Regla de Hund).");
                    esperarEnter(sc);
                    break;

                case 0:
                    System.out.println("Saliendo del menú de ejemplos...");
                    esperarEnter(sc);
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    esperarEnter(sc);
                    break;
            }

        } while (opcion_marcado != 0);
    }

    private static void esperarEnter(Scanner sc) {
        System.out.println("\nPresiona ENTER para continuar...");
        sc.nextLine();
    }

    private static void limpiarPantalla() {
        for (int i = 0; i < 40; i++) System.out.println();
    }
}
