/**
 * MyCalc gui/MainWindow 
 * Copyright MLuensmann
 * 
 * @author Fox W. Mulder
 */

package gui;

import logic.CloseListener;
import logic.ExitAction;
import logic.MyCalcLogic;
import misc.MyCalculatorNumbers;

import java.awt.Color;
//import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Container;
//import java.net.URL;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
//import javax.swing.JTextField;
import javax.swing.KeyStroke;
//import gui.InfoWindow;

public class MainWindow extends JFrame implements ActionListener, KeyListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	private static final boolean RIGHT_TO_LEFT = false;
	
	//JTextField mCTextField = new JTextField(50);
	protected JLabel mCLabel = new JLabel();
	protected JLabel mCLabel2 = new JLabel();
	//protected JLabel mCFWL = new JLabel("Formelspeicher initialisiert");
	protected JButton mCButton1 = new JButton("7"); //protected
	protected JButton mCButton2 = new JButton("8"); //protected
	protected JButton mCButton3 = new JButton("9"); //protected 
	protected JButton mCButton4 = new JButton("/"); //protected 
	protected JButton mCButton5 = new JButton("4"); //protected 
	protected JButton mCButton6 = new JButton("5"); //protected 
	protected JButton mCButton7 = new JButton("6"); //protected 
	protected JButton mCButton8 = new JButton("*"); //protected 
	protected JButton mCButton9 = new JButton("1"); //protected 
	protected JButton mCButton10 = new JButton("2"); //protected 
	protected JButton mCButton11 = new JButton("3"); //protected 
	protected JButton mCButton12 = new JButton("-"); //protected 
	protected JButton mCButton13 = new JButton("="); //protected
	protected JButton mCButton14 = new JButton("+"); //protected 
	protected JButton mCButton15 = new JButton("0"); //protected
	protected JButton mCButton16 = new JButton("c");
	protected JButton mCButton17 = new JButton(".");
	protected JButton mCButton18 = new JButton("^");
	protected JButton mCButton19 = new JButton("e");
	protected JButton mCButton20 = new JButton("s");
	
	protected FormulaWindow mCFWV;
	
	@Override
	public void keyTyped(KeyEvent kE){}
	 
	@Override
	public void keyPressed(KeyEvent kE)
	{  if(kE.isControlDown() == false)
	   {
		if(kE.getKeyCode() == KeyEvent.VK_0 || kE.getKeyCode() == KeyEvent.VK_NUMPAD0){mCButton15.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_1 || kE.getKeyCode() == KeyEvent.VK_NUMPAD1){mCButton9.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_2 || kE.getKeyCode() == KeyEvent.VK_NUMPAD2){mCButton10.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_3 || kE.getKeyCode() == KeyEvent.VK_NUMPAD3){mCButton11.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_4 || kE.getKeyCode() == KeyEvent.VK_NUMPAD4){mCButton5.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_5 || kE.getKeyCode() == KeyEvent.VK_NUMPAD5){mCButton6.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_6 || kE.getKeyCode() == KeyEvent.VK_NUMPAD6){mCButton7.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_7 || kE.getKeyCode() == KeyEvent.VK_NUMPAD7){mCButton1.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_8 || kE.getKeyCode() == KeyEvent.VK_NUMPAD8){mCButton2.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_9 || kE.getKeyCode() == KeyEvent.VK_NUMPAD9){mCButton3.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_C || kE.getKeyCode() == KeyEvent.VK_ESCAPE){mCButton16.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_E){mCButton19.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_V){mCButton20.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_D || kE.getKeyCode() == KeyEvent.VK_DIVIDE){mCButton4.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_M || kE.getKeyCode() == KeyEvent.VK_MULTIPLY){mCButton8.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_S || kE.getKeyCode() == KeyEvent.VK_SUBTRACT){mCButton12.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_A || kE.getKeyCode() == KeyEvent.VK_ADD){mCButton14.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_K || kE.getKeyCode() == KeyEvent.VK_DECIMAL){mCButton17.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_X || kE.getKeyCode() == KeyEvent.VK_DEAD_CIRCUMFLEX){mCButton18.doClick();}
		if(kE.getKeyCode() == KeyEvent.VK_ENTER || kE.getKeyCode() == KeyEvent.VK_NUMBER_SIGN){mCButton13.doClick();}
	   }
	}
	
	//public MyCalcLogic mCMCL;
	//protected FormulaWindow mCFMW;
	
	@Override
	public void keyReleased(KeyEvent ek){}
	
	//public static MyCalcLogic mCL = new MyCalcLogic();
	
	public MainWindow(MyCalcLogic pMCL){
		myCalcGui();
		//getContentPane().add(mCLabel);
		//mCL.addImpl(getRootPane(), accessibleContext, EXIT_ON_CLOSE);
	}	
		
	public void setUpContentPane(Container pMCPane){
		if(RIGHT_TO_LEFT){
			pMCPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		
		pMCPane.setLayout(new GridBagLayout());
		GridBagConstraints mCLC1 = new GridBagConstraints();
		GridBagConstraints mCLC2 = new GridBagConstraints();
		GridBagConstraints mCLC3 = new GridBagConstraints();
		GridBagConstraints mCBC1 = new GridBagConstraints();
		GridBagConstraints mCBC2 = new GridBagConstraints();
		GridBagConstraints mCBC3 = new GridBagConstraints();
		GridBagConstraints mCBC4 = new GridBagConstraints();
		GridBagConstraints mCBC5 = new GridBagConstraints();
		GridBagConstraints mCBC6 = new GridBagConstraints();
		GridBagConstraints mCBC7 = new GridBagConstraints();
		GridBagConstraints mCBC8 = new GridBagConstraints();
		GridBagConstraints mCBC9 = new GridBagConstraints();
		GridBagConstraints mCBC10 = new GridBagConstraints();
		GridBagConstraints mCBC11 = new GridBagConstraints();
		GridBagConstraints mCBC12 = new GridBagConstraints();
		GridBagConstraints mCBC13 = new GridBagConstraints();
		GridBagConstraints mCBC14 = new GridBagConstraints();
		GridBagConstraints mCBC15 = new GridBagConstraints();
		GridBagConstraints mCBC16 = new GridBagConstraints();
		GridBagConstraints mCBC17 = new GridBagConstraints();
		GridBagConstraints mCBC18 = new GridBagConstraints();
		GridBagConstraints mCBC19 = new GridBagConstraints();
		GridBagConstraints mCBC20 = new GridBagConstraints();


		/*mCFWV.setToolTipText("Formelspeicher");
		mCFWV.addKeyListener(this);
		mCFWV.setName(getName());
		mCFWV.setEnabled(true);
		mCFWV.setToolTipText("Formelspeicher");
		mCFWV.addKeyListener(this);*/
		//mCFWV.mCFWL.setName(mCFWV.mCFWL.getName());
		//mCFWV.mCFWL.addKeyListener(this);
		//mCFWV.mCFWL.setEnabled(true);
		//mCFWV.mCFWL.setVisible(true);
		//mCFWV.mCFWL.setToolTipText("Formelspeicher");
		mCLC3.weightx = 0.1;
		mCLC3.weighty = 0.1;
		mCLC3.gridheight = 1;
		mCLC3.gridwidth = 4;
		mCLC3.gridx = 0;
		mCLC3.gridy = 0;
		pMCPane.add(mCFWV.mCFWL, mCLC3);
		
		
		mCLabel.setEnabled(true);
		mCLabel.setVisible(true);
		mCLabel.setToolTipText("Anzeige");
		//mCLabel.setText("Please put in any value!");		
		mCLC1.weightx = 0.35;
		mCLC1.weighty = 0.35;		
		mCLC1.gridheight = 1;
		mCLC1.gridwidth = 4;
		mCLC1.gridx = 0;
		mCLC1.gridy = 1;
		pMCPane.add(mCLabel, mCLC1);

		
		mCButton1.setName("7");
		mCButton1.setToolTipText("7");		
		mCButton1.setBackground(Color.GRAY);
		mCButton1.addActionListener(this);
		mCButton1.setMnemonic(KeyEvent.VK_7);
		mCButton1.addKeyListener(this);
		mCBC1.weightx = 0.05;
		mCBC1.weighty = 0.05;		
		mCBC1.gridheight = 1;
		mCBC1.gridwidth = 1;
		mCBC1.gridx = 0;
		mCBC1.gridy = 2;
		pMCPane.add(mCButton1, mCBC1);


		mCButton2.setBackground(Color.GRAY);
		mCButton2.setName("8");
		mCButton2.setToolTipText("8");		
		mCButton2.addActionListener(this);
		mCButton2.setMnemonic(KeyEvent.VK_8);
		mCButton2.addKeyListener(this);		
		mCBC2.weightx = 0.05;
		mCBC2.weighty = 0.05;		
		mCBC2.gridheight = 1;
		mCBC2.gridwidth = 1;
		mCBC2.gridx = 1;
		mCBC2.gridy = 2;
		pMCPane.add(mCButton2, mCBC2);
		

		mCButton3.setBackground(Color.GRAY);
		mCButton3.setName("9");
		mCButton3.setToolTipText("9");		
		mCButton3.addActionListener(this);
		mCButton3.setMnemonic(KeyEvent.VK_9);
		mCButton3.addKeyListener(this);				
		mCBC3.weightx = 0.05;
		mCBC3.weighty = 0.05;		
		mCBC3.gridheight = 1;
		mCBC3.gridwidth = 1;
		mCBC3.gridx = 2;
		mCBC3.gridy = 2;
		pMCPane.add(mCButton3, mCBC3);
		
		
		mCButton4.setBackground(Color.GRAY);
		mCButton4.setName("/");
		mCButton4.setToolTipText("Division");		
		mCButton4.addActionListener(this);
		mCButton4.setMnemonic(KeyEvent.VK_D);
		mCButton4.addKeyListener(this);				
		mCBC4.weightx = 0.05;
		mCBC4.weighty = 0.05;		
		mCBC4.gridheight = 1;
		mCBC4.gridwidth = 1;
		mCBC4.gridx = 3;
		mCBC4.gridy = 2;
		mCBC4.ipadx = 4;
		mCBC4.ipady = 0;
		pMCPane.add(mCButton4, mCBC4);
		

		mCButton5.setBackground(Color.GRAY);
		mCButton5.setName("4");
		mCButton5.setToolTipText("4");		
		mCButton5.addActionListener(this);
		mCButton5.setMnemonic(KeyEvent.VK_4);
		mCButton5.addKeyListener(this);
		mCBC5.weightx = 0.05;
		mCBC5.weighty = 0.05;		
		mCBC5.gridheight = 1;
		mCBC5.gridwidth = 1;
		mCBC5.gridx = 0;
		mCBC5.gridy = 3;
		pMCPane.add(mCButton5, mCBC5);
		

		mCButton6.setBackground(Color.GRAY);
		mCButton6.setName("5");
		mCButton6.setToolTipText("5");		
		mCButton6.addActionListener(this);
		mCButton6.setMnemonic(KeyEvent.VK_6);
		mCButton6.addKeyListener(this);
		mCBC6.weightx = 0.05;
		mCBC6.weighty = 0.05;		
		mCBC6.gridheight = 1;
		mCBC6.gridwidth = 1;
		mCBC6.gridx = 1;
		mCBC6.gridy = 3;
		pMCPane.add(mCButton6, mCBC6);
		

		mCButton7.setBackground(Color.GRAY);
		mCButton7.setName("6");
		mCButton7.setToolTipText("6");		
		mCButton7.addActionListener(this);
		mCButton7.setMnemonic(KeyEvent.VK_6);
		mCButton7.addKeyListener(this);
		mCBC7.weightx = 0.05;
		mCBC7.weighty = 0.05;		
		mCBC7.gridheight = 1;
		mCBC7.gridwidth = 1;
		mCBC7.gridx = 2;
		mCBC7.gridy = 3;
		pMCPane.add(mCButton7, mCBC7);
		

		mCButton8.setBackground(Color.GRAY);
		mCButton8.setName("*");
		mCButton8.setToolTipText("Multiplikation");		
		mCButton8.addActionListener(this);
		mCButton8.setMnemonic(KeyEvent.VK_M);
		mCButton8.addKeyListener(this);				
		mCBC8.weightx = 0.05;
		mCBC8.weighty = 0.05;		
		mCBC8.gridheight = 1;
		mCBC8.gridwidth = 1;
		mCBC8.gridx = 3;
		mCBC8.gridy = 3;
		mCBC8.ipadx = 2;
		mCBC8.ipady = 0;
		pMCPane.add(mCButton8, mCBC8);
		

		mCButton9.setBackground(Color.GRAY);
		mCButton9.setName("1");
		mCButton9.setToolTipText("1");		
		mCButton9.addActionListener(this);
		mCButton9.setMnemonic(KeyEvent.VK_1);
		mCButton9.addKeyListener(this);
		mCBC9.weightx = 0.05;
		mCBC9.weighty = 0.05;		
		mCBC9.gridheight = 1;
		mCBC9.gridwidth = 1;
		mCBC9.gridx = 0;
		mCBC9.gridy = 4;
		pMCPane.add(mCButton9, mCBC9);
		

		mCButton10.setBackground(Color.GRAY);
		mCButton10.setName("2");
		mCButton10.setToolTipText("2");		
		mCButton10.addActionListener(this);
		mCButton10.setMnemonic(KeyEvent.VK_2);
		mCButton10.addKeyListener(this);
		mCBC10.weightx = 0.05;
		mCBC10.weighty = 0.05;		
		mCBC10.gridheight = 1;
		mCBC10.gridwidth = 1;
		mCBC10.gridx = 1;
		mCBC10.gridy = 4;
		pMCPane.add(mCButton10, mCBC10);
		

		mCButton11.setBackground(Color.GRAY);
		mCButton11.setName("3");
		mCButton11.setToolTipText("3");		
		mCButton11.addActionListener(this);
		mCButton11.setMnemonic(KeyEvent.VK_3);
		mCButton11.addKeyListener(this);
		mCBC11.weightx = 0.05;
		mCBC11.weighty = 0.05;		
		mCBC11.gridheight = 1;
		mCBC11.gridwidth = 1;
		mCBC11.gridx = 2;
		mCBC11.gridy = 4;
		pMCPane.add(mCButton11, mCBC11);
		

		mCButton12.setBackground(Color.GRAY);
		mCButton12.setName("-");
		mCButton12.setToolTipText("Subtraktion");		
		mCButton12.addActionListener(this);
		mCButton12.setMnemonic(KeyEvent.VK_S);
		mCButton12.addKeyListener(this);				
		mCBC12.weightx = 0.05;
		mCBC12.weighty = 0.05;		
		mCBC12.gridheight = 1;
		mCBC12.gridwidth = 1;
		mCBC12.gridx = 3;
		mCBC12.gridy = 4;
		mCBC12.ipadx = 3;
		mCBC12.ipady = 0;
		pMCPane.add(mCButton12, mCBC12);
		
		
		mCButton13.setEnabled(false);
		mCButton13.setBackground(Color.GRAY);
		mCButton13.setName("=");
		mCButton13.setToolTipText("Ergebnis anzeigen");		
		mCButton13.addActionListener(this);
		mCButton13.setMnemonic(KeyEvent.VK_ENTER);
		mCButton13.addKeyListener(this);
		mCBC13.weightx = 0.05;
		mCBC13.weighty = 0.05;		
		mCBC13.gridheight = 1;
		mCBC13.gridwidth = 1;
		mCBC13.gridx = 2;
		mCBC13.gridy = 5;
		mCBC13.ipadx = 0;
		mCBC13.ipady = 0;
		pMCPane.add(mCButton13, mCBC13);
		
		
		mCButton14.setBackground(Color.GRAY);
		mCButton14.setName("+");
		mCButton14.setToolTipText("Addition");		
		mCButton14.addActionListener(this);
		mCButton14.setMnemonic(KeyEvent.VK_A);
		mCButton14.addKeyListener(this);				
		mCBC14.weightx = 0.05;
		mCBC14.weighty = 0.05;		
		mCBC14.gridheight = 1;
		mCBC14.gridwidth = 1;
		mCBC14.gridx = 3;
		mCBC14.gridy = 5;
		mCBC14.ipadx = 0;
		mCBC14.ipady = 0;
		pMCPane.add(mCButton14, mCBC14);
		

		mCButton15.setBackground(Color.GRAY);
		mCButton15.setName("0");
		mCButton15.setToolTipText("0");		
		mCButton15.addActionListener(this);
		mCButton15.setMnemonic(KeyEvent.VK_0);
		mCButton15.addKeyListener(this);
		mCBC15.weightx = 0.05;
		mCBC15.weighty = 0.05;		
		mCBC15.gridheight = 1;
		mCBC15.gridwidth = 1;
		mCBC15.gridx = 1;
		mCBC15.gridy = 5;		
		pMCPane.add(mCButton15, mCBC15);
		

		mCButton16.setBackground(Color.GRAY);
		mCButton16.setName("C");
		mCButton16.setToolTipText("Löschen");		
		mCButton16.addActionListener(this);
		mCButton16.setMnemonic(KeyEvent.VK_C);
		mCButton16.addKeyListener(this);		
		mCBC16.weightx = 0.05;
		mCBC16.weighty = 0.05;		
		mCBC16.gridheight = 1;
		mCBC16.gridwidth = 1;
		mCBC16.gridx = 0;
		mCBC16.gridy = 5;		
		pMCPane.add(mCButton16, mCBC16);
		
		
		mCButton17.setBackground(Color.GRAY);
		mCButton17.setName(",");
		mCButton17.setToolTipText("Komma");
		mCButton17.addActionListener(this);
		mCButton17.setMnemonic(KeyEvent.VK_K);
		mCButton17.addKeyListener(this);
		mCBC17.weightx = 0.05;
		mCBC17.weighty = 0.05;		
		mCBC17.gridheight = 1;
		mCBC17.gridwidth = 1;
		mCBC17.gridx = 0;
		mCBC17.gridy = 6;		
		mCBC17.ipadx = 4;
		mCBC17.ipady = 0;		
		pMCPane.add(mCButton17, mCBC17);
		
		
		mCButton18.setBackground(Color.GRAY);
		mCButton18.setName("^");
		mCButton18.setToolTipText("Exponent");
		mCButton18.addActionListener(this);
		mCButton18.setMnemonic(KeyEvent.VK_X);
		mCButton18.addKeyListener(this);				
		mCBC18.weightx = 0.05;
		mCBC18.weighty = 0.05;		
		mCBC18.gridheight = 1;
		mCBC18.gridwidth = 1;
		mCBC18.gridx = 1;
		mCBC18.gridy = 6;		
		mCBC18.ipadx = 0;
		mCBC18.ipady = 0;		
		pMCPane.add(mCButton18, mCBC18);
		
		
		mCButton19.setEnabled(false);
		mCButton19.setBackground(Color.GRAY);
		mCButton19.setName("x^y");
		mCButton19.setToolTipText("Exponentenberechnung");
		mCButton19.addActionListener(this);
		mCButton19.setMnemonic(KeyEvent.VK_E);
		mCButton19.addKeyListener(this);		
		mCBC19.weightx = 0.05;
		mCBC19.weighty = 0.05;		
		mCBC19.gridheight = 1;
		mCBC19.gridwidth = 1;
		mCBC19.gridx = 2;
		mCBC19.gridy = 6;		
		mCBC19.ipadx = 0;
		mCBC19.ipady = 0;		
		pMCPane.add(mCButton19, mCBC19);
		
		
		mCButton20.setBackground(Color.GRAY);
		mCButton20.setName("+/-");
		mCButton20.setToolTipText("Vorzeichenwechsel");
		mCButton20.addActionListener(this);
		mCButton20.setMnemonic(KeyEvent.VK_V);
		mCButton20.addKeyListener(this);		
		mCBC20.weightx = 0.05;
		mCBC20.weighty = 0.05;		
		mCBC20.gridheight = 1;
		mCBC20.gridwidth = 1;
		mCBC20.gridx = 3;
		mCBC20.gridy = 6;		
		mCBC20.ipadx = 0;
		mCBC20.ipady = 0;		
		pMCPane.add(mCButton20, mCBC20);
		
		
		mCLabel2.setEnabled(true);
		mCLabel2.setVisible(true);
		mCLabel2.setToolTipText("Copyrights@ML");
		mCLabel2.setText("Copyright: ML");		
		mCLC2.weightx = 0.05;
		mCLC2.weighty = 0.05;		
		mCLC2.gridheight = 1;
		mCLC2.gridwidth = 4;
		mCLC2.gridx = 0;
		mCLC2.gridy = 7;
		pMCPane.add(mCLabel2, mCLC2);	
		
	}	
	
	public JLabel getMCLabel(){
		return mCLabel;
	}
	
	public void myCalcGui(){
		JFrame mCFrame = new JFrame();		
		mCFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mCFrame.setTitle("Mein kleiner Rechner");
		mCFrame.setName("MainFrame");
		mCFrame.setPreferredSize(new Dimension(350, 350));
		mCFrame.setResizable(false);
		
		JMenuBar mCMBar = new JMenuBar();
		
		JMenu mCMenu = new JMenu("Datei");
		mCMenu.setMnemonic(KeyEvent.VK_D);
		mCMenu.getAccessibleContext().setAccessibleDescription("Dateisubmenue fuer dateirelevante Aspekte");
		mCMBar.add(mCMenu);
		
		JMenu mCInfoBar = new JMenu("Info");
		mCInfoBar.setMnemonic(KeyEvent.VK_I);
		mCInfoBar.getAccessibleContext().setAccessibleDescription("Aufruf der generellen Informationen bezogen auf Author und Programm!");
		mCMBar.add(mCInfoBar);
		
		CloseListener mCCloseListener = new CloseListener();
		mCFrame.addWindowListener(mCCloseListener);			
		
		ExitAction mCEA = new ExitAction();
		JMenuItem mCExitMenuItem = new JMenuItem(mCEA);
		mCExitMenuItem.setText("Beenden");
		mCExitMenuItem.setMnemonic(KeyEvent.VK_B);
		mCExitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		//mCExitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.));
		mCExitMenuItem.getAccessibleContext().setAccessibleDescription("Schließen des Fensters?");		
		mCMenu.add(mCExitMenuItem);
				
		
		//InfoWindow mCIW = new InfoWindow();
		JMenuItem mCInfoMenuItem = new JMenuItem();
		mCInfoMenuItem.setText("Infopanel");
		mCInfoMenuItem.setMnemonic(KeyEvent.VK_I);
		mCInfoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		mCInfoMenuItem.getAccessibleContext().setAccessibleDescription("Öffnen des Info Panels für weitere Informationen");
		mCInfoBar.add(mCInfoMenuItem);
		mCInfoMenuItem.addActionListener(new ActionListener(){
			@Override
		    public void actionPerformed(ActionEvent evt) {
		        new InfoWindow().setVisible(true);
		    }
		});
		
		mCFWV = new FormulaWindow();
		//mCFrame.add(mCFWV);
		
		/*InfoWindow mCIW = new InfoWindow();
		JMenuItem mCInfoMenuItem = new JMenuItem(mCIW);
		mCInfoMenuItem.setText("Info Panel öffnen");
		mCInfoMenuItem.setMnemonic(KeyEvent.VK_I);
		mCInfoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		mCInfoMenuItem.getAccessibleContext().setAccessibleDescription("Öffnen des Info Panels für weitere Informationen");
		mCInfoBar.add(mCInfoMenuItem);
		mCMenu.add(mCInfoMenuItem);*/
		
		setUpContentPane(mCFrame.getContentPane());
		mCFrame.setJMenuBar(mCMBar);
				
		mCFrame.pack();	
		mCFrame.setVisible(true);
	}	
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		//new MyCalcLogic();
		//final MyCalcLogic mCL = new MyCalcLogic();
	}
	
}