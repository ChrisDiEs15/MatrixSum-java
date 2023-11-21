package matrixsum;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class MatrixSum {

    public static void main(String[] args) {
        Scanner tamano = new Scanner(System.in);

        System.out.println("Programa que suma dos matrices del mismo tamano");
        System.out.println("Ingrese el tamano de la fila recuerde que se creara una matriz de n*n dimensiones");
        int nDimension = tamano.nextInt();
        int fila = nDimension;
        int columna = nDimension;

        /*matrix creator func, the func returns a matrix*/
        System.out.println("Ingrese los valores de la matriz 1");
        int matrix1[][] = matrixCreator(fila, columna);
        System.out.println("Ingrese los valores de la matriz 2");
        int matrix2[][] = matrixCreator(fila, columna);
        /*pass to sum func*/
        int resultMatrix[][] = sumMatrix(matrix1, matrix2, fila, columna);
        /*pass to print func*/
        showMatrix(resultMatrix, fila, columna);
    }

    /*func to create a matriz n*m*/
    public static int[][] matrixCreator(int fila, int columna) {
        Scanner datosMatrix = new Scanner(System.in);

        int[][] matrixCreator = new int[fila][columna];
        for (int k = 0; k < fila; k++) {
            for (int l = 0; l < columna; l++) {
                System.out.println("Ingrese el dato de la fila " + k + " de la columna " + l);
                int nDato = datosMatrix.nextInt();
                matrixCreator[k][l] = nDato;
            }
        }

        return matrixCreator;
    }

    /*func to sum 2 matrix matrix*/
    public static int[][] sumMatrix(int matrix1[][], int matrix2[][], int fila, int columna) {
        int[][] sumMatrix = new int[fila][columna];
        
        for (int k = 0; k < fila; k++) {
            for (int l = 0; l < columna; l++) {
                int val0 = matrix1[k][l];
                int val1 = matrix2[k][l];
                int result = val0 + val1;
                sumMatrix[k][l] = result;
            }
        }

        return sumMatrix;
    }
    
    /*func to print the matrix*/
    public static void showMatrix(int matrix[][], int fila, int columna) {
        
        System.out.println("La matriz de resultados es: ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
