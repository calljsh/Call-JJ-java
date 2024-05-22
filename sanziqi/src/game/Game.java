package game;
import board.Board;
import java.util.Scanner;
public class Game {
    private Board board; // 游戏棋盘
    private char currentPlayer; // 当前玩家
    // 构造函数，初始化游戏
    public Game()
    {
        board = new Board(); // 创建新的棋盘
        currentPlayer = 'X'; // 设定初始玩家为 X
    }
    // 开始游戏
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.printBoard(); // 打印当前棋盘状态
            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt(); // 获取玩家输入的行数
            int col = scanner.nextInt(); // 获取玩家输入的列数

            if (board.placePiece(row, col, currentPlayer))
            {
                char winner = board.checkWinner(); // 检查是否有玩家获胜
                if (winner != ' ') {
                    board.printBoard(); // 打印最终的棋盘状态
                    System.out.println("Player " + winner + " wins!"); // 输出获胜者
                    break; // 游戏结束
                } else if(board.isBoardFull())
                {
                    board.printBoard(); // 打印最终的棋盘状态
                    System.out.println("It's a draw!"); // 输出平局
                    break; // 游戏结束
                }
                togglePlayer(); // 切换玩家
            } else {
                System.out.println("Invalid move. Try again."); // 如果玩家输入无效，提示重新输入
            }
        }
        scanner.close();
    }    // 切换当前玩家
    private void togglePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // 如果当前玩家是 X，则切换为 O；如果当前玩家是 O，则切换为 X
    }
}
