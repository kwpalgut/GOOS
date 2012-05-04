package auctionsniper.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import auctionsniper.Main;

/*Code commented out in this section is due to not being able to use a JLabel in AuctionSniperDriver 
*/

public class MainWindow extends JFrame{ 
	  /**
	 * 
	 */
	public static final String SNIPER_STATUS_NAME = "sniper status";
//	private final JLabel sniperStatus = createLabel("mainwindowjoining");
	private static final long serialVersionUID = 1L;
	public static final String STATUS_LOST = "Lost";
	
	  DefaultTableModel model = new DefaultTableModel();
	  JTable snipersTable = new JTable(model); 

	public MainWindow() {
	    super("Auction Sniper"); 
	    setName(Main.MAIN_WINDOW_NAME); 
	    fillContentPane(makeSnipersTable());

//	    add(sniperStatus");
	    pack();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    setVisible(true); 
	}
	
//	private static JLabel createLabel(String initialText) {
//		JLabel result = new JLabel(initialText);
//		result.setName(SNIPER_STATUS_NAME);
//		result.setBorder(new LineBorder(Color.BLACK));
//		return result;
//	}
	

	  private void fillContentPane(JTable snipersTable) { 
		    final Container contentPane = getContentPane(); 
		    contentPane.setLayout(new BorderLayout()); 
		    contentPane.add(new JScrollPane(snipersTable), BorderLayout.CENTER); 
		  } 
	  
	  private JTable makeSnipersTable() { 
		  model.addColumn("Col1");
		  model.addRow(new Object[]{"joining"});

		    return snipersTable; 
		  }
	public void showStatus(String status) {
		//sniperStatus.setText(status); 
		
		model.addRow(new Object[]{"lost"});
		
	}
} 