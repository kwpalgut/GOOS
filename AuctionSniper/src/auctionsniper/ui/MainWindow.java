package auctionsniper.ui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import auctionsniper.Main;

 
public class MainWindow extends JFrame{ 
	  /**
	 * 
	 */
	public static final String SNIPER_STATUS_NAME = "sniper status";
//	private final JLabel sniperStatus = createLabel("mainwindowjoining");
	private static final long serialVersionUID = 1L;
	

	public MainWindow() {
	    super("Auction Sniper"); 
	    setName(Main.MAIN_WINDOW_NAME); 
	    fillContentPane(makeSnipersTable());

//	    add("test2");
	    pack();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    setVisible(true); 
	}
	  private void fillContentPane(JTable snipersTable) { 
		    final Container contentPane = getContentPane(); 
		    contentPane.setLayout(new BorderLayout()); 
		    contentPane.add(new JScrollPane(snipersTable), BorderLayout.CENTER); 
		  } 
	  
	  private JTable makeSnipersTable() { 

		  DefaultTableModel model = new DefaultTableModel();
		  JTable snipersTable = new JTable(model); 
		  model.addColumn("Col1");
		  model.addRow(new Object[]{"joining"});

		    return snipersTable; 
		  }
} 