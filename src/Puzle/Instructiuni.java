package Puzle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Instructiuni {
	
	static Icon background = new ImageIcon("Resource/Puzzle/Instructiuni/Instructiuniback.gif");
	static Icon inp = new ImageIcon("Resource/Puzzle/Instructiuni/inapoi.png");
	static Icon inpp = new ImageIcon("Resource/Puzzle/Instructiuni/inapoip.png");
	
	static JButton inapoi = new JButton();
	
	public Instructiuni(){
		
		Puzzle.background.setIcon(background);
		
		inapoi.setBounds(610, 530, 160, 40);
    	inapoi.setIcon(inp);
    	inapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	inapoiActionPerformed(evt);
            }
        });
    	inapoi.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                inapoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inapoiMouseExited(evt);
            }
    	});
		
    	Puzzle.frame.add(inapoi);
		Puzzle.frame.add(Puzzle.background);
		
	}
	
	private void inapoiActionPerformed(java.awt.event.ActionEvent evt) {
		Puzzle.frame.remove(inapoi);
		new Puzzle();
	}
	
	private void inapoiMouseEntered(java.awt.event.MouseEvent evt) {   
		inapoi.setIcon(inpp);
	}                                     

    private void inapoiMouseExited(java.awt.event.MouseEvent evt) {    
    	inapoi.setIcon(inp);
	} 

}
