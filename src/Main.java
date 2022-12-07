import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите максимальную длинну матрицы: ");
        int n = scan.nextInt();

        int matrix[][] = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print("| " + matrix[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println("Получаем модуль матрицы: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Math.abs(matrix[i][j]);
                System.out.print("| " + matrix[i][j] + " |");
            }
            System.out.println();
        }

        int normi = 0;
        int norml = 0;
        double norme = 0;
        int anormi[] = new int[n];
        int anorml[] = new int[n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                normi = matrix[i][j] + normi;
                norml = matrix[i][j] + norml;
                norme = Math.pow(matrix[i][j], 2) + norme;
            }
            anormi[i] = normi;
            normi = 0;
            anorml[i] = norml;
            norml = 0;
        }
        System.out.print("normi = ");
        for (int i = 0; i < anormi.length; i++) {
            System.out.print("| " + anormi[i] + " |");
        }
        System.out.print("\n norml = ");
        for (int i = 0; i < anorml.length; i++) {
            System.out.print("| " + anorml[i] + " |");
        }
        System.out.print("\n norme = " + Math.sqrt(norme));
    }
}
