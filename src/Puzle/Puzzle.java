package Puzle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Puzzle {
	
	static JFrame frame = new JFrame("Puzzle");
	
	static JButton start = new JButton();
	static JButton instr = new JButton();
	static JButton credt = new JButton();
	
	static JLabel background = new JLabel();
	static JLabel l1 = new JLabel();
	static JLabel l2 = new JLabel();
	static JLabel l3 = new JLabel();
	
	static Icon back = new ImageIcon("Resource/Puzzle/Background.gif");
	static Icon srt = new ImageIcon("Resource/Puzzle/start.png");
	static Icon srtp = new ImageIcon("Resource/Puzzle/startpress.png");
	static Icon instructiuni = new ImageIcon("Resource/Puzzle/instructiuni.png");
	static Icon instructiunip = new ImageIcon("Resource/Puzzle/instructiunipress.png");
	static Icon credite = new ImageIcon("Resource/Puzzle/credite.png");
	static Icon creditep = new ImageIcon("Resource/Puzzle/creditepress.png");
	static Icon porneste = new ImageIcon("Resource/Puzzle/pornestejoc.png");
	static Icon cumsejoaca = new ImageIcon("Resource/Puzzle/cumsejoaca.png");
	static Icon desprenoi =  new ImageIcon("Resource/Puzzle/desprenoi.png");
	
	public Puzzle(){
		frame.setSize(800, 618); 
		frame.setLayout(null); 
    	frame.setVisible(true); 
    	frame.setLocationRelativeTo(null); 
    	frame.setResizable(false);
    	
    	background.setText(null);
    	background.setBounds(0 , 0 , 800, 618);
    	background.setIcon(back);
    	l1.setText(null);
    	l1.setBounds(97, 70 , 200 , 60);
    	l1.setIcon(porneste);
    	l1.setVisible(false);
    	l2.setText(null);
    	l2.setBounds(297, 70 , 200 , 60);
    	l2.setIcon(cumsejoaca);
    	l2.setVisible(false);
    	l3.setText(null);
    	l3.setBounds(497, 70 , 200 , 60);
    	l3.setIcon(desprenoi);
    	l3.setVisible(false);
    	
    	start.setBounds(117, 25, 160, 40);
    	start.setIcon(srt);
    	start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	startActionPerformed(evt);
            }
        });
    	start.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                startMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startMouseExited(evt);
            }
    	});
    	instr.setBounds(317, 25, 160, 40);
    	instr.setIcon(instructiuni);
    	instr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	instrActionPerformed(evt);
            }
        });
    	instr.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                instrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instrMouseExited(evt);
            }
    	});
    	credt.setBounds(517, 25, 160, 40);
    	credt.setIcon(credite);
    	credt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	credtActionPerformed(evt);
            }
        });
    	credt.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                credtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                credtMouseExited(evt);
            }
    	});
    	
    	frame.add(start);
    	frame.add(l1);
    	frame.add(instr);
    	frame.add(l2);
    	frame.add(credt);
    	frame.add(l3);
    	frame.add(background);
		
	}
	
	private void startActionPerformed(java.awt.event.ActionEvent evt) { 
		frame.remove(start);
    	frame.remove(l1);
    	frame.remove(instr);
    	frame.remove(l2);
    	frame.remove(credt);
    	frame.remove(l3);
    	new Level_Select();
	}
	
	private void startMouseEntered(java.awt.event.MouseEvent evt) {   
		start.setIcon(srtp);
		l1.setVisible(true);
	}                                     

    private void startMouseExited(java.awt.event.MouseEvent evt) {    
    	start.setIcon(srt);
    	l1.setVisible(false);
	} 
    
    private void instrActionPerformed(java.awt.event.ActionEvent evt) { 
    	frame.remove(start);
    	frame.remove(l1);
    	frame.remove(instr);
    	frame.remove(l2);
    	frame.remove(credt);
    	frame.remove(l3);
    	new Instructiuni();
	}
	
	private void instrMouseEntered(java.awt.event.MouseEvent evt) {   
		instr.setIcon(instructiunip);
		l2.setVisible(true);
	}                                     

    private void instrMouseExited(java.awt.event.MouseEvent evt) {    
    	instr.setIcon(instructiuni);
    	l2.setVisible(false);
	} 
    
    private void credtActionPerformed(java.awt.event.ActionEvent evt) { 
    	frame.remove(start);
    	frame.remove(l1);
    	frame.remove(instr);
    	frame.remove(l2);
    	frame.remove(credt);
    	frame.remove(l3);
    	new Credite();
   	}
   	
   	private void credtMouseEntered(java.awt.event.MouseEvent evt) {   
   		credt.setIcon(creditep);
   		l3.setVisible(true);
   	}                                     

    private void credtMouseExited(java.awt.event.MouseEvent evt) {    
       credt.setIcon(credite);
       l3.setVisible(false);
   	} 

}
