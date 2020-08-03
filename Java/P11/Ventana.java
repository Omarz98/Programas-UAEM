package Paquete11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame{

	public JRadioButton	r1,r2,r3;
	public JCheckBox ch1,ch2,ch3;
	public TextArea area;
	public JButton btn1,btn2,btn3;
	public ButtonGroup grupo;
	public JScrollPane scroll;

	public Ventana(){
		setTitle("Principal");
		setSize(500,500);
		setLayout(null);
		initComponents();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public void initComponents(){
		r1 = new JRadioButton("Fuente 1");
		r2 = new JRadioButton("Fuente 2");
		r3 = new JRadioButton("Fuente 3");

		ch1 = new JCheckBox("Negritas");
		ch2 = new JCheckBox("Cursiva");
		ch3 = new JCheckBox("Salir");

		area = new TextArea();
		scroll = new JScrollPane(area);
		btn1 = new JButton("F1");
		btn1 = new JButton("F2");
		btn1 = new JButton("Salir");

		grupo = new ButtonGroup();
		grupo.add(r1);
		grupo.add(r2);
		grupo.add(r3);

		r1.setBounds(20,20,100,40);//500,400
		r1.setBounds(20,40,100,40);
		r1.setBounds(20,60,100,40);

		ch1.setBounds(80,20,100,40);//500,400
		ch2.setBounds(80,40,100,40);
		ch3.setBounds(80,60,100,40);

		btn1.setBounds(20,475,100,40);
		btn2.setBounds(40,475,100,40);
		btn3.setBounds(80,475,100,40);

		area.setBounds(20,100,460,400);

		
		/*add(area);
		add(r1);
		add(r2);
		add(r3);
		add(ch1);
		add(ch2);
		add(ch3);
		add(area);
		add(btn1);
		add(btn2);
		add(btn3);*/
	}


	public static void main(String[] args) {
		Ventana v = new Ventana();
	}
}//clase