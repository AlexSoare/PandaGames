package Platform;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Culoare.Culoare;
import Escape.Escape;
import Escape.EscapeCreate;
import MTI.MTI;
import Puzle.Puzzle;
import Tetris.Tetris;


public class Panda{
	
	static JFrame frame = new JFrame();
	
	Icon background = new ImageIcon("Resource/Panda/background.png");
	
    JLabel back = new JLabel();
    
    JButton l1 = new JButton();
    JButton l2 = new JButton();
    JButton l3 = new JButton();
    JButton l4 = new JButton();
    JButton l5 = new JButton();
    
	JMenuBar menu = new JMenuBar();
	JMenu menuFile = new JMenu("Games");
	JMenu menuOption = new JMenu("Options");
    JMenu menuHelp = new JMenu("Help");
    JMenuItem menuGame1 = new JMenuItem("Puzzle");
    JMenuItem menuGame2 = new JMenuItem("Tetris");
    JMenuItem menuGame3 = new JMenuItem("Escape");
    JMenuItem menuGame4 = new JMenuItem("MTI");
    JMenuItem menuGame5 = new JMenuItem("Culoare");
    JMenuItem menuExit = new JMenuItem("Exit");
    JMenuItem menuNoi = new JMenuItem("Contact");
    JMenuItem menuCredite = new JMenuItem("Credite");
    JMenuItem menuCreate = new JMenuItem("Escape level creator");
    
    Icon b1 = new ImageIcon("Resource/Panda/puzzle.png");
    Icon b1p = new ImageIcon("Resource/Panda/puzzlep.png");
    Icon b2 = new ImageIcon("Resource/Panda/tetris.png");
    Icon b2p = new ImageIcon("Resource/Panda/tetrisp.png");
    Icon b3 = new ImageIcon("Resource/Panda/escape.png");
    Icon b3p = new ImageIcon("Resource/Panda/escapep.png");
    Icon b4 = new ImageIcon("Resource/Panda/mti.png");
    Icon b4p = new ImageIcon("Resource/Panda/mtip.png");
    Icon b5 = new ImageIcon("Resource/Panda/razboi.png");
    Icon b5p = new ImageIcon("Resource/Panda/razboip.png");

	public Panda(){
		frame.setSize(800,795);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		back.setBounds(0, 0, 800, 766);
		back.setIcon(background);
		
		menuGame1.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        menuGame1ActionPerformed(evt);
		    }
		});
		menuGame2.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        menuGame2ActionPerformed(evt);
		    }
		});
		menuGame3.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        try {
					menuGame3ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		menuGame4.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        menuGame4ActionPerformed(evt);
		    }
		});
		menuGame5.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        menuGame5ActionPerformed(evt);
		    }
		});
		menuExit.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        menuExitActionPerformed(evt);
		    }
		});
		menuNoi.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        menuNoiActionPerformed(evt);
		    }
		});
		menuCredite.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        menuCrediteActionPerformed(evt);
		    }
		});
		menuCreate.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        try {
					menuCreateActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		
		l1.setBounds(142, 284, 100, 100);
		l1.setIcon(b1);
		l1.setContentAreaFilled( false );
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
		
    	l2.setBounds(359, 284, 100, 100);
    	l2.setIcon(b2);
    	l2.setContentAreaFilled( false );
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
    	
    	l3.setBounds(572, 284, 100, 100);
    	l3.setIcon(b3);
    	l3.setContentAreaFilled( false );
    	l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					l3ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
    	
    	l4.setBounds(251, 468, 100, 100);
    	l4.setIcon(b4);
    	l4.setContentAreaFilled( false );
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
    	
    	l5.setBounds(464, 468, 100, 100);
    	l5.setIcon(b5);
    	l5.setContentAreaFilled( false );
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
	
		menu.setBounds(0, 0, 800, 20);
		menu.add(menuFile);
		menu.add(menuOption);
		menu.add(menuHelp);
		menuFile.add(menuGame1);
		menuFile.add(menuGame2);
		menuFile.add(menuGame3);
		menuFile.add(menuGame4);
		menuFile.add(menuGame5);
		menuFile.add(menuExit);
		menuOption.add(menuCreate);
		menuHelp.add(menuNoi);
		menuHelp.add(menuCredite);
		
		frame.add(menu);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(back);

		frame.repaint();
		menu.repaint();
	}
	
	private void menuGame1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Puzzle();
	}
	
    private void menuGame2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Tetris();
	}
    
    private void menuGame3ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		new Escape();
	}
    
    private void menuGame4ActionPerformed(java.awt.event.ActionEvent evt) {
		new MTI();
	}
    
    private void menuGame5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Culoare();
	}
    
    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {
		frame.dispose();
	}
    
    private void menuNoiActionPerformed(java.awt.event.ActionEvent evt) {
		
   	}
    
    private void menuCrediteActionPerformed(java.awt.event.ActionEvent evt) {
		
   	}
    
    private void menuCreateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		new EscapeCreate();
   	}
    
    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Puzzle();
	}
	
	private void l1MouseEntered(java.awt.event.MouseEvent evt) {   
		l1.setIcon(b1p);
	
	}                                     

    private void l1MouseExited(java.awt.event.MouseEvent evt) {    
    	l1.setIcon(b1);
	} 
	
    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {
    	new Tetris();
	}
	
	private void l2MouseEntered(java.awt.event.MouseEvent evt) {   
		l2.setIcon(b2p);
	}                                     

    private void l2MouseExited(java.awt.event.MouseEvent evt) {    
    	l2.setIcon(b2);
	}
    
    private void l3ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	new Escape();
	}
	
	private void l3MouseEntered(java.awt.event.MouseEvent evt) {  
		l3.setIcon(b3p);
	}                                     

    private void l3MouseExited(java.awt.event.MouseEvent evt) {    
    	l3.setIcon(b3);
	}
    
    private void l4ActionPerformed(java.awt.event.ActionEvent evt) {
    	new MTI();
	}
	
	private void l4MouseEntered(java.awt.event.MouseEvent evt) {   
		l4.setIcon(b4p);
	}                                     

    private void l4MouseExited(java.awt.event.MouseEvent evt) {    
    	l4.setIcon(b4);
	}
    
    private void l5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Culoare();
	}
	
	private void l5MouseEntered(java.awt.event.MouseEvent evt) {   
		l5.setIcon(b5p);
	}                                     

    private void l5MouseExited(java.awt.event.MouseEvent evt) {    
    	l5.setIcon(b5);
	}
    
}
