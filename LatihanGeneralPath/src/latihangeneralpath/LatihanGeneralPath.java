/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihangeneralpath;

import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author hp
 */
public class LatihanGeneralPath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat frame
        JFrame frame = new JFrame("Menggambar Bangun 20");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // memanggil class BasngunGeneralPath
        BangunGeneralPath bangun2JPanel = new BangunGeneralPath();
        
        frame.add(bangun2JPanel);
        frame.setBackground(Color.WHITE);
        frame.setSize(315, 330);
        frame.setVisible(true);
    }
    
}
