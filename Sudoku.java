
public class Sudoku {

    public static int[][] matriz = new int[9][9];
    public static int index1 = 0;
    public static int index2 = 0;
    public static int s1, s2, s3, s4, s5, s6, s7, s8, s9;
    //p1 sub matrix counter

    public static void main(String[] args) {
        //chamada dos metodos

        board.board();
        Players.p1();

        while (!Verify.verifyP1()) {
            //roda o p1 e o verify até que não tenha erro e $ok retorne verdadeiro
            //reset index
            index1 = 0;
            System.out.println("Erro: " + Verify.motivo + " ! Preencha os campos de novo.");
            board.newBoard();
            Players.p1();
            Verify.verifyP1();
        }


        Players.p2();
        Verify.checkWinner();

        if (Verify.checkWinner() == 1) {
            System.out.println("Jogador 1 ganhou! ");
            System.out.println(Verify.motivo2);
        } else if (Verify.checkWinner() == 2) {
            System.out.println("Jogador 2 ganhou! ");
            System.out.println(Verify.motivo2);
        }


    }
}
