package auctionsniper;

import javax.swing.SwingUtilities;

import auctionsniper.ui.MainWindow;

public class Main { 
	private MainWindow ui;
	public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";
	public static final String SNIPER_STATUS_NAME = "sniper_status_name";

	public Main() throws Exception {
		startUserInterface();
	}
	
	public static void main(String... args) throws Exception {
		Main main = new Main();
	}
	
	private void startUserInterface() throws Exception {
		SwingUtilities.invokeAndWait(new Runnable() {
			public void run() {
				ui = new MainWindow();
			}
		});
	}
}
