import java.util.Scanner;

public class Main {

    static ItemBibliotecaDigital Titanic = new VideoDigital("Titanic", "James Cameron", "1.600", 1000);
    static ItemBibliotecaDigital HarryPotter = new Ebook("Harry Potter", "J.K. Rowling", "2.500", 500);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Listar Filmes");
            System.out.println("2. Listar Livros");
            System.out.println("3. Baixar Titanic");
            System.out.println("4. Baixar Harry Potter");
            System.out.println("5. Visualizar Vídeo");
            System.out.println("6. Visualizar Ebook");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(Titanic.getDescription("Um casal lá no navio e o navio bate e morrem"));
                    break;
                case 2:
                    System.out.println(HarryPotter.getDescription("Um pia que é bruxo e tem varinha soltando poder e pa"));
                    break;
                case 3:
                    ((Baixavel) Titanic).baixar();
                    break;
                case 4:
                    ((Baixavel) HarryPotter).baixar();
                    break;
                case 5:
                    visualizarVideo(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void visualizarVideo(Scanner scanner) {
        System.out.println("Escolha um vídeo para visualizar:");
        System.out.println("1. Titanic");
        System.out.print("Escolha uma opção: ");
        int videoChoice = scanner.nextInt();

        switch (videoChoice) {
            case 1:
                ((Visualizavel) Titanic).visualizar();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    }
}