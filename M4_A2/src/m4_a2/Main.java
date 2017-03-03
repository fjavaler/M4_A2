package m4_a2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;

public class Main
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Main window = new Main();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		mntmWelcome.setIcon(new ImageIcon(Main.class.getResource("/information.png")));
		mnHelp.add(mntmWelcome);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setIcon(new ImageIcon(Main.class.getResource("/file.png")));
		mnHelp.add(mntmAbout);
		frame.getContentPane().setLayout(null);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(16, 6, 68, 16);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(134, 6, 74, 16);
		frame.getContentPane().add(lblLastName);

		JLabel lblCellPhone = new JLabel("Cell Phone");
		lblCellPhone.setBounds(252, 6, 68, 16);
		frame.getContentPane().add(lblCellPhone);

		textField = new JTextField();
		textField.setBounds(16, 22, 92, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(134, 22, 92, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(252, 22, 92, 26);
		frame.getContentPane().add(textField_2);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Logo1");
		comboBox.addItem("Logo2");
		comboBox.addItem("Logo3");
		comboBox.addItem("Logo4");		
		comboBox.setSelectedIndex(0);
		comboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				switch ("" + comboBox.getSelectedItem())
				{
					case ("Logo1"):
					{
						
					}
					case ("Logo2"):
					{
						
					}
					case ("Logo3"):
					{
						
					}
					case ("Logo4"):
					{
						
					}
					default:
					{
						
					}
				}
			}
		});
		comboBox.setBounds(375, 23, 92, 25);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnBlack = new JRadioButton("Black");
		rdbtnBlack.setBounds(16, 70, 92, 23);
		frame.getContentPane().add(rdbtnBlack);
		
		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.setForeground(Color.RED);
		rdbtnRed.setBounds(16, 105, 92, 23);
		frame.getContentPane().add(rdbtnRed);
		
		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.setForeground(Color.GREEN);
		rdbtnGreen.setBounds(16, 140, 92, 23);
		frame.getContentPane().add(rdbtnGreen);
		
		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.setForeground(Color.BLUE);
		rdbtnBlue.setBounds(16, 175, 92, 23);
		frame.getContentPane().add(rdbtnBlue);
		
		JButton btnNew = new JButton("New");
		btnNew.setIcon(new ImageIcon(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		btnNew.setBounds(16, 209, 125, 41);
		frame.getContentPane().add(btnNew);
		
		JButton btnSave = new JButton("Save");
		btnSave.setIcon(new ImageIcon(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		btnSave.setBounds(185, 209, 125, 41);
		frame.getContentPane().add(btnSave);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		btnDelete.setBounds(356, 209, 125, 41);
		frame.getContentPane().add(btnDelete);
		
		JCheckBox chckbxBold = new JCheckBox("Bold");
		chckbxBold.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxBold.setBounds(98, 70, 128, 23);
		frame.getContentPane().add(chckbxBold);
		
		JCheckBox chckbxItalic = new JCheckBox("Italic");
		chckbxItalic.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		chckbxItalic.setBounds(98, 105, 128, 23);
		frame.getContentPane().add(chckbxItalic);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon image = new ImageIcon("src/logo1.png");
		lblNewLabel.setIcon(image);
		lblNewLabel.setBounds(252, 58, 215, 138);
		frame.getContentPane().add(lblNewLabel);
	}
}
