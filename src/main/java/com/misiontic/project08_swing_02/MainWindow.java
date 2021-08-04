/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project08_swing_02;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aleja
 */
public class MainWindow extends JFrame implements ActionListener{
    private JLabel description, result;
    private JTextField inputDolar;
    private JButton calculate;
    MainWindow(){
        
        
        //setBounds(450,200,500,200);//tamaño y posicion
        //setSize(300,300);
        //setLocationRelativeTo(null);//centrar
        Toolkit myScreen = Toolkit.getDefaultToolkit();//detectar la pantalla
        Dimension screenSize = myScreen.getScreenSize();//Obteniedno tamaño de pantalla completo
        int height = screenSize.height;//alto
        int width = screenSize.width;
        setSize(width/2, height/2);
        setLocationRelativeTo(null);
        setTitle("Mision TIC");// titulo de la venta
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//forma de cerrar app
        JPanel panel =new JPanel();
        panel.setLayout(null); //desactivar layaot predeterminado
        this.getContentPane().add(panel); //El panel se encarga de ubicar los componentes
        description = new JLabel("Convertir de dolares a pesos");
        description.setBounds(10, 10, 50, 50);
        panel.add(description); //Agregar elemento al panel dentro de la ventana
         inputDolar = new JTextField();//Crear casilla
        inputDolar.setBounds(10,60,100,30);//dimensiones del  
        panel.add(inputDolar);//Agregar elemento 
         result= new JLabel("0,0");//mostar resultado con un texto
        result.setBounds(30,100,100,30);//dimensiones del texto
        panel.add(result);//agreagar al panel
        JButton calculateButton =new JButton("Calcular");//crear boton
        calculateButton.setBounds(10,140,100,30);//dimensiones del boton
        calculateButton.addActionListener(this);//implementar interfaz para evento del button
        panel.add(calculateButton);//agregar boton al panel
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dolar= inputDolar.getText();
        double pesos =Double.parseDouble(dolar)*3900;
        result.setText(""+pesos);
        JOptionPane.showMessageDialog(this,"ok");
    }
}
