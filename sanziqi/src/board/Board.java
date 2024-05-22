package board;

import java.util.Arrays;

public class Board {
    private char[][] board; // 棋盘状态

    // 构造函数，初始化棋盘
    public Board() {
        board = new char[3][3];
        for (char[] row : board) {
            Arrays.fill(row, ' '); // 将棋盘初始化为空格
        }
    }
    // 打印棋盘
    public void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " | "); // 打印每个单元格
            }
            System.out.println();
            System.out.println("---------"); // 打印分隔线
        }
    }
    // 在指定位置放置棋子
    public boolean placePiece(int row, int col, char piece) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            return false;  // 如果位置无效或已经有棋子，返回 false
        }
        board[row][col] = piece; // 在指定位置放置棋子
        return true;
    }

    // 检查游戏状态，返回获胜者或游戏尚未结束
    public char checkWinner() {
        // 检查行
        for (int i = 0; i < 3; ++i) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];  // 如果一行的棋子都相同，返回获胜者
            }
        }
        // 检查列
        for (int j = 0; j < 3; ++j) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return board[0][j];  // 如果一列的棋子都相同，返回获胜者
            }
        }
        // 检查对角线
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];  // 如果左上到右下对角线的棋子都相同，返回获胜者
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];  // 如果左下到右上对角线的棋子都相同，返回获胜者
        }

        return ' ';  // 游戏尚未结束，返回空格
    }

    // 检查是否棋盘已满
    public boolean isBoardFull() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (board[i][j] == ' ') {
                    return false; // 如果有空格，表示棋盘尚未满
                }
            }
        }
        return true; // 棋盘已满
    }
}
