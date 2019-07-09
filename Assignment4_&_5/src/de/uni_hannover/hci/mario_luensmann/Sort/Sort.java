package de.uni_hannover.hci.mario_luensmann.Sort;

import java.util.ArrayList;
import java.util.Collections;

import de.uni_hannover.hci.mario_luensmann.isortable.ISortable;
import de.uni_hannover.hci.mario_luensmann.modes.SortMode;

public class Sort {
	
	static ArrayList<String> myArr1 = new ArrayList<String>();
	
	static String myArr2 = new String();
	
	@SuppressWarnings("static-access")
	public static void Sort(SortMode pMode, ISortable[] pToSort){
		/*for(int i = 0; i < pToSort.length-2; i++){
			for(int j = i + 1; j < pToSort.length-1; j++){
				if(pToSort[i].getSortString(pMode).compareTo(pToSort[j].getSortString(pMode)) > 0){
					ISortable tmp = pToSort[i];
					pToSort[i] = pToSort[j];
					pToSort[j] = tmp;
					myArr2 += pToSort[i].getSortString(pMode) + "\n";
				}
			}
		} //Zweite Mögliche Implementation
		System.out.println(myArr2);/**/
		/*for(int i = 0; i < pToSort.length; i++){
			myArr1.add(pToSort[i].getSortString(pMode));
		}
		Collections.sort(myArr1);
		for(String strV: myArr1){
			System.out.println(strV); /*Nur für Testzwecke und ja es 
			ist immer noch ein normales Array nur zwischenzeitlich nicht ;).
			Effizient nur vier Zeilen lang aber braucht noch die fünfte für die
			Konvertierung in ein stink normales String Array womit Ihr ja nur arbeitet./**/
		//}
	}
}
