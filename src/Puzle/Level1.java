package Puzle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Level1 {
	
	int j=9,x=0;
	
	
	static JButton b1 = new JButton();
	static JButton b2 = new JButton();
	static JButton b3 = new JButton();
	static JButton b4 = new JButton();
	static JButton b5 = new JButton();
	static JButton b6 = new JButton();
	static JButton b7 = new JButton();
	static JButton b8 = new JButton();
	static JButton b9 = new JButton();
	
	static Icon p1 = new ImageIcon("Resource/Puzzle/Level1/1.png");
	static Icon p2 = new ImageIcon("Resource/Puzzle/Level1/2.png");
	static Icon p3 = new ImageIcon("Resource/Puzzle/Level1/3.png");
	static Icon p4 = new ImageIcon("Resource/Puzzle/Level1/4.png");
	static Icon p5 = new ImageIcon("Resource/Puzzle/Level1/5.png");
	static Icon p6 = new ImageIcon("Resource/Puzzle/Level1/6.png");
	static Icon p7 = new ImageIcon("Resource/Puzzle/Level1/7.png");
	static Icon p8 = new ImageIcon("Resource/Puzzle/Level1/8.png");
	static Icon p9 = new ImageIcon("Resource/Puzzle/Level1/9.png");

	
	static JFrame frame = new JFrame("");
	
	public Level1(){
		frame.setSize(245, 268); 
		frame.setLayout(null); 
    	frame.setVisible(true); 
    	frame.setLocationRelativeTo(null); 
    	frame.setResizable(false);
    	frame.setTitle(String.valueOf(x));
    	
    	init();
    	
    	b1.setIcon(p7); 
		b1.setVisible(true); 
		b1.setBounds(0, 0 , 80, 80); 
		b1.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b1ActionPerformed(evt);
            }
        });
		
		b2.setIcon(p2);
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
		
		b4.setIcon(p3);
		b4.setVisible(true);
		b4.setBounds(0 , 80 ,80 ,80);
		b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b4ActionPerformed(evt);
            }
        });
		
		b5.setIcon(p6);
		b5.setVisible(true);
		b5.setBounds(80 , 80 ,80 ,80);
		b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b5ActionPerformed(evt);
            }
        });
		
		b6.setIcon(p4);
		b6.setVisible(true);
		b6.setBounds(160 , 80 ,80 ,80);
		b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b6ActionPerformed(evt);
            }
        });
		
		b7.setIcon(p8);
		b7.setVisible(true);
		b7.setBounds(0 , 160 ,80 ,80);
		b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b7ActionPerformed(evt);
            }
        });
		
		b8.setIcon(p5);
		b8.setVisible(true);
		b8.setBounds(80 , 160 ,80 ,80);
		b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b8ActionPerformed(evt);
            }
        });
		
		b9.setBounds(160 , 160 ,80 ,80);
		b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	b9ActionPerformed(evt);
            }
        });
		b9.setVisible(false);
		
		frame.add(b1);frame.add(b2);frame.add(b3);
		frame.add(b4);frame.add(b5);frame.add(b6);
		frame.add(b7);frame.add(b8);frame.add(b9);
    	
	}
	
	private void init(){
		j=9;x=0;
		b1.setIcon(p8); 
		b2.setIcon(p2);
		b3.setIcon(p1);
		b4.setIcon(p3);
		b5.setIcon(p6);
		b6.setIcon(p4);
		b7.setIcon(p7);
		b8.setIcon(p5);
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
		if(j==4){
			b1.setVisible(false);
			b4.setIcon(b1.getIcon());
			b4.setVisible(true);
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
    	if(j==5){
			b2.setVisible(false);
			b5.setIcon(b2.getIcon());
			b5.setVisible(true);
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
    	if(j==6){
			b3.setVisible(false);
			b6.setIcon(b3.getIcon());
			b6.setVisible(true);
			j=3;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    }
    
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	if(j==1){
			b4.setVisible(false);
			b1.setIcon(b4.getIcon());
			b1.setVisible(true);
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
    	if(j==7){
			b4.setVisible(false);
			b7.setIcon(b4.getIcon());
			b7.setVisible(true);
			j=4;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    } 
    
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	if(j==2){
			b5.setVisible(false);
			b2.setIcon(b5.getIcon());
			b2.setVisible(true);
			j=5;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    	if(j==4){
			b5.setVisible(false);
			b4.setIcon(b5.getIcon());
			b4.setVisible(true);
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
    	if(j==8){
			b5.setVisible(false);
			b8.setIcon(b5.getIcon());
			b8.setVisible(true);
			j=5;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    }
    
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	if(j==3){
			b6.setVisible(false);
			b3.setIcon(b6.getIcon());
			b3.setVisible(true);
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
    	if(j==9){
			b6.setVisible(false);
			b9.setIcon(b6.getIcon());
			b9.setVisible(true);
			j=6;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
    }
    
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	if(j==4){
			b7.setVisible(false);
			b4.setIcon(b7.getIcon());
			b4.setVisible(true);
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
    }
    
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                               
		if(j==9){
			b8.setVisible(false);
			b9.setIcon(b8.getIcon());
			b9.setVisible(true);
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
		if(j==5){
			b8.setVisible(false);
			b5.setIcon(b8.getIcon());
			b5.setVisible(true);
			j=8;
			x++;
			frame.setTitle(String.valueOf("Mutari: "+x));
		}
		
    }
    
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	if(j==6){
			b9.setVisible(false);
			b6.setIcon(b9.getIcon());
			b6.setVisible(true);
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
    }
    
}
