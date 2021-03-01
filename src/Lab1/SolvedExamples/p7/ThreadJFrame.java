package Lab1.SolvedExamples.p7;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


/**
* This code was generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* *************************************
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED
* for this machine, so Jigloo or this code cannot be used legally
* for any corporate or commercial purpose.
* *************************************
*/
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class ThreadJFrame extends javax.swing.JFrame {
	private JPanel panel;
	
	public ThreadJFrame() {
		super();
		initGUI();
	}
	
	public void addThreadCounterTextbox(NumaratorWindowT t){
	    String name = t.getName();
	    JLabel l = new JLabel(name);
	    JTextField tf = new JTextField();
	    panel.add(l);
	    panel.add(tf);
	    
	    t.setTextField(tf);
	}
	
	private void initGUI() {
		try {
			setSize(400, 300);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            {
                panel = new JPanel();
                GridLayout jPanel1Layout = new GridLayout(30, 2);
                jPanel1Layout.setColumns(2);
                jPanel1Layout.setRows(30);
                this.getContentPane().add(panel, BorderLayout.CENTER);
                panel.setLayout(jPanel1Layout);
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	* Auto-generated method for setting the popup menu for a component
	*/
    private void setComponentPopupMenu(
        final java.awt.Component parent,
        final javax.swing.JPopupMenu menu) {
        parent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent e) {
                if (e.isPopupTrigger())
                    menu.show(parent, e.getX(), e.getY());
            }
            public void mouseReleased(java.awt.event.MouseEvent e) {
                if (e.isPopupTrigger())
                    menu.show(parent, e.getX(), e.getY());
            }
        });
    }

}
