package ejercicio5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Mouse extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea area;
	private JButton limpiar;

	public Mouse() {
		setTitle("Mouse el chivato");
		setBounds(650, 300, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		System.out.println(contentPane);

        area = new JTextArea();
        area.setForeground(new Color(255, 255, 255));
        area.setBackground(new Color(0, 0, 0));
        area.setEditable(false);
        area.setBounds(44, 81, 235, 334);
        contentPane.add(area);
        repaint();
  		
		scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(500, 450));
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBackground(new Color(0, 0, 0));
        limpiar.setForeground(new Color(255, 255, 255));
        limpiar.setFont(new Font("Yu Gothic", Font.PLAIN, 13));
        limpiar.setBounds(120, 30, 89, 23);
        contentPane.add(limpiar);
        repaint();

		ActionListener al1=new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {	
			    if(limpiar.getActionListeners() != null)	{
			    	area.setText("");
			    }
			}
		};
		limpiar.addActionListener(al1);
		
		MouseListener clicks = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				area.append("Clickaste.\n");
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				area.append("Entraste en la zona blanca.\n");
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				area.append("Saliste de la zona blanca.\n");
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				area.append("Presionaste la tecla del ratón.\n");
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				area.append("Soltaste la tecla del ratón.\n");
				
			}
			
		};
		this.addMouseListener(clicks);
	}
	
}