package lesson2.HomeWork;

public class Ex4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("isValidSudoku(board) = " + isValidSudoku(board));
    }

    /**
     * @param board Таблица судоку
     * @param row   Номер строки
     * @return True - если содержит хотя бы одну цифру, без повторений
     * @apiNote Содержит ли строка цифру 1-9 без повторения
     */
    private static boolean checkRow(char[][] board, int row) {
        boolean[] isonly = new boolean[9];
        int num = 0, dotCount = 0;
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] != '.') {
                num = board[row][i] - '0';
                if (isonly[num - 1])
                    return false;
                isonly[num - 1] = true;
            } else
                dotCount++;
        }
        if (dotCount < board[0].length)
            return true;
        else
            return false;

    }

    /**
     * @param board Таблица судоку
     * @param col   Номер столбца
     * @return True - если содержит хотя бы одну цифру, без повторений
     * @apiNote Содержит ли столбец цифру 1-9 без повторения
     */
    private static boolean checkCol(char[][] board, int col) {
        boolean[] isonly = new boolean[9];
        int num = 0, dotCount = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != '.') {
                num = board[i][col] - '0';
                if (isonly[num - 1])
                    return false;
                isonly[num - 1] = true;
            } else
                dotCount++;
        }
        if (dotCount < board.length)
            return true;
        else
            return false;

    }

    /**
     * @param board Таблица Судоку
     * @param row   Номер строки, с которой начинается блок
     * @param col   Номер столбца, с которого начинается блок
     * @return True - если содержит хотя бы одну цифру 1-9 без повторений
     * @apiNote Проверяет, содержит ли подблок из 9 элементов 3 x 3 цифру 1-9 без повторения
     */
    private static boolean checkBox(char[][] board, int row, int col) {
        boolean[] isonly = new boolean[9];
        int num = 0, dotCount = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] != '.') {
                    num = board[i][j] - '0';
                    if (isonly[num - 1])
                        return false;
                    isonly[num - 1] = true;
                } else
                    dotCount++;
            }
        }
        if (dotCount < 9)
            return true;
        else
            return false;

    }

    /**
     * @param board Таблица Судоку
     * @return True - если составлена корректно
     * @apiNote Проверяет таблицу Судоку на корректность
     */
    private static boolean isValidSudoku(char[][] board) {

        // check rows
        for (int i = 0; i < board.length; i++) {
            if (!checkRow(board, i)) {
                System.out.println("Wrong row: i = " + i);
                return false;
            }
        }

        // check cols
        for (int i = 0; i < board[0].length; i++) {
            if (!checkCol(board, i)) {
                System.out.println("Wrong column: j = " + i);
                return false;
            }
        }

        // check boxes
        for (int i = 0; i < board.length - 2; i += 3) {
            for (int j = 0; j < board[0].length - 2; j += 3) {
                if (!checkBox(board, i, j)) {
                    System.out.println("Wrong box: i = " + i + ", j = " + j);
                    return false;
                }
            }
        }

        return true;
    }
}
