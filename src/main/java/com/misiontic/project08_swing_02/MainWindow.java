/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project08_swing_02;

import javax.swing.JFrame;

/**
 *
 * @author aleja
 */
public class MainWindow extends JFrame {
    
    MainWindow(){
        setBounds(450,200,500,200);//tamaño y posicion
        setTitle("Mision TIC");// titulo de la venta
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//forma de cerrar app
        
    }
}
