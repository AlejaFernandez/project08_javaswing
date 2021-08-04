/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project08_swing_02;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aleja
 */
public class MainWindow extends JFrame {
    
    MainWindow(){
        setBounds(450,200,500,200);//tamaño y posicion
        setTitle("Mision TIC");// titulo de la venta
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//forma de cerrar app
        JPanel panel =new JPanel();
        panel.setLayout(null); //desactivar layaot predeterminado
        this.getContentPane().add(panel); //El panel se encarga de ubicar los componentes
        JLabel description = new JLabel("Convertir de dolares a pesos");
        description.setBounds(10, 10, 50, 50);
        panel.add(description); //Agregar elemento al panel dentro de la ventana
    }
}
