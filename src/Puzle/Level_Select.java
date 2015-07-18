package Puzle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Level_Select {
	
	static Icon back = new ImageIcon("Resource/Puzzle/Level_Select/Background.png");
	static Icon b1 = new ImageIcon("Resource/Puzzle/Level_Select/l1.png");
	static Icon b2 = new ImageIcon("Resource/Puzzle/Level_Select/l2.png");
	static Icon b3 = new ImageIcon("Resource/Puzzle/Level_Select/l3.png");
	static Icon b4 = new ImageIcon("Resource/Puzzle/Level_Select/l4.png");
	static Icon b5 = new ImageIcon("Resource/Puzzle/Level_Select/l5.png");
	static Icon b6 = new ImageIcon("Resource/Puzzle/Level_Select/l6.png");
	static Icon b7 = new ImageIcon("Resource/Puzzle/Level_Select/l7.png");
	static Icon b8 = new ImageIcon("Resource/Puzzle/Level_Select/l8.png");
	static Icon b9 = new ImageIcon("Resource/Puzzle/Level_Select/l9.png");
	static Icon b1p = new ImageIcon("Resource/Puzzle/Level_Select/l1p.png");
	static Icon b2p = new ImageIcon("Resource/Puzzle/Level_Select/l2p.png");
	static Icon b3p = new ImageIcon("Resource/Puzzle/Level_Select/l3p.png");
	static Icon b4p = new ImageIcon("Resource/Puzzle/Level_Select/l4p.png");
	static Icon b5p = new ImageIcon("Resource/Puzzle/Level_Select/l5p.png");
	static Icon b6p = new ImageIcon("Resource/Puzzle/Level_Select/l6p.png");
	static Icon b7p = new ImageIcon("Resource/Puzzle/Level_Select/l7p.png");
	static Icon b8p = new ImageIcon("Resource/Puzzle/Level_Select/l8p.png");
	static Icon b9p = new ImageIcon("Resource/Puzzle/Level_Select/l9p.png");
	
	static JButton l1 = new JButton();
	static JButton l2 = new JButton();
	static JButton l3 = new JButton();
	static JButton l4 = new JButton();
	static JButton l5 = new JButton();
	static JButton l6 = new JButton();
	static JButton l7 = new JButton();
	static JButton l8 = new JButton();
	static JButton l9 = new JButton();
	
	public Level_Select(){
		Puzzle.background.setIcon(back);
		
		l1.setBounds(32, 339, 196, 45);
    	l1.setIcon(b1);
    	l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l1ActionPerformed(evt);
            }
        });
    	l1.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l1MouseExited(evt);
            }
    	});
		
    	l2.setBounds(32, 404, 196, 45);
    	l2.setIcon(b2);
    	l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l2ActionPerformed(evt);
            }
        });
    	l2.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l2MouseExited(evt);
            }
    	});
    	
    	l3.setBounds(32, 469, 196, 45);
    	l3.setIcon(b3);
    	l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l3ActionPerformed(evt);
            }
        });
    	l3.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l3MouseExited(evt);
            }
    	});
    	
    	l4.setBounds(303, 339, 196, 45);
    	l4.setIcon(b4);
    	l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l4ActionPerformed(evt);
            }
        });
    	l4.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l4MouseExited(evt);
            }
    	});
    	
    	l5.setBounds(303, 404, 196, 45);
    	l5.setIcon(b5);
    	l5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l5ActionPerformed(evt);
            }
        });
    	l5.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l5MouseExited(evt);
            }
    	});
    	
    	l6.setBounds(303, 469, 196, 45);
    	l6.setIcon(b6);
    	l6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l6ActionPerformed(evt);
            }
        });
    	l6.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l6MouseExited(evt);
            }
    	});
    	
    	l7.setBounds(573, 339, 196, 45);
    	l7.setIcon(b7);
    	l7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l7ActionPerformed(evt);
            }
        });
    	l7.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l7MouseExited(evt);
            }
    	});
    	
    	l8.setBounds(573, 404, 196, 45);
    	l8.setIcon(b8);
    	l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l8ActionPerformed(evt);
            }
        });
    	l8.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l8MouseExited(evt);
            }
    	});
    	
    	l9.setBounds(573, 469, 196, 45);
    	l9.setIcon(b9);
    	l9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	l9ActionPerformed(evt);
            }
        });
    	l9.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseEntered(java.awt.event.MouseEvent evt) {
                l9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l9MouseExited(evt);
            }
    	});
    	
    	Puzzle.frame.add(l1);
    	Puzzle.frame.add(l2);
    	Puzzle.frame.add(l3);
    	Puzzle.frame.add(l4);
    	Puzzle.frame.add(l5);
    	Puzzle.frame.add(l6);
    	Puzzle.frame.add(l7);
    	Puzzle.frame.add(l8);
    	Puzzle.frame.add(l9);
    	Puzzle.frame.add(Puzzle.background);
   
		
	}
	
	private void l1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Level1();
	}
	
	private void l1MouseEntered(java.awt.event.MouseEvent evt) {   
		l1.setIcon(b1p);
	
	}                                     

    private void l1MouseExited(java.awt.event.MouseEvent evt) {    
    	l1.setIcon(b1);
	} 
	
    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {
    	new Level2();
	}
	
	private void l2MouseEntered(java.awt.event.MouseEvent evt) {   
		l2.setIcon(b2p);
	}                                     

    private void l2MouseExited(java.awt.event.MouseEvent evt) {    
    	l2.setIcon(b2);
	}
    
    private void l3ActionPerformed(java.awt.event.ActionEvent evt) {
    	new Level3();
	}
	
	private void l3MouseEntered(java.awt.event.MouseEvent evt) {  
		l3.setIcon(b3p);
	}                                     

    private void l3MouseExited(java.awt.event.MouseEvent evt) {    
    	l3.setIcon(b3);
	}
    
    private void l4ActionPerformed(java.awt.event.ActionEvent evt) {
    	new Level4();
	}
	
	private void l4MouseEntered(java.awt.event.MouseEvent evt) {   
		l4.setIcon(b4p);
	}                                     

    private void l4MouseExited(java.awt.event.MouseEvent evt) {    
    	l4.setIcon(b4);
	}
    
    private void l5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Level5();
	}
	
	private void l5MouseEntered(java.awt.event.MouseEvent evt) {   
		l5.setIcon(b5p);
	}                                     

    private void l5MouseExited(java.awt.event.MouseEvent evt) {    
    	l5.setIcon(b5);
	}
    
    private void l6ActionPerformed(java.awt.event.ActionEvent evt) {
		new Level6();
	}
	
	private void l6MouseEntered(java.awt.event.MouseEvent evt) {   
		l6.setIcon(b6p);
	}                                     

    private void l6MouseExited(java.awt.event.MouseEvent evt) {    
    	l6.setIcon(b6);
	}
    
    private void l7ActionPerformed(java.awt.event.ActionEvent evt) {
		new Level7();
	}
	
	private void l7MouseEntered(java.awt.event.MouseEvent evt) {   
		l7.setIcon(b7p);
	}                                     

    private void l7MouseExited(java.awt.event.MouseEvent evt) {    
    	l7.setIcon(b7);
	}
    
    private void l8ActionPerformed(java.awt.event.ActionEvent evt) {
		new Level8();
	}
	
	private void l8MouseEntered(java.awt.event.MouseEvent evt) {   
		l8.setIcon(b8p);
	}                                     

    private void l8MouseExited(java.awt.event.MouseEvent evt) {    
    	l8.setIcon(b8);
	}
    
    private void l9ActionPerformed(java.awt.event.ActionEvent evt) {
		new Level9();
	}
	
	private void l9MouseEntered(java.awt.event.MouseEvent evt) {   
		l9.setIcon(b9p);
	}                                     

    private void l9MouseExited(java.awt.event.MouseEvent evt) {    
    	l9.setIcon(b9);
	}

}
