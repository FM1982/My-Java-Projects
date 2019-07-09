/**
 * MyCalc logic/CloseListener
 * Copyright MLuensmann
 * 
 * @author Fox W. Mulder
 */

package logic;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class CloseListener extends WindowAdapter {
		
	private String mCMessage;
	private String mCTitle;
	private Action mCCloseAction;
	private boolean mCDisposeOnClose = false;
	
	public CloseListener(){
		mCMessage = "Sind Sie sicher das Sie das Fenster schließen wollen?";
		mCTitle = "Meinen kleinen Rechner schließen";		
	}
	
	public void setDisposeOnClose(boolean pMCDisposeOnClose){
		this.mCDisposeOnClose = pMCDisposeOnClose;
	}
		
	private boolean confirmWindowClosing(JFrame mCFrame){
		if(mCMessage == null){ 
			return true;					
		}
		int result = JOptionPane.showConfirmDialog(mCFrame, mCMessage, mCTitle, JOptionPane.YES_NO_OPTION);					
		return (result == JOptionPane.YES_OPTION) ? true : false;
	}
	
	@Override
	public void windowClosing(WindowEvent e){
		JFrame mCFrame = (JFrame) e.getComponent();
		if(!confirmWindowClosing(mCFrame)){
			mCFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			return;
		}
		if(mCDisposeOnClose){
			mCFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		}
		else
		{
			mCFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if (mCCloseAction != null)
		{
			ActionEvent mCAE = new ActionEvent(mCFrame, ActionEvent.ACTION_PERFORMED, "");
			mCCloseAction.actionPerformed(mCAE);
		}
	}
	
}