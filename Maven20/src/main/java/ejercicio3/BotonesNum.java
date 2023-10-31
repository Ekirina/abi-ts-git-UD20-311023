package ejercicio3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BotonesNum extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton button1;
	private JButton button2;
	private JLabel avisobtn1;
	private JLabel avisobtn2;
	private int contador1 = 0;
	private int contador2 = 0;

	public BotonesNum() {
		setTitle("Los botones");
		setBounds(650, 300, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		System.out.println(contentPane);
		
		avisobtn1 = new JLabel();
		setVisible(true);
		avisobtn1.setForeground(new Color(0, 100, 0));
		avisobtn1.setBounds(23, 40, 236, 14);
		contentPane.add(avisobtn1);
		repaint();
		
		avisobtn2 = new JLabel();
		setVisible(true);
		avisobtn2.setForeground(new Color(0, 100, 0));
		avisobtn2.setBounds(23, 65, 236, 14);
		contentPane.add(avisobtn2);
		repaint();

		button1 = new JButton("1");
		button1.setForeground(new Color(230, 230, 250));
		button1.setBackground(new Color(0, 128, 0));
		button1.setBounds(46, 90, 89, 23);
		contentPane.add(button1);

		button2 = new JButton("2");
		button2.setForeground(new Color(230, 230, 250));
		button2.setBackground(new Color(0, 128, 0));
		button2.setBounds(159, 90, 89, 23);
		contentPane.add(button2);
		
		ActionListener al1=new ActionListener(){ 

			@Override
			public void actionPerformed(ActionEvent e) {	
				if(button1.getActionCommand() != null) {
					contador1 ++;
				}
			    avisobtn1.setText("Has pulsado el botón " + button1.getActionCommand() + " || " + contador1 + " veces");		
			}
		};
		ActionListener al2=new ActionListener(){ 

			@Override
			public void actionPerformed(ActionEvent e) {	
			
				if(button2.getActionCommand() != null) {
					contador2++;
				}
			    avisobtn2.setText("Has pulsado el botón " + button2.getActionCommand() + " || " + contador2 + " veces");
			}
		};
		button1.addActionListener(al1);
		repaint();
		button2.addActionListener(al2);
		repaint();	
	}	
}


