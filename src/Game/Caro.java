package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Caro extends JPanel implements MouseListener {
    private final int SIZE = 15;
    private final int CELL_SIZE = 40;
    private final char[][] board;
    private char currentPlayer; // Biến để theo dõi người chơi hiện tại
    private boolean gameEnded; // Biến để theo dõi trạng thái trò chơi

    public Caro() {
        this.board = new char[SIZE][SIZE];
        resetGame(); // Khởi tạo trò chơi
        addMouseListener(this);
        setPreferredSize(new Dimension(SIZE * CELL_SIZE, SIZE * CELL_SIZE));
    }

    private void resetGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '\0'; // Đặt lại tất cả các ô thành trống
            }
        }
        currentPlayer = 'X'; // Bắt đầu với người chơi X
        gameEnded = false; // Trò chơi bắt đầu chưa kết thúc
        repaint(); // Vẽ lại bảng
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                g.drawRect(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                if (board[i][j] != '\0') {
                    // Thiết lập màu sắc và kích thước phông chữ
                    g.setColor(board[i][j] == 'X' ? Color.RED : Color.BLUE);
                    g.setFont(new Font("Arial", Font.BOLD, 30)); // Kích thước phông chữ lớn
                    FontMetrics fm = g.getFontMetrics();
                    int x = i * CELL_SIZE + (CELL_SIZE - fm.stringWidth(String.valueOf(board[i][j]))) / 2;
                    int y = j * CELL_SIZE + (CELL_SIZE + fm.getAscent()) / 2 - 5; // Điều chỉnh y một chút
                    g.drawString(String.valueOf(board[i][j]), x, y);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (gameEnded) return; // Nếu trò chơi đã kết thúc, không cho phép nhấp chuột

        int x = e.getX() / CELL_SIZE;
        int y = e.getY() / CELL_SIZE;
        if (x < SIZE && y < SIZE && board[x][y] == '\0') {
            board[x][y] = currentPlayer; // Đánh dấu ô với người chơi hiện tại
            if (checkWin(x, y)) {
                gameEnded = true; // Đánh dấu trò chơi đã kết thúc
                JOptionPane.showMessageDialog(this, "Người chơi " + currentPlayer + " thắng!", "Kết thúc trò chơi", JOptionPane.INFORMATION_MESSAGE);
                resetGame(); // Reset trò chơi để bắt đầu lại
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Chuyển lượt
                repaint();
            }
        }
    }

    // Hàm kiểm tra thắng
    private boolean checkWin(int x, int y) {
        return checkDirection(x, y, 1, 0) || // Ngang
               checkDirection(x, y, 0, 1) || // Dọc
               checkDirection(x, y, 1, 1) || // Chéo phải
               checkDirection(x, y, 1, -1);  // Chéo trái
    }

    // Hàm kiểm tra theo hướng nhất định
    private boolean checkDirection(int x, int y, int dx, int dy) {
        char player = board[x][y];
        int count = 1;

        // Kiểm tra một chiều
        for (int i = 1; i < 5; i++) {
            int newX = x + i * dx;
            int newY = y + i * dy;
            if (newX < 0 || newX >= SIZE || newY < 0 || newY >= SIZE || board[newX][newY] != player) {
                break;
            }
            count++;
        }

        // Kiểm tra chiều ngược lại
        for (int i = 1; i < 5; i++) {
            int newX = x - i * dx;
            int newY = y - i * dy;
            if (newX < 0 || newX >= SIZE || newY < 0 || newY >= SIZE || board[newX][newY] != player) {
                break;
            }
            count++;
        }

        // Chỉ thông báo thắng nếu có đúng 5 ký tự liên tiếp
        return count == 5;
    }

    // Các phương thức MouseListener khác
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cờ caro");
        Caro game = new Caro();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
