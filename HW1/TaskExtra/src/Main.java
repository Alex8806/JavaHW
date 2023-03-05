//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
// * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
// * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
// * * Также заполнить элементы побочной диагонали


import java.util.Arrays;

public class Main {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +  "    ");
            }
            System.out.println();
        }
    }

    static int[][] fillMatrix(int l) {
        int[][] matrix = new int[l][l];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 8) + 2;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        System.out.println("Задать целочисленный массив, состоящий из элементов 0 и 1.\nС помощью цикла и условия заменить 0 на 1, 1 на 0;");
        int[] list = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                list[i] = 1;
            } else {
                list[i] = 0;
            }
        }
        System.out.println(Arrays.toString(list));

        System.out.println("Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] \nпройти по нему циклом, и числа меньшие 6 умножить на 2;");

        list = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            for (i = 0; i < list.length; i++) {
                if (list[i] < 6) {
                    list[i] *= 2;
                    continue;
                }
            }
            System.out.println(Arrays.toString(list));
        }
        System.out.println("Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),\n" +
                "// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами");


        int[][] matrix = fillMatrix(5);
        printMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j || j ==(matrix[i].length - i -1 ) ){matrix[i][j]=1;}
            }
        }

        System.out.println(" измененный:");
        printMatrix(matrix);
    }}