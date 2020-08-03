package Paquete11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F1 extends JFrame implements ActionListener{

	JLabel et1,et2;
	JTextField texto,tf;
	JComboBox opc;

	public F1(){
		setTitle("F1");
		setSize(350,230);
		setLayout(null);
		initComponents();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public void initComponents(){

		et1 = new JLabel("Titulo");
		texto = new JTextField("");
		et2 = new JLabel("Color");
		tf = new JTextField(20);
		opc = new JComboBox();
		opc.addItem("Rojo");
		opc.addItem("Verde");
		opc.addItem("Azul");
		opc.addItem("Morado");

		opc.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tf.setText(opc.getSelectedItem().toString());
			}
		});

		et1.setBounds(20,20,100,40);
		texto.setBounds(110,20,200,40);
		et2.setBounds(20,80,100,40);
		opc.setBounds(110,80,100,40);

		add(et1);
		add(texto);
		add(et2);
		add(opc);
	}

	public void actionPerformed(ActionEvent ev){

	}

	public static void main(String[] args) {
		F1 x = new F1();
	}

}