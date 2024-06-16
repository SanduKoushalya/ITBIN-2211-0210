/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class GradientPanel extends JPanel {
    private Color color1;
    private Color color2;

    // Constructor that accepts RGB values for the colors
    public GradientPanel(int r1, int g1, int b1, int r2, int g2, int b2) {
        this.color1 = new Color(r1, g1, b1);
        this.color2 = new Color(r2, g2, b2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // Create a gradient with the specified colors
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

    public static void main(String[] args) {
        // Specify the RGB values for the colors
        int r1 = 102, g1 = 153, b1 = 255; // Dark Blue
        int r2 = 204, g2 = 153, b2 = 255; // Light Blue

        JFrame frame = new JFrame("Gradient Panel Example");
        GradientPanel panel = new GradientPanel(r1, g1, b1, r2, g2, b2);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
