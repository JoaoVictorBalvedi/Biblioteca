public class ItemBibliotecaDigital {
    public String autor;
    public String titulo;
    public String tamanhomb;

    public ItemBibliotecaDigital(String autor, String titulo, String tamanhomb){
        this.autor = autor;
        this.titulo = titulo;
        this.tamanhomb = tamanhomb;

    }

    public String getDescription(String theme) {
        return "Autor: " + autor + " - Título: " + titulo;
    }

    public String getTamanho() {
        return tamanhomb;
    }

    public String getTitulo(){
        return titulo;
    }
}