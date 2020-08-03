package Paquete11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener{

	JButton btnf1,btnf2,btnsalir;
	JLabel	lb1,lb2;

	public Interfaz(){
		setTitle("Evento: clase Propia");
		setLayout(null);
		setSize(720,720);
		initComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ev){
		/*System.out.println("Evento");
		if ( ev.getSource() == btnSalir ) {
			System.exit(0);
		}

		if ( ev.getSource()==btnOk) {
			//JOptionPane.showMessageDialog(null,"Mensaje","Titulo",2);
			String texto = JOptionPane.showInputDialog(null,"Texto","Titulo",JOptionPane.INFORMATION_MESSAGE);
			et2.setText( texto );
		}*/
	}

	public void initComponents(){
		btnf1 = new JButton("F1");
		btnf2 = new JButton("F2");
		btnsalir = new JButton("Salir");

		//et1 = new JLabel("Etiqueta 1 ");
		

		
		btnf1.setBounds(100,600,100,30);
		btnf2.setBounds(300,600,100,30);
		btnsalir.setBounds(500,600,100,30);

		//btnOk.addActionListener(this);
		//btnSalir.addActionListener(this);

		//add(et1);
		//add(et2);
		add(btnf1);
		add(btnf2);
		add(btnsalir);
	}

	public static void main(String[] args) {
		
		Interfaz f = new Interfaz();
	}//main
}
