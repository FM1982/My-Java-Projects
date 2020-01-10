/**
 * MyCalc gui/InfoWindow 
 * Copyright MLuensmann
 * 
 * @author Fox W. Mulder
 */

package gui;

//import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Container;
import java.awt.GridBagLayout;
//import java.awt.Graphics;

//import java.awt.image.BufferedImage;
//import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


//import javax.imageio.ImageIO;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

//import java.net.URL;

//import mainfiles.MyCalc;

public class InfoWindow extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private static final boolean LEFT_TO_RIGHT = false;
	
	DateFormat mCDF = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
	
	Date mCCD = Calendar.getInstance().getTime();
	
	private String mCRequestDate = mCDF.format(mCCD);

	//java.net.URL imgURL = InfoWindow.class.getResource("src/images/new_corporate_design.png");
	
	//int y = getIconHeight();
	//int x = getIconWidth();

	URL imageURL = InfoWindow.class.getResource("src/images/new_corporate_design.png");
	
	public InfoWindow(){
		//super(parent);
		if(imageURL != null){
			ImageIcon mCIcon = new ImageIcon(imageURL);
			//mCIcon.paintIcon(this.add(rootPane), mCIcon, 0, 0);
		}
		/*getRootPane().setDefaultButton(mCCloseButton);*/
		myCalcInfoWindow();
	}		
	
	/*public void closeInfoWindow(){
		dispose();
	}*/
	
	/*private int getIconHeight() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	private int getIconWidth() {
		// TODO Auto-generated method stub
		return 50;
	}*/
	
	private void myCalcInfoWindow(){
		
		String mCAuthorText = "Mario Luensmann <br/> Copyright: ML";
		
		ImageIcon mCImageLabel = mCLNCD();
		
		/*JLabel mCImageLabel = new JLabel("ML Copyright", mCImIcon, JLabel.HEIGHT);
		mCImageLabel.setIcon(mCImIcon);
		mCImIcon.getIconHeight();
		mCImIcon.getIconWidth();*/
		//mCImageLabel.getIconHeight();
		//mCImageLabel.getIconWidth();
		
		JLabel mCIconLabel = new JLabel(mCImageLabel);
		mCIconLabel.setIcon(mCImageLabel);
		JLabel mCAuthorLabel = new JLabel("<html>Datum und Systemzeit: <br/>" + "<br/>" + mCRequestDate + "<br/>" + "<br/>" + "Zusätzliche Informationen: <br/>" + "<br/>" + mCAuthorText + "</html>");
		//JLabel mCProgrammVersionLabel = new JLabel();
		//JLabel mCProgrammInfoLabel = new JLabel();
		JFrame mCInfoFrame = new JFrame();
		//mCCloseButton = new JButton();
		
		mCInfoFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		mCInfoFrame.setFocusable(true);
		mCInfoFrame.setName("Das Info Panel");
		mCInfoFrame.setTitle("Info Panel");
		mCInfoFrame.setPreferredSize(new Dimension(300, 175));
		mCInfoFrame.setResizable(false);
		
		//mCAuthorLabel.setText(mCRequestDate + mCAuthorText);
		mCInfoFrame.add(mCIconLabel);
		mCInfoFrame.add(mCAuthorLabel);
		
		setUpContentPane(mCInfoFrame.getContentPane());
		//mCInfoFrame.getContentPane();
		mCInfoFrame.pack();
		mCInfoFrame.setVisible(true);			
	}
	
	private ImageIcon mCLNCD(){
		ImageIcon mCImIcon = new ImageIcon("src/images/new_corporate_design.png", "ML Copyright Icon");
		Image mCIcon = mCImIcon.getImage();
		Image mCImageIc = mCIcon.getScaledInstance(130, 130, java.awt.Image.SCALE_SMOOTH);
		mCImIcon = new ImageIcon(mCImageIc);
		return mCImIcon;
	}
	
	private void setUpContentPane(Container pMCCPC){
		if(LEFT_TO_RIGHT){
			pMCCPC.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		}
		pMCCPC.setLayout(new GridBagLayout());
	}
	
	/*@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void paintIcon(Component pMCInfoFrame, Graphics pMCImIcon, int pX, int pY) {
		// TODO Auto-generated method stub
		super.paint(pMCImIcon);
		
		pMCImIcon.
	}*/

}