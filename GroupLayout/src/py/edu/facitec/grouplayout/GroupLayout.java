package py.edu.facitec.grouplayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import java.awt.SystemColor;

public class GroupLayout extends JFrame {

	private JPanel contentPane;
	private JTextField ing1;
	private JTextField ing2;
	private JLabel lblElResultadoEs;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupLayout frame = new GroupLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GroupLayout() {
		setForeground(new Color(0, 102, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 102, 102));
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		
		ing1 = new JTextField();
		ing1.setForeground(Color.RED);
		ing1.setColumns(10);
		
		ing2 = new JTextField();
		ing2.setForeground(Color.RED);
		ing2.setColumns(10);
		
		JLabel lblCalculadoraDeSuma = new JLabel("Calculadora de Suma y Resta");
		lblCalculadoraDeSuma.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCalculadoraDeSuma.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblCalculadoraDeSuma.setForeground(new Color(0, 139, 139));
		
		JButton btnSuma = new JButton("SUMA");
		btnSuma.setForeground(SystemColor.textHighlight);
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1, v2, r; //inicializaciion de variables 
				try {
					v1 = Integer.parseInt(ing1.getText());//toma el valor de texto del 
					//primer boton de ingreso y lo convierte en int lo cual se asigna a la variable
					v2 = Integer.parseInt(ing2.getText());
					r = v1 + v2;
					resultado.setText(Integer.toString(r));//convierte el entero a text y asigna a resultado
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Debes ingresar numeros enteros en los casilleros");
				}
			}
		});
		
		JButton btnResta = new JButton("RESTAR");
		btnResta.setForeground(SystemColor.textHighlight);
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1, v2, r; //inicializaciion de variables 
				try {
					v1 = Integer.parseInt(ing1.getText());//toma el valor de texto del 
					//primer boton de ingreso y lo convierte en int lo cual se asigna a la variable
					v2 = Integer.parseInt(ing2.getText());
					r = v1 - v2;
					resultado.setText(Integer.toString(r));//convierte el entero a text y asigna a resultado
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Debes ingresar numeros enteros en los casilleros");
				}
				
			}
		});
		
		lblElResultadoEs = new JLabel("El resultado es:");
		
		resultado = new JTextField();
		resultado.setForeground(new Color(153, 0, 0));
		resultado.setColumns(10);
		javax.swing.GroupLayout gl_contentPane = new javax.swing.GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(116)
					.addComponent(lblCalculadoraDeSuma)
					.addContainerGap(105, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
					.addGap(13)
					.addComponent(ing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(ing2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(98))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(103, Short.MAX_VALUE)
					.addComponent(lblElResultadoEs)
					.addGap(18)
					.addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(153))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCalculadoraDeSuma)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addComponent(btnSuma)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(ing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ing2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(btnResta)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblElResultadoEs)
						.addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(94))
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {ing1, ing2});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {ing1, ing2});
		contentPane.setLayout(gl_contentPane);
	}
}
