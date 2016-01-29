package simpleUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import drinkManager.DrinkAmount;
import drinkManager.DrinkContainer;
import drinkManager.DrinkManager;
import drinkManager.Unit;
import drinkTypes.Drink;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ChangeContainerDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField amountTextField;
	private int drinkContainerSlot;
	private DrinkManager drinkManager;

	/**
	 * Create the dialog.
	 */
	public ChangeContainerDialog(DrinkManager drinkManager, int drinkContainerSlot) {
		this.drinkContainerSlot = drinkContainerSlot;
		this.drinkManager = drinkManager;
		
		setBounds(100, 100, 1292, 760);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setModal(true);
		
		JComboBox drinkChoice = new JComboBox(drinkManager.getDrinkMap().values().toArray());
		drinkChoice.setFont(new Font("Tahoma", Font.PLAIN, 50));
		drinkChoice.setBounds(12, 86, 753, 123);
		contentPanel.add(drinkChoice);
		
		JLabel lblDrink = new JLabel("DRINK");
		lblDrink.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblDrink.setBounds(12, 13, 753, 59);
		contentPanel.add(lblDrink);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("RUM");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxNewCheckBox.setBounds(795, 81, 186, 39);
		contentPanel.add(chckbxNewCheckBox);
		
		JLabel lblSize = new JLabel("SIZE");
		lblSize.setHorizontalAlignment(SwingConstants.CENTER);
		lblSize.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblSize.setBounds(12, 223, 753, 59);
		contentPanel.add(lblSize);
		
		JCheckBox chckbxVodka = new JCheckBox("VODKA");
		chckbxVodka.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxVodka.setBounds(985, 81, 186, 39);
		contentPanel.add(chckbxVodka);
		
		JCheckBox chckbxWhiskey = new JCheckBox("WHISKEY");
		chckbxWhiskey.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxWhiskey.setBounds(795, 126, 186, 39);
		contentPanel.add(chckbxWhiskey);
		
		JCheckBox chckbxTequila = new JCheckBox("TEQUILA");
		chckbxTequila.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxTequila.setBounds(795, 170, 186, 39);
		contentPanel.add(chckbxTequila);
		
		JCheckBox chckbxGin = new JCheckBox("GIN");
		chckbxGin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxGin.setBounds(985, 126, 186, 39);
		contentPanel.add(chckbxGin);
		
		JCheckBox chckbxOther = new JCheckBox("MIXER");
		chckbxOther.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxOther.setBounds(985, 170, 186, 39);
		contentPanel.add(chckbxOther);
		
		amountTextField = new JTextField("0.0");
		amountTextField.setFont(new Font("Tahoma", Font.PLAIN, 50));
		amountTextField.setBounds(119, 295, 261, 123);
		contentPanel.add(amountTextField);
		amountTextField.setColumns(10);
		
		Unit[] unitList = {Unit.LITER, Unit.OUNCE};
		JComboBox unitChoice = new JComboBox(unitList);
		unitChoice.setFont(new Font("Tahoma", Font.PLAIN, 50));
		unitChoice.setBounds(408, 295, 267, 123);
		contentPanel.add(unitChoice);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Drink drinkToAdd = (Drink) drinkChoice.getSelectedItem();
						DrinkAmount drinkSize = null;
						try {
							drinkSize = new DrinkAmount(Double.parseDouble(amountTextField.getText()), (Unit) unitChoice.getSelectedItem());
						} catch (Exception exception) { }
											
						if (drinkToAdd != null && drinkSize != null) {
							dispose();
							drinkManager.insertNewDrinkContainer(new DrinkContainer(drinkToAdd, drinkSize), drinkContainerSlot);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
