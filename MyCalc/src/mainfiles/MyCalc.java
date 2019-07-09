/**
 * MyCalc mainfiles/MyCalc
 * Copyright MLuensmann
 * 
 * @author Fox W. Mulder
 */

package mainfiles;

import logic.MyCalcLogic;
//import gui.FormulaWindow;
//import gui.MainWindow;

//import java.util.NoSuchElementException;
//import java.util.Scanner;

public class MyCalc {	

	/*public static Scanner s1;
	
	public static Scanner s2;
	
	public static Scanner s3;
	
	public static Scanner s4;
	
	private static int cTA;
	
	private static int cYD;
	
	private static int cAP;
	
	public static double hVA;
	
	public static double hVB;
		
	private static int dBZ = 0;
	
	private static int uR = 0;
	
	private static boolean cC = true;*/
	
	public static void main(String[] args) {
		final MyCalcLogic mCL2 = new MyCalcLogic();
		//final MainWindow mCGui = new MainWindow(mCL2);
		//final FormulaWindow mCFW = new FormulaWindow(mCGui);
		//final FormulaWindow mCFW = new FormulaWindow(mCL2);
		/*s1 = new Scanner(System.in);
		s2 = new Scanner(System.in);
		s3 = new Scanner(System.in);
		s4 = new Scanner(System.in);
		try{
			System.out.println("Please put in the arithmetic precision: \n \n" + "0 for full numbers or \n" + "1 for commata seperated values \n");			
			cAP = Integer.parseInt(s4.next());			
			if(cAP == 0 || cAP == 1){
				System.out.println("Please put in one of the following values: \n \n" + "0 for addition \n" + "1 for substraction \n" + "2 for Multiplication \n" + "3 for Division \n");
				cTA = Integer.parseInt(s3.next());
			}
			else{
				throw new NoSuchElementException("Values not applicable!");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Wrong value, not a Number" + nfe.getLocalizedMessage());
		}
		@SuppressWarnings("unused")
		MyCalc instance = new MyCalc(cTA);
		MyCalcPlus instance2 = new MyCalcPlus();
		MyCalcMinus instance3 = new MyCalcMinus();
		MyCalcMulti instance4 = new MyCalcMulti();
		MyCalcDiv instance5 = new MyCalcDiv();		
		try{
			if (cYD == 0 && cC != false){
				System.out.println("Please enter two numbers to make the addition \n");
				if(cAP == 0){					
					hVA = Integer.parseInt(s1.next());
					hVB = Integer.parseInt(s2.next());
					instance2.setMyCalcPlus0((int) hVA, (int) hVB);
					System.out.println("The Result of the addition is: " + (int) instance2.resultPlus);
				}
				else
				{
					hVA = Double.parseDouble(s1.next());
					hVB = Double.parseDouble(s2.next());
					instance2.setMyCalcPlus1(hVA, hVB);
					System.out.println("The Result of the addition is: " + instance2.resultPlus);
				}								
			}
			else if (cYD == 1 && cC != false){
				System.out.println("Please enter two numbers to make the substraction \n");
				if(cAP == 0){
					hVA = Integer.parseInt(s1.next());
					hVB = Integer.parseInt(s2.next());
					instance3.setMyCalcMinus0((int) hVA, (int) hVB);
					System.out.println("The Result of the substraction is: " + (int) instance3.resultMinus);
				}
				else
				{
					hVA = Double.parseDouble(s1.next());
					hVB = Double.parseDouble(s2.next());
					instance3.setMyCalcMinus1(hVA, hVB);
					System.out.println("The Result of the substraction is: " + instance3.resultMinus);
				}
			}
			else if (cYD == 2 && cC != false){
				System.out.println("Please enter two numbers to make the multiplication \n");
				if(cAP == 0){
					hVA = Integer.parseInt(s1.next());
					hVB = Integer.parseInt(s2.next());
					instance4.setMyCalcMulti0((int) hVA, (int) hVB);
					System.out.println("The Result of the multiplication is: " + (int) instance4.resultMulti);
				}
				else
				{
					hVA = Double.parseDouble(s1.next());
					hVB = Double.parseDouble(s2.next());
					instance4.setMyCalcMulti1(hVA, hVB);
					System.out.println("The Result of the multiplication is: " + instance4.resultMulti);
				}
			}
			else if (cYD == 3 && cC != false){
				System.out.println("Please enter two numbers to make the division \n");
				if(cAP == 0){					
					hVA = Integer.parseInt(s1.next());
					hVB = Integer.parseInt(s2.next());
					instance5.setMyCalcDiv0((int) hVA, (int) hVB);
					if(hVB == dBZ && hVA != dBZ){
						System.out.println("Error! Division by Zero not possible!");
					}
					else if(hVA == uR & hVB == uR){
						System.out.println("Error! Undefined Result!");
					}
					else{
					System.out.println("The Result of the division is: " + (int) instance5.resultDiv);
					}
				}
				else
				{
					hVA = Double.parseDouble(s1.next());
					hVB = Double.parseDouble(s2.next());
					instance5.setMyCalcDiv1(hVA, hVB);
					if(hVB == dBZ && hVA != dBZ){
						System.out.println("Error! Division by Zero not possible!");
					}
					else if(hVA == uR & hVB == uR){
						System.out.println("Error! Undefined Result!");
					}
					else{
					System.out.println("The Result of the division is: " + instance5.resultDiv);
					}
				}
			}
		} catch (NumberFormatException nfe){
			System.out.println("Wrong Values, not a Number!");
			nfe.printStackTrace();
		}*/
		javax.swing.SwingUtilities.invokeLater(new Runnable() {				
	        @Override
			public void run() {
	        	//mCGui.myCalcGui();
	        	//new MainWindow(mCL2);
	        }
	    });
	}
	
	/*public MyCalc(int pX){
		if(pX == 0 || pX == 1 || pX == 2 || pX == 3){
			cYD = pX;
			cC = true;
		}
		else
		{
			cC = false;
			throw new NoSuchElementException("Values not applicable!");
		}
	}*/	
			
}