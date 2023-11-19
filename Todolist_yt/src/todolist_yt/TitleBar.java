/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist_yt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author AAA
 */
public class TitleBar extends JPanel {
    
    JLabel TitleText = new JLabel("To Do List App");
    public TitleBar(){
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(new Color(90, 143, 123));
        
        TitleText.setPreferredSize(new Dimension(200, 80));
        TitleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        TitleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(this.TitleText);
    }
    
}
