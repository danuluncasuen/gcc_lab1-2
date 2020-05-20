package com.company.lab1;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawRect(200,200,200,200);
        g2.setColor(Color.blue);
        g2.fillOval(500,200,200,200);
        g2.drawString("Laboratorul numarul 1", 1020, 500);
    }
}

public class Main {

    JFrame f;
    MyPanel p;

    public Main(){
        f = new JFrame();
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());
        p = new MyPanel();
        c.add(p, BorderLayout.CENTER);
        f.setSize(1200,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]){
        Main t = new Main();
    }
}