import java.util.Scanner;

public class Input {
    public static void input1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SUB");
        System.out.println("Linha: ");
        int linha = scanner.nextInt();

        System.out.println("Coluna: ");
        int coluna = scanner.nextInt();
        System.out.println("Numero desejado: ");
        int num = scanner.nextInt();

        Sudoku.matriz[linha][coluna] = num;

        board.board();

    }

    public static void input2() {

        Scanner scanner = new Scanner(System.in);

        int linha;
        int coluna;

                System.out.println("SUB");
                System.out.println("Linha: ");
                linha = scanner.nextInt();

                System.out.println("Coluna: ");
                coluna = scanner.nextInt();
                System.out.println("Numero desejado: ");
                int num = scanner.nextInt();

                Sudoku.matriz[linha][coluna] = num;

            board.board();
        }
    }


