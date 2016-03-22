package logic;

import gui.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyCalcLogic extends MainWindow implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mCValues; 
	
	private String mCOperator;
	
	private String mCExponentFunction;
	
	private String mCBoth; 
	
	private String mCSum;
	
	private String mCExponentResultDouble;
	
	private String mCExponentResultInt;
	
	private String mCBaseIntValue;
	
	private String mCBaseDoubleValue;
	
	private String mCSign= "-";
	
	private String mCValueString;
	
	private Integer mCNegativeInteger;
	
	private Integer mCFirstIntValue;
	
	private Integer mCSecondIntValue;

	private double mCFirstDoubleValue;
	
	private double mCSecondDoubleValue;
	
	private double mCNegativeDouble;
	
	private double mCValueCheck;	
		
	private boolean mCCommata = false;
	
	private boolean mCCheckValue = false;
	
	private boolean mCExponentCheck = false;
	
	private boolean mCRestartAction = false;
	
	private boolean mCModulo = true;
	
	private boolean mCDoubleToInt = false;
	
	private boolean mCIsNegativeNumber = false;
	
	private boolean mCIsNegativeNumberInt = false;
	
	private boolean mCIsNegativeNumberDouble = false;
		
	public MyCalcLogic(){
		super();
		//setMCDisplayLabel("Rechner bereit!");
	}	
	
	private void setMCDisplayLabel(String mCS){
		mCLabel.setText(mCS);
	}
	
	private String getMCDisplayLabel(){
		return mCLabel.getText();
	}
	
	/*
	 * Logic for MyCalc overrides actionPerformed(ActionEvent e) 
	 * Method in MainWindow.java 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {		
				
		String mCCommand = e.getActionCommand();
		
		/*
		 * Number types alias the gui numbers for representation
		 * and calculation
		 */
		
		if (mCCommand.equals(mCButton1.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton1.getText());
		}
		if (mCCommand.equals(mCButton2.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton2.getText());
		}
		if (mCCommand.equals(mCButton3.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton3.getText());
		}
		if (e.getSource() == mCButton17) {
			mCValues = getMCDisplayLabel();
			mCCommata = true;
			mCExponentCheck = true;
			setMCDisplayLabel(mCValues + mCButton17.getText());
		}
		if (mCCommand.equals(mCButton5.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton5.getText());
		}
		if (mCCommand.equals(mCButton6.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton6.getText());
		}
		if (mCCommand.equals(mCButton7.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton7.getText());
		}
		if (mCCommand.equals(mCButton9.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton9.getText());
		}
		if (mCCommand.equals(mCButton10.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton10.getText());
		}
		if (mCCommand.equals(mCButton11.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton11.getText());
		}
		if (mCCommand.equals(mCButton15.getText())) {
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton15.getText());
		}
		
		if(mCCommand.equals(mCButton20.getText())){
			mCValues = getMCDisplayLabel();
			if (mCIsNegativeNumber == true) {
				if (mCIsNegativeNumberInt == true
						&& mCIsNegativeNumberDouble == false) {
					mCFirstIntValue = Integer.valueOf(mCValues);
					mCNegativeInteger = mCFirstIntValue * -1;
					mCFirstIntValue = 0;
					mCValues = String.valueOf(mCNegativeInteger);
					setMCDisplayLabel(mCValues);
				} else {
					mCFirstDoubleValue = Double.valueOf(mCValues);
					mCNegativeDouble = mCFirstDoubleValue * -1;
					mCFirstDoubleValue = 0;
					mCValues = String.valueOf(mCNegativeDouble);
					setMCDisplayLabel(mCValues);
				}
			} else {
				setMCDisplayLabel(mCSign + mCValues);
			}
		}
		
		//Calculation types including exponential functions
		
		if (mCCommand.equals(mCButton14.getText())) {
			mCOperator = mCButton14.getText();
			if (mCRestartAction == true) {
				mCSum = getMCDisplayLabel();
			} else {
				mCBoth = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
		}

		if (mCCommand.equals(mCButton12.getText())) {
			mCOperator = mCButton12.getText();
			if (mCRestartAction == true) {
				mCSum = getMCDisplayLabel();
			} else {
				mCBoth = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
		}

		if (mCCommand.equals(mCButton4.getText())) {
			mCOperator = mCButton4.getText();
			if (mCRestartAction == true) {
				mCSum = getMCDisplayLabel();
			} else {
				mCBoth = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
		}

		if (mCCommand.equals(mCButton8.getText())) {
			mCOperator = mCButton8.getText();
			if (mCRestartAction == true) {
				mCSum = getMCDisplayLabel();
			} else {
				mCBoth = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
		}

		if (mCCommand.equals(mCButton18.getText())) {
			mCExponentFunction = mCButton18.getText();
			if (mCExponentCheck == true) {
				mCBaseDoubleValue = getMCDisplayLabel();
			} else {
				mCBaseIntValue = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
		}				
				
		//Extra step for exponential functions
		
		if (mCCommand.equals(mCButton19.getText())) {
			if (mCExponentFunction == "^"
					&& (mCCommata == true || mCCheckValue == true)) {
				if (mCExponentCheck == false) {
					int mCResult;
					int mCBase = Integer.parseInt(mCBaseIntValue);
					int mCExp = Integer.parseInt(getMCDisplayLabel());
					mCResult = (int) Math.pow(mCBase, mCExp);
					mCExponentResultInt = String.valueOf(mCResult);
				} else {
					double mCResult;
					double mCBase = Double.parseDouble(mCBaseDoubleValue);
					double mCExp = Double.parseDouble(getMCDisplayLabel());
					mCResult = Math.pow(mCBase, mCExp);
					if ((mCResult % 1) == 0) {
						mCDoubleToInt = true;
						mCSum = Double.toString(mCResult);
						mCExponentResultInt = mCSum.substring(0,
								mCSum.indexOf("."));
					} else {
						mCDoubleToInt = false;
						mCExponentResultDouble = Double.toString(mCResult);
					}
					if (mCDoubleToInt == true) {
						mCCheckValue = false;
						mCExponentCheck = false;
						setMCDisplayLabel(mCExponentResultInt);
					} else {
						mCExponentCheck = true;
						setMCDisplayLabel(mCExponentResultDouble);
					}
					// mCExponentResult = String.valueOf(mCResult);
				}
				// mCExponentResult = String.valueOf(mCResult);
				// setMCDisplayLabel(mCExponentResult);
			}
			if (mCExponentFunction == "^" && mCCommata == false
					&& mCCheckValue == false) {
				int mCResult;
				int mCBase = Integer.parseInt(mCBaseIntValue);
				int mCExp = Integer.parseInt(getMCDisplayLabel());
				mCResult = (int) Math.pow(mCBase, mCExp);
				mCExponentResultInt = String.valueOf(mCResult);
				setMCDisplayLabel(mCExponentResultInt);
			}
		}
		/* 
		 * Result of calculations after number and 
		 * calculation type has been considered
		 */
		
		if (mCCommand.equals(mCButton13.getText())) {

			if (mCOperator == "+"
					&& (mCCommata == true || mCCheckValue == true)) {
				if (mCRestartAction == true) {
					mCFirstDoubleValue = Double.valueOf(mCSum);
				} else {
					mCFirstDoubleValue = Double.valueOf(mCBoth);
				}
				mCSecondDoubleValue = Double.valueOf(getMCDisplayLabel());
				mCValueCheck = mCFirstDoubleValue + mCSecondDoubleValue;
				if ((mCValueCheck % 1) == 0) {
					mCDoubleToInt = true;
					mCSum = Double.toString(mCValueCheck);
					mCValueString = mCSum.substring(0, mCSum.indexOf("."));
				} else {
					mCDoubleToInt = false;
					mCSum = Double.toString(mCValueCheck);
				}
				if (mCDoubleToInt == true) {
					mCCheckValue = false;
					mCExponentCheck = false;
					setMCDisplayLabel(mCValueString);
				} else {
					mCExponentCheck = true;
					setMCDisplayLabel(mCSum);
				}
				mCRestartAction = true;
			}

			if (mCOperator == "+" && mCCommata == false
					&& mCCheckValue == false) {
				if (mCRestartAction == true) {
					mCFirstIntValue = Integer.parseInt(mCSum);
				} else {
					mCFirstIntValue = Integer.parseInt(mCBoth);
				}
				mCSecondIntValue = Integer.parseInt(getMCDisplayLabel());
				mCSum = Integer.toString(mCFirstIntValue + mCSecondIntValue);
				setMCDisplayLabel(mCSum);
				mCRestartAction = true;
			}

			if (mCOperator == "-"
					&& (mCCommata == true || mCCheckValue == true)) {
				if (mCRestartAction == true) {
					mCFirstDoubleValue = Double.valueOf(mCSum);
				} else {
					mCFirstDoubleValue = Double.valueOf(mCBoth);
				}
				mCSecondDoubleValue = Double.valueOf(getMCDisplayLabel());
				mCValueCheck = mCFirstDoubleValue - mCSecondDoubleValue;
				if (mCFirstDoubleValue < mCSecondDoubleValue) {
					mCIsNegativeNumberDouble = true;
					mCIsNegativeNumber = true;
				} else {
					mCIsNegativeNumberDouble = false;
					mCIsNegativeNumber = false;
				}
				if ((mCValueCheck % 1) == 0) {
					mCDoubleToInt = true;
					mCSum = Double.toString(mCValueCheck);
					mCValueString = mCSum.substring(0, mCSum.indexOf("."));
				} else {
					mCDoubleToInt = false;
					mCSum = Double.toString(mCValueCheck);
				}
				if (mCDoubleToInt == true) {
					mCCheckValue = false;
					mCExponentCheck = false;
					setMCDisplayLabel(mCValueString);
				} else {
					mCExponentCheck = true;
					setMCDisplayLabel(mCSum);
				}
				mCRestartAction = true;
			}

			if (mCOperator == "-" && mCCommata == false
					&& mCCheckValue == false) {
				if (mCRestartAction == true) {
					mCFirstIntValue = Integer.parseInt(mCSum);
				} else {
					mCFirstIntValue = Integer.parseInt(mCBoth);
				}
				mCSecondIntValue = Integer.parseInt(getMCDisplayLabel());
				if (mCFirstIntValue < mCSecondIntValue) {
					mCIsNegativeNumberInt = true;
					mCIsNegativeNumber = true;
				} else {
					mCIsNegativeNumberInt = false;
					mCIsNegativeNumber = false;
				}
				mCSum = Integer.toString(mCFirstIntValue - mCSecondIntValue);
				setMCDisplayLabel(mCSum);
				mCRestartAction = true;
			}
			/*
			 * Try Catch block for divisions by zero (double) which 
			 * are mathematically wrong
			 */
			try {
				if (mCOperator == "/"
						&& (mCCommata == true || mCCheckValue == true)) {
					if (mCRestartAction == true) {
						mCFirstDoubleValue = Double.valueOf(mCSum);
					} else {
						mCFirstDoubleValue = Double.valueOf(mCBoth);
					}
					mCSecondDoubleValue = Double.valueOf(getMCDisplayLabel());
					mCValueCheck = mCFirstDoubleValue / mCSecondDoubleValue;
					if ((mCValueCheck % 1) == 0) {
						mCDoubleToInt = true;
						mCSum = Double.toString(mCValueCheck);
						mCValueString = mCSum.substring(0, mCSum.indexOf("."));
					} else {
						mCDoubleToInt = false;
						mCSum = Double.toString(mCValueCheck);
					}
					if (mCDoubleToInt == true) {
						mCCheckValue = false;
						mCExponentCheck = false;
						setMCDisplayLabel(mCValueString);
					} else {
						mCExponentCheck = true;
						setMCDisplayLabel(mCSum);
					}
					mCRestartAction = true;
				}
			} catch (Exception exc) {
				exc = new Exception("Teilen mit 0 nicht möglich!");
				setMCDisplayLabel(exc.getLocalizedMessage());
			}
			/*
			 * Try Catch block for divisions by zero (full Integer) which are
			 * mathematically wrong
			 */
			try {
				if (mCOperator == "/" && mCCommata == false
						&& mCCheckValue == false) {
					if (mCRestartAction == true) {
						mCFirstIntValue = Integer.parseInt(mCSum);
					} else {
						mCFirstIntValue = Integer.parseInt(mCBoth);
					}
					mCSecondIntValue = Integer.parseInt(getMCDisplayLabel());
					/*
					 *  Check whether the numerator (first value) is 
					 *  a full integer number
					 */
					if ((mCFirstIntValue % mCSecondIntValue) == 0) {
						mCModulo = true;
					} else {
						mCModulo = false;
					}
					/*
					 * Check whether the numerator is smaller then 
					 * the denominator or whether the boolean value 
					 * "mCModulo" is false 
					 */
					if (mCFirstIntValue < mCSecondIntValue || mCModulo == false) {
						if (mCRestartAction == true) {
							mCSum = Integer.toString(mCFirstIntValue);
							mCFirstDoubleValue = Double.valueOf(mCSum);
						} else {
							mCBoth = Integer.toString(mCFirstIntValue);
							mCFirstDoubleValue = Double.valueOf(mCBoth);
						}
						mCSecondDoubleValue = Double
								.valueOf(getMCDisplayLabel());
						mCSum = Double.toString(mCFirstDoubleValue
								/ mCSecondDoubleValue);
						/*
						 * Check whether the value is a double 
						 * result value so that the corresponding 
						 * calculus is done by the corresponding 
						 * double calculation methods (ifs)
						 */
						mCCheckValue = true;
						mCExponentCheck = true;
					} else {
						mCSum = Integer.toString(mCFirstIntValue
								/ mCSecondIntValue);
						mCCheckValue = false;
						mCExponentCheck = false;
					}
					setMCDisplayLabel(mCSum);
					mCRestartAction = true;
				}
			} catch (Exception exc) {
				exc = new Exception("Teilen mit 0 nicht möglich!");
				setMCDisplayLabel(exc.getLocalizedMessage());
			}
			if (mCOperator == "*"
					&& (mCCommata == true || mCCheckValue == true)) {
				if (mCRestartAction == true) {
					mCFirstDoubleValue = Double.valueOf(mCSum);
				} else {
					mCFirstDoubleValue = Double.valueOf(mCBoth);
				}
				mCSecondDoubleValue = Double.valueOf(getMCDisplayLabel());
				mCValueCheck = mCFirstDoubleValue * mCSecondDoubleValue;
				if ((mCValueCheck % 1) == 0) {
					mCDoubleToInt = true;
					mCSum = Double.toString(mCValueCheck);
					mCValueString = mCSum.substring(0, mCSum.indexOf("."));
				} else {
					mCDoubleToInt = false;
					mCSum = Double.toString(mCValueCheck);
				}
				if (mCDoubleToInt == true) {
					mCCheckValue = false;
					mCExponentCheck = false;
					setMCDisplayLabel(mCValueString);
				} else {
					mCExponentCheck = true;
					setMCDisplayLabel(mCSum);
				}
				mCRestartAction = true;
			}
			if (mCOperator == "*" && mCCommata == false
					&& mCCheckValue == false) {
				if (mCRestartAction == true) {
					mCFirstIntValue = Integer.parseInt(mCSum);
				} else {
					mCFirstIntValue = Integer.parseInt(mCBoth);
				}
				mCSecondIntValue = Integer.parseInt(getMCDisplayLabel());
				mCSum = Integer.toString(mCFirstIntValue * mCSecondIntValue);
				setMCDisplayLabel(mCSum);
				mCRestartAction = true;
			}
		}
				
		//Blank input after calculation is finished
		
		if (mCCommand.equals(mCButton16.getText())) {
			setMCDisplayLabel("");
			mCBoth = "";
			mCSum = "";
			mCValueString = "";
			mCBaseIntValue = "";
			mCBaseDoubleValue = "";
			mCValueString = "";
			mCExponentFunction = "";
			mCExponentResultInt = "";
			mCExponentResultDouble = "";
			mCFirstIntValue = 0;
			mCSecondIntValue = 0;
			mCNegativeInteger = 0;
			mCFirstDoubleValue = 0.0;
			mCSecondDoubleValue = 0.0;
			mCNegativeDouble = 0.0;
			mCValueCheck = 0.0;
			mCCommata = false;
			mCCheckValue = false;
			mCExponentCheck = false;
			mCRestartAction = false;
			mCModulo = true;
			mCDoubleToInt = false;
			mCIsNegativeNumber = false;
			mCIsNegativeNumberInt = false;
			mCIsNegativeNumberDouble = false;
			// setMCDisplayLabel("Gelöscht! Rechner bereit!");
		}		
	}
	
}
