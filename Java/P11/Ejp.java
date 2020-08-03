package Paquete11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejp extends JFrame implements ActionListener{

	public JRadioButton	r1,r2,r3;
	public JCheckBox ch1,ch2,ch3;
	public TextArea area;
	public JButton btn1,btn2,btn3;
	public ButtonGroup grupo;
	public JScrollPane scroll;

	public Ejp(){
		setTitle("Principal");
		setSize(400,600);
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
		ch3 = new JCheckBox("Italika");

		area = new TextArea();
		scroll = new JScrollPane(area);
		btn1 = new JButton("F1");
		btn2 = new JButton("F2");
		btn3 = new JButton("Salir");

		grupo = new ButtonGroup();
		grupo.add(r1);
		grupo.add(r2);
		grupo.add(r3);

		r1.setBounds(20,10,100,40);//500,400
		r2.setBounds(20,40,100,40);
		r3.setBounds(20,70,100,40);

		ch1.setBounds(200,10,100,40);//500,400
		ch2.setBounds(200,40,100,40);
		ch3.setBounds(200,70,100,40);

		area.setBounds(20,120,350,350);

		btn1.setBounds(20,500,100,40);
		btn2.setBounds(140,500,100,40);
		btn3.setBounds(270,500,100,40);

		add(r1);
		add(r2);
		add(r3);
		add(ch1);
		add(ch2);
		add(ch3);
		add(area);
		add(btn1);
		add(btn2);
		add(btn3);

	}

	public void actionPerformed(ActionEvent ev){

	}

	public static void main(String[] args) {
		Ejp e = new Ejp();
	}

}