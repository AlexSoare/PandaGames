package Culoare;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Culoare implements ActionListener{
	

	int r,g,b,btn,x=0,pct,timer;
	
	static JFrame f = new JFrame("Color");
	
	JButton c1 = new JButton();
	JButton c2 = new JButton();
	JButton c3 = new JButton();
	JButton c4 = new JButton();
	JButton c5 = new JButton();
	JButton c6 = new JButton();
	JButton c7 = new JButton();
	JButton c8 = new JButton();
	JButton c9 = new JButton();
	JButton c10 = new JButton();
	JButton c11 = new JButton();
	JButton c12 = new JButton();
    JButton c13 = new JButton();
	JButton c14 = new JButton();
	JButton c15 = new JButton();
	JButton c16 = new JButton();
	JButton c17 = new JButton();
	JButton c18 = new JButton();
	JButton c19 = new JButton();
	JButton c20 = new JButton();
	JButton c21 = new JButton();
	JButton c22 = new JButton();
	JButton c23 = new JButton();
	JButton c24 = new JButton();
	JButton c25 = new JButton();
	JButton c26 = new JButton();
	JButton c27 = new JButton();
	JButton c28 = new JButton();
	JButton c29 = new JButton();
	JButton c30 = new JButton();
	JButton c31 = new JButton();
	JButton c32 = new JButton();
	JButton c33 = new JButton();
	JButton c34 = new JButton();
	JButton c35 = new JButton();
	JButton c36 = new JButton();
	JButton c37 = new JButton();
	JButton c38 = new JButton();
	JButton c39 = new JButton();
	JButton c40 = new JButton();
	JButton c41 = new JButton();
	JButton c42 = new JButton();
	JButton c43 = new JButton();
	JButton c44 = new JButton();
	JButton c45 = new JButton();
	JButton c46 = new JButton();
	JButton c47 = new JButton();
	JButton c48 = new JButton();
	JButton c49 = new JButton();
	JButton c50 = new JButton();
	JButton c51 = new JButton();
	JButton c52 = new JButton();
	JButton c53 = new JButton();
	JButton c54 = new JButton();
	JButton c55 = new JButton();
	JButton c56 = new JButton();
	JButton c57 = new JButton();
	JButton c58 = new JButton();
	JButton c59 = new JButton();
	JButton c60 = new JButton();
	JButton c61 = new JButton();
	JButton c62 = new JButton();
	JButton c63 = new JButton();
	JButton c64 = new JButton();
	JButton c65 = new JButton();
	JButton c66 = new JButton();
	JButton c67 = new JButton();
	JButton c68 = new JButton();
	JButton c69 = new JButton();
	JButton c70 = new JButton();
	JButton c71 = new JButton();
	JButton c72 = new JButton();
	JButton c73 = new JButton();
	JButton c74 = new JButton();
	JButton c75 = new JButton();
	JButton c76 = new JButton();
	JButton c77 = new JButton();
	JButton c78 = new JButton();
	JButton c79 = new JButton();
	JButton c80 = new JButton();
	JButton c81 = new JButton();
	JButton c82 = new JButton();
	JButton c83 = new JButton();
	JButton c84 = new JButton();
	JButton c85 = new JButton();
	JButton c86 = new JButton();
	JButton c87 = new JButton();
	JButton c88 = new JButton();
	JButton c89 = new JButton();
	JButton c90 = new JButton();
	JButton c91 = new JButton();
	JButton c92 = new JButton();
	JButton c93 = new JButton();
	JButton c94 = new JButton();
	JButton c95 = new JButton();
	JButton c96 = new JButton();
	JButton c97 = new JButton();
	JButton c98 = new JButton();
	JButton c99 = new JButton();
	JButton c100 = new JButton();
	
	JButton start = new JButton("Start");

	
	Icon background = new ImageIcon("Resource/Color/background.png");
	Icon terminat = new ImageIcon("Resource/Color/finish.png");
	
	JLabel back = new JLabel();
	JLabel punctaj = new JLabel();
	
	Timer time = new Timer();
	
	Vector<JButton> v = new Vector<JButton>(100,1);
	
	public Culoare(){
		
		f.setSize(306,329);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		f.setLocationRelativeTo(null);	
		
		back.setBounds(0,0,307,330);
		back.setIcon(background);
		
		start.setBounds(53, 225, 200, 50);
		start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	startActionPerformed(evt);
            }
        });
		
		punctaj.setBounds(83, 115, 200, 50);
		punctaj.setVisible(false);
		punctaj.setForeground(Color.WHITE);
		
		
		v.add(c1);v.add(c2);v.add(c3);v.add(c4);v.add(c5);v.add(c6);v.add(c7);v.add(c8);v.add(c9);v.add(c10);v.add(c11);v.add(c12);
		v.add(c13);v.add(c14);v.add(c15);v.add(c16);v.add(c17);v.add(c18);v.add(c19);v.add(c20);v.add(c21);v.add(c22);v.add(c23);v.add(c24);
		v.add(c25);v.add(c26);v.add(c27);v.add(c28);v.add(c29);v.add(c30);v.add(c31);v.add(c32);v.add(c33);v.add(c34);v.add(c35);v.add(c36);
		v.add(c37);v.add(c38);v.add(c39);v.add(c40);v.add(c41);v.add(c42);v.add(c43);v.add(c44);v.add(c45);v.add(c46);v.add(c47);v.add(c48);
		v.add(c49);v.add(c50);v.add(c51);v.add(c52);v.add(c53);v.add(c54);v.add(c55);v.add(c56);v.add(c57);v.add(c58);v.add(c59);v.add(c60);
		v.add(c61);v.add(c62);v.add(c63);v.add(c64);v.add(c65);v.add(c66);v.add(c67);v.add(c68);v.add(c69);v.add(c70);v.add(c71);v.add(c72);
		v.add(c73);v.add(c74);v.add(c75);v.add(c76);v.add(c77);v.add(c78);v.add(c79);v.add(c80);v.add(c81);v.add(c82);v.add(c83);v.add(c84);
		v.add(c85);v.add(c86);v.add(c87);v.add(c88);v.add(c89);v.add(c90);v.add(c91);v.add(c92);v.add(c93);v.add(c94);v.add(c95);v.add(c96);
		v.add(c97);v.add(c98);v.add(c99);v.add(c100);
		
		f.add(start);
		f.add(punctaj);
		f.add(back);
		
		Init();

	}
	
	public void Init(){
		x=0;
		pct=0;
		timer = 0;
		back.setVisible(true);
		back.setIcon(background);
		start.setVisible(true);
	}
	
	public void Next_Level(){
		x=0;
		if(pct < 15){
			r=randInt(61,255);
			g=randInt(61,255);
			b=randInt(61,255);
			btn= randInt(2,24);	
			
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++){
					v.get(x).setBounds(i*60,j*60,60,60);
					v.get(x).setBackground(new Color(r , g , b));
					x++;
				}
			if(pct<10){
				v.get(btn).setBackground(new Color(r-60 , g-60 , b-60));
			}
			else{
				v.get(btn).setBackground(new Color(r-20 , g-20 , b-20));
			}
			f.setTitle("Puncte: "+String.valueOf(pct));	
			f.repaint();
		}else{
			r=randInt(100,255);
			g=randInt(100,255);
			b=randInt(100,255);
			btn= randInt(2,99);	
			
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++){
					v.get(x).setBounds(i*30,j*30,30,30);
					v.get(x).setBackground(new Color(r , g , b));
					x++;
				}
			if(pct<25){
				v.get(btn).setBackground(new Color(r-20 , g-20 , b-20));
			}else if(pct<50){
				v.get(btn).setBackground(new Color(r-10 , g-10 , b-10));
			}else{
				v.get(btn).setBackground(new Color(r-5 , g-5 , b-5));
			}
			f.setTitle("Puncte: "+String.valueOf(pct));	
			f.repaint();
			if(pct == 60){
				finish();
			}
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == v.get(btn)){
			pct++;
			Next_Level();
		}else{
			if(pct > 0){
				pct--;
				f.setTitle("Puncte: "+String.valueOf(pct));
			}
		}
	}
	
	private void startActionPerformed(java.awt.event.ActionEvent evt) { 
		start.setVisible(false);
		back.setVisible(false);
		time.schedule(new Time(), 1000);
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++){
				v.get(x).addActionListener(this);
				f.add(v.get(x));
				x++;
			}
		Next_Level();
	}
	
	
	public void finish (){
		x=0;
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++){
				f.remove(v.get(x));
				x++;
			}
		back.setVisible(true);
		punctaj.setVisible(true);
		back.setIcon(terminat);
		punctaj.setText("Ai terminat in "+ String.valueOf(timer)+" secunde");
	}
	
	public static int randInt(int min, int max) {

	    Random rand = new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	class Time extends TimerTask {
	    public void run() {
	    	timer++;
	    	time.schedule(new Time(), 1000);
	    }
	}

}
