
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
public class aboutUS extends JFrame {
    public aboutUS(){
        super("About US");
        
        getContentPane().setBackground(Color.WHITE);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    void drawAboutUS(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke1 = new BasicStroke(2f); 
        g2d.setColor(Color.BLACK); 
        g2d.setStroke(stroke1);
        g2d.drawString("Tentang Kami", 50, 50);
        g2d.drawString("Ini adalah aplikasi yang dibuat dalam tugas Mata Kuliah Komputer Grafik 1", 50, 70);
        g2d.drawString("Dibuat Oleh : ", 50, 90);
        g2d.drawString("Mohamad Khatar Malayki, Muhamad Ichsan Darmawan", 50, 110);
        g2d.drawString("Muhammad Fajar Handika, Yulian Islam Prayoga", 50, 130);
        
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        drawAboutUS(g);
    }
    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new aboutUS().setVisible(true);
            }
        });
    }


}
