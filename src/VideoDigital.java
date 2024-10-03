public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel{
    private int duracaoMinutos;

    public VideoDigital(String titulo, String autor, String tamanhomb, int duracaoMinutos) {
        super(titulo, autor, tamanhomb);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void baixar() {
        System.out.println("Baixando vídeo: " + getTitulo() + " - " + getTamanho() + "Mb");
    }

    public void visualizar() {
        System.out.println("Visualizando vídeo: " + getTitulo() + " - " + duracaoMinutos + " minutos\n*FILME RODANDO AQUI...*");
    }
}
