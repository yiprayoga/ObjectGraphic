
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yulian
 */
public class garis extends JFrame {
    public garis(){
        super("Garis");
        
        getContentPane().setBackground(Color.WHITE);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    void drawGaris(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke1 = new BasicStroke(2f); 
        g2d.setColor(Color.RED); 
        g2d.setStroke(stroke1);
        g2d.drawLine(50, 100, 300, 100);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Mohamad Khatar Malayki", 50, 300);
        g2d.drawString("191011401166", 50, 350);
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        drawGaris(g);
    }
    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new garis().setVisible(true);
            }
        });
    }

}
