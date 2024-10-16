public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro() {
    }

    public Libro(String autor, int añoPublicacion, String codigo, String titulo) {
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
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
                ", añoPublicacion=" + añoPublicacion +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }

}
