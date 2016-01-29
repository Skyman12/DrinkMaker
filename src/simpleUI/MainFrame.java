package simpleUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import drinkManager.DrinkAmount;
import drinkManager.DrinkManager;
import drinkManager.DrinkRecipe;
import drinkTypes.Drink;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	
	private ArrayList<JLabel> labelList;
	private ArrayList<JLabel> percentList;
	private ArrayList<JSlider> sliderList;
	private DrinkManager drinkManager;
	private JList drinkList;
	private JButton btnMakeDrink;
	private JLabel lblDrinkName;
	
	private DrinkRecipe currentDrinkRecipe;
	private JTextField searchBox;

	/**
	 * Create the frame.
	 */
	public MainFrame(DrinkManager drinkManager) {
		this.drinkManager = drinkManager;
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 1600, 1080);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		labelList = new ArrayList<>();
		sliderList = new ArrayList<>();
		percentList = new ArrayList<>();
		
		JButton btnManage = new JButton("MANAGE");
		btnManage.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new ManagementJFrame(drinkManager).setVisible(true);
			}
		});
		btnManage.setBounds(1728, 26, 174, 64);
		getContentPane().add(btnManage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 100, 672, 668);
		getContentPane().add(scrollPane);
		
		drinkList = new JList(drinkManager.getAvaliableDrinks().keySet().toArray());
		drinkList.setFont(new Font("Tahoma", Font.PLAIN, 60));
		scrollPane.setViewportView(drinkList);
		addDrinkListHandlers();
		
		JLabel lblDrinkList = new JLabel("Drink List");
		lblDrinkList.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblDrinkList.setBounds(243, 26, 222, 55);
		getContentPane().add(lblDrinkList);
		
		btnMakeDrink = new JButton("MAKE DRINK");
		btnMakeDrink.setFont(new Font("Tahoma", Font.PLAIN, 70));
		btnMakeDrink.setBounds(784, 877, 1092, 111);
		getContentPane().add(btnMakeDrink);
		
		lblDrinkName = new JLabel("Drink Name");
		lblDrinkName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrinkName.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblDrinkName.setBounds(1015, 78, 653, 105);
		getContentPane().add(lblDrinkName);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(1015, 166, 655, 2);
		getContentPane().add(separator);
		
		JLabel ingredient1Label = new JLabel("Ingredient 1");
		ingredient1Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient1Label.setBounds(784, 196, 476, 55);
		getContentPane().add(ingredient1Label);
		labelList.add(ingredient1Label);
		
		JLabel ingredient2Label = new JLabel("Ingredient 2");
		ingredient2Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient2Label.setBounds(784, 264, 476, 55);
		getContentPane().add(ingredient2Label);
		labelList.add(ingredient2Label);
		
		JLabel ingredient3Label = new JLabel("Ingredient 3");
		ingredient3Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient3Label.setBounds(784, 332, 476, 55);
		getContentPane().add(ingredient3Label);
		labelList.add(ingredient3Label);
		
		JLabel ingredient4Label = new JLabel("Ingredient 4");
		ingredient4Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient4Label.setBounds(784, 400, 476, 55);
		getContentPane().add(ingredient4Label);
		labelList.add(ingredient4Label);
		
		JLabel ingredient5Label = new JLabel("Ingredient 5");
		ingredient5Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient5Label.setBounds(784, 468, 476, 55);
		getContentPane().add(ingredient5Label);
		labelList.add(ingredient5Label);
		
		JLabel ingredient6Label = new JLabel("Ingredient 6");
		ingredient6Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient6Label.setBounds(784, 535, 476, 55);
		getContentPane().add(ingredient6Label);
		labelList.add(ingredient6Label);
		
		JLabel ingredient7Label = new JLabel("Ingredient 7");
		ingredient7Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient7Label.setBounds(784, 603, 476, 55);
		getContentPane().add(ingredient7Label);
		labelList.add(ingredient7Label);
		
		JLabel ingredient8Label = new JLabel("Ingredient 8");
		ingredient8Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient8Label.setBounds(784, 671, 476, 55);
		getContentPane().add(ingredient8Label);
		labelList.add(ingredient8Label);
		
		JLabel ingredient9Label = new JLabel("Ingredient 9");
		ingredient9Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient9Label.setBounds(784, 739, 476, 55);
		getContentPane().add(ingredient9Label);
		labelList.add(ingredient9Label);
		
		JLabel ingredient10Label = new JLabel("Ingredient 10");
		ingredient10Label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient10Label.setBounds(784, 807, 476, 55);
		getContentPane().add(ingredient10Label);
		labelList.add(ingredient10Label);
		
		JSlider slider1 = new JSlider();
		slider1.setPaintTrack(true);
		slider1.setSnapToTicks(true);
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider1.setBounds(1388, 203, 488, 48);
		getContentPane().add(slider1);
		sliderList.add(slider1);
		
		JSlider slider2 = new JSlider();
		slider2.setSnapToTicks(true);
		slider2.setPaintTicks(true);
		slider2.setPaintLabels(true);
		slider2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider2.setBounds(1388, 271, 488, 48);
		getContentPane().add(slider2);
		sliderList.add(slider2);
		
		JSlider slider3 = new JSlider();
		slider3.setSnapToTicks(true);
		slider3.setPaintTicks(true);
		slider3.setPaintLabels(true);
		slider3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider3.setBounds(1388, 339, 488, 48);
		getContentPane().add(slider3);
		sliderList.add(slider3);
		
		JSlider slider4 = new JSlider();
		slider4.setSnapToTicks(true);
		slider4.setPaintTicks(true);
		slider4.setPaintLabels(true);
		slider4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider4.setBounds(1388, 407, 488, 48);
		getContentPane().add(slider4);
		sliderList.add(slider4);
		
		JSlider slider5 = new JSlider();
		slider5.setSnapToTicks(true);
		slider5.setPaintTicks(true);
		slider5.setPaintLabels(true);
		slider5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider5.setBounds(1388, 475, 488, 48);
		getContentPane().add(slider5);
		sliderList.add(slider5);
		
		JSlider slider6 = new JSlider();
		slider6.setSnapToTicks(true);
		slider6.setPaintTicks(true);
		slider6.setPaintLabels(true);
		slider6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider6.setBounds(1388, 542, 488, 48);
		getContentPane().add(slider6);
		sliderList.add(slider6);
		
		JSlider slider7 = new JSlider();
		slider7.setSnapToTicks(true);
		slider7.setPaintTicks(true);
		slider7.setPaintLabels(true);
		slider7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider7.setBounds(1388, 610, 488, 48);
		getContentPane().add(slider7);
		sliderList.add(slider7);
		
		JSlider slider8 = new JSlider();
		slider8.setSnapToTicks(true);
		slider8.setPaintTicks(true);
		slider8.setPaintLabels(true);
		slider8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider8.setBounds(1388, 678, 488, 48);
		getContentPane().add(slider8);
		sliderList.add(slider8);
		
		JSlider slider9 = new JSlider();
		slider9.setPaintTicks(true);
		slider9.setSnapToTicks(true);
		slider9.setPaintLabels(true);
		slider9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider9.setBounds(1388, 746, 488, 48);
		getContentPane().add(slider9);
		sliderList.add(slider9);
		
		JSlider slider10 = new JSlider();
		slider10.setSnapToTicks(true);
		slider10.setPaintTicks(true);
		slider10.setPaintLabels(true);
		slider10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		slider10.setBounds(1388, 814, 488, 48);
		getContentPane().add(slider10);
		sliderList.add(slider10);
		
		JLabel ingredient1Percent = new JLabel("%");
		ingredient1Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient1Percent.setBounds(1272, 196, 104, 55);
		getContentPane().add(ingredient1Percent);
		percentList.add(ingredient1Percent);
		
		JLabel ingredient2Percent = new JLabel("%");
		ingredient2Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient2Percent.setBounds(1272, 264, 104, 55);
		getContentPane().add(ingredient2Percent);
		percentList.add(ingredient2Percent);
		
		JLabel ingredient3Percent = new JLabel("%");
		ingredient3Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient3Percent.setBounds(1272, 332, 104, 55);
		getContentPane().add(ingredient3Percent);
		percentList.add(ingredient3Percent);
		
		JLabel ingredient4Percent = new JLabel("%");
		ingredient4Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient4Percent.setBounds(1272, 400, 104, 55);
		getContentPane().add(ingredient4Percent);
		percentList.add(ingredient4Percent);
		
		JLabel ingredient5Percent = new JLabel("%");
		ingredient5Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient5Percent.setBounds(1272, 468, 104, 55);
		getContentPane().add(ingredient5Percent);
		percentList.add(ingredient5Percent);
		
		JLabel ingredient6Percent = new JLabel("%");
		ingredient6Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient6Percent.setBounds(1272, 535, 104, 55);
		getContentPane().add(ingredient6Percent);
		percentList.add(ingredient6Percent);
		
		JLabel ingredient7Percent = new JLabel("%");
		ingredient7Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient7Percent.setBounds(1272, 603, 104, 55);
		getContentPane().add(ingredient7Percent);
		percentList.add(ingredient7Percent);
		
		JLabel ingredient8Percent = new JLabel("%");
		ingredient8Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient8Percent.setBounds(1272, 671, 104, 55);
		getContentPane().add(ingredient8Percent);
		percentList.add(ingredient8Percent);
		
		JLabel ingredient9Percent = new JLabel("%");
		ingredient9Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient9Percent.setBounds(1272, 739, 104, 55);
		getContentPane().add(ingredient9Percent);
		percentList.add(ingredient9Percent);
		
		JLabel ingredient10Percent = new JLabel("%");
		ingredient10Percent.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ingredient10Percent.setBounds(1272, 807, 104, 55);
		getContentPane().add(ingredient10Percent);
		percentList.add(ingredient10Percent);
		
		JCheckBox checkBoxRum = new JCheckBox("RUM");
		checkBoxRum.setFont(new Font("Tahoma", Font.PLAIN, 30));
		checkBoxRum.setBounds(12, 846, 178, 48);
		getContentPane().add(checkBoxRum);
		
		searchBox = new JTextField();
		searchBox.setBounds(126, 781, 469, 48);
		getContentPane().add(searchBox);
		searchBox.setColumns(10);
		
		JCheckBox checkBoxVodka = new JCheckBox("VODKA");
		checkBoxVodka.setFont(new Font("Tahoma", Font.PLAIN, 30));
		checkBoxVodka.setBounds(12, 899, 178, 48);
		getContentPane().add(checkBoxVodka);
		
		JCheckBox checkBoxWhiskey = new JCheckBox("WHISKEY");
		checkBoxWhiskey.setFont(new Font("Tahoma", Font.PLAIN, 30));
		checkBoxWhiskey.setBounds(194, 846, 178, 48);
		getContentPane().add(checkBoxWhiskey);
		
		JCheckBox checkBoxGin = new JCheckBox("GIN");
		checkBoxGin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		checkBoxGin.setBounds(194, 899, 178, 48);
		getContentPane().add(checkBoxGin);
		
		JCheckBox checkBoxTequila = new JCheckBox("TEQUILA");
		checkBoxTequila.setFont(new Font("Tahoma", Font.PLAIN, 30));
		checkBoxTequila.setBounds(376, 846, 178, 48);
		getContentPane().add(checkBoxTequila);
		
		JCheckBox checkBoxOther = new JCheckBox("OTHER");
		checkBoxOther.setFont(new Font("Tahoma", Font.PLAIN, 30));
		checkBoxOther.setBounds(376, 899, 178, 48);
		getContentPane().add(checkBoxOther);
		
		addSliderHandlers(); 
		
		setSlidersToHidden(sliderList);
		setLabelsToHidden(labelList);
		setLabelsToHidden(percentList);
	}
	
	private void addDrinkListHandlers() {
		drinkList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				updateDrinkInformation();
			}
		});
	}
	
	private void addSliderHandlers() {
		for (JSlider slider : sliderList)
			slider.addChangeListener(new ChangeListener() {
		        public void stateChanged(ChangeEvent ce) {
		        	updatePercentValues();
		        }
	    });
	}
	
	private void updateDrinkInformation() {
		setSlidersToHidden(sliderList);
		setLabelsToHidden(labelList);
		setLabelsToHidden(percentList);
		
		String drinkName = drinkList.getSelectedValue().toString();
		currentDrinkRecipe = drinkManager.getAvaliableDrinks().get(drinkName);
		
		lblDrinkName.setText(drinkName);
		
		int i = 0;
		for (Drink d : currentDrinkRecipe.getIngredients().keySet()) {
			labelList.get(i).setText(d.toString());
			labelList.get(i).setVisible(true);
			sliderList.get(i).setValue(currentDrinkRecipe.getIngredients().get(d).getStandardAmount().intValue());
			sliderList.get(i).setVisible(true);
			percentList.get(i).setVisible(true);
			i++;
		}
		
		updatePercentValues();
	}
	
	private void updatePercentValues() {
		String drinkName = drinkList.getSelectedValue().toString();
		Map<Drink, DrinkAmount> drinkToDisplay = drinkManager.getAvaliableDrinks().get(drinkName).getIngredients();
		
		int total = 0;
		int i = 0;
		
		for (Drink d : currentDrinkRecipe.getIngredients().keySet()) {
			total+= sliderList.get(i).getValue();
			i++;
		}
		
		i = 0;
		for (Drink d : drinkToDisplay.keySet()) {
			JSlider slider = sliderList.get(i);
			if (total > 0) {
				double percent = (slider.getValue() * 100.0) / (total * 1.0);
				DecimalFormat df = new DecimalFormat("#.##");      
				percent = Double.valueOf(df.format(percent));
				percentList.get(i).setText(percent + "");
			} else {
				percentList.get(i).setText("0.0");
			}
			i++;
		}
	}
	
	private void setSlidersToHidden(ArrayList<JSlider> sliderList) {
		for (JSlider s : sliderList) {
			s.setVisible(false);
		}
	}
	
	private void setLabelsToHidden(ArrayList<JLabel> labelList) {
		for (JLabel s : labelList) {
			s.setVisible(false);
		}
	}

}
