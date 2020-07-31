import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DropMode;
import java.awt.TextField;
import java.awt.TextArea;

public class Table_GUI {

	private JFrame frame;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_GUI window = new Table_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
}

	/**
	 * Create the application.
	 */
	public Table_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	int num1;
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 754, 772);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMathTablesCreator = new JLabel("Math Tables Creator");
		lblMathTablesCreator.setForeground(Color.BLUE);
		lblMathTablesCreator.setBackground(Color.WHITE);
		lblMathTablesCreator.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMathTablesCreator.setBounds(237, 13, 234, 39);
		frame.getContentPane().add(lblMathTablesCreator);
		
		JLabel lblEnterNumber = new JLabel("Enter Number");
		lblEnterNumber.setForeground(Color.RED);
		lblEnterNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterNumber.setBounds(36, 102, 122, 23);
		frame.getContentPane().add(lblEnterNumber);

		TextArea textArea = new TextArea();
		textArea.setBackground(new Color(245, 222, 179));
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(79, 213, 330, 436);
		frame.getContentPane().add(textArea);

		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 240, 245));
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Integer.parseInt(textField_1.getText());
			}
		});
		textField_1.setBounds(170, 102, 169, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTable = new JLabel("TABLE");
		lblTable.setForeground(Color.RED);
		lblTable.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTable.setBounds(227, 174, 56, 16);
		frame.getContentPane().add(lblTable);
		
		JButton btnTable = new JButton("PRINT");
		btnTable.setBackground(Color.MAGENTA);
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str = textField_1.getText();
				int num=Integer.parseInt(str);
				
						for(int i=1;i<=10;i++) {
							textArea.setText(textArea.getText()+"\n\n                         "+num+"   *   "+i+"   =   "+(num*i));
						
					
						}
						}
				
		});

		btnTable.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTable.setBounds(370, 100, 97, 25);
		frame.getContentPane().add(btnTable);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.MAGENTA);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textArea.setText(" ");
			
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(515, 623, 97, 25);
		frame.getContentPane().add(btnReset);
		
			}
}

