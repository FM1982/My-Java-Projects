/**
 * MyCalc gui/FormulaWindow 
 * Copyright MLuensmann
 * 
 * @author Fox W. Mulder
 */

package gui;

/*
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;*/


//import logic.MyCalcLogic;
//import java.awt.GridBagConstraints;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class FormulaWindow extends JPanel { //MainWindow 
	
	private static final long serialVersionUID = 2209103510159179179L;
	
	public JLabel mCFWL ;
	
	//private boolean RightToLeft = false;
		
	protected MainWindow mCMWV;
	
	public String mCFWName;

	public FormulaWindow() {
		//mCFWName = "Formelspeicher bereit";
		//super(null);	
		//this.mCMWV = pMCMWV;
		//pMCMWV.add(mCFWL);
		//super(null);
		myCalcFormulaWindow();
		//mCFWL.getComponents();
		//pMCL.getLayout().addLayoutComponent("Formelspeicher", mCFWL);
	}
	
	public String getMCFormulaWindowName(){
		return mCFWName;
	}
	
	/*public JLabel getMCFWLabel(){
		return mCFWL;
	}*/
	
	/*public void setUpContentPane(Container pMCMWV){
		if(RightToLeft){
			pMCMWV.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		
		//pMCMWV.getLayout().addLayoutComponent(getMCFormulaWindowName(), mCFWL);
		
		//pMCMWV.setLayout(new GridBagLayout());
		
		GridBagConstraints mCLC3 = new GridBagConstraints();
		
		mCFWL.addKeyListener(this.mCMWV);
		mCFWL.setName(getMCFormulaWindowName());
		mCFWL.setEnabled(true);
		mCFWL.setToolTipText(getMCFormulaWindowName());
		mCLC3.weightx = 0.1;
		mCLC3.weighty = 0.1;
		mCLC3.gridheight = 1;
		mCLC3.gridwidth = 4;
		mCLC3.gridx = 0;
		mCLC3.gridy = 0;
		pMCMWV.add(mCFWL, mCLC3);
		
	}*/
	
	public void myCalcFormulaWindow(){
		/*JPanel mCPanel = new JPanel();
		GridBagConstraints mCLC3 = new GridBagConstraints();
		
		
		mCPanel.addKeyListener(mCMWV);
		mCPanel.setName(getMCFormulaWindowName());
		mCPanel.setEnabled(true);
		mCPanel.setToolTipText(getMCFormulaWindowName());
		GridBagConstraints mCLC3 = new GridBagConstraints();
		mCLC3.weightx = 0.1;
		mCLC3.weighty = 0.1;
		mCLC3.gridheight = 1;
		mCLC3.gridwidth = 4;
		mCLC3.gridx = 0;
		mCLC3.gridy = 0;*/
		//mCFWL = new JLabel("Formelspeicher bereit");
		//mCPanel.add(mCFWL); getMCFormulaWindowName()
		//mCFWName = "Formelspeicher bereit";
		//mCFWL = new JLabel(getMCFormulaWindowName());
		//mCFWL.setToolTipText("Formelspeicher");
		//add(mCFWL);
		//mCFWName = "Formelspeicher bereit";
		//mCFWL.setToolTipText("Formelspeicher");
		//mCFWL = new JLabel(getMCFormulaWindowName()); //getMCFormulaWindowName();
		//mCFWName = "Formelspeicher bereit";
		mCFWL = new JLabel();
		mCFWL.setToolTipText("Formelspeicher");
		mCFWL.setEnabled(true);
		mCFWL.setVisible(true);
		add(mCFWL);
	}

}