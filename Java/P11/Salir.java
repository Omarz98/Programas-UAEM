package Paquete11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Salir extends JFrame implements ActionListener{

	JLabel et1;
	JPasswordField psw;
	JButton btn1,btn2;

	public Salir(){
		setTitle("Salir");
		setSize(300,250);
		setLayout(null);
		initComponents();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public void initComponents(){
		et1 = new JLabel("Contrasena");
		psw = new JPasswordField("");
		btn1 = new JButton("Opcion");
		btn2 = new JButton("Ok");

		et1.setBounds(20,5,100,40);

		psw.setBounds(20,40,200,40);

		btn1.setBounds(20,120,100,40);
		btn2.setBounds(150,120,100,40);

		add(et1);
		add(psw);
		add(btn1);
		add(btn2);

	}

	public void actionPerformed(ActionEvent ev){

	}

	public static void main(String[] args) {
		Salir x = new Salir();
	}

}