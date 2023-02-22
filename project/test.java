package project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class test {

	private JFrame frame;
	private JTextField textField_chickenburger;
	private JTextField textfield_chickenburgermeal;
	private JTextField textField_cheeseburger;
	private JTextField textField_convert;
	private JTextField textField_QTY;

	double first,second,result;
	
	String operation,answer;
	
	double Lebanese_Lerra = 0 ;
	double Euro = 0 ;
	double Canadian_Dollar = 0 ;
	double Japanese_Yen = 0 ;
	double Mexican_Peso = 0 ;
	double New_Zealand_Dollar = 0 ;
	double Saudi_Arabia_Riyal = 0 ;
	double Turkish_Lira = 0 ;
	double UAE_Dirham = 0 ; 
	double Singapore_Dollar = 0 ;
	double Russian_Rouble = 0 ;
	double Chinese_Yuan = 0 ;
	
	double ssTea = 0 ;
	double ssIce_Tea = 0 ;
	double ssCoffee = 0 ;
	double ssIce_Coffee = 0 ;
	double ssCola = 0 ;
	double ssCoke = 0 ;
	double ssOrange = 0 ;
	double ssApple_juice = 0 ;
	
	double iDelivery = 0;
	
	

	private JTextArea textField_1;
	private JTextField textField;
	
	Drinks D1 = new Drinks();
	Burger B1 = new Burger();
	Delivery D2 = new Delivery();
	Currency C1 = new Currency();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 72, 580, 232);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(24, 22, 155, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(24, 60, 200, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(24, 98, 155, 27);
		panel.add(lblNewLabel_1_2);
		
		textField_chickenburger = new JTextField();
		textField_chickenburger.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_chickenburger.setBounds(270, 22, 271, 23);
		panel.add(textField_chickenburger);
		textField_chickenburger.setColumns(10);
		
		textfield_chickenburgermeal = new JTextField();
		textfield_chickenburgermeal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textfield_chickenburgermeal.setColumns(10);
		textfield_chickenburgermeal.setBounds(270, 62, 271, 23);
		panel.add(textfield_chickenburgermeal);
		
		textField_cheeseburger = new JTextField();
		textField_cheeseburger.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_cheeseburger.setColumns(10);
		textField_cheeseburger.setBounds(270, 100, 271, 23);
		panel.add(textField_cheeseburger);
		
		final JComboBox comboBox_sac = new JComboBox();
		comboBox_sac.setModel(new DefaultComboBoxModel(new String[] {"Select a drink",
		"Apple juice", "Tea", "Cola", "Coke", "Coffee", "Ice tea", "Ice coffe", "Orange"}));
		comboBox_sac.setBounds(24, 167, 155, 20);
		panel.add(comboBox_sac);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Drinks");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2_2.setBounds(24, 136, 155, 27);
		panel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("QTY");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2_3.setBounds(270, 136, 155, 27);
		panel.add(lblNewLabel_1_2_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 136, 520, 6);
		panel.add(separator);
		
		final JCheckBox chckbxhomedelivery = new JCheckBox("Home Delivery");
		chckbxhomedelivery.setFont(new Font("Tahoma", Font.PLAIN, 21));
		chckbxhomedelivery.setBounds(24, 194, 200, 23);
		panel.add(chckbxhomedelivery);
		
		final JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setFont(new Font("Tahoma", Font.PLAIN, 21));
		chckbxTax.setBounds(267, 194, 200, 23);
		panel.add(chckbxTax);
		
		textField_QTY = new JTextField();
		textField_QTY.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_QTY.setColumns(10);
		textField_QTY.setBounds(270, 167, 271, 23);
		panel.add(textField_QTY);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(600, 72, 337, 232);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JComboBox comboBox_co = new JComboBox();
		comboBox_co.setModel(new DefaultComboBoxModel(new String[] {"Choose one..",
		"Lebanese_Lerra" , "Euro" , "Canadian_Dollar" , "Japanese_Yen" , "Mexican_Peso" ,
		"New_Zealand_Dollar" , "Saudi_Arabia_Riyal" , "Turkish_Lira" , "UAE_Dirham" , "Singapore_Dollar" ,
		"Russian_Rouble" , "Chinese_Yuan"}));
		comboBox_co.setBounds(95, 21, 155, 20);
		panel_1.add(comboBox_co);
		
		textField_convert = new JTextField();
		textField_convert.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_convert.setColumns(10);
		textField_convert.setBounds(60, 82, 226, 39);
		panel_1.add(textField_convert);
		
		final JLabel Converter = new JLabel("");
		Converter.setHorizontalAlignment(SwingConstants.RIGHT);
		Converter.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Converter.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Converter.setBounds(60, 144, 226, 27);
		panel_1.add(Converter);
		
		// --------------------------------------- Money Converter -----------------------------------
		JButton btnconvert = new JButton("Convert");
		btnconvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double USD = Double.parseDouble(textField_convert.getText());
				if(comboBox_co.getSelectedItem().equals("Lebanese_Lerra")) 
				{
					Lebanese_Lerra = C1.getLebanese_Lerra();
					
					String cConvert1 = String.format("%.2f L.L", Lebanese_Lerra * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Euro")) 
				{
					Euro = C1.getEuro();
					
					String cConvert1 = String.format("%.2f €", Euro * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Canadian_Dollar")) 
				{
					Canadian_Dollar = C1.getCanadian_Dollar();
					
					String cConvert1 = String.format("%.2f CAD$", Canadian_Dollar * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Japanese_Yen")) 
				{
					Japanese_Yen = C1.getJapanese_Yen();
					
					String cConvert1 = String.format("%.2f ¥", Japanese_Yen * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Mexican_Peso")) 
				{
					Mexican_Peso = C1.getMexican_Peso();
					
					String cConvert1 = String.format("%.2f MXN$", Mexican_Peso * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("New_Zealand_Dollar")) 
				{
					New_Zealand_Dollar = C1.getNew_Zealand_Dollar();
					
					String cConvert1 = String.format("%.2f NZ$", New_Zealand_Dollar * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Saudi_Arabia_Riyal")) 
				{
					Saudi_Arabia_Riyal = C1.getSaudi_Arabia_Riyal();
					
					String cConvert1 = String.format("%.2f SR", Saudi_Arabia_Riyal * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Turkish_Lira")) 
				{
					Turkish_Lira = C1.getTurkish_Lira();
					
					String cConvert1 = String.format("%.2f TRY", Turkish_Lira * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("UAE_Dirham")) 
				{
					UAE_Dirham = C1.getUAE_Dirham();
					
					String cConvert1 = String.format("%.2f AED", UAE_Dirham * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Singapore_Dollar")) 
				{
					Singapore_Dollar = C1.getSingapore_Dollar();
					
					String cConvert1 = String.format("%.2f S$", Singapore_Dollar * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Russian_Rouble")) 
				{
					Russian_Rouble = C1.getRussian_Rouble();
					
					String cConvert1 = String.format("%.2f RUB", Russian_Rouble * USD);
					Converter.setText(cConvert1);	
				}
				
				if(comboBox_co.getSelectedItem().equals("Chinese_Yuan")) 
				{
					Chinese_Yuan = C1.getChinese_Yuan();
					
					String cConvert1 = String.format("%.2f ¥", Chinese_Yuan * USD);
					Converter.setText(cConvert1);	
				}
				
				
			}
		});
		btnconvert.setBounds(50, 182, 89, 23);
		panel_1.add(btnconvert);
		
		// -------------------------------------- Close --------------------------------------
		JButton btnclose = new JButton("Close");
		btnclose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Converter.setText(null);
				textField_convert.setText(null);
				comboBox_co.setSelectedItem("Choose one..");
				
			}
		});
		btnclose.setBounds(198, 182, 89, 23);
		panel_1.add(btnclose);
		
		JLabel lblNewLabel_1_4 = new JLabel("Currency Conveter");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_4.setBounds(74, 45, 190, 27);
		panel_1.add(lblNewLabel_1_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_1.setBounds(10, 315, 580, 200);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cost of Drinks");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_3.setBounds(21, 21, 155, 27);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cost of Meal");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(21, 69, 200, 27);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cost of Delivery");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2_1.setBounds(21, 118, 155, 27);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		final JLabel lblcostofdrinks = new JLabel("");
		lblcostofdrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcostofdrinks.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblcostofdrinks.setBounds(281, 21, 220, 27);
		lblcostofdrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1_1.add(lblcostofdrinks);
		
		final JLabel lblcostofmeal = new JLabel("");
		lblcostofmeal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcostofmeal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblcostofmeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblcostofmeal.setBounds(281, 69, 220, 27);
		panel_1_1.add(lblcostofmeal);
		
		final JLabel lblcostofdelivery = new JLabel("");
		lblcostofdelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcostofdelivery.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblcostofdelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblcostofdelivery.setBounds(281, 118, 220, 27);
		panel_1_1.add(lblcostofdelivery);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_2.setBounds(600, 315, 337, 200);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
	    final JLabel lbltax = new JLabel("");
		lbltax.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltax.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbltax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbltax.setBounds(164, 22, 163, 27);
		panel_1_2.add(lbltax);
		
		final JLabel lblsubtotal = new JLabel("");
		lblsubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblsubtotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblsubtotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblsubtotal.setBounds(164, 70, 163, 27);
		panel_1_2.add(lblsubtotal);
		
		final JLabel lbltotal = new JLabel("");
		lbltotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbltotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbltotal.setBounds(164, 119, 163, 27);
		panel_1_2.add(lbltotal);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Total");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2_1_1.setBounds(10, 119, 123, 27);
		panel_1_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sub Total");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1.setBounds(10, 70, 123, 27);
		panel_1_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Tax");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_3_1.setBounds(10, 22, 123, 27);
		panel_1_2.add(lblNewLabel_1_3_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_4.setBounds(10, 526, 1332, 113);
		frame.getContentPane().add(panel_1_4);
		panel_1_4.setLayout(null);
		
		
		// --------------------------------------- Total -----------------------------------
		JButton btntotal = new JButton("Total");
		btntotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			double chickenburger = Double.parseDouble(textField_chickenburger.getText());
			double ichickenburger = B1.getichickenburger();
			double Burger;
			Burger =(chickenburger * ichickenburger);
			
			String pMeal =String.format("%1$,.2f", Burger);
			lblcostofmeal.setText(pMeal);
			
			double ChicburgerMeal = Double.parseDouble(textfield_chickenburgermeal.getText());
			double iChicburgerMeal= B1.getiChicburgerMeal();
			double BurgerMeal;
			BurgerMeal = (ChicburgerMeal* iChicburgerMeal);
			String cbMeal = String.format("%.2f", BurgerMeal+ Burger);
			lblcostofmeal.setText(cbMeal);
			
			double CheeseBurger =Double.parseDouble(textField_cheeseburger.getText());
			double cheeseburgerprice = B1.getcheeseburgerprice();
			double cheeseburgermeal;
			cheeseburgermeal =(CheeseBurger * cheeseburgerprice);
			String cheese = String.format( "%.2f", cheeseburgermeal + BurgerMeal + Burger);
			lblcostofmeal.setText(cheese);
			
			
			
			
			
			// --------------------------------------- Home Delivery -----------------------------------
			
			if (chckbxhomedelivery.isSelected())
			{
				iDelivery = D2.getDelivery();
				
				String pDelivery = String.format("%.2f" , iDelivery);
				lblcostofdelivery.setText(pDelivery);
				
			}
			else 
			{
				lblcostofdelivery.setText("0");
			}
			
			
			// --------------------------------------- Drinks -----------------------------------
			
			double Drinks = Double.parseDouble(textField_QTY.getText());						
			
			if (comboBox_sac.getSelectedItem().equals("Apple juice"))
			{
				double Apple_juice = D1.getApple_juice();
				ssApple_juice = Apple_juice * Drinks ;
				
				String sApple_juice = String.format("%2.2f" , ssApple_juice);
				lblcostofdrinks.setText( sApple_juice );
			}
			
			if (comboBox_sac.getSelectedItem().equals("Tea"))
			{
				double Tea = D1.getTea();
				ssTea = Tea * Drinks ;
				
				String sTea = String.format("%2.2f" , ssTea);
				lblcostofdrinks.setText( sTea );
			}
			
			if (comboBox_sac.getSelectedItem().equals("Ice tea"))
			{
				double Ice_Tea = D1.getIce_Tea();
				ssIce_Tea = Ice_Tea * Drinks ;
				
				String sIce_Tea = String.format("%2.2f" , ssIce_Tea);
				lblcostofdrinks.setText( sIce_Tea );
			}
			
			if (comboBox_sac.getSelectedItem().equals("Coke"))
			{
				double Coke = D1.getCoke();
				ssCoke = Coke * Drinks ;
				
				String sCoke = String.format("%2.2f" , ssCoke);
				lblcostofdrinks.setText( sCoke );
			}
			
			if (comboBox_sac.getSelectedItem().equals("Cola"))
			{
				double Cola = D1.getCola();
				ssCola = Cola * Drinks ;
				
				String sCola = String.format("%2.2f" , ssCola);
				lblcostofdrinks.setText( sCola);
			}
			
			if (comboBox_sac.getSelectedItem().equals("Orange"))
			{
				double Orange = D1.getOrange();
				ssOrange = Orange * Drinks ;
				
				String sOrange = String.format("%2.2f" , ssOrange);
				lblcostofdrinks.setText( sOrange);
			}
			
			if (comboBox_sac.getSelectedItem().equals("Coffee"))
			{
				double Coffee = D1.getCoffee();
				ssCoffee = Coffee * Drinks ;
				
				String sCoffee = String.format("%2.2f" , ssCoffee);
				lblcostofdrinks.setText( sCoffee);
			}
			
			if (comboBox_sac.getSelectedItem().equals("Ice coffe"))
			{
				double Ice_Coffee = D1.getIce_Coffee();
				ssIce_Coffee = Ice_Coffee * Drinks ;
				
				String sIce_Coffee = String.format("%2.2f" , ssIce_Coffee);
				lblcostofdrinks.setText( sIce_Coffee);
			}
			
			if (comboBox_sac.getSelectedItem().equals("Select a drink"))
			{
				lblcostofdrinks.setText("0");
			}

			
			
			// --------------------------------------- Tax Rate -----------------------------------
			double sTotal1 = Double.parseDouble(lblcostofdrinks.getText());
			double sTotal2 = Double.parseDouble(lblcostofmeal.getText());
			double sTotal3 = Double.parseDouble(lblcostofdelivery.getText());
			double AllTotal = (sTotal1 + sTotal2 + sTotal3)/100 ;
			if(chckbxTax.isSelected())
			{
				String sTotal = String.format("%2.2f" , AllTotal);
				lbltax.setText(sTotal);
			}
			else 
			{
				lbltax.setText("0");
			}
			
			
			// --------------------------------------- Total -----------------------------------
			double sTotal4 = Double.parseDouble(lbltax.getText());
			double subTotal = (sTotal1 + sTotal2 + sTotal3);
			String ssubTotal = String.format("$ %2.2f" , subTotal);
			lblsubtotal.setText(ssubTotal);
			
			double allTotal = (sTotal1 + sTotal2 + sTotal3 + sTotal4);
			String sTotal = String.format("$ %2.2f" , allTotal);
			lbltotal.setText(sTotal);
			
			String sTaxTotal = String.format("$ %2.2f" , sTotal4);
			lbltax.setText(sTaxTotal);
			
			}
		});
		
		
		btntotal.setBounds(526, 39, 89, 23);
		panel_1_4.add(btntotal);
			
			// --------------------------------------- Receipt -----------------------------------
					
		
		JButton btnreceipt = new JButton("Receipt");
		btnreceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Qty1 = Double.parseDouble(textField_chickenburger.getText());
				double Qty2 = Double.parseDouble(textfield_chickenburgermeal.getText());
				double Qty3 = Double.parseDouble(textField_cheeseburger.getText());
			    double Qty5 = Double.parseDouble(textField_QTY.getText());
				Object Qty4 = comboBox_sac.getSelectedItem();
				String Qty6 = lbltotal.getText();				
				
				double a = B1.getichickenburger();
				double b= B1.getiChicburgerMeal();
				double c = B1.getcheeseburgerprice();
			
				textField_1.setText("Resturant Food Ordering System:\n\n"+"Chicken Burger:\t\t"+Qty1+
				"\nPrice of a Chicken Burger:\t\t"+a+"$"
				+"\n\nChicken Burger Meal:\t\t"+Qty2+"\nPrice of a Chicken Burger Meal:\t\t"+b+"$"+
				"\n\nCheese Burger:\t\t\t"+Qty3+"\nPrice of a Cheese Burger:\t\t"+c+"$"+"\n\n"+Qty4+
				" Drinks ordered:\t\t"+Qty5+"\n\n\nTotal:\t\t                      "
						+Qty6+"\n\nThanks for using our food ordering software!");
			}
		});
		
		
		btnreceipt.setBounds(678, 39, 89, 23);
		panel_1_4.add(btnreceipt);
		
		// --------------------------------------- Reset -----------------------------------
		
		
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcostofdelivery.setText(null);
				lblsubtotal.setText(null);
				lbltotal.setText(null);
				lbltax.setText(null);				
				lblcostofdrinks.setText(null);
				lblcostofmeal.setText(null);
				Converter.setText(null);
				textField.setText(null);
				
				
				textField_chickenburger.setText(null);
				textfield_chickenburgermeal.setText(null);
				textField_cheeseburger.setText(null);
				textField_QTY.setText(null);
				textField_convert.setText(null);
				textField_1.setText(null);
				
				
				
				chckbxhomedelivery.setSelected(false);
				chckbxTax.setSelected(false);								
				
				comboBox_sac.setSelectedItem("Select a drink");
				comboBox_co.setSelectedItem("Choose one..");
			}
		});
		
		btnreset.setBounds(824, 39, 89, 23);
		panel_1_4.add(btnreset);
		
		// --------------------------------------- Exit -----------------------------------
				
		
		JButton btnexit = new JButton("Exit");
		btnexit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnexit.setBounds(958, 39, 89, 23);
		panel_1_4.add(btnexit);
		
		
		JLabel lblNewLabel = new JLabel("Resturant Ordering System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel.setBounds(185, -9, 1010, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_3.setBounds(947, 72, 395, 443);
		frame.getContentPane().add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 35, 375, 398);
		panel_1_3.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField_1 = new JTextArea();
		textField_1.setBounds(10, 10, 350, 351);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		
		// --------------------------------------- Calculator -----------------------------------
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(48, 36, 258, 51);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		panel_3.add(textField);
		
		JButton btnbackspace = new JButton("\uf0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//backspace
				
				String backspace=null;
				if(textField.getText().length()>0) 
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
							
			}
		});

		btnbackspace.setFont(new Font("Windings", Font.BOLD, 16));
		btnbackspace.setBounds(10, 71, 63, 33);
		frame.getContentPane().add(btnbackspace);
		
		
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(113, 97, 63, 33);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);   //clearance
				
			}
		});
		
		final JButton btn00 = new JButton("00");
		btn00.setBounds(178, 97, 63, 33);
		btn00.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn00);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		
		JButton btnplus = new JButton("+");
		btnplus.setBounds(243, 97, 63, 33);
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnplus);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
				
			}
		});
		
		JButton btnsub = new JButton("-");
		btnsub.setBounds(243, 138, 63, 33);
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnsub);
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		
		final JButton btn9 = new JButton("9");
		btn9.setBounds(178, 138, 63, 33);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		
		
		final JButton btn8 = new JButton("8");
		btn8.setBounds(113, 138, 63, 33);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		
		final JButton btn7 = new JButton("7");
		btn7.setBounds(48, 138, 63, 33);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		
		final JButton btn6 = new JButton("6");
		btn6.setBounds(178, 176, 63, 33);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
	
		
		
		final JButton btn5 = new JButton("5");
		btn5.setBounds(113, 176, 63, 33);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		
		final JButton btn4 = new JButton("4");
		btn4.setBounds(48, 176, 63, 33);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		
		
		final JButton btn3 = new JButton("3");
		btn3.setBounds(178, 219, 63, 33);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		
		final JButton btn2 = new JButton("2");
		btn2.setBounds(113, 219, 63, 33);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		
		final JButton btn1 = new JButton("1");
		btn1.setBounds(48, 219, 63, 33);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		
		final JButton btn0 = new JButton("0");
		btn0.setBounds(48, 262, 63, 33);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btn0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		
	
		
		final JButton btndott = new JButton(".");
		btndott.setBounds(113, 262, 63, 33);
		btndott.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btndott);
		btndott.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndott.getText();
				textField.setText(number);
			}
		});
		
		JButton btnbackspace1 = new JButton("\uf0E7");
		btnbackspace1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//backspace
				
				String backspace=null;
				if(textField.getText().length()>0) 
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
							
			}
		});
		
		JButton btnmul = new JButton("*");
		btnmul.setBounds(243, 176, 63, 33);
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnmul);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
			}
		});
		
		JButton btndiv = new JButton("/");
		btndiv.setBounds(243, 219, 63, 33);
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btndiv);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				
			}
		});
		
		JButton btnperc = new JButton("%");
		btnperc.setBounds(243, 262, 63, 33);
		btnperc.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnperc);
		btnperc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				
			}
		});
		
		JButton btnequal = new JButton("=");
		btnequal.setBounds(178, 262, 63, 33);
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(btnequal);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
			}
		});
		
		
		btnbackspace1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnbackspace1.setBounds(48, 97, 63, 33);
		panel_3.add(btnbackspace1);
		
		}
}
