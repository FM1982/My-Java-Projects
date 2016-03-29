/*
 * MyCalc gui/InfoWindow 
 * Copyright MLuensmann
 */

package gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import mainfiles.MyCalc;

public class InfoWindow extends JDialog implements Icon {

	private JButton mCCloseButton;
	
	java.net.URL imageURL = MyCalc.class.getResource("images\new_corporate_design.png");
	
	public InfoWindow(){
		//super(parent);
		if(imageURL != null){
			ImageIcon mCIcon = new ImageIcon(imageURL);
		}
		getRootPane().setDefaultButton(mCCloseButton);
		myCalcInfoWindow();
	}		
	
	public void closeInfoWindow(){
		dispose();
	}
	
	private void myCalcInfoWindow(){
		JLabel mCImageLabel = new JLabel();
		JLabel mCTitleLabel = new JLabel();
		JLabel mCAuthorLabel = new JLabel();
		JLabel mCProgrammVersionLabel = new JLabel();
		JLabel mCProgrammInfoLabel = new JLabel();
		JFrame mCInfoFrame = new JFrame();
		mCCloseButton = new JButton();		
		
		mCInfoFrame.setDefaultCloseOperation(mCInfoFrame.DISPOSE_ON_CLOSE);
		mCInfoFrame.setFocusable(true);
		mCInfoFrame.setName("Das Info Panel");
		mCInfoFrame.setTitle("Info Panel");
		mCInfoFrame.setPreferredSize(new Dimension(250, 250));
		mCInfoFrame.setResizable(false);
		
		mCAuthorLabel.setText("Mario Luensmann");
		//mCInfoFrame.add(mCAuthorLabel);
		mCInfoFrame.add(mCImageLabel);
		
		mCInfoFrame.getContentPane();
		mCInfoFrame.pack();
		mCInfoFrame.setVisible(true);		
				
	}
	
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

}
