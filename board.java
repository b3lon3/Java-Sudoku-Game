public class board {
    static void board() {
        //board method
        System.out.println();

        for (int i = 0; i < 9; i++) {
            //a cada 3 linhas
            if (i % 3 == 0 && i != 0) {
                System.out.println("-----|-----|-----|");
            }

            for (int j = 0; j < 9; j++) {
                System.out.print(Sudoku.matriz[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }

    }

    static void newBoard() {
        //metodo para gerar nova matriz

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Sudoku.matriz[i][j] = 0;
            }

        }
    }
}
