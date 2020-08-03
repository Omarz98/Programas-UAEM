pakage Paquete12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	
	private JLabel et1,et2,et3,et4;
	private JTextField txt1,txt2;
	private JRadioButon r1,r2,r3,r4,r5;
	private JButton btnLimpiar,btnAgregar;

	public Main(){
		setTitle("Mini Proyecto");
		setSize(400,600);
		setLayout(null);
		initComponents();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public void initComponents(){
		et1= new JLabel("Agencia");
		et2= new JLabel("Nombre:");
		et3= new JLabel("Direccion:");
		et4= new JLabel("Valoracion");

		txt1 = new JTextField("");
		txt2 = new JTextField("");
		
		r1 = new JRadioButon("");
		r2 = new JRadioButon("");
		r3 = new JRadioButon("");
		r4 = new JRadioButon("");
		r5 = new JRadioButon("");

		btnLImpiar = new JButton("Limpiar");
		btnAgregar= new JButton("Agregar");

		et1.setBounds(100,5,100,40);
		et2.setBounds(5,60,80,20);
		et3.setBounds(5,90,80,20);
		et4.setBounds(5,120,80,20);

		txt.setBounds(100,60,100,20);
		txt.setBounds(100,90,100,20);

		r1.setBounds(100,120,20,20);
		r2.setBounds(120,120,20,20);
		r3.setBounds(140,120,20,20);
		r4.setBounds(160,120,20,20);
		r5.setBounds(180,120,20,20);

		add(et1);
		add(et2);
		add(et3);
		add(et4);
		add(et5);
		add(et6);
		add(et1);
		add(et1);
		add(et1);
		add(et1);
		add(et1);

	}

	public static void main(String[] args){
		Main m = new Main();
	}
}
