import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lista miLista = new Lista();
        boolean band = true;

        System.out.print("Cuántos datos vas a meter? ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Dato: ");
            int dato = scan.nextInt();
            miLista.add(dato);
        }

        while (band) {
            System.out.println("1. Agregar");
            System.out.println("2. Editar");
            System.out.println("3. Eliminar");
            System.out.println("4. Imprimir");
            System.out.println("5. Salir");
            char opc = scan.next().charAt(0);
            switch (opc) {
                case '1':
                    System.out.print("Dato: ");
                    int nuevoDato = scan.nextInt();
                    miLista.add(nuevoDato);
                    break;
                case '2':
                    System.out.print("Posición: ");
                    int posicionEditar = scan.nextInt();
                    System.out.print("Dato: ");
                    int datoEdit = scan.nextInt();
                    miLista.editPosition(posicionEditar, datoEdit);
                    break;
                case '3':
                    System.out.print("Posición: ");
                    int posicionBorrar = scan.nextInt();
                    miLista.delete(posicionBorrar);
                    break;
                case '4':
                    miLista.print();
                    break;
                case '5':
                    band = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}