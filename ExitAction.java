/*
 * MyCalc mainfiles/ExitAction
 * Copyright MLuensmann
 */

package mainfiles;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;

public class ExitAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExitAction(){
		super("Exit");
		putValue(Action.MNEMONIC_KEY, new Integer(KeyEvent.VK_Q));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(Frame mCFrame : JFrame.getFrames()){
			if(mCFrame.isActive()){
				WindowEvent mCWindowClosing = new WindowEvent(mCFrame, WindowEvent.WINDOW_CLOSING);
				mCFrame.dispatchEvent(mCWindowClosing);
			}
		}		
	}

}
