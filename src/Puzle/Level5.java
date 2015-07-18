package Puzle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Level5 {
	
    int j=16,x=0;
	
	static JButton b1 = new JButton();
	static JButton b2 = new JButton();
	static JButton b3 = new JButton();
	static JButton b4 = new JButton();
	static JButton b5 = new JButton();
	static JButton b6 = new JButton();
	static JButton b7 = new JButton();
	static JButton b8 = new JButton();
	static JButton b9 = new JButton();
	static JButton b10 = new JButton();
	static JButton b11 = new JButton();
	static JButton b12 = new JButton();
	static JButton b13 = new JButton();
	static JButton b14 = new JButton();
	static JButton b15 = new JButton();
	static JButton b16 = new JButton();
	
	static JLabel l = new JLabel();
	
	static Icon p1 = new ImageIcon("Resource/Puzzle/Level5/1.png");
	static Icon p2 = new ImageIcon("Resource/Puzzle/Level5/2.png");
	static Icon p3 = new ImageIcon("Resource/Puzzle/Level5/3.png");
	static Icon p4 = new ImageIcon("Resource/Puzzle/Level5/4.png");
	static Icon p5 = new ImageIcon("Resource/Puzzle/Level5/5.png");
	static Icon p6 = new ImageIcon("Resource/Puzzle/Level5/6.png");
	static Icon p7 = new ImageIcon("Resource/Puzzle/Level5/7.png");
	static Icon p8 = new ImageIcon("Resource/Puzzle/Level5/8.png");
	static Icon p9 = new ImageIcon("Resource/Puzzle/Level5/9.png");
	static Icon p10 = new ImageIcon("Resource/Puzzle/Level5/10.png");
	static Icon p11 = new ImageIcon("Resource/Puzzle/Level5/11.png");
	static Icon p12 = new ImageIcon("Resource/Puzzle/Level5/12.png");
	static Icon p13 = new ImageIcon("Resource/Puzzle/Level5/13.png");
	static Icon p14 = new ImageIcon("Resource/Puzzle/Level5/14.png");
	static Icon p15 = new ImageIcon("Resource/Puzzle/Level5/15.png");
	static Icon p16 = new ImageIcon("Resource/Puzzle/Level5/16.png");
	static Icon poza = new ImageIcon("Resource/Puzzle/Level5/poza.png");
	
	static JFrame frame = new JFrame("");
	
	public Level5(){
		
		frame.setSize(645, 348); 
		frame.setLayout(null); 
    	frame.setVisible(true); 
    	frame.setLocationRelativeTo(null); 
    	frame.setResizable(false);
		frame.setTitle(String.valueOf("Mutari: "+x));
		
		init();
		
		l.setIcon(poza);
		l.setBounds(320, 0 , 320, 320);
		
		b1.setIcon(p15); 
		b1.setVisible(true); 
		b1.setBounds(0, 0 , 80, 80); 
		b1.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b1ActionPerformed(evt);
            }
        });
		
		b2.setIcon(p3);
		b2.setVisible(true);
		b2.setBounds(80 , 0 ,80 ,80);
		b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b2ActionPerformed(evt);
            }
        });
		
		b3.setIcon(p8);
		b3.setVisible(true);
		b3.setBounds(160 , 0, 80 ,80);
		b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b3ActionPerformed(evt);
            }
        });
		
		b4.setIcon(p11);
		b4.setVisible(true);
		b4.setBounds(240 , 0 ,80 ,80);
		b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b4ActionPerformed(evt);
            }
        });
		
		b5.setIcon(p14);
		b5.setVisible(true);
		b5.setBounds(0 , 80 ,80 ,80);
		b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b5ActionPerformed(evt);
            }
        });
		
		b6.setIcon(p5);
		b6.setVisible(true);
		b6.setBounds(80 , 80 ,80 ,80);
		b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b6ActionPerformed(evt);
            }
        });
		
		b7.setIcon(p7);
		b7.setVisible(true);
		b7.setBounds(160 , 80 ,80 ,80);
		b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b7ActionPerformed(evt);
            }
        });
		
		b8.setIcon(p1);
		b8.setVisible(true);
		b8.setBounds(240 , 80 ,80 ,80);
		b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b8ActionPerformed(evt);
            }
        });
		
		b9.setIcon(p13);
		b9.setBounds(0 , 160 ,80 ,80);
		b9.setVisible(true);
		b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b9ActionPerformed(evt);
            }
        });
		
		b10.setIcon(p4);
		b10.setBounds(80 , 160 ,80 ,80);
		b10.setVisible(true);
		b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b10ActionPerformed(evt);
            }
        });
		
		b11.setIcon(p12);
		b11.setBounds(160 , 160 ,80 ,80);
		b11.setVisible(true);
		b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b11ActionPerformed(evt);
            }
        });
		
		b12.setIcon(p10);
		b12.setBounds(240 , 160 ,80 ,80);
		b12.setVisible(true);
		b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b12ActionPerformed(evt);
            }
        });
		
		b13.setIcon(p9);
		b13.setBounds(0, 240 ,80 ,80);
		b13.setVisible(true);
		b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b13ActionPerformed(evt);
            }
        });
		
		b14.setIcon(p6);
		b14.setBounds(80 , 240 ,80 ,80);
		b14.setVisible(true);
		b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b14ActionPerformed(evt);
            }
        });
		
		b15.setIcon(p2);
		b15.setBounds(160 , 240 ,80 ,80);
		b15.setVisible(true);
		b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b15ActionPerformed(evt);
            }
        });
		
		b16.setBounds(240 , 240 ,80 ,80);
		b16.setVisible(false);
		b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b16ActionPerformed(evt);
            }
        });
		
		frame.add(b1);frame.add(b2);frame.add(b3);
		frame.add(b4);frame.add(b5);frame.add(b6);
		frame.add(b7);frame.add(b8);frame.add(b9);
		frame.add(b10);frame.add(b11);frame.add(b12);
		frame.add(b13);frame.add(b14);frame.add(b15);
		frame.add(b16);
		frame.add(l);
		
	}
	
	private void init(){
		j=16;x=0;
		b1.setIcon(p15);
		b2.setIcon(p3);
		b3.setIcon(p8);
		b4.setIcon(p11);
		b5.setIcon(p14);
		b6.setIcon(p5);
		b7.setIcon(p7);
		b8.setIcon(p1);
		b9.setIcon(p13);
		b10.setIcon(p4);
		b11.setIcon(p12);
		b12.setIcon(p10);
		b13.setIcon(p9);
		b14.setIcon(p6);
		b15.setIcon(p2);
		
	}
	
	private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==2){
			b1.setVisible(false);
			b2.setIcon(b1.getIcon());
			b2.setVisible(true);
			j=1;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==5){
			b1.setVisible(false);
			b5.setIcon(b1.getIcon());
			b5.setVisible(true);
			j=1;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==1){
			b2.setVisible(false);
			b1.setIcon(b2.getIcon());
			b1.setVisible(true);
			j=2;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==3){
			b2.setVisible(false);
			b3.setIcon(b2.getIcon());
			b3.setVisible(true);
			j=2;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==6){
			b2.setVisible(false);
			b6.setIcon(b2.getIcon());
			b6.setVisible(true);
			j=2;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==2){
			b3.setVisible(false);
			b2.setIcon(b3.getIcon());
			b2.setVisible(true);
			j=3;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==4){
			b3.setVisible(false);
			b4.setIcon(b3.getIcon());
			b4.setVisible(true);
			j=3;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==7){
			b3.setVisible(false);
			b7.setIcon(b3.getIcon());
			b7.setVisible(true);
			j=3;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==3){
			b4.setVisible(false);
			b3.setIcon(b4.getIcon());
			b3.setVisible(true);
			j=4;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==8){
			b4.setVisible(false);
			b8.setIcon(b4.getIcon());
			b8.setVisible(true);
			j=4;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==1){
			b5.setVisible(false);
			b1.setIcon(b5.getIcon());
			b1.setVisible(true);
			j=5;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==6){
			b5.setVisible(false);
			b6.setIcon(b5.getIcon());
			b6.setVisible(true);
			j=5;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==9){
			b5.setVisible(false);
			b9.setIcon(b5.getIcon());
			b9.setVisible(true);
			j=5;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==2){
			b6.setVisible(false);
			b2.setIcon(b6.getIcon());
			b2.setVisible(true);
			j=6;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==5){
			b6.setVisible(false);
			b5.setIcon(b6.getIcon());
			b5.setVisible(true);
			j=6;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==7){
			b6.setVisible(false);
			b7.setIcon(b6.getIcon());
			b7.setVisible(true);
			j=6;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==10){
			b6.setVisible(false);
			b10.setIcon(b6.getIcon());
			b10.setVisible(true);
			j=6;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==3){
			b7.setVisible(false);
			b3.setIcon(b7.getIcon());
			b3.setVisible(true);
			j=7;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==6){
			b7.setVisible(false);
			b6.setIcon(b7.getIcon());
			b6.setVisible(true);
			j=7;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==8){
			b7.setVisible(false);
			b8.setIcon(b7.getIcon());
			b8.setVisible(true);
			j=7;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==11){
			b7.setVisible(false);
			b11.setIcon(b7.getIcon());
			b11.setVisible(true);
			j=7;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==4){
			b8.setVisible(false);
			b4.setIcon(b8.getIcon());
			b4.setVisible(true);
			j=8;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==7){
			b8.setVisible(false);
			b7.setIcon(b8.getIcon());
			b7.setVisible(true);
			j=8;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==12){
			b8.setVisible(false);
			b12.setIcon(b8.getIcon());
			b12.setVisible(true);
			j=8;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==5){
			b9.setVisible(false);
			b5.setIcon(b9.getIcon());
			b5.setVisible(true);
			j=9;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==10){
			b9.setVisible(false);
			b10.setIcon(b9.getIcon());
			b10.setVisible(true);
			j=9;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==13){
			b9.setVisible(false);
			b13.setIcon(b9.getIcon());
			b13.setVisible(true);
			j=9;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==6){
			b10.setVisible(false);
			b6.setIcon(b10.getIcon());
			b6.setVisible(true);
			j=10;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==9){
			b10.setVisible(false);
			b9.setIcon(b10.getIcon());
			b9.setVisible(true);
			j=10;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==11){
			b10.setVisible(false);
			b11.setIcon(b10.getIcon());
			b11.setVisible(true);
			j=10;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==14){
			b10.setVisible(false);
			b14.setIcon(b10.getIcon());
			b14.setVisible(true);
			j=10;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==7){
			b11.setVisible(false);
			b7.setIcon(b11.getIcon());
			b7.setVisible(true);
			j=11;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==10){
			b11.setVisible(false);
			b10.setIcon(b11.getIcon());
			b10.setVisible(true);
			j=11;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==12){
			b11.setVisible(false);
			b12.setIcon(b11.getIcon());
			b12.setVisible(true);
			j=11;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==15){
			b11.setVisible(false);
			b15.setIcon(b11.getIcon());
			b15.setVisible(true);
			j=11;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==8){
			b12.setVisible(false);
			b8.setIcon(b12.getIcon());
			b8.setVisible(true);
			j=12;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==11){
			b12.setVisible(false);
			b11.setIcon(b12.getIcon());
			b11.setVisible(true);
			j=12;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==16){
			b12.setVisible(false);
			b16.setIcon(b12.getIcon());
			b16.setVisible(true);
			j=12;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==9){
			b13.setVisible(false);
			b9.setIcon(b13.getIcon());
			b9.setVisible(true);
			j=13;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==14){
			b13.setVisible(false);
			b14.setIcon(b13.getIcon());
			b14.setVisible(true);
			j=13;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==10){
			b14.setVisible(false);
			b10.setIcon(b14.getIcon());
			b10.setVisible(true);
			j=14;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==13){
			b14.setVisible(false);
			b13.setIcon(b14.getIcon());
			b13.setVisible(true);
			j=14;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==15){
			b14.setVisible(false);
			b15.setIcon(b14.getIcon());
			b15.setVisible(true);
			j=14;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==11){
			b15.setVisible(false);
			b11.setIcon(b15.getIcon());
			b11.setVisible(true);
			j=15;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==14){
			b15.setVisible(false);
			b14.setIcon(b15.getIcon());
			b14.setVisible(true);
			j=15;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==16){
			b15.setVisible(false);
			b16.setIcon(b15.getIcon());
			b16.setVisible(true);
			j=15;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
    
    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(j==12){
			b16.setVisible(false);
			b12.setIcon(b16.getIcon());
			b12.setVisible(true);
			j=16;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==15){
			b16.setVisible(false);
			b15.setIcon(b16.getIcon());
			b15.setVisible(true);
			j=16;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}

}
