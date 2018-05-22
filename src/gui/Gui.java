/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Gui extends JFrame {
    private JTextField caja1, caja2;
    private JButton boton1, boton2, boton3,boton4,boton5;
   
    public Gui(){
        super("Titulo");
        initialComponents();
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello world");
                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                
            }
        });
    }
    
    public void initialComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         Container container = getContentPane();
        
        caja1 = new JTextField();
        caja1.setBounds(10,0,150,30);
        
        caja2 = new JTextField();
        caja2.setBounds(10,50,150,30);
        caja2.setEditable(false);
       
        boton1 = new JButton("Sumar");
        boton1.setBounds(100,100,100,25);
        
        boton2 = new JButton("Restar");
        boton2.setBounds(10,100,100,25);
        
        boton3 = new JButton("Multiplicar");
        boton3.setBounds(120,200,100,25);
        
        boton4 = new JButton("Dividir");
        boton4.setBounds(220,200,100,25);
        
        boton5 = new JButton("Binario");
        boton5.setBounds(320,200,100,25);
        
        
       
        container.add(caja1);
        container.add(caja2);
        container.add(boton1);
        
        setSize(300,300);
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new Gui().setVisible(true);
            }
        });
    }
}
