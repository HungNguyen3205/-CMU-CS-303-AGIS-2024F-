/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Game2048 extends JFrame {
    private final int SIZE = 4;
    private final int TILE_SIZE = 100;
    private final int[][] board;
    private final JLabel[][] labels;

    public Game2048() {
        board = new int[SIZE][SIZE];
        labels = new JLabel[SIZE][SIZE];
        setTitle("2048 Game");
        setSize(SIZE * TILE_SIZE, SIZE * TILE_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(SIZE, SIZE));

        initializeBoard();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP -> moveUp();
                    case KeyEvent.VK_DOWN -> moveDown();
                    case KeyEvent.VK_LEFT -> moveLeft();
                    case KeyEvent.VK_RIGHT -> moveRight();
                }
                addRandomTile();
                updateLabels();
                if (isGameOver()) {
                    JOptionPane.showMessageDialog(null, "Game Over!");
                    resetGame();
                }
            }
        });

        addRandomTile();
        updateLabels();
        setVisible(true);
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
                labels[i][j] = new JLabel();
                labels[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                labels[i][j].setHorizontalAlignment(JLabel.CENTER);
                labels[i][j].setBorder(BorderFactory.createLineBorder(Color.GRAY));
                add(labels[i][j]);
            }
        }
    }

    private void addRandomTile() {
        Random rand = new Random();
        int emptyCells = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) emptyCells++;
            }
        }

        if (emptyCells == 0) return;

        int position = rand.nextInt(emptyCells);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    if (position == 0) {
                        board[i][j] = rand.nextInt(10) < 9 ? 2 : 4;
                        return;
                    }
                    position--;
                }
            }
        }
    }

    private void updateLabels() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                labels[i][j].setText(board[i][j] == 0 ? "" : String.valueOf(board[i][j]));
                labels[i][j].setBackground(getColor(board[i][j]));
                labels[i][j].setOpaque(true);
            }
        }
    }

    private Color getColor(int value) {
        return switch (value) {
            case 0 -> Color.LIGHT_GRAY;
            case 2 -> new Color(238, 228, 218);
            case 4 -> new Color(237, 224, 200);
            case 8 -> new Color(242, 177, 121);
            case 16 -> new Color(245, 149, 99);
            case 32 -> new Color(246, 124, 95);
            case 64 -> new Color(246, 94, 59);
            case 128 -> new Color(237, 207, 114);
            case 256 -> new Color(237, 204, 97);
            case 512 -> new Color(237, 200, 80);
            case 1024 -> new Color(237, 197, 63);
            case 2048 -> new Color(237, 194, 46);
            default -> new Color(60, 58, 50);
        };
    }

    private void moveUp() {
        for (int j = 0; j < SIZE; j++) {
            for (int i = 1; i < SIZE; i++) {
                if (board[i][j] != 0) {
                    for (int k = i; k > 0; k--) {
                        if (board[k - 1][j] == 0) {
                            board[k - 1][j] = board[k][j];
                            board[k][j] = 0;
                        } else if (board[k - 1][j] == board[k][j]) {
                            board[k - 1][j] *= 2;
                            board[k][j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private void moveDown() {
        for (int j = 0; j < SIZE; j++) {
            for (int i = SIZE - 2; i >= 0; i--) {
                if (board[i][j] != 0) {
                    for (int k = i; k < SIZE - 1; k++) {
                        if (board[k + 1][j] == 0) {
                            board[k + 1][j] = board[k][j];
                            board[k][j] = 0;
                        } else if (board[k + 1][j] == board[k][j]) {
                            board[k + 1][j] *= 2;
                            board[k][j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private void moveLeft() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 1; j < SIZE; j++) {
                if (board[i][j] != 0) {
                    for (int k = j; k > 0; k--) {
                        if (board[i][k - 1] == 0) {
                            board[i][k - 1] = board[i][k];
                            board[i][k] = 0;
                        } else if (board[i][k - 1] == board[i][k]) {
                            board[i][k - 1] *= 2;
                            board[i][k] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private void moveRight() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = SIZE - 2; j >= 0; j--) {
                if (board[i][j] != 0) {
                    for (int k = j; k < SIZE - 1; k++) {
                        if (board[i][k + 1] == 0) {
                            board[i][k + 1] = board[i][k];
                            board[i][k] = 0;
                        } else if (board[i][k + 1] == board[i][k]) {
                            board[i][k + 1] *= 2;
                            board[i][k] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private boolean isGameOver() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) return false;
                if (i < SIZE - 1 && board[i][j] == board[i + 1][j]) return false;
                if (j < SIZE - 1 && board[i][j] == board[i][j + 1]) return false;
            }
        }
        return true;
    }

    private void resetGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }
        addRandomTile();
        updateLabels();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Game2048::new);
    }
}

