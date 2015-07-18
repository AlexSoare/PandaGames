package Puzle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Level7 {
	
    int j=20,x=0;
	
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
	static JButton b17 = new JButton();
	static JButton b18 = new JButton();
	static JButton b19 = new JButton();
	static JButton b20 = new JButton();
	
	static JLabel l = new JLabel();
	
	static Icon p1 = new ImageIcon("Resource/Puzzle/Level7/1.png");
	static Icon p2 = new ImageIcon("Resource/Puzzle/Level7/2.png");
	static Icon p3 = new ImageIcon("Resource/Puzzle/Level7/3.png");
	static Icon p4 = new ImageIcon("Resource/Puzzle/Level7/4.png");
	static Icon p5 = new ImageIcon("Resource/Puzzle/Level7/5.png");
	static Icon p6 = new ImageIcon("Resource/Puzzle/Level7/6.png");
	static Icon p7 = new ImageIcon("Resource/Puzzle/Level7/7.png");
	static Icon p8 = new ImageIcon("Resource/Puzzle/Level7/8.png");
	static Icon p9 = new ImageIcon("Resource/Puzzle/Level7/9.png");
	static Icon p10 = new ImageIcon("Resource/Puzzle/Level7/10.png");
	static Icon p11 = new ImageIcon("Resource/Puzzle/Level7/11.png");
	static Icon p12 = new ImageIcon("Resource/Puzzle/Level7/12.png");
	static Icon p13 = new ImageIcon("Resource/Puzzle/Level7/13.png");
	static Icon p14 = new ImageIcon("Resource/Puzzle/Level7/14.png");
	static Icon p15 = new ImageIcon("Resource/Puzzle/Level7/15.png");
	static Icon p16 = new ImageIcon("Resource/Puzzle/Level7/16.png");
	static Icon p17 = new ImageIcon("Resource/Puzzle/Level7/17.png");
	static Icon p18 = new ImageIcon("Resource/Puzzle/Level7/18.png");
	static Icon p19 = new ImageIcon("Resource/Puzzle/Level7/19.png");
	static Icon p20 = new ImageIcon("Resource/Puzzle/Level7/20.png");
	static Icon poza = new ImageIcon("Resource/Puzzle/Level7/poza.png");
	
	static JFrame frame = new JFrame("");
	
	public Level7(){
		
		frame.setSize(805, 348); 
		frame.setLayout(null); 
    	frame.setVisible(true); 
    	frame.setLocationRelativeTo(null); 
    	frame.setResizable(false);
		frame.setTitle(String.valueOf("Mutari: "+x));
		
		init();
		
		l.setIcon(poza);
		l.setBounds(400, 0 , 400, 320);
		
		b1.setIcon(p19); 
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
		
		b3.setIcon(p1);
		b3.setVisible(true);
		b3.setBounds(160 , 0, 80 ,80);
		b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b3ActionPerformed(evt);
            }
        });
		
		b4.setIcon(p7);
		b4.setVisible(true);
		b4.setBounds(240 , 0 ,80 ,80);
		b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b4ActionPerformed(evt);
            }
        });
		
		b5.setIcon(p15);
		b5.setVisible(true);
		b5.setBounds(320 , 0 ,80 ,80);
		b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b5ActionPerformed(evt);
            }
        });
		
		b6.setIcon(p18);
		b6.setVisible(true);
		b6.setBounds(0 , 80 ,80 ,80);
		b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b6ActionPerformed(evt);
            }
        });
		
		b7.setIcon(p5);
		b7.setVisible(true);
		b7.setBounds(80 , 80 ,80 ,80);
		b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b7ActionPerformed(evt);
            }
        });
		
		b8.setIcon(p4);
		b8.setVisible(true);
		b8.setBounds(160 , 80 ,80 ,80);
		b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b8ActionPerformed(evt);
            }
        });
		
		b9.setIcon(p10);
		b9.setBounds(240 , 80 ,80 ,80);
		b9.setVisible(true);
		b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b9ActionPerformed(evt);
            }
        });
		
		b10.setIcon(p13);
		b10.setBounds(320 , 80 ,80 ,80);
		b10.setVisible(true);
		b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b10ActionPerformed(evt);
            }
        });
		
		b11.setIcon(p17);
		b11.setBounds(0 , 160 ,80 ,80);
		b11.setVisible(true);
		b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b11ActionPerformed(evt);
            }
        });
		
		b12.setIcon(p16);
		b12.setBounds(80 , 160 ,80 ,80);
		b12.setVisible(true);
		b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b12ActionPerformed(evt);
            }
        });
		
		b13.setIcon(p2);
		b13.setBounds(160 , 160 ,80 ,80);
		b13.setVisible(true);
		b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b13ActionPerformed(evt);
            }
        });
		
		b14.setIcon(p9);
		b14.setBounds(240 , 160 ,80 ,80);
		b14.setVisible(true);
		b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b14ActionPerformed(evt);
            }
        });
		
		b15.setIcon(p6);
		b15.setBounds(320 , 160 ,80 ,80);
		b15.setVisible(true);
		b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b15ActionPerformed(evt);
            }
        });
		
		b16.setIcon(p14);
		b16.setBounds(0 , 240 ,80 ,80);
		b16.setVisible(true);
		b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b16ActionPerformed(evt);
            }
        });
		
		b17.setIcon(p8);
		b17.setBounds(80 , 240 ,80 ,80);
		b17.setVisible(true);
		b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b17ActionPerformed(evt);
            }
        });
		
		b18.setIcon(p11);
		b18.setBounds(160 , 240 ,80 ,80);
		b18.setVisible(true);
		b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b18ActionPerformed(evt);
            }
        });
		
		b19.setIcon(p12);
		b19.setBounds(240 , 240 ,80 ,80);
		b19.setVisible(true);
		b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b19ActionPerformed(evt);
            }
        });
		
		b20.setBounds(320 , 240 ,80 ,80);
		b20.setVisible(false);
		b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b20ActionPerformed(evt);
            }
        });
		
		frame.add(b1);frame.add(b2);frame.add(b3);
		frame.add(b4);frame.add(b5);frame.add(b6);
		frame.add(b7);frame.add(b8);frame.add(b9);
		frame.add(b10);frame.add(b11);frame.add(b12);
		frame.add(b13);frame.add(b14);frame.add(b15);
		frame.add(b16);frame.add(b17);frame.add(b18);
		frame.add(b19);frame.add(b20);
		frame.add(l);
		
	}
	
	private void init(){
		j=20;x=0;
		b1.setIcon(p19);
		b2.setIcon(p3);
		b3.setIcon(p1);
		b4.setIcon(p7);
		b5.setIcon(p15);
		b6.setIcon(p18);
		b7.setIcon(p5);
		b8.setIcon(p4);
		b9.setIcon(p10);
		b10.setIcon(p13);
		b11.setIcon(p17);
		b12.setIcon(p16);
		b13.setIcon(p2);
		b14.setIcon(p9);
		b15.setIcon(p6);
		b16.setIcon(p14);
		b17.setIcon(p8);
		b18.setIcon(p11);
		b19.setIcon(p12);
		
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
		if(j==6){
			b1.setVisible(false);
			b6.setIcon(b1.getIcon());
			b6.setVisible(true);
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
    	if(j==7){
			b2.setVisible(false);
			b7.setIcon(b2.getIcon());
			b7.setVisible(true);
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
    	if(j==8){
			b3.setVisible(false);
			b8.setIcon(b3.getIcon());
			b8.setVisible(true);
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
    	if(j==5){
			b4.setVisible(false);
			b5.setIcon(b4.getIcon());
			b5.setVisible(true);
			j=4;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==9){
			b4.setVisible(false);
			b9.setIcon(b4.getIcon());
			b9.setVisible(true);
			j=4;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    }
	
	private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==4){
			b5.setVisible(false);
			b4.setIcon(b5.getIcon());
			b4.setVisible(true);
			j=5;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==10){
			b5.setVisible(false);
			b10.setIcon(b5.getIcon());
			b10.setVisible(true);
			j=5;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==1){
			b6.setVisible(false);
			b1.setIcon(b6.getIcon());
			b1.setVisible(true);
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
    	if(j==11){
			b6.setVisible(false);
			b11.setIcon(b6.getIcon());
			b11.setVisible(true);
			j=6;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==2){
			b7.setVisible(false);
			b2.setIcon(b7.getIcon());
			b2.setVisible(true);
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
    	if(j==12){
			b7.setVisible(false);
			b12.setIcon(b7.getIcon());
			b12.setVisible(true);
			j=7;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==3){
			b8.setVisible(false);
			b3.setIcon(b8.getIcon());
			b3.setVisible(true);
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
    	if(j==9){
			b8.setVisible(false);
			b9.setIcon(b8.getIcon());
			b9.setVisible(true);
			j=8;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==13){
			b8.setVisible(false);
			b13.setIcon(b8.getIcon());
			b13.setVisible(true);
			j=8;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==4){
			b9.setVisible(false);
			b4.setIcon(b9.getIcon());
			b4.setVisible(true);
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
    	if(j==8){
			b9.setVisible(false);
			b8.setIcon(b9.getIcon());
			b8.setVisible(true);
			j=9;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==14){
			b9.setVisible(false);
			b14.setIcon(b9.getIcon());
			b14.setVisible(true);
			j=9;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b10ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==5){
			b10.setVisible(false);
			b5.setIcon(b10.getIcon());
			b5.setVisible(true);
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
    	if(j==15){
			b10.setVisible(false);
			b15.setIcon(b10.getIcon());
			b15.setVisible(true);
			j=10;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b11ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==6){
			b11.setVisible(false);
			b6.setIcon(b11.getIcon());
			b6.setVisible(true);
			j=11;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==16){
			b11.setVisible(false);
			b16.setIcon(b11.getIcon());
			b16.setVisible(true);
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
	}
	
	private void b12ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==7){
			b12.setVisible(false);
			b7.setIcon(b12.getIcon());
			b7.setVisible(true);
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
    	if(j==13){
			b12.setVisible(false);
			b13.setIcon(b12.getIcon());
			b13.setVisible(true);
			j=12;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==17){
			b12.setVisible(false);
			b17.setIcon(b12.getIcon());
			b17.setVisible(true);
			j=12;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b13ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==8){
			b13.setVisible(false);
			b8.setIcon(b13.getIcon());
			b8.setVisible(true);
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
    	if(j==12){
			b13.setVisible(false);
			b12.setIcon(b13.getIcon());
			b12.setVisible(true);
			j=13;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==18){
			b13.setVisible(false);
			b18.setIcon(b13.getIcon());
			b18.setVisible(true);
			j=13;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b14ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==9){
			b14.setVisible(false);
			b9.setIcon(b14.getIcon());
			b9.setVisible(true);
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
    	if(j==19){
			b14.setVisible(false);
			b19.setIcon(b14.getIcon());
			b19.setVisible(true);
			j=14;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b15ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==10){
			b15.setVisible(false);
			b10.setIcon(b15.getIcon());
			b10.setVisible(true);
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
    	if(j==20){
			b15.setVisible(false);
			b20.setIcon(b15.getIcon());
			b20.setVisible(true);
			j=15;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b16ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==11){
			b16.setVisible(false);
			b11.setIcon(b16.getIcon());
			b11.setVisible(true);
			j=16;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==17){
			b16.setVisible(false);
			b17.setIcon(b16.getIcon());
			b17.setVisible(true);
			j=16;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b17ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==12){
			b17.setVisible(false);
			b12.setIcon(b17.getIcon());
			b12.setVisible(true);
			j=17;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==16){
			b17.setVisible(false);
			b16.setIcon(b17.getIcon());
			b16.setVisible(true);
			j=17;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==18){
			b17.setVisible(false);
			b18.setIcon(b17.getIcon());
			b18.setVisible(true);
			j=17;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	
	}
	
	private void b18ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==13){
			b18.setVisible(false);
			b13.setIcon(b18.getIcon());
			b13.setVisible(true);
			j=18;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==17){
			b18.setVisible(false);
			b17.setIcon(b18.getIcon());
			b17.setVisible(true);
			j=18;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==19){
			b18.setVisible(false);
			b19.setIcon(b18.getIcon());
			b19.setVisible(true);
			j=18;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b19ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==14){
			b19.setVisible(false);
			b14.setIcon(b19.getIcon());
			b14.setVisible(true);
			j=19;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==18){
			b19.setVisible(false);
			b18.setIcon(b19.getIcon());
			b18.setVisible(true);
			j=19;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==20){
			b19.setVisible(false);
			b20.setIcon(b19.getIcon());
			b20.setVisible(true);
			j=19;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}
	
	private void b20ActionPerformed(java.awt.event.ActionEvent evt) {
		if(j==15){
			b20.setVisible(false);
			b15.setIcon(b20.getIcon());
			b15.setVisible(true);
			j=20;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		if(j==19){
			b20.setVisible(false);
			b19.setIcon(b20.getIcon());
			b19.setVisible(true);
			j=20;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
	}

}
