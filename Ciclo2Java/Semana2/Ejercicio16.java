package Ciclo2Java.Semana2;

class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * @return String
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return String
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return int
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @param paginas
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Libro() {

    }

    @Override
    public String toString() {
        return "El libro " + getTitulo() + " con ISB:" + getIsbn() + " creado por " + getAutor() + " tiene "
                + getPaginas() + " páginas.";
    }
}

public class Ejercicio16 {

    public static int encontrarMayor(Libro listaLibros[]) {
        int mayor = 0;
        
        for (Libro libro : listaLibros) {
            if (libro.getPaginas() > mayor) {
                mayor = libro.getPaginas();
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("AAA123", "El libro de las emociones", "Pepito Pérez", 350);
        Libro libro2 = new Libro("BBB456", "Crimen y castigo", "Fiodor Dostoievski", 589);
        Libro libro3 = new Libro("CCC789", "No te rindas nunca", "Juan Bala", 167);

        Libro lista_libros[] = { libro1, libro2, libro3 };

        for (Libro libro : lista_libros) {
            System.out.println("\n" + libro);
        }

        System.out.println("\nEl libro con más páginas tiene: " + encontrarMayor(lista_libros));

    }

}
