package m4_a2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.SystemColor;

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
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		mntmExit.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		mntmWelcome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				UIManager.put("OptionPane.background", new ColorUIResource(239, 239, 127));
				UIManager.put("Panel.background", new ColorUIResource(239, 239, 127));
				JOptionPane.showMessageDialog(frame,
						"Welcome to my app.\n\nThis app is an "
								+ "introduction to working\nwith GUIs for CS 1410, taken Spring\nsemester "
								+ "of 2017 with Professor\nRobert Baird.");
			}
		});
		mntmWelcome.setIcon(new ImageIcon(Main.class.getResource("/information.png")));
		mnHelp.add(mntmWelcome);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				AboutWindow about = new AboutWindow();
				JFrame aboutFrame = about.getFrame();
				aboutFrame.setBounds(frame.getX() + 10, frame.getY() + 10, frame.getWidth() - 20, frame.getHeight() - 20);
				aboutFrame.setVisible(true);
			}
		});
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

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.window);
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/logo1.png")));
		lblNewLabel.setBounds(302, 60, 138, 138);
		frame.getContentPane().add(lblNewLabel);

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
				if (e.getSource() instanceof JComboBox)
				{
					switch ("" + comboBox.getSelectedItem())
					{
						case ("Logo1"):
						{
							lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/logo1.png")));
							break;
						}
						case ("Logo2"):
						{
							lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/logo2.png")));
							break;
						}
						case ("Logo3"):
						{
							lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/logo3.png")));
							break;
						}
						case ("Logo4"):
						{
							lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/logo4.png")));
							break;
						}
						default:
						{
							lblNewLabel.setIcon(null);
							break;
						}
					}
				}
			}
		});
		comboBox.setBounds(375, 23, 92, 25);
		frame.getContentPane().add(comboBox);

		JRadioButton rdbtnBlack = new JRadioButton("Black");
		rdbtnBlack.setBounds(16, 70, 92, 23);
		frame.getContentPane().add(rdbtnBlack);
		rdbtnBlack.setSelected(true);
		rdbtnBlack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				lblFirstName.setForeground(Color.BLACK);
				lblLastName.setForeground(Color.BLACK);
				lblCellPhone.setForeground(Color.BLACK);
			}
		});

		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.setForeground(Color.RED);
		rdbtnRed.setBounds(16, 105, 92, 23);
		frame.getContentPane().add(rdbtnRed);
		rdbtnRed.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				lblFirstName.setForeground(Color.RED);
				lblLastName.setForeground(Color.RED);
				lblCellPhone.setForeground(Color.RED);
			}
		});

		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.setForeground(Color.GREEN);
		rdbtnGreen.setBounds(16, 140, 92, 23);
		frame.getContentPane().add(rdbtnGreen);
		rdbtnGreen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				lblFirstName.setForeground(Color.GREEN);
				lblLastName.setForeground(Color.GREEN);
				lblCellPhone.setForeground(Color.GREEN);
			}
		});

		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.setForeground(Color.BLUE);
		rdbtnBlue.setBounds(16, 175, 92, 23);
		frame.getContentPane().add(rdbtnBlue);
		rdbtnBlue.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				lblFirstName.setForeground(Color.BLUE);
				lblLastName.setForeground(Color.BLUE);
				lblCellPhone.setForeground(Color.BLUE);
			}
		});

		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnBlack);
		radioGroup.add(rdbtnRed);
		radioGroup.add(rdbtnGreen);
		radioGroup.add(rdbtnBlue);

		JButton btnNew = new JButton("New");
		btnNew.setIcon(new ImageIcon(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		btnNew.setBounds(16, 209, 125, 41);
		frame.getContentPane().add(btnNew);
		btnNew.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				UIManager.put("OptionPane.background", new ColorUIResource(SystemColor.window));
				UIManager.put("Panel.background", new ColorUIResource(SystemColor.window));
				JOptionPane.showMessageDialog(frame, "New button pressed", "Confirmation",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		JButton btnSave = new JButton("Save");
		btnSave.setIcon(
				new ImageIcon(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		btnSave.setBounds(185, 209, 125, 41);
		frame.getContentPane().add(btnSave);
		btnSave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				UIManager.put("OptionPane.background", new ColorUIResource(SystemColor.window));
				UIManager.put("Panel.background", new ColorUIResource(SystemColor.window));
				JOptionPane.showMessageDialog(frame, "Save button pressed", "Confirmation",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		btnDelete.setBounds(356, 209, 125, 41);
		frame.getContentPane().add(btnDelete);
		btnDelete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				UIManager.put("OptionPane.background", new ColorUIResource(SystemColor.window));
				UIManager.put("Panel.background", new ColorUIResource(SystemColor.window));
				JOptionPane.showMessageDialog(frame, "Delete button pressed", "Confirmation",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		// Bold and Italic fonts
		Font bold = new Font("Lucida Grande", Font.BOLD, 13);
		Font italic = new Font("Lucida Grande", Font.ITALIC, 13);
		Font boldAndItalic = new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13);
		Font normal = new Font("Lucida Grande", Font.PLAIN, 13);

		JCheckBox chckbxBold = new JCheckBox("Bold");
		chckbxBold.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxBold.setBounds(98, 70, 128, 23);
		frame.getContentPane().add(chckbxBold);

		JCheckBox chckbxItalic = new JCheckBox("Italic");
		chckbxItalic.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		chckbxItalic.setBounds(98, 105, 128, 23);
		frame.getContentPane().add(chckbxItalic);
		chckbxItalic.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (!chckbxBold.isSelected() && chckbxItalic.isSelected())
				{
					lblFirstName.setFont(italic);
					lblLastName.setFont(italic);
					lblCellPhone.setFont(italic);
				}
				else if (chckbxBold.isSelected() && chckbxItalic.isSelected())
				{
					lblFirstName.setFont(boldAndItalic);
					lblLastName.setFont(boldAndItalic);
					lblCellPhone.setFont(boldAndItalic);
				}
				else if (chckbxBold.isSelected() && !chckbxItalic.isSelected())
				{
					lblFirstName.setFont(bold);
					lblLastName.setFont(bold);
					lblCellPhone.setFont(bold);
				}
				else
				{
					lblFirstName.setFont(normal);
					lblLastName.setFont(normal);
					lblCellPhone.setFont(normal);
				}
			}
		});

		chckbxBold.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (!chckbxItalic.isSelected() && chckbxBold.isSelected())
				{
					lblFirstName.setFont(bold);
					lblLastName.setFont(bold);
					lblCellPhone.setFont(bold);
				}
				else if (chckbxItalic.isSelected() && chckbxBold.isSelected())
				{
					lblFirstName.setFont(boldAndItalic);
					lblLastName.setFont(boldAndItalic);
					lblCellPhone.setFont(boldAndItalic);
				}
				else if (chckbxItalic.isSelected() && !chckbxBold.isSelected())
				{
					lblFirstName.setFont(italic);
					lblLastName.setFont(italic);
					lblCellPhone.setFont(italic);
				}
				else
				{
					lblFirstName.setFont(normal);
					lblLastName.setFont(normal);
					lblCellPhone.setFont(normal);
				}
			}
		});
	}
}
