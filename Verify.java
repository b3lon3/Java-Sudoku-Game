public class Verify {

    public static String motivo;
    public static String motivo2;
    static boolean verifyP1() {

        boolean ok = true;

        //outer loop identifier
        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                //verify lines if repeated number
                for (int k = 0; k < 9; k++) {
                    if (Sudoku.matriz[i][j] != 0 & Sudoku.matriz[i][k] != 0 & Sudoku.matriz[i][j] == Sudoku.matriz[i][k] & k != j) {
                        ok = false;
                        motivo = "L";
                        break outer;
                    }
                }

                //verify columns if repeated number
                for (int k = 0; k < 9; k++) {
                    if (Sudoku.matriz[j][i] != 0 & Sudoku.matriz[k][i] != 0 &  Sudoku.matriz[j][i] == Sudoku.matriz[k][i] & k != j) {
                        ok = false;
                        motivo = "C";
                        break outer;
                    }
                }

                //divisao em sub matrizes
                //verificação se p1 preencheu mais de 5 nas subM, caso sim, s++
                if (i < 3 && j < 3) {
                    //1 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s1++;
                    }
                }
                if (i < 3 && j > 3 && j < 6) {
                    //2 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s2++;
                    }
                }
                if (i < 3 && j > 6) {
                    //3 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s3++;
                    }
                }
                if (i > 3 && i < 6 && j < 3) {
                    //4 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s4++;
                    }
                }
                if (i > 3 && i < 6 && j > 3 && j < 6) {
                    //5 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s5++;
                    }
                }
                if (i > 3 && i < 6 && j > 6) {
                    //6 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s6++;
                    }
                }
                if (i > 6 && j < 3) {
                    //7 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s7++;
                    }
                }
                if (i > 6 && j > 3 && j < 6) {
                    //8 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s8++;
                    }
                }
                if (i > 6 && j > 6) {
                    //9 sub
                    if (Sudoku.matriz[i][j] != 0) {
                        Sudoku.s9++;
                    }
                }

            }
        }

        //se p1 preenche mais de 5 espaços em alguma sub M, retorna falso
        if (Sudoku.s1 > 5 || Sudoku.s2 > 5 || Sudoku.s3 > 5 ||
                Sudoku.s4 > 5 || Sudoku.s5 > 5 || Sudoku.s6 > 5 ||
                Sudoku.s7 > 5 || Sudoku.s8 > 5 || Sudoku.s9 > 5) {
            ok = false;
            motivo = ">5 p1";
        }

        return ok;

    }

    static int checkWinner() {
        //verify winner method

        int winner = 2;

        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                //verify lines if repeated number
                for (int k = 0; k < 9; k++) {
                    if (Sudoku.matriz[i][j] == Sudoku.matriz[i][k]) {
                        winner = 1;
                        motivo2 = "L2";
                        break outer;
                    }
                }

                //verify columns if repeated number
                for (int k = 0; k < 9; k++) {
                    if (Sudoku.matriz[j][i] == Sudoku.matriz[k][i]) {
                        winner = 1;
                        motivo2 = "C2";
                        break outer;
                    }
                }
            }
        }

        int r1 = 1, r2 = 1, r3 = 1, r4 = 1, r5 = 1, r6 = 1, r7 = 1, r8 = 1, r9 = 1;
        int fat = 362880;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                //this is going to multiply the sub-matrix by itself.
                if (i < 3 && j < 3) {
                    //1 sub
                    r1 *= Sudoku.matriz[i][j];
                }
                if (i < 3 && j > 3 && j < 6) {
                    //2 sub
                    r2 *= Sudoku.matriz[i][j];
                }
                if (i < 3 && j > 6) {
                    //3 sub
                    r3 *= Sudoku.matriz[i][j];
                }
                if (i > 3 && i < 6 && j < 3) {
                    //4 sub
                    r4 *= Sudoku.matriz[i][j];
                }
                if (i > 3 && i < 6 && j > 3 && j < 6) {
                    //5 sub
                    r5 *= Sudoku.matriz[i][j];
                }
                if (i > 3 && i < 6 && j > 6) {
                    //6 sub
                    r6 *= Sudoku.matriz[i][j];
                }
                if (i > 6 && j < 3) {
                    //7 sub
                    r7 *= Sudoku.matriz[i][j];
                }
                if (i > 6 && j > 3 && j < 6) {
                    //8 sub
                    r8 *= Sudoku.matriz[i][j];
                }
                if (i > 6 && j > 6) {
                    //9 sub
                    r9 *= Sudoku.matriz[i][j];
                }

            }
        }
        //check if there are only numbers 1-9 inside sub-matrix
        if (r1 != fat || r2 != fat || r3 != fat
                || r4 != fat || r5 != fat || r6 != fat
                || r7 != fat || r8 != fat || r9 != fat) {
                winner = 1;
                motivo2 = "fat";
        }

        return winner;
    }
}








