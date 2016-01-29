package simpleUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import drinkManager.DrinkAmount;
import drinkManager.DrinkContainer;
import drinkManager.DrinkManager;
import drinkTypes.Drink;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class ManagementJFrame extends JFrame {

	private JPanel contentPane;
	private DrinkManager drinkManager;
	private ArrayList<JLabel> drinkContainerNameLabelList;
	private ArrayList<JLabel> drinkContainerSizeLabelList;
	private ArrayList<JProgressBar> fillAmountList;

	/**
	 * Create the frame.
	 */
	public ManagementJFrame(DrinkManager drinkManager) {
		this.drinkManager = drinkManager;
		drinkContainerNameLabelList = new ArrayList<>();
		drinkContainerSizeLabelList = new ArrayList<>();
		fillAmountList = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1080);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMain = new JButton("MAIN");
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainFrame(drinkManager).setVisible(true);
			}
		});
		btnMain.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMain.setBounds(1720, 13, 174, 64);
		contentPane.add(btnMain);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnLogout.setBounds(12, 13, 174, 64);
		contentPane.add(btnLogout);
		
		JButton btnRefillContainer1 = new JButton("Refill Container 1");
		btnRefillContainer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(1);
				update();
			}
		});
		
		btnRefillContainer1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer1.setBounds(12, 108, 219, 64);
		contentPane.add(btnRefillContainer1);
		
		JButton btnRefillContainer2 = new JButton("Refill Container 2");
		btnRefillContainer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(2);
				update();
			}
		});
		btnRefillContainer2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer2.setBounds(12, 189, 219, 64);
		contentPane.add(btnRefillContainer2);
		
		JButton btnRefillContainer3 = new JButton("Refill Container 3");
		btnRefillContainer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(3);
				update();
			}
		});
		btnRefillContainer3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer3.setBounds(12, 270, 219, 64);
		contentPane.add(btnRefillContainer3);
		
		JButton btnRefillContainer4 = new JButton("Refill Container 4");
		btnRefillContainer4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(4);
				update();
			}
		});
		btnRefillContainer4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer4.setBounds(12, 351, 219, 64);
		contentPane.add(btnRefillContainer4);
		
		JButton btnRefillContainer5 = new JButton("Refill Container 5");
		btnRefillContainer5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(5);
				update();
			}
		});
		btnRefillContainer5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer5.setBounds(12, 432, 219, 64);
		contentPane.add(btnRefillContainer5);
		
		JButton btnRefillContainer6 = new JButton("Refill Container 6");
		btnRefillContainer6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(6);
				update();
			}
		});
		btnRefillContainer6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer6.setBounds(12, 513, 219, 64);
		contentPane.add(btnRefillContainer6);
		
		JButton btnRefillContainer7 = new JButton("Refill Container 7");
		btnRefillContainer7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(7);
				update();
			}
		});
		btnRefillContainer7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer7.setBounds(12, 594, 219, 64);
		contentPane.add(btnRefillContainer7);
		
		JButton btnRefillContainer8 = new JButton("Refill Container 8");
		btnRefillContainer8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(8);
				update();
			}
		});
		btnRefillContainer8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer8.setBounds(12, 675, 219, 64);
		contentPane.add(btnRefillContainer8);
		
		JButton btnRefillContainer9 = new JButton("Refill Container 9");
		btnRefillContainer9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(9);
				update();
			}
		});
		btnRefillContainer9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer9.setBounds(12, 756, 219, 64);
		contentPane.add(btnRefillContainer9);
		
		JButton btnRefillContainer10 = new JButton("Refill Container 10");
		btnRefillContainer10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkManager.refillDrinkContainer(10);
				update();
			}
		});
		btnRefillContainer10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRefillContainer10.setBounds(12, 837, 219, 64);
		contentPane.add(btnRefillContainer10);
		
		JButton btnChangeContainer1 = new JButton("Change Container 1");
		btnChangeContainer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 1).setVisible(true);
				update();
			}
		});
		btnChangeContainer1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer1.setBounds(243, 108, 238, 64);
		contentPane.add(btnChangeContainer1);
		
		JButton btnChangeContainer2 = new JButton("Change Container 2");
		btnChangeContainer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ChangeContainerDialog(drinkManager, 2).setVisible(true);
				update();
			}
		});
		btnChangeContainer2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer2.setBounds(243, 189, 238, 64);
		contentPane.add(btnChangeContainer2);
		
		JButton btnChangeContainer3 = new JButton("Change Container 3");
		btnChangeContainer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 3).setVisible(true);
				update();
			}
		});
		btnChangeContainer3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer3.setBounds(243, 270, 238, 64);
		contentPane.add(btnChangeContainer3);
		
		JButton btnChangeContainer4 = new JButton("Change Container 4");
		btnChangeContainer4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 4).setVisible(true);
				update();
			}
		});
		btnChangeContainer4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer4.setBounds(243, 351, 238, 64);
		contentPane.add(btnChangeContainer4);
		
		JButton btnChangeContainer5 = new JButton("Change Container 5");
		btnChangeContainer5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 5).setVisible(true);
				update();
			}
		});
		btnChangeContainer5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer5.setBounds(243, 432, 238, 64);
		contentPane.add(btnChangeContainer5);
		
		JButton btnChangeContainer6 = new JButton("Change Container 6");
		btnChangeContainer6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 6).setVisible(true);
				update();
			}
		});
		btnChangeContainer6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer6.setBounds(243, 513, 238, 64);
		contentPane.add(btnChangeContainer6);
		
		JButton btnChangeContainer7 = new JButton("Change Container 7");
		btnChangeContainer7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 7).setVisible(true);
				update();
			}
		});
		btnChangeContainer7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer7.setBounds(243, 594, 238, 64);
		contentPane.add(btnChangeContainer7);
		
		JButton btnChangeContainer8 = new JButton("Change Container 8");
		btnChangeContainer8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 8).setVisible(true);
				update();
			}
		});
		btnChangeContainer8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer8.setBounds(243, 675, 238, 64);
		contentPane.add(btnChangeContainer8);
		
		JButton btnChangeContainer9 = new JButton("Change Container 9");
		btnChangeContainer9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 9).setVisible(true);
				update();
			}
		});
		btnChangeContainer9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer9.setBounds(243, 756, 238, 64);
		contentPane.add(btnChangeContainer9);
		
		JButton btnChangeContainer10 = new JButton("Change Container 10");
		btnChangeContainer10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChangeContainerDialog(drinkManager, 10).setVisible(true);
				update();
			}
		});
		btnChangeContainer10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeContainer10.setBounds(243, 837, 238, 64);
		contentPane.add(btnChangeContainer10);
		
		JLabel lblContainer1Drink = new JLabel("Container 1 Drink");
		lblContainer1Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer1Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer1Drink.setBounds(503, 104, 451, 68);
		contentPane.add(lblContainer1Drink);
		drinkContainerNameLabelList.add(lblContainer1Drink);
		
		JLabel lblContainer2Drink = new JLabel("Container 2 Drink");
		lblContainer2Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer2Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer2Drink.setBounds(503, 185, 451, 68);
		contentPane.add(lblContainer2Drink);
		drinkContainerNameLabelList.add(lblContainer2Drink);
		
		JLabel lblContainer3Drink = new JLabel("Container 3 Drink");
		lblContainer3Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer3Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer3Drink.setBounds(503, 264, 451, 68);
		contentPane.add(lblContainer3Drink);
		drinkContainerNameLabelList.add(lblContainer3Drink);
		
		JLabel lblContainer4Drink = new JLabel("Container 4 Drink");
		lblContainer4Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer4Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer4Drink.setBounds(503, 347, 451, 68);
		contentPane.add(lblContainer4Drink);
		drinkContainerNameLabelList.add(lblContainer4Drink);
		
		JLabel lblContainer5Drink = new JLabel("Container 5 Drink");
		lblContainer5Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer5Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer5Drink.setBounds(503, 428, 451, 68);
		contentPane.add(lblContainer5Drink);
		drinkContainerNameLabelList.add(lblContainer5Drink);
		
		JLabel lblContainer6Drink = new JLabel("Container 6 Drink");
		lblContainer6Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer6Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer6Drink.setBounds(503, 509, 451, 68);
		contentPane.add(lblContainer6Drink);
		drinkContainerNameLabelList.add(lblContainer6Drink);
		
		JLabel lblContainer7Drink = new JLabel("Container 7 Drink");
		lblContainer7Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer7Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer7Drink.setBounds(503, 590, 451, 68);
		contentPane.add(lblContainer7Drink);
		drinkContainerNameLabelList.add(lblContainer7Drink);
		
		JLabel lblContainer8Drink = new JLabel("Container 8 Drink");
		lblContainer8Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer8Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer8Drink.setBounds(503, 671, 451, 68);
		contentPane.add(lblContainer8Drink);
		drinkContainerNameLabelList.add(lblContainer8Drink);
		
		JLabel lblContainer9Drink = new JLabel("Container 9 Drink");
		lblContainer9Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer9Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer9Drink.setBounds(503, 752, 451, 68);
		contentPane.add(lblContainer9Drink);
		drinkContainerNameLabelList.add(lblContainer9Drink);
		
		JLabel lblContainer10Drink = new JLabel("Container 10 Drink");
		lblContainer10Drink.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer10Drink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer10Drink.setBounds(503, 833, 451, 68);
		contentPane.add(lblContainer10Drink);
		drinkContainerNameLabelList.add(lblContainer10Drink);
		
		JLabel lblContainer1Size = new JLabel("Size");
		lblContainer1Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer1Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer1Size.setBounds(966, 108, 168, 68);
		contentPane.add(lblContainer1Size);
		drinkContainerSizeLabelList.add(lblContainer1Size);
		
		JLabel lblContainer2Size = new JLabel("Size");
		lblContainer2Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer2Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer2Size.setBounds(966, 189, 168, 68);
		contentPane.add(lblContainer2Size);
		drinkContainerSizeLabelList.add(lblContainer2Size);
		
		JLabel lblContainer3Size = new JLabel("Size");
		lblContainer3Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer3Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer3Size.setBounds(966, 266, 168, 68);
		contentPane.add(lblContainer3Size);
		drinkContainerSizeLabelList.add(lblContainer3Size);
				
		JLabel lblContainer4Size = new JLabel("Size");
		lblContainer4Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer4Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer4Size.setBounds(966, 351, 168, 68);
		contentPane.add(lblContainer4Size);
		drinkContainerSizeLabelList.add(lblContainer4Size);
		
		JLabel lblContainer5Size = new JLabel("Size");
		lblContainer5Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer5Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer5Size.setBounds(966, 432, 168, 68);
		contentPane.add(lblContainer5Size);
		drinkContainerSizeLabelList.add(lblContainer5Size);
		
		JLabel lblContainer6Size = new JLabel("Size");
		lblContainer6Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer6Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer6Size.setBounds(966, 507, 168, 68);
		contentPane.add(lblContainer6Size);
		drinkContainerSizeLabelList.add(lblContainer6Size);
		
		JLabel lblContainer7Size = new JLabel("Size");
		lblContainer7Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer7Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer7Size.setBounds(966, 588, 168, 68);
		contentPane.add(lblContainer7Size);
		drinkContainerSizeLabelList.add(lblContainer7Size);
		
		JLabel lblContainer8Size = new JLabel("Size");
		lblContainer8Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer8Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer8Size.setBounds(966, 669, 168, 68);
		contentPane.add(lblContainer8Size);
		drinkContainerSizeLabelList.add(lblContainer8Size);
		
		JLabel lblContainer9Size = new JLabel("Size");
		lblContainer9Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer9Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer9Size.setBounds(966, 750, 168, 68);
		contentPane.add(lblContainer9Size);
		drinkContainerSizeLabelList.add(lblContainer9Size);
		
		JLabel lblContainer10Size = new JLabel("Size");
		lblContainer10Size.setHorizontalAlignment(SwingConstants.CENTER);
		lblContainer10Size.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContainer10Size.setBounds(966, 831, 168, 68);
		contentPane.add(lblContainer10Size);
		drinkContainerSizeLabelList.add(lblContainer10Size);
		
		JProgressBar progressContainer1 = new JProgressBar();
		progressContainer1.setValue(50);
		progressContainer1.setBounds(1146, 112, 321, 64);
		contentPane.add(progressContainer1);
		fillAmountList.add(progressContainer1);
		
		JProgressBar progressContainer2 = new JProgressBar();
		progressContainer2.setValue(50);
		progressContainer2.setBounds(1146, 193, 321, 64);
		contentPane.add(progressContainer2);
		fillAmountList.add(progressContainer2);
		
		JProgressBar progressContainer3 = new JProgressBar();
		progressContainer3.setValue(50);
		progressContainer3.setBounds(1146, 270, 321, 64);
		contentPane.add(progressContainer3);
		fillAmountList.add(progressContainer3);
		
		JProgressBar progressContainer4 = new JProgressBar();
		progressContainer4.setValue(50);
		progressContainer4.setBounds(1146, 351, 321, 64);
		contentPane.add(progressContainer4);
		fillAmountList.add(progressContainer4);
		
		JProgressBar progressContainer5 = new JProgressBar();
		progressContainer5.setValue(50);
		progressContainer5.setBounds(1146, 432, 321, 64);
		contentPane.add(progressContainer5);
		fillAmountList.add(progressContainer5);
		
		JProgressBar progressContainer6 = new JProgressBar();
		progressContainer6.setValue(50);
		progressContainer6.setBounds(1146, 513, 321, 64);
		contentPane.add(progressContainer6);
		fillAmountList.add(progressContainer6);
		
		JProgressBar progressContainer7 = new JProgressBar();
		progressContainer7.setValue(50);
		progressContainer7.setBounds(1146, 594, 321, 64);
		contentPane.add(progressContainer7);
		fillAmountList.add(progressContainer7);
		
		JProgressBar progressContainer8 = new JProgressBar();
		progressContainer8.setValue(50);
		progressContainer8.setBounds(1146, 675, 321, 64);
		contentPane.add(progressContainer8);
		fillAmountList.add(progressContainer8);
		
		JProgressBar progressContainer9 = new JProgressBar();
		progressContainer9.setValue(50);
		progressContainer9.setBounds(1146, 756, 321, 64);
		contentPane.add(progressContainer9);
		fillAmountList.add(progressContainer9);
		
		JProgressBar progressContainer10 = new JProgressBar();
		progressContainer10.setValue(50);
		progressContainer10.setBounds(1146, 837, 321, 64);
		contentPane.add(progressContainer10);
		fillAmountList.add(progressContainer10);
		
		update();
	}
	
	private void update() {
		int i = 0;
		for (DrinkContainer container : drinkManager.getContainerLayout()) {
			updateDrinkNameLabel(drinkContainerNameLabelList.get(i), container.getDrink());
			updateDrinkSizeLabel(drinkContainerSizeLabelList.get(i), container.getCurrentAmount());
			updateFilledAmount(fillAmountList.get(i), container.getSize(), container.getCurrentAmount());
			i++;
		}
		
		drinkManager.addCustomOption();
	}
	
	private void updateDrinkNameLabel(JLabel labelToUpdate, Drink drink) {
		labelToUpdate.setText(drink.toString());
	}
	
	private void updateDrinkSizeLabel(JLabel labelToUpdate, DrinkAmount amount) {
		labelToUpdate.setText(amount.toString());
	}
	
	private void updateFilledAmount(JProgressBar barToUpdate, DrinkAmount size, DrinkAmount fillAmount) {
		Double percentFull = (100.0 * fillAmount.getStandardAmount() / size.getStandardAmount());
		barToUpdate.setValue(percentFull.intValue());
	}
}
