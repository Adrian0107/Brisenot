package puzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Puzzle extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle frame = new Puzzle();
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
	public Puzzle() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 13, 121, 64);
		btn1.setBackground(Color.orange);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(145, 13, 121, 64);
		btn2.setBackground(Color.orange);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(278, 13, 121, 64);
		btn3.setBackground(Color.orange);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 90, 121, 64);
		btn4.setBackground(Color.orange);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(145, 90, 121, 64);
		btn5.setBackground(Color.orange);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(278, 90, 121, 64);
		btn6.setBackground(Color.orange);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 167, 121, 64);
		btn7.setBackground(Color.orange);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(145, 167, 121, 64);
		btn8.setBackground(Color.orange);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(278, 167, 121, 64);
		btn9.setBackground(Color.orange);
		contentPane.add(btn9);
		btn9.setVisible(false);

		
		JButton btnJuegoNuevo = new JButton("Otro juego");
		btnJuegoNuevo.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {				
				btn9.setVisible(false);				
				int[] num1 = new int[8];
				int [] num2 = {1,2,3,4,5,6,7,8};
				for (int x=0; x<8;x++) {					
					num1[x]=num2[x];
				}				
								
				btn1.setText(String.valueOf(num1[0]));
				btn1.setVisible(true);
				btn2.setText(String.valueOf(num1[1]));
				btn2.setVisible(true);
				btn3.setText(String.valueOf(num1[2]));
				btn3.setVisible(true);
				btn4.setText(String.valueOf(num1[3]));
				btn4.setVisible(true);
				btn5.setText(String.valueOf(num1[4]));
				btn5.setVisible(true);
				btn6.setText(String.valueOf(num1[5]));
				btn6.setVisible(true);
				btn7.setText(String.valueOf(num1[6]));
				btn7.setVisible(true);
				btn8.setText(String.valueOf(num1[7]));
				btn8.setVisible(true);
				
			}
		});
		btnJuegoNuevo.setBounds(12, 260, 127, 45);
		btnJuegoNuevo.setBackground(Color.RED);
		contentPane.add(btnJuegoNuevo);
		
		JButton btnSalir = new JButton("Salir del juego");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(145, 260, 121, 45);
		btnSalir.setBackground(Color.RED);
		contentPane.add(btnSalir);
		
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn2.isVisible()==false) {
					btn2.setText(btn1.getText());
					btn1.setVisible(false);
					btn2.setVisible(true);
				}
				if(btn4.isVisible()==false) {
					btn4.setText(btn1.getText());
					btn4.setVisible(true);
					btn1.setVisible(false);
				}
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1.isVisible()==false) {
					btn1.setText(btn2.getText());
					btn1.setVisible(true);
					btn2.setVisible(false);
				}
				if(btn3.isVisible()==false) {
					btn3.setText(btn2.getText());
					btn3.setVisible(true);
					btn2.setVisible(false);
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn2.getText());
					btn5.setVisible(true);
					btn2.setVisible(false);
				}
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn2.isVisible()==false) {
					btn2.setText(btn3.getText());
					btn2.setVisible(true);
					btn3.setVisible(false);
				}
				if(btn6.isVisible()==false) {
					btn6.setText(btn3.getText());
					btn6.setVisible(true);
					btn3.setVisible(false);
				}
				
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1.isVisible()==false) {
					btn1.setText(btn4.getText());
					btn1.setVisible(true);
					btn4.setVisible(false);
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn4.getText());
					btn5.setVisible(true);
					btn4.setVisible(false);
				}
				if(btn7.isVisible()==false) {
					btn7.setText(btn4.getText());
					btn7.setVisible(true);
					btn4.setVisible(false);
				}
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4.isVisible()==false) {
					btn4.setText(btn5.getText());
					btn4.setVisible(true);
					btn5.setVisible(false);
				}
				if(btn6.isVisible()==false) {
					btn6.setText(btn5.getText());
					btn6.setVisible(true);
					btn5.setVisible(false);
				}
				if(btn2.isVisible()==false) {
					btn2.setText(btn5.getText());
					btn2.setVisible(true);
					btn5.setVisible(false);
				}
				if(btn8.isVisible()==false) {
					btn8.setText(btn5.getText());
					btn8.setVisible(true);
					btn5.setVisible(false);
				}
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn5.isVisible()==false) {
					btn5.setText(btn6.getText());
					btn5.setVisible(true);
					btn6.setVisible(false);
				}
				if(btn3.isVisible()==false) {
					btn3.setText(btn6.getText());
					btn3.setVisible(true);
					btn6.setVisible(false);
				}
				
				if(btn9.isVisible()==false) {
					btn9.setText(btn6.getText());
					btn9.setVisible(true);
					btn6.setVisible(false);
				}
			
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4.isVisible()==false) {
					btn4.setText(btn7.getText());
					btn4.setVisible(true);
					btn7.setVisible(false);
				}
				if(btn8.isVisible()==false) {
					btn8.setText(btn7.getText());
					btn8.setVisible(true);
					btn7.setVisible(false);
				}
				
				
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn7.isVisible()==false) {
					btn7.setText(btn8.getText());
					btn7.setVisible(true);
					btn8.setVisible(false);
				}
				if(btn5.isVisible()==false) {
					btn5.setText(btn8.getText());
					btn5.setVisible(true);
					btn8.setVisible(false);
				}
				if(btn9.isVisible()==false) {
					btn9.setText(btn8.getText());
					btn9.setVisible(true);
					btn8.setVisible(false);
				}
				
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn8.isVisible()==false) {
					btn8.setText(btn9.getText());
					btn8.setVisible(true);
					btn9.setVisible(false);
				}
				if(btn6.isVisible()==false) {
					btn6.setText(btn9.getText());
					btn6.setVisible(true);
					btn9.setVisible(false);
				}
				
			}
		});
		
		
	}
	
}

