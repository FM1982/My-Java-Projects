package misc;

public enum MyCalculatorNumbers {
	
	ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9");
	
	/*private static MainWindow myMCButton;
	
	private static JButton mCNumberValue;
	
	private static JButton mCMapToButton(){
		mCNumberValue = myMCButton.mCButton9;
		return mCNumberValue;
	}*/
	
	private final String myCalculatorString;
	
	MyCalculatorNumbers(String pMCStringValue){
		this.myCalculatorString = pMCStringValue;
	}

}