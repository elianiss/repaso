public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro() {
    }

    public Libro(String codigo, String titulo, String autor, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion; // Cambiado
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() { // Cambiado
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) { // Cambiado
        this.anioPublicacion = anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion + // Cambiado
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
