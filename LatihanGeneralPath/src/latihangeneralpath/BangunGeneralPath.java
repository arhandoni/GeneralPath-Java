/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package latihangeneralpath;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;
/**
 *
 * @author hp
 */
public class BangunGeneralPath extends JPanel {
    
    // gambar general path
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random acak = new Random();// manggil paintcomponent superkelas
        
        // mendefinisikan kooridnat
        int[] xtitik = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int[] ytitik = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath bintang = new GeneralPath(); // menciptakan ojek generalpath
        
        // menetapkan koorinat awal dari the generalpath
        bintang.moveTo(xtitik[0], ytitik[0]); 
        
        // meciptakan bintang
        for (int hitung = 1; hitung < xtitik.length; hitung++) {
            bintang.lineTo(xtitik[hitung], ytitik[hitung]);
        }
        
        bintang.closePath(); // mwnutup bangung
        
        g2d.translate(150, 150); //translasi titik awal menjadi (150, 150)
        
        //rotasi disekitar titik awal dan menggambarkan bintang dengan warna
        for (int hitung = 1; hitung <=20; hitung++) {
            g2d.rotate(Math.PI / 10.0); //rotasi sistem koordinat
            
            // menetapkan warna pada gambar
            g2d.setColor(Color.pink);
            
            g2d.fill(bintang); //menggamnbar bintang terisi
        }
    }
}
        
