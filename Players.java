public class Players {
    static void p1() {
        //game P1 method

        System.out.println();
        System.out.println("Escolha as coordenadas e os numeros. ");
        System.out.println("Limite de 5 numeros por sub-matriz.");
        System.out.println("Números apenas de 1 a 9. ");

        //45 times p1 plays
        while (Sudoku.index1 < 48) {
            Sudoku.index1++;
            Input.input1();
        }
        System.out.println("Limite p1 atingido. ");

    }

    static void p2() {
        //game P2 method

        System.out.println();
        System.out.println("Preencha os espaços restantes seguindo as regras do Sudoku.");
        System.out.println("Limite de 4 numeros por sub-matriz.");
        System.out.println("Números apenas de 1 a 9.");

        //36 times p2 plays
        while (Sudoku.index2 < 38 ) {
            Sudoku.index2++;
            Input.input2();
        }
        System.out.println("Limite p2 atingido. ");
    }
}
