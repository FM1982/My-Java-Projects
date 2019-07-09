/**
 * MyCalc logic/MyCalcLogic
 * Copyright MLuensmann
 * 
 * @author Fox W. Mulder
 */

package logic;

import gui.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import misc.MyCalculatorNumbers;

public class MyCalcLogic extends MainWindow implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private String mCNullValue = "";

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
	
	private String mCFormulaWindowValues;
	
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
	
	private boolean mCNotHasOperator = false;
	
	private boolean mCIsNegativeNumber = false;
	
	private boolean mCIsNegativeNumberInt = false;
	
	private boolean mCIsNegativeNumberDouble = false;
	
	/**
	 * This String arraylist for typesafetinest is made to store the values that have been put
	 * into the calculation until the "=" button is pressed at which point the list should be
	 * emptied. At least thats the plan, but it still needs to be implemented! It works just the
	 * rest of the list needs to follow!
	 */
		
	ArrayList<String> mCMCLAL = new ArrayList<String>();
	
	LinkedList<String> mCFWSE = new LinkedList<String>();
		
	MyCalculatorNumbers mCEN;
	
	//public FormulaWindow mCFW;
	
	/**
	 * The Constructor for the my Calculator Logic class.
	 */
	
	public MyCalcLogic(){
		super(null);
		if(mCLabel.isShowing()){
			setMCDisplayLabel("Rechner initialisiert!");
		}
		if(mCFWV.mCFWL.isShowing()){
			setMCFWDisplayLabel("Formelspeicher bereit");
		}
	}
		
	//public MyCalcLogic mCMCL;
	
	/**
	 * A Setter for the my Calculator Label that is used as a JComponent embedded in the JFrame 
	 * in order for setting certain values in the diverse methods seen above.
	 * @param mCS
	 */
	
	private void setMCDisplayLabel(String mCS){
		mCLabel.setText(mCS); // mCS == my calculator String
	}
	
	/**
	 * A Setter for the my Calculator Formula Window Label that is used as a JComponent embedded
	 * in the feature class FormulaWindow.java for implementing a preview of mathematical equations
	 * in order for setting certain values in the diverse methods that will follow. 
	 * @param mCFWS
	 */
	
	private void setMCFWDisplayLabel(String mCFWS){
		mCFWV.mCFWL.setText(mCFWS); // mCFWS == my calculator Formula Window String
	}
	
	/**
	 * A Setter for the my Calculator Formula Window Label, that is used for testing purposes when
	 * the value needs to be returned as a direct string.
	 * @param mCFWS
	 * @return
	 */
	
	/*private String setMCFWValues(String mCFWS){
		return mCFWV.mCFWName.toString();
	}*/
	
	/**
	 * A Setter for setting the ArrayList that is typesafe with the String datatype to not only
	 * iterate through the list but also add a value at the list at the very end of the list.
	 * @param pMCLE
	 */
	
	private ArrayList<String> setMCLE(String pMCLE){//(ArrayList<String> pMCLE){
		String mCALE = pMCLE;//getMCFWDisplayLabel(); // mCALE == my Calculator Array List Element
		mCMCLAL.add(mCALE);
		String mCLALE = mCMCLAL.get(mCMCLAL.size() - 1);
		mCMCLAL.clear();
		mCMCLAL.add(mCLALE);
		//mCMCLAL = pMCLE; // pMCLE == parameter my Calculator Last Element
		/*for(int mCIOAL = 0; mCIOAL < mCMCLAL.size(); mCIOAL++){ // mCIOAL == my calculator Index of Array List
			//mCMCLAL.add(mCIOAL, mCALE);
			mCMCLAL.add(mCALE);
		}
		for(String mCStr : mCMCLAL){
			mCMCLAL.add(mCALE);
		}*/
		System.out.println("current saved Strings: " + mCMCLAL);
		return mCMCLAL;
	}
	
	/**
	 * A Setter to set all the List items from the String lists with typesafetinest, in order to 
	 * structure it for the Formula Window and to allow the Formula Window to show them in 
	 * structured and ordered form of the arrival of each element in the order they came in.
	 * @param pMCLLE
	 * @return
	 */
	
	private LinkedList<String> setMCLLE(ArrayList<String> pMCLLE){
		mCFWSE.addAll(mCMCLAL);
		
		System.out.println("List of Strings: " + mCFWSE);
		
		return mCFWSE;
	}
	
	/**
	 * This method is still not implemented! Originally meant as a complex getter for
	 * getting the last element in the current LinkedList as a typesafe String List in order
	 * to return the last item of it! In other words TODO!
	 * @param pMCALLI
	 * @return
	 */
	
	private String getMCALLI(LinkedList<String> pMCALLI){
		String mCACLLI = "";
		
		for(String mCACLLIS: pMCALLI){
			for (int i = 0; i < pMCALLI.size(); i++){
				mCACLLI = pMCALLI.get(i);//mCACLLIS.concat(mCACLLIS);
			}
			System.out.println("values: " + mCACLLI);
		}
		
		return mCACLLI;
	}
	
	private LinkedList<String> getMCLLE(){
		return mCFWSE;
	}
	
	/*private String getMCALLI(){
		LinkedList<String> mCLL = mCFWSE;
		String mCLLI;
		for(int i = 0; i < mCLL.size(); i++){
			mCLLI = mCLL.element();
			System.out.print(mCLLI);
			return mCLLI;
		}
		return null;
	}*/
	
	/**
	 * A Getter for getting values from the my Calculator Label that is used as a JComponent 
	 * embedded in the JFrame in order for getting certain values the input user clicks on 
	 * keyboard or uses the JButtons for.
	 * @return
	 */
	
	private String getMCDisplayLabel(){
		return mCLabel.getText();
	}
	
	/**
	 * A Getter for getting values from the my Calculator Formula Window Label that is used as a 
	 * JComponent embedded in the in the feature class FormulaWindow.java for implementing a preview 7
	 * of mathematical equations in order for getting certain values the input user clicks on 
	 * keyboard and needs to be extracted from the actual equations label.
	 * @return
	 */
	
	private String getMCFWDisplayLabel(){
		return mCFWV.mCFWL.getText();
	}
	
	/**
	 * A getter that returns the last String element in the typesafe ArrayList that contains only Strings,
	 * which are only of type String and contain the concatenated String elements of the last addition of
	 * Strings for the display of the Formula Window feature.
	 * @param pMCALS
	 * @return
	 */
	
	/*private String getMCLLE(ArrayList<String> pMCALS){
		//String mCLIOAL;
		for(int i = 0; i < pMCALS.size(); i++){
			mCMCLAL = pMCALS;
		}
		return mCMCLAL.toString();
	}*/
	
	/**
	 * A private method within the My Calculator Logic class that decides whether a Number
	 * that is as of type primitive int is either a negative Number or not and returns the result
	 * in form of a boolean called mCDNNI. This is to prevent the sign change from chaining 
	 * repeatedly after the same number.
	 * @param pMCVal1
	 * @return
	 */
	
	private boolean decideNegativeNumberInt(int pMCVal1){
		boolean mCDNNI = false; // my calculator Decide Negative Number Int
		if (pMCVal1 < 0){
			mCDNNI = true;
			mCIsNegativeNumber = true;
			mCIsNegativeNumberInt = true;
		}
		if (pMCVal1 > 0){
			mCDNNI = false;
			mCIsNegativeNumber = false;
			mCIsNegativeNumberInt = false;
		}
		return mCDNNI;
	}
	
	/**
	 * A private method within the My Calculator Logic class that decides whether a Number
	 * that is as of type primitive double is either a negative Number or not and returns the 
	 * result in form of a boolean called mCDNNI. This is to prevent the sign change from 
	 * chaining repeatedly after the same number. This time around its so to say just for decimal
	 * seperated values.
	 * @param pMCVal2
	 * @return
	 */
	
	private boolean decideNegativeNumberDouble(double pMCVal2){
		boolean mCDNND = false; // my calculator Decide Negative Number Double
		if (pMCVal2 < 0){
			mCDNND = true;
			mCIsNegativeNumber = true;
			mCIsNegativeNumberDouble = true;
		}
		if (pMCVal2 > 0){
			mCDNND = false;
			mCIsNegativeNumber = false;
			mCIsNegativeNumberDouble = false;
		}
		return mCDNND;
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
		
		//Number 7
		if (mCCommand.equals(mCButton1.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				//setMCFWDisplayLabel(mCValues + mCButton1.getText());
			}
			/*if(getMCFWDisplayLhabel().contentEquals("" + "+")){
				mCFormulaWindowValues = getMCFWDisplayLabel();
				setMCLE(mCFormulaWindowValues + mCButton1.getText());
				setMCFWDisplayLabel(mCFormulaWindowValues + mCButton
				1.getText());
			}*/
			mCValues = getMCDisplayLabel();
			mCMCLAL = setMCLE(mCValues + mCButton1.getText()); //hier setzen wir den aktuellen Wert in die ArrayList
			setMCDisplayLabel(mCValues + mCButton1.getText());
			setMCFWDisplayLabel(mCValues + mCButton1.getText());
			//setMCFWDisplayLabel(mCMCLAL + mCValues + mCButton1.getText());
			//setMCLLE(mCMCLAL);
			/*if(mCCommand.equals(mCButton4.getText()) || mCCommand.equals(mCButton8.getText()) || mCCommand.equals(mCButton12.getText()) || mCCommand.equals(mCButton14.getText())){
				setMCLLE(mCMCLAL);
			}*/
			/*if(!mCCommand.equals(mCButton1.getText())){
				setMCLLE(setMCLE(mCValues + mCButton1.getText()));
			}*/
			//mCFormulaWindowValues = setMCFWValues(mCValues + mCButton1.getText());
		}
		
		//Number 8
		if (mCCommand.equals(mCButton2.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				//setMCFWDisplayLabel(mCValues + mCButton2.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton2.getText());
			setMCFWDisplayLabel(mCValues + mCButton2.getText());
			setMCLE(mCValues + mCButton2.getText());
			/*setMCDisplayLabel(mCValues + mCButton2.getText());
			setMCFWDisplayLabel(mCValues + mCButton2.getText());
			setMCLE(mCValues + mCButton2.getText());*/
		}
		
		//Number 9
		if (mCCommand.equals(mCButton3.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				//setMCFWDisplayLabel(mCValues + mCButton3.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton3.getText());
			setMCFWDisplayLabel(mCValues + mCButton3.getText());
			setMCLE(mCValues + mCButton3.getText());
			/*setMCDisplayLabel(mCValues + mCButton3.getText());
			setMCFWDisplayLabel(mCValues + mCButton3.getText());*/
		}
		
		//Value dot == .
		if (e.getSource() == mCButton17) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				//setMCFWDisplayLabel(mCValues + mCButton3.getText());
			}
			mCValues = getMCDisplayLabel();
			mCCommata = true;
			mCExponentCheck = true;
			setMCDisplayLabel(mCValues.replace(".", "") + mCButton17.getText());
			setMCFWDisplayLabel(mCValues.replace(".", "") + mCButton17.getText());
			//setMCDisplayLabel(mCValues + mCButton17.getText());
			if(e.getSource() == mCButton17 && mCValues.contains(".")){
				setMCDisplayLabel(mCValues);
			}
		}
		
		//Number 4
		if (mCCommand.equals(mCButton5.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				setMCFWDisplayLabel(mCValues + mCButton5.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton5.getText());
			setMCFWDisplayLabel(mCValues + mCButton5.getText());
			setMCLE(mCValues + mCButton5.getText());
			/*setMCDisplayLabel(mCValues + mCButton5.getText());*/
		}
		
		//Number 5
		if (mCCommand.equals(mCButton6.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				setMCFWDisplayLabel(mCValues + mCButton6.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton6.getText());
			setMCFWDisplayLabel(mCValues + mCButton6.getText());
			setMCLE(mCValues + mCButton6.getText());
			/*setMCDisplayLabel(mCValues + mCButton6.getText());*/
		}
		
		//Number 6
		if (mCCommand.equals(mCButton7.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				setMCFWDisplayLabel(mCValues + mCButton7.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton7.getText());
			setMCFWDisplayLabel(mCValues + mCButton7.getText());
			setMCLE(mCValues + mCButton7.getText());
			/*setMCDisplayLabel(mCValues + mCButton7.getText());*/
		}
		
		//Number 1
		if (mCCommand.equals(mCButton9.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				setMCFWDisplayLabel(mCValues + mCButton9.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton9.getText());
			setMCFWDisplayLabel(mCValues + mCButton9.getText());
			setMCLE(mCValues + mCButton9.getText());
			
			/*setMCDisplayLabel(mCValues + mCButton9.getText());*/
		}
		
		//Number 2
		if (mCCommand.equals(mCButton10.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				setMCFWDisplayLabel(mCValues + mCButton10.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton10.getText());
			setMCFWDisplayLabel(mCValues + mCButton10.getText());
			setMCLE(mCValues + mCButton10.getText());
			/*setMCDisplayLabel(mCValues + mCButton10.getText());*/
		}
		
		//Number 3
		if (mCCommand.equals(mCButton11.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				setMCFWDisplayLabel(mCValues + mCButton11.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton11.getText());
			setMCFWDisplayLabel(mCValues + mCButton11.getText());
			setMCLE(mCValues + mCButton11.getText());
			/*setMCDisplayLabel(mCValues + mCButton11.getText());*/
		}
		
		//Number 0
		if (mCCommand.equals(mCButton15.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			if(mCFWV.mCFWL.getText().matches("Formelspeicher bereit")){
				setMCFWDisplayLabel("");
				mCValues = getMCFWDisplayLabel();
				setMCFWDisplayLabel(mCValues + mCButton15.getText());
			}
			mCValues = getMCDisplayLabel();
			setMCDisplayLabel(mCValues + mCButton15.getText());
			setMCFWDisplayLabel(mCValues + mCButton15.getText());
			setMCLE(mCValues + mCButton15.getText());
			/*setMCDisplayLabel(mCValues + mCButton15.getText());*/
		}
		
		//Value sign change
		if(mCCommand.equals(mCButton20.getText())){
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			mCValues = getMCDisplayLabel();
			String mCStrVal = "" + "." + "";
			if (mCValues.contains(mCStrVal)){
				if (decideNegativeNumberDouble(Double.valueOf(mCValues)) == false) {
					setMCDisplayLabel(mCSign + mCValues);
				}
				else if(decideNegativeNumberDouble(Double.valueOf(mCValues))  == true) {
					double mCVar2 = 0;
					mCNegativeDouble = Double.valueOf(mCValues);
					mCVar2 = mCNegativeDouble * -1;
					mCValues = String.valueOf(mCVar2);
					setMCDisplayLabel(mCValues);
				}
			}
			else{
				if (decideNegativeNumberInt(Integer.valueOf(mCValues)) == false) {
					setMCDisplayLabel(mCSign + mCValues);
				}
				else if(decideNegativeNumberInt(Integer.valueOf(mCValues))  == true) {
					int mCVar1 = 0;
					mCNegativeInteger = Integer.valueOf(mCValues);
					mCVar1 = mCNegativeInteger * -1;
					mCValues = String.valueOf(mCVar1);
					setMCDisplayLabel(mCValues);
				}
			}
			
			/*
			 * Fehlerhafter Code - Beschreibung:
			 * Diese Funktionalität ist nicht ausgiebig getestet, das heißt hier wird nicht 
			 * berücksichtigt, dass wenn eine Zahl bereits Negativ ist nicht noch einmal der 
			 * Vorzeichenwechsel ein weiteres Minus "-" hinzuaddiert sondern, wieder 
			 * in den Originalzustand zurückgeht!
			 */
			
			/*
			if (mCIsNegativeNumber == true) {
				if (mCIsNegativeNumberInt == true
						&& mCIsNegativeNumberDouble == false) {
					mCFirstIntValue = Integer.valueOf(mCValues);
					mCNegativeInteger = mCFirstIntValue * -1;
					mCFirstIntValue = 0;
					mCValues = String.valueOf(mCNegativeInteger);
					setMCDisplayLabel(mCValues);
				} else if (mCIsNegativeNumberInt == false
						&& mCIsNegativeNumberDouble == true) {
					mCFirstDoubleValue = Double.valueOf(mCValues);
					mCNegativeDouble = mCFirstDoubleValue * -1;
					mCFirstDoubleValue = 0;
					mCValues = String.valueOf(mCNegativeDouble);
					setMCDisplayLabel(mCValues);
				}
			}*/
			
		}
		
		//Calculation types including exponential functions
		
		//Operator addition
		if (mCCommand.equals(mCButton14.getText())) {
			mCButton13.setEnabled(true); //activate button needs better Implementation cause quite rudimentary
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			mCOperator = mCButton14.getText();
			if (mCRestartAction == true) {
				mCSum = getMCDisplayLabel();
			} else {
				mCBoth = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
			//setMCFWDisplayLabel(mCFormulaWindowValues + mCOperator);
			//setMCFWDisplayLabel(mCMCLAL + mCOperator);
			/*
			 * Idee: Wir sammeln alle Werte nacheinander 
			 * als einzelen ArrayList Werte, 
			 * verknüpfen diese als LinkedList und geben diese geordnet 
			 * über die LinkedList Algorithm aus!
			 * Ab hier!
			 */
			setMCLLE(mCMCLAL);
			setMCLE(mCBoth);
			setMCLE(mCOperator);
			//setMCLLE(mCMCLAL);
		}

		//Operator subtraction
		if (mCCommand.equals(mCButton12.getText())) {
			mCButton13.setEnabled(true); //activate button needs better Implementation cause quite rudimentary
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			mCOperator = mCButton12.getText();
			if (mCRestartAction == true) {
				mCSum = getMCDisplayLabel();
			} else {
				mCBoth = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
			//setMCFWDisplayLabel(mCFormulaWindowValues + mCOperator);
			setMCFWDisplayLabel(mCMCLAL + mCOperator);
			setMCLLE(mCMCLAL);
			setMCLE(mCBoth);
			setMCLE(mCOperator);
			setMCLLE(mCMCLAL);
		}

		//Operator division
		if (mCCommand.equals(mCButton4.getText())) {
			mCButton13.setEnabled(true); //activate button needs better Implementation cause quite rudimentary
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			mCOperator = mCButton4.getText();
			if (mCRestartAction == true) {
				mCSum = getMCDisplayLabel();
			} else {
				mCBoth = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
			//setMCFWDisplayLabel(mCFormulaWindowValues + mCOperator);
			setMCFWDisplayLabel(mCMCLAL + mCOperator);
			setMCLLE(mCMCLAL);
			setMCLE(mCBoth);
			setMCLE(mCOperator);
			setMCLLE(mCMCLAL);
		}

		//Operator multiplication
		if (mCCommand.equals(mCButton8.getText())) {
			mCButton13.setEnabled(true); //activate button needs better Implementation cause quite rudimentary
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			mCOperator = mCButton8.getText();
			if (mCRestartAction == true) {
				mCSum = getMCDisplayLabel();
			} else {
				mCBoth = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
			//setMCFWDisplayLabel(mCFormulaWindowValues + mCOperator);
			setMCFWDisplayLabel(mCMCLAL + mCOperator);
			setMCLLE(mCMCLAL);
			setMCLE(mCBoth);
			setMCLE(mCOperator);
			setMCLLE(mCMCLAL);
		}

		//exponential function
		if (mCCommand.equals(mCButton18.getText())) {
			mCButton19.setEnabled(true); //activate button needs better Implementation cause quite rudimentary
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			mCExponentFunction = mCButton18.getText();
			if (mCExponentCheck == true) {
				mCBaseDoubleValue = getMCDisplayLabel();
			} else {
				mCBaseIntValue = getMCDisplayLabel();
			}
			setMCDisplayLabel("");
			setMCFWDisplayLabel(mCFormulaWindowValues + mCExponentFunction);
		}				
				
		//Extra step for exponential functions
		
		//exponential calculation
		if (mCCommand.equals(mCButton19.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
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
						mCExponentResultInt = mCSum.substring(0, mCSum.indexOf("."));
					} else {
						mCDoubleToInt = false;
						mCExponentResultDouble = Double.toString(mCResult);
					}
					if (mCDoubleToInt == true) {
						mCCheckValue = false;
						mCExponentCheck = false;
						setMCDisplayLabel(mCExponentResultInt);
						setMCFWDisplayLabel(mCExponentResultInt);
					} else {
						mCExponentCheck = true;
						setMCDisplayLabel(mCExponentResultDouble);
						setMCFWDisplayLabel(mCExponentResultDouble);
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
				setMCFWDisplayLabel(mCExponentResultInt);
			}
		}
		/* 
		 * Result of calculations after number and 
		 * calculation type has been considered
		 */
		
		//equal sign
		if (mCCommand.equals(mCButton13.getText())) {
			if(mCLabel.getText().matches("Gelöscht! Rechner bereit!") || mCLabel.getText().matches("Rechner initialisiert!")){
				setMCDisplayLabel("");
			}
			
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
					setMCFWDisplayLabel(mCValueString);
				} else {
					mCExponentCheck = true;
					setMCDisplayLabel(mCSum);
					setMCFWDisplayLabel(mCSum);
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
				setMCFWDisplayLabel(mCSum);
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
					setMCFWDisplayLabel(mCValueString);
				} else {
					mCExponentCheck = true;
					setMCDisplayLabel(mCSum);
					setMCFWDisplayLabel(mCSum);
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
				setMCFWDisplayLabel(mCSum);
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
						setMCFWDisplayLabel(mCValueString);
					} else {
						mCExponentCheck = true;
						setMCDisplayLabel(mCSum);
						setMCFWDisplayLabel(mCSum);
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
					setMCFWDisplayLabel(mCSum);
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
					setMCFWDisplayLabel(mCValueString);
				} else {
					mCExponentCheck = true;
					setMCDisplayLabel(mCSum);
					setMCFWDisplayLabel(mCSum);
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
				setMCFWDisplayLabel(mCSum);
				mCRestartAction = true;
			}
		}
				
		//Blank input after calculation is finished
		
		//Value cancel
		if (mCCommand.equals(mCButton16.getText())) {
			//setMCDisplayLabel("");
			mCButton13.setEnabled(false);
			mCButton19.setEnabled(false);
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
			setMCDisplayLabel("Gelöscht! Rechner bereit!");
			setMCFWDisplayLabel("Gelöscht! Formelspeicher bereit!");
		}		
	}
}