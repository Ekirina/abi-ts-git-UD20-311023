package ejercicio8;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertidorPro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel convertir;
	private JButton €_pts;
	private JButton pts_€;
	private JTextField apts;
	private JTextField a€;
	private JTextField cantidad;
	private JButton borrar; 

	public ConvertidorPro() {
		setTitle("Convertidor pro de pts.- €");
		setBounds(650, 300, 500, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
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
		€_pts.setBounds(258, 105, 89, 23);
		contentPane.add(€_pts);

		pts_€ = new JButton("pts. - €");
		pts_€.setFont(new Font("Tahoma", Font.BOLD, 11));
		pts_€.setForeground(new Color(230, 230, 250));
		pts_€.setBackground(new Color(0, 128, 0));
		pts_€.setBounds(23, 105, 89, 23);
		contentPane.add(pts_€);

		apts = new JTextField();
		apts.setEditable(false);
		apts.setForeground(new Color(0, 102, 0));
		apts.setFont(new Font("Tahoma", Font.BOLD, 12));
		apts.setBounds(358, 108, 106, 20);
		contentPane.add(apts);
		apts.setColumns(10);

		a€ = new JTextField();
		a€.setEditable(false);
		a€.setForeground(new Color(0, 102, 0));
		a€.setFont(new Font("Tahoma", Font.BOLD, 12));
		a€.setBounds(122, 108, 107, 20);
		contentPane.add(a€);
		a€.setColumns(10);

		cantidad = new JTextField();
		cantidad.setForeground(new Color(0, 102, 0));
		cantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		cantidad.setBounds(186, 45, 114, 23);
		contentPane.add(cantidad);
		cantidad.setColumns(10);	

		borrar = new JButton("Borrar");
		borrar.setForeground(new Color (230, 230, 250));
		borrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		borrar.setBackground(new Color(0, 102, 0));
		borrar.setBounds(202, 153, 89, 23);
		contentPane.add(borrar);

		ActionListener al1=new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {	
				apesetas();
			}
		};
		€_pts.addActionListener(al1);

		ActionListener al2=new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {	
				aeuros();
			}
		};
		pts_€.addActionListener(al2);

		ActionListener clear=new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {	
				vaciar();
			}
		};
		borrar.addActionListener(clear);

		pts_€.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
					aeuros();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		€_pts.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
					apesetas();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		borrar.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
					vaciar();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		setContentPane(contentPane);
	}
	/*€_pts.addKeyListener(null);
		pts_€.addKeyListener(null);*/

	public void aeuros() {
		try {
			double qtity = Double.parseDouble(cantidad.getText());
			double result;
			result = (qtity / 166.386);
			a€.setText(String.format("%.2f", result));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Error. Introduzca bien la cantidad a convertir.");
		}
	}
	public void apesetas() {
		try {
			double qtity = Double.parseDouble(cantidad.getText());
			double result;
			result =(qtity * 166.386);
			apts.setText(String.format("%.2f", result));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Error. Introduzca bien la cantidad a convertir.");
		}
	}
	public void vaciar() {
		apts.setText("");
		a€.setText("");
		cantidad.setText("");
	}

}
