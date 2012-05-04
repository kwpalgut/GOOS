package test.endtoend.auctionsniper;

import static com.objogate.wl.swing.matcher.IterableComponentsMatcher.matching;
import static com.objogate.wl.swing.matcher.JLabelTextMatcher.withLabelText;
import auctionsniper.Main;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JTableDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

public class AuctionSniperDriver extends JFrameDriver { 
  public AuctionSniperDriver(int timeoutMillis) { 
    super(new GesturePerformer(), 
          JFrameDriver.topLevelFrame( 
            named(Main.MAIN_WINDOW_NAME), 
            showingOnScreen()), 
            new AWTEventQueueProber(timeoutMillis, 100)); 
  }
  
  //The AuctionSniper driver does not work with the original JLabelDriver. 
  //Using a stripped down JTable from later in the project was the workaround
  public void showsSniperStatus(String statusText) { 
	    JTableDriver table = new JTableDriver(this); 
	    table.hasRow( 
	        matching(withLabelText(statusText)));     
	  }
  
//  public void showsSniperStatus(String statusText) {
//	 new JLabelDriver(this, named(Main.SNIPER_STATUS_NAME)).hasText(equalTo(statusText));     
//  }
 
} 
