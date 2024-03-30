/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasnake;

import javax.swing.JFrame;

/**
 *
 * @author FerreiraDev
 */
public class GameFrame extends JFrame {

    GameFrame() {
        GamePanel Panel = new GamePanel();
        this.add(Panel);
        this.setTitle("JaSnake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
