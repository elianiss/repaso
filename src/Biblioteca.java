import java.util.HashMap;
import java.util.Map;

// Clase Biblioteca
class Biblioteca {
    private Map<String, Libro> coleccionLibros;

    public Biblioteca() {
        coleccionLibros = new HashMap<>();
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        coleccionLibros.put(libro.getCodigo(), libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    // Método para eliminar un libro
    public void eliminarLibro(String codigo) {
        if (coleccionLibros.containsKey(codigo)) {
            Libro libroEliminado = coleccionLibros.remove(codigo);
            System.out.println("Libro eliminado: " + libroEliminado.getTitulo());
        } else {
            System.out.println("No se encontró ningún libro con el código: " + codigo);
        }
    }

    // Método para buscar un libro
    public Libro buscarLibro(String codigo) {
        return coleccionLibros.get(codigo);
    }

    // Método para mostrar todos los libros
    public void mostrarLibros() {
        if (coleccionLibros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (Libro libro : coleccionLibros.values()) {
                System.out.println(libro);
            }
        }
    }
}