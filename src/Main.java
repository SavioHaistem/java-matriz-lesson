import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("columns: ");
        int columns = scan.nextInt();

        System.out.print("lines: ");
        int lines = scan.nextInt();

        Integer[][] matriz = new Integer[lines][columns];


        for (int countLines = 0; countLines < matriz.length; countLines++) {
            for (int countColumns = 0; countColumns < matriz[countLines].length; countColumns++) {
                System.out.printf("type line: %d, column: %d: ", countLines, countColumns);
                matriz[countLines][countColumns] = scan.nextInt();
            }
        }

        for (int countLines = 0; countLines < matriz.length; countLines++) {
            for (int countColumns = 0; countColumns < matriz[countLines].length; countColumns++) {
                System.out.print(matriz[countLines][countColumns] + "  ");
            }
            System.out.printf("%n");
        }

        System.out.print("type the number for search: ");
        int wantedNumber = scan.nextInt();

        for (int countLines = 0; countLines < matriz.length; countLines++) {
            for (int countColumns = 0; countColumns < matriz[countLines].length; countColumns++) {
                if (matriz[countLines][countColumns].equals(wantedNumber)) {
                    System.out.printf("Position: L: %d, C: %d %n", countLines, countColumns);
                    if (countColumns - 1 >= 0) {
                        System.out.println("left: " + matriz[countLines][countColumns - 1]);
                    };
                    if (countLines - 1 >= 0) {
                        System.out.println("top: " + matriz[countLines - 1][countColumns]);
                    }
                    if (countColumns + 1 < matriz[countLines].length) {
                        System.out.println("rigth: " + matriz[countLines][countColumns + 1]);
                    }
                    if (countLines + 1 < matriz.length) {
                        System.out.println("down: " + matriz[countLines + 1][countColumns]);
                    }
                }
            }
        }
    }
}