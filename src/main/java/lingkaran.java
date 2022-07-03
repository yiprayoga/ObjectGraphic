
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
public class lingkaran extends JFrame {
    public lingkaran(){
        super("Lingkaran");
        
        getContentPane().setBackground(Color.WHITE);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    void drawLingkaran(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke1 = new BasicStroke(2f); 
        g2d.setColor(Color.RED); 
        g2d.setStroke(stroke1);
        g2d.drawOval(100, 100, 100, 100);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Muhamad Ichsan Darmawan", 50, 300);
        g2d.drawString("191011401142", 50, 350);
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        drawLingkaran(g);
    }
    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new lingkaran().setVisible(true);
            }
        });
    }

}