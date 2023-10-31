package ejercicio2;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class UltimoBoton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton button1;
	private JButton button2;
	private JLabel aviso;

	public UltimoBoton() {
		setTitle("Los botones");
		setBounds(650, 300, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		System.out.println(contentPane);

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
		
		aviso = new JLabel();
		aviso.setForeground(new Color(0, 100, 0));
		aviso.setBounds(81, 65, 136, 14);
		contentPane.add(aviso);

		ActionListener al=new ActionListener(){ 

			@Override
			public void actionPerformed(ActionEvent e) {
			    aviso.setText("Has pulsado el botón " + e.getActionCommand());			
		}
		};
		button1.addActionListener(al);		
		button2.addActionListener(al);	
		}
	}

