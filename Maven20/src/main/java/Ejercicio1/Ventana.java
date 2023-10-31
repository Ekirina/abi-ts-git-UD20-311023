package Ejercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar barraMenu;

	public Ventana() {
		setTitle("La ventana");
		setBounds(200, 200, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		barraMenu = new JMenuBar();
		contentPane.add(barraMenu);
		System.out.println(contentPane);
		
		JLabel lblNewLabel = new JLabel("Puedes cambiar el tamaño en el margen.");
		lblNewLabel.setBackground(new Color(220, 220, 220));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(30, 66, 231, 36);
		contentPane.add(lblNewLabel);
		

		ActionListener al=new ActionListener(){ 

			@Override
			public void actionPerformed(ActionEvent e) {
			}		
		};
	}
}
