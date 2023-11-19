/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist_yt;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author AAA
 */
public class List extends JPanel{
    public List(){
        GridLayout Layout = new GridLayout(10, 1);
        Layout.setVgap(5);
        this.setLayout(Layout);
        
        
    }
    
    public void indexnum(){
        Component[] listcomp = this.getComponents();
        for(int i = 0; i < listcomp.length; i++){
            if(listcomp[i] instanceof Task){
                ((Task)listcomp[i]).writeindexj1(i+1);
                
            }
        }
    }
}
