package Ordinario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Repetidos extends JFrame{
	
	private JLabel et1;
	private JTextField txt;
	private JButton btn,btn2;
	
	public Repetidos() {
		setTitle("Fechas");
		setSize(500,600);
		initComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void initComponents(){
		
		et1 = new JLabel("fecha:");
		txt = new JTextField("");
		btn = new JButton("Ingresar");
		btn2 = new JButton("Mostrar");
		
		et1.setBounds(20,20,30,60);
		txt.setBounds(20,50,30,60);
		btn.setBounds(20,80,30,60);
		btn2.setBounds(20,110,30,60);
		
		add(et1);
		add(txt);
		add(btn);
		add(btn2);
		
		btn.addActionListener(new ActionListener){
			actionPerformed( ActionEvent e){
				txt.setText();
			}
		}
		
	}
	
	public static void main(String[] args){
		Repetidos r = new Repetidos();
	}	
}