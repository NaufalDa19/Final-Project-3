/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package projectgui;

import java.awt.Dimension;

/**
 *
 * @author Naufal D~A
 */
public class Home{

    public static void main(String[] args) {
        Register_page tampil = new Register_page();
        tampil.setVisible(true);
        tampil.pack();
        tampil.setMinimumSize(new Dimension (360,440));
        tampil.setLocationRelativeTo(null);
        tampil.setDefaultCloseOperation(Register_page.EXIT_ON_CLOSE);
    }
    
}
