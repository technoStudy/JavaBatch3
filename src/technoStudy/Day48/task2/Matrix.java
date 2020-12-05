package technoStudy.Day48.task2;

import java.util.Random;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] matrix;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[this.rows][this.columns];
    }

    public Matrix(int[][] matrix) throws MatrixException {
        if(matrix == null) {
            throw new MatrixException("2D array cannot be null!");
        }
        this.matrix = matrix;
        this.rows = matrix.length;

        int[] theFirstColumn = matrix[0];
        if(theFirstColumn == null) {
            throw new MatrixException("The first column cannot be null");
        }
        // TODO: what about the other columns, should we check them also for null
        // TODO: check them for length, their length should be the same
        this.columns = matrix[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        if(i < 0 || i >= this.rows) {
            throw new MatrixRuntimeException("Invalid row");
        }

        if(j < 0 || j >= this.columns) {
            throw new MatrixRuntimeException("Invalid column");
        }
        this.matrix[i][j] = value;
    }

    public void fillWithRandomValues(int min, int max) {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = random.nextInt(max - min + 1) + min;
                setElement(i, j, value);
            }
        }
    }

    @Override
    public String toString() {
        String matrixString = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixString += matrix[i][j] + "\t";
            }
            matrixString += "\n";
        }
        return matrixString;
    }
}
