
import java.awt.BasicStroke; 
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.Stroke; 
import java.awt.geom.Rectangle2D; 
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
public class pPanjang extends JFrame {
    public pPanjang(){
        super("Rectangle");
        
        getContentPane().setBackground(Color.WHITE);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    void drawRectangles(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke1 = new BasicStroke(2f); 
        g2d.setColor(Color.RED); 
        g2d.setStroke(stroke1);
        g2d.drawRect(100, 100, 100, 100); 
        g2d.setColor(Color.BLACK);
        g2d.drawString("Muhammad Fajar Handika", 50, 300);
        g2d.drawString("191011402404", 50, 350);
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        drawRectangles(g);
    }
    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new pPanjang().setVisible(true);
            }
        });
    }


}
