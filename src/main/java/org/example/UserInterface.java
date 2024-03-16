package org.example;

import java.awt.event.*;

import java.awt.*;
import javax.swing.*;

public class UserInterface extends JPanel implements MouseListener, MouseMotionListener{
    static int x=0,y=0;


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.red);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        g.setColor(new Color(190,132,200));
        g.fillRect(x-20,y-20,40,40);
        g.drawString("PlyMe", 100, 100);
        Image chessPieceImage =  new ImageIcon("C:\\Users\\Lenovo\\Desktop\\2024projekty\\ChessEngine\\src\\main\\resources\\chess_pieces.png").getImage();
        g.drawImage(chessPieceImage, x, y, 100,100,this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
