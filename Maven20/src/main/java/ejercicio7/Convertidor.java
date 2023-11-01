package ejercicio7;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Convertidor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel convertir;
	private JButton €_pts;
	private JButton pts_€;
	private JTextField apts;
	private JTextField a€;
	private JTextField cantidad;

	public Convertidor() {
		setTitle("Convertidor de pts.- €");
		setBounds(650, 300, 500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		System.out.println(contentPane);

		convertir = new JLabel();
		convertir.setText("Cantidad a convertir");
		convertir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		convertir.setForeground(new Color(0, 100, 0));
		convertir.setBounds(188, 11, 112, 23);
		convertir.setVisible(true);
		contentPane.add(convertir);

		€_pts = new JButton("€ - pts.");
		€_pts.setFont(new Font("Tahoma", Font.BOLD, 11));
		€_pts.setForeground(new Color(230, 230, 250));
		€_pts.setBackground(new Color(0, 128, 0));
		€_pts.setBounds(258, 87, 89, 23);
		contentPane.add(€_pts);
		
		pts_€ = new JButton("pts. - €");
		pts_€.setFont(new Font("Tahoma", Font.BOLD, 11));
		pts_€.setForeground(new Color(230, 230, 250));
		pts_€.setBackground(new Color(0, 128, 0));
		pts_€.setBounds(23, 87, 89, 23);
		contentPane.add(pts_€);
		
		apts = new JTextField();
		apts.setForeground(new Color(0, 102, 0));
		apts.setFont(new Font("Tahoma", Font.BOLD, 12));
		apts.setBounds(357, 96, 106, 14);
		contentPane.add(apts);
		apts.setColumns(10);
		
		a€ = new JTextField();
		a€.setForeground(new Color(0, 102, 0));
		a€.setFont(new Font("Tahoma", Font.BOLD, 12));
		a€.setBounds(122, 96, 107, 14);
		contentPane.add(a€);
		a€.setColumns(10);
		
		cantidad = new JTextField();
		cantidad.setForeground(new Color(0, 102, 0));
		cantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		cantidad.setBounds(186, 45, 114, 23);
		contentPane.add(cantidad);
		cantidad.setColumns(10);	

		ActionListener al1=new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {	
				double qtity = Double.parseDouble(cantidad.getText());
				double result;
				result =(qtity * 166.386);
			    apts.setText(String.format("%.2f", result));
			}
		};
		€_pts.addActionListener(al1);
		
		ActionListener al2=new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {	
				double qtity = Double.parseDouble(cantidad.getText());
				double result;
				result = (qtity / 166.386);
			    a€.setText(String.format("%.2f", result));
			}
		};
		pts_€.addActionListener(al2);
	}
}
