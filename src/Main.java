import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Eliana Camila Guevara


        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            System.out.println("\n----- Menú Biblioteca -----");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Eliminar un libro");
            System.out.println("3. Buscar un libro");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese el código del libro: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int anioPublicacion = scanner.nextInt();
                    scanner.nextLine();

                    Libro nuevoLibro = new Libro(codigo, titulo, autor, anioPublicacion);
                    biblioteca.agregarLibro(nuevoLibro);
                    break;

                case 2:

                    System.out.print("Ingrese el código del libro a eliminar: ");
                    String codigoEliminar = scanner.nextLine();
                    biblioteca.eliminarLibro(codigoEliminar);
                    break;

                case 3:

                    System.out.print("Ingrese el código del libro a buscar: ");
                    String codigoBuscar = scanner.nextLine();
                    Libro libroBuscado = biblioteca.buscarLibro(codigoBuscar);
                    if (libroBuscado != null) {
                        System.out.println("Libro encontrado: " + libroBuscado);
                    } else {
                        System.out.println("No se encontró el libro.");
                    }
                    break;

                case 4:

                    biblioteca.mostrarLibros();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige otra opción.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}