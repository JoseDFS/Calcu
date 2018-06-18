/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import FactoryBinario.Binario;
import OperacionesAritmeticas.Operacion;
import OperacionesAritmeticas.Suma;
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

    private JTextField caja1, caja2, caja3;
    private JButton boton1, boton2, boton3, boton4, boton5;
    private AbstractFactory factory;

    public Gui() {
        super("Calculadora");
        initialComponents();
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello world");
                factory = FactoryProducer.getFactory("Aritmetica");
                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                Operacion suma = factory.getOperacion(1);

                caja3.setText(Float.toString(suma.Calcular(a, b)));

            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello world");
                factory = FactoryProducer.getFactory("Aritmetica");
                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                Operacion restar = factory.getOperacion(2);

                caja3.setText(Float.toString(restar.Calcular(a, b)));

            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello world");
                factory = FactoryProducer.getFactory("Aritmetica");
                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                Operacion multi = factory.getOperacion(3);

                caja3.setText(Float.toString(multi.Calcular(a, b)));

            }
        });
        
         boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello world");
                factory =  FactoryProducer.getFactory("Aritmetica");
                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                Operacion division = factory.getOperacion(4);
                
                caja3.setText(Float.toString(division.Calcular(a, b)));
                

            }
        });

        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello world");
                factory = FactoryProducer.getFactory("Binario");
                int a = Integer.parseInt(caja1.getText());
                Binario binario = factory.getBinario();
                binario.aBinario(a);
                System.out.println(binario.getResultado());
                caja3.setText(binario.aBinario(a));

            }
        });
    }

    public void initialComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Container container = getContentPane();

        caja1 = new JTextField();
        caja1.setBounds(10, 0, 150, 30);

        caja2 = new JTextField();
        caja2.setBounds(10, 50, 150, 30);

        caja3 = new JTextField();
        caja3.setBounds(10, 100, 150, 30);
        caja3.setEditable(false);

        boton1 = new JButton("Sumar");
        boton1.setBounds(60, 150, 100, 25);

        boton2 = new JButton("Restar");
        boton2.setBounds(170, 150, 100, 25);

        boton3 = new JButton("Multiplicar");
        boton3.setBounds(0, 200, 100, 25);

        boton4 = new JButton("Dividir");
        boton4.setBounds(110, 200, 100, 25);

        boton5 = new JButton("Binario");
        boton5.setBounds(220, 200, 100, 25);

        container.add(caja1);
        container.add(caja2);
        container.add(caja3);

        container.add(boton1);
        container.add(boton2);
        container.add(boton3);
        container.add(boton4);
        container.add(boton5);

        setSize(340, 300);

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
