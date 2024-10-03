public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    private int numeroPaginas;

    public Ebook(String titulo, String autor, String tamanhomb, int numeroPaginas) {
        super(titulo, autor, tamanhomb);
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void baixar() {
    System.out.println("Baixando ebook: " + getTitulo() + " - " + tamanhomb + "Mb");
    }

}
