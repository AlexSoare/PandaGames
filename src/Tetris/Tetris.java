package Tetris;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tetris implements ActionListener,KeyListener{

	int i,j,k,stop,a,b,q,x,d,cul,I,q2,spd=300,q3,q4=0,pct,code,s;
	
	JFrame f = new JFrame("Tetris");
	
	Timer time;
	
	Clip lc = null;
	Clip move = null;
	Clip hit = null;
	Clip swit = null;
	Clip loos = null;
	Clip sta = null;
	
	// Fiecare JLabel reprezinta un "pixel" al jocului , acesta fiind de 40x40
	JLabel p1 = new JLabel();
	JLabel p2 = new JLabel();
	JLabel p3 = new JLabel();
	JLabel p4 = new JLabel();
	JLabel p5 = new JLabel();
	JLabel p6 = new JLabel();
	JLabel p7 = new JLabel();
	JLabel p8 = new JLabel();
	JLabel p9 = new JLabel();
	JLabel p10 = new JLabel();	
	JLabel p11 = new JLabel();
	JLabel p12 = new JLabel();
	JLabel p13 = new JLabel();
	JLabel p14 = new JLabel();
	JLabel p15 = new JLabel();
	JLabel p16 = new JLabel();
	JLabel p17 = new JLabel();
	JLabel p18 = new JLabel();
	JLabel p19 = new JLabel();
	JLabel p20 = new JLabel();
	JLabel p21 = new JLabel();
	JLabel p22 = new JLabel();
	JLabel p23 = new JLabel();
	JLabel p24 = new JLabel();
	JLabel p25 = new JLabel();
	JLabel p26 = new JLabel();
	JLabel p27 = new JLabel();
	JLabel p28 = new JLabel();
	JLabel p29 = new JLabel();
	JLabel p30 = new JLabel();
	JLabel p31 = new JLabel();
	JLabel p32 = new JLabel();
	JLabel p33 = new JLabel();
	JLabel p34 = new JLabel();
	JLabel p35 = new JLabel();
	JLabel p36 = new JLabel();
	JLabel p37 = new JLabel();
	JLabel p38 = new JLabel();
	JLabel p39 = new JLabel();
	JLabel p40 = new JLabel();
	JLabel p41 = new JLabel();
	JLabel p42 = new JLabel();
	JLabel p43 = new JLabel();
	JLabel p44 = new JLabel();
	JLabel p45 = new JLabel();
	JLabel p46 = new JLabel();
	JLabel p47 = new JLabel();
	JLabel p48 = new JLabel();
	JLabel p49 = new JLabel();
	JLabel p50 = new JLabel();
	JLabel p51 = new JLabel();
	JLabel p52 = new JLabel();
	JLabel p53 = new JLabel();
	JLabel p54 = new JLabel();
	JLabel p55 = new JLabel();
	JLabel p56 = new JLabel();
	JLabel p57 = new JLabel();
	JLabel p58 = new JLabel();
	JLabel p59 = new JLabel();
	JLabel p60 = new JLabel();
	JLabel p61 = new JLabel();
	JLabel p62 = new JLabel();
	JLabel p63 = new JLabel();
	JLabel p64 = new JLabel();
	JLabel p65 = new JLabel();
	JLabel p66 = new JLabel();
	JLabel p67 = new JLabel();
	JLabel p68 = new JLabel();
	JLabel p69 = new JLabel();
	JLabel p70 = new JLabel();
	JLabel p71 = new JLabel();
	JLabel p72 = new JLabel();
	JLabel p73 = new JLabel();
	JLabel p74 = new JLabel();
	JLabel p75 = new JLabel();
	JLabel p76 = new JLabel();
	JLabel p77 = new JLabel();
	JLabel p78 = new JLabel();
	JLabel p79 = new JLabel();
	JLabel p80 = new JLabel();
	JLabel p81 = new JLabel();
	JLabel p82 = new JLabel();
	JLabel p83 = new JLabel();
	JLabel p84 = new JLabel();
	JLabel p85 = new JLabel();
	JLabel p86 = new JLabel();
	JLabel p87 = new JLabel();
	JLabel p88 = new JLabel();
	JLabel p89 = new JLabel();
	JLabel p90 = new JLabel();
	JLabel p91 = new JLabel();
	JLabel p92 = new JLabel();
	JLabel p93 = new JLabel();
	JLabel p94 = new JLabel();
	JLabel p95 = new JLabel();
	JLabel p96 = new JLabel();
	JLabel p97 = new JLabel();
	JLabel p98 = new JLabel();
	JLabel p99 = new JLabel();
	JLabel p100 = new JLabel();
	JLabel p101 = new JLabel();
	JLabel p102 = new JLabel();
	JLabel p103 = new JLabel();
	JLabel p104 = new JLabel();
	JLabel p105 = new JLabel();
	JLabel p106 = new JLabel();
	JLabel p107 = new JLabel();
	JLabel p108 = new JLabel();
	JLabel p109 = new JLabel();
	JLabel p110 = new JLabel();	
	JLabel p111 = new JLabel();
	JLabel p112 = new JLabel();
	JLabel p113 = new JLabel();
	JLabel p114 = new JLabel();
	JLabel p115 = new JLabel();
	JLabel p116 = new JLabel();
	JLabel p117 = new JLabel();
	JLabel p118 = new JLabel();
	JLabel p119 = new JLabel();
	JLabel p120 = new JLabel();
	JLabel p121 = new JLabel();
	JLabel p122 = new JLabel();
	JLabel p123 = new JLabel();
	JLabel p124 = new JLabel();
	JLabel p125 = new JLabel();
	JLabel p126 = new JLabel();
	JLabel p127 = new JLabel();
	JLabel p128 = new JLabel();
	JLabel p129 = new JLabel();
	JLabel p130 = new JLabel();
	JLabel p131 = new JLabel();
	JLabel p132 = new JLabel();
	JLabel p133 = new JLabel();
	JLabel p134 = new JLabel();
	JLabel p135 = new JLabel();
	JLabel p136 = new JLabel();
	JLabel p137 = new JLabel();
	JLabel p138 = new JLabel();
	JLabel p139 = new JLabel();
	JLabel p140 = new JLabel();
	JLabel p141 = new JLabel();
	JLabel p142 = new JLabel();
	JLabel p143 = new JLabel();
	JLabel p144 = new JLabel();
	JLabel p145 = new JLabel();
	JLabel p146 = new JLabel();
	JLabel p147 = new JLabel();
	JLabel p148 = new JLabel();
	JLabel p149 = new JLabel();
	JLabel p150 = new JLabel();
	JLabel p151 = new JLabel();
	JLabel p152 = new JLabel();
	JLabel p153 = new JLabel();
	JLabel p154 = new JLabel();
	JLabel p155 = new JLabel();
	JLabel p156 = new JLabel();
	JLabel p157 = new JLabel();
	JLabel p158 = new JLabel();
	JLabel p159 = new JLabel();
	JLabel p160 = new JLabel();
	JLabel p161 = new JLabel();
	JLabel p162 = new JLabel();
	JLabel p163 = new JLabel();
	JLabel p164 = new JLabel();
	JLabel p165 = new JLabel();
	JLabel p166 = new JLabel();
	JLabel p167 = new JLabel();
	JLabel p168 = new JLabel();
	JLabel p169 = new JLabel();
	JLabel p170 = new JLabel();
	JLabel p171 = new JLabel();
	JLabel p172 = new JLabel();
	JLabel p173 = new JLabel();
	JLabel p174 = new JLabel();
	JLabel p175 = new JLabel();
	JLabel p176 = new JLabel();
	JLabel p177 = new JLabel();
	JLabel p178 = new JLabel();
	JLabel p179 = new JLabel();
	JLabel p180 = new JLabel();
	JLabel fin = new JLabel();
	
	JLabel forma = new JLabel();
	JLabel puncte = new JLabel();


	JLabel back = new JLabel();
    JLabel st = new JLabel();
    JLabel dr = new JLabel();
	JTextField speed = new JTextField();
	
	JButton start = new JButton();
	
	JButton again = new JButton();
	
	Icon c = new ImageIcon("Resource/Tetris/Img/c.png");
	Icon cg = new ImageIcon("Resource/Tetris/Img/cg.png");
	Icon ca = new ImageIcon("Resource/Tetris/Img/ca.png");
	Icon cv = new ImageIcon("Resource/Tetris/Img/cv.png");
	Icon cm = new ImageIcon("Resource/Tetris/Img/cm.png");
	Icon cp = new ImageIcon("Resource/Tetris/Img/cp.png");
	Icon n = new ImageIcon("Resource/Tetris/Img/n.png");
    Icon jos = new ImageIcon("Resource/Tetris/Img/jos.png");
    Icon mrg = new ImageIcon("Resource/Tetris/Img/stdr.png");
    Icon background = new ImageIcon("Resource/Tetris/Img/background.png");
    Icon star = new ImageIcon("Resource/Tetris/Img/start.png");
    Icon los = new ImageIcon("Resource/Tetris/Img/lose.png");
    Icon aga = new ImageIcon("Resource/Tetris/Img/again.png");
    Icon wini = new ImageIcon("Resource/Tetris/Img/win.png");
    
    Icon fptr = new ImageIcon("Resource/Tetris/Img/ptr1.png");
    Icon flin = new ImageIcon("Resource/Tetris/Img/lin1.png");
    Icon ft = new ImageIcon("Resource/Tetris/Img/t1.png");
    
    // Vectorul JLabel-urilor , "pixel-ilor"
	Vector<JLabel> v = new Vector<JLabel>(100,1); 
	
	// Vectorul de lungime egala cu cel de JLabel-uri ce retine val de 0 sau 1
	//    -daca pe o pozitie este retinuta val 0 inseamna ca in acea pozitie
	// nu se afla nici o forma
	//    -daca pe o pozitie este retinuta val 1 inseamna ca in acea pozitie
	// se afla o forma
	Vector<Integer> v2 = new Vector<Integer>(100,1); 
	
	// Vectorul de lungime egala cu cel de JLabel-uri ce retine 0,1,2,3,4,5 sau 6
	//    - 0 inseamna ca in acea pozitie nu se afla nici o forma
	//    - alt numar inseamna culoarea JLabel-ului de pe respectiva pozitie
	Vector<Integer> v2c = new Vector<Integer>(100,1);
	
	ActionEvent e;
	
	// Functie ce defineste intregul board
	public Tetris (){
		
		f.setSize(700, 748);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setLayout(null); 
		f.addKeyListener(this);
		f.setFocusable( true );
		
		f.add(st);
		f.add(dr);
		
		
		
		again.setBounds(160,400,145,81);
		again.setIcon(aga);
		again.setVisible(false);
		again.addActionListener(this);
		
		fin.setBounds(40,40,400,640);
			
		back.setBounds(480 , 0 , 220, 720);
		back.setIcon(background);
		st.setBounds(0,0,40,720);
		st.setIcon(mrg);
		dr.setBounds(440,0,40,720);
		dr.setIcon(mrg);
		speed.setBounds(550,15,50,20);
		start.setBounds(500,657,180,50);
		start.addActionListener(this);
		start.setIcon(star);
		forma.setBounds(528,360,120,80);
		forma.setVisible(true);
		puncte.setBounds(634,195,50,40);
		puncte.setVisible(true);
		puncte.setForeground(Color.red);
		puncte.setText("<html><span style='font-size:24px'>"+pct+"</span></html>");
		
		f.add(puncte);
		f.add(forma);
		f.add(start);
		f.add(back);

		v.add(p1);v.add(p2);v.add(p3);v.add(p4);v.add(p5);v.add(p6);v.add(p7);v.add(p8);v.add(p9);v.add(p10);
		v.add(p11);v.add(p12);v.add(p13);v.add(p14);v.add(p15);v.add(p16);v.add(p17);v.add(p18);v.add(p19);v.add(p20);
		v.add(p21);v.add(p22);v.add(p23);v.add(p24);v.add(p25);v.add(p26);v.add(p27);v.add(p28);v.add(p29);v.add(p30);
		v.add(p31);v.add(p32);v.add(p33);v.add(p34);v.add(p35);v.add(p36);v.add(p37);v.add(p38);v.add(p39);v.add(p40);
		v.add(p41);v.add(p42);v.add(p43);v.add(p44);v.add(p45);v.add(p46);v.add(p47);v.add(p48);v.add(p49);v.add(p50);
		v.add(p51);v.add(p52);v.add(p53);v.add(p54);v.add(p55);v.add(p56);v.add(p57);v.add(p58);v.add(p59);v.add(p60);
		v.add(p61);v.add(p62);v.add(p63);v.add(p64);v.add(p65);v.add(p66);v.add(p67);v.add(p68);v.add(p69);v.add(p70);
		v.add(p71);v.add(p72);v.add(p73);v.add(p74);v.add(p75);v.add(p76);v.add(p77);v.add(p78);v.add(p79);v.add(p80);
		v.add(p81);v.add(p82);v.add(p83);v.add(p84);v.add(p85);v.add(p86);v.add(p87);v.add(p88);v.add(p89);v.add(p90);
		v.add(p91);v.add(p92);v.add(p93);v.add(p94);v.add(p95);v.add(p96);v.add(p97);v.add(p98);v.add(p99);v.add(p100);
		v.add(p101);v.add(p102);v.add(p103);v.add(p104);v.add(p105);v.add(p106);v.add(p107);v.add(p108);v.add(p109);v.add(p110);
		v.add(p111);v.add(p112);v.add(p113);v.add(p114);v.add(p115);v.add(p116);v.add(p117);v.add(p118);v.add(p119);v.add(p120);
		v.add(p121);v.add(p122);v.add(p123);v.add(p124);v.add(p125);v.add(p126);v.add(p127);v.add(p128);v.add(p129);v.add(p130);
		v.add(p131);v.add(p132);v.add(p133);v.add(p134);v.add(p135);v.add(p136);v.add(p137);v.add(p138);v.add(p139);v.add(p140);
		v.add(p141);v.add(p142);v.add(p143);v.add(p144);v.add(p145);v.add(p146);v.add(p147);v.add(p148);v.add(p149);v.add(p150);
		v.add(p151);v.add(p152);v.add(p153);v.add(p154);v.add(p155);v.add(p156);v.add(p157);v.add(p158);v.add(p159);v.add(p160);
		v.add(p161);v.add(p162);v.add(p163);v.add(p164);v.add(p165);v.add(p166);v.add(p167);v.add(p168);v.add(p169);v.add(p170);
		v.add(p171);v.add(p172);v.add(p173);v.add(p174);v.add(p175);v.add(p176);v.add(p177);v.add(p178);v.add(p179);v.add(p180);
		
		for(i=0;i<180;i++)
		{
			if(i%10==0 && i!=0)
				j++;
			v.get(i).setBounds(i%10*40+40,j*40,40,40);
			f.add(v.get(i));
			v.get(i).setIcon(n);
			if(i<170)
				v2.add(0);
			else v2.add(1);
			v2c.add(0);
		}
		v.get(170).setText("Pct:");
		for(i=170;i<180;i++)
			v.get(i).setIcon(jos);
		for(i=0;i<10;i++)
			v.get(i).setIcon(jos);
		q=1;
		f.add(again);
		f.add(fin);
		f.repaint();
		

	}
	
	// Aceasta clasa creeaza impresia stergeri board-ului intr-o maniera dinamica , 
	// asteptand un anumit timp dupa fiecare stergere a unui pixel
	class Lose extends TimerTask {
	    public void run() {
	    	v.get(i).setVisible(false);
	    	i++;
	    	if(i<170)
	    		time.schedule(new Lose(), 10); 
	    	else again.setVisible(true);
	    }
	}
	

	// Aceasta clasa creeaza impresia miscari formelor , asteptand un anumit
	// timp dupa fiecare miscare 
	class Time extends TimerTask {
	    public void run() {
	    	Randare();
	    	VerificareLinie();
	    	switch(q3){
		    	case 1:{
		    		if(v2.get(k)==0){
		    			s=0;
					    if(k<170  && v2.get(k+10)==1){
					    	v2.set(k, 1);
					    	v2c.set(k, cul);
					    	try {
						        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Hit.wav"));
						        hit = AudioSystem.getClip();
						        hit.open(audio);
						    }    
						    catch(UnsupportedAudioFileException uae) {}
						    catch(IOException ioe) {}
						    catch(LineUnavailableException lua) {}
					    	hit.start();
					    	s=1;
					    }
					    if(k<=169 && k>9){
					    	Culoare(k,cul);
					    	if(s!=1){
						    	try {
							        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Move.wav"));
							        move = AudioSystem.getClip();
							        move.open(audio);
							    }    
							    catch(UnsupportedAudioFileException uae) {}
							    catch(IOException ioe) {}
							    catch(LineUnavailableException lua) {}
						    	move.start();
					    	}
					    }
					    if(k>19)
					    	if(v2.get(k-10)==0)v.get(k-10).setIcon(n);
					    k+=10;
					    if(k<=179)
					    	time.schedule(new Time(), spd);
					    else{FormaNoua();}    
				    }else{FormaNoua();}
		    	}break;
		    	case 2:{
		    		if(v2.get(a)==0 && v2.get(b)==0){
		    			s=0;
					    if(a<170  && (v2.get(a+10)==1 || v2.get(b+10)==1)){
					    	v2.set(a, 1);
					    	v2.set(b, 1);
					    	v2c.set(a, cul);
					    	v2c.set(b, cul);
					    	try {
						        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Hit.wav"));
						        hit = AudioSystem.getClip();
						        hit.open(audio);
						    }    
						    catch(UnsupportedAudioFileException uae) {}
						    catch(IOException ioe) {}
						    catch(LineUnavailableException lua) {}
					    	hit.start();
					    	s=1;
					    }
					    if(a<=169 && a>9){
					     	Culoare(a,cul);
					     	Culoare(b,cul);
					     	if(s!=1){
						     	try {
							        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Move.wav"));
							        move = AudioSystem.getClip();
							        move.open(audio);
							    }    
							    catch(UnsupportedAudioFileException uae) {}
							    catch(IOException ioe) {}
							    catch(LineUnavailableException lua) {}
						    	move.start();
					     	}
					    }
					    if(a>19){
					    	if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
					    	if(q2==0)
					    		if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
					    	
					    }
					    a+=10;
					    b+=10;
					    if(a<=179)
					    	time.schedule(new Time(), spd);
					    else{FormaNoua();}    
				    }else{FormaNoua();}
		    	}break;
		    	case 3:{
		    		s=0;
		    		if(v2.get(d)==0 && v2.get(a)==0 && v2.get(x)==0){
					    if(d<170  && (v2.get(d+10)==1 || v2.get(a+10)==1 || v2.get(x+10)==1)){
					    	v2.set(a, 1);
					    	v2.set(b, 1);
					    	v2.set(x ,1);
					    	v2.set(d, 1);
					    	v2c.set(a, cul);
					    	v2c.set(b, cul);
					    	v2c.set(x, cul);
					    	v2c.set(d, cul);
					    	try {
						        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Hit.wav"));
						        hit = AudioSystem.getClip();
						        hit.open(audio);
						    }    
						    catch(UnsupportedAudioFileException uae) {}
						    catch(IOException ioe) {}
						    catch(LineUnavailableException lua) {}
					    	hit.start();
					    	s=1;
					    }
					    if(d<=169 && a>9){
					     	Culoare(a,cul);
					     	Culoare(b,cul);
					     	Culoare(x,cul);
					     	Culoare(d,cul);
					     	if(s!=1){
						     	try {
							        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Move.wav"));
							        move = AudioSystem.getClip();
							        move.open(audio);
							    }    
							    catch(UnsupportedAudioFileException uae) {}
							    catch(IOException ioe) {}
							    catch(LineUnavailableException lua) {}
						    	move.start();
					     	}
					    }
					    if(a>19){
					    	if(q2==0){
						    	if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
						    	if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
						    	if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
					    	}else{
					    		if(q2!=3)v.get(x-10).setIcon(n);
					    		v.get(d-10).setIcon(n);
					    	}
					    }
					    a+=10;
					    b+=10;
					    x+=10;
					    d+=10;
					    if(d<=179)
					    	time.schedule(new Time(), spd);
					    else{FormaNoua();}    
				    }else{FormaNoua();}
		    	}break;
	    	}
	    }
	}
	
	// Functie ce verifica daca o linie este completa
	public void VerificareLinie(){
		I=160;
		while(I>20)
		{
			stop=1;
			for(i=I;i<I+10 && stop==1;i++)
				if(v2.get(i)==0)
					stop=0;
			if(stop==1)
				LinieCompleta(I);
			I=I-10;
		}
	}
	
	// Functie ce creeaza o forma noua si o insereaza in joc apeland clasa Time
	public void FormaNoua(){
		if(pct<30){
			q2=0;
			if(VerificarePierdere()==1){
				
				cul=randInt(1,6);
				if(q4==0){
					q4=randInt(1,3);
					while(q4==q)
						q4=randInt(1,3);
					if(q4==1)
						forma.setIcon(fptr);
					if(q4==2)
						forma.setIcon(flin);
					if(q4==3)
						forma.setIcon(ft);
					q3=q;
					q=0;
				}
				else{ 
					q=randInt(1,3);
					while(q==q4)
						q=randInt(1,3);
					if(q==1)
						forma.setIcon(fptr);
					if(q==2)
						forma.setIcon(flin);
					if(q==3)
						forma.setIcon(ft);
					q3=q4;
					q4=0;
				}
				switch(q3){
					case 1:{
						k=randInt(0,9);
						time = new Timer();
						time.schedule(new Time(), spd);
					}break;
					case 2:{
						a=randInt(0,8);
						b=a+1;
						time = new Timer();
						time.schedule(new Time(), spd);
					}break;
					case 3:{
						a=randInt(0,7);
						b=a+1;
						x=b+1;
						d=b+10;
						time = new Timer();
						time.schedule(new Time(), spd);
					}
				}
	
			}
		}else {
			fin.setIcon(wini);
			Pierdut();
		}
	}
	
	// Functie ce seteaza culoare fiecarei forme
	public void Culoare(int poz, int cu){
		switch(cu){
			case 1: v.get(poz).setIcon(c);break;
			case 2: v.get(poz).setIcon(cg);break;
			case 3: v.get(poz).setIcon(ca);break;
			case 4: v.get(poz).setIcon(cp);break;
			case 5: v.get(poz).setIcon(cm);break;
			case 6: v.get(poz).setIcon(cv);break;
		}
	}
	
	// Functie ce sterge o linie cand aceasta este completa si muta
	// toate formele ce sunt deasupra aceste linii cu un pixel mai jos 
	public void LinieCompleta(int linie){
		try {
	        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/LineC.wav"));
	        lc = AudioSystem.getClip();
	        lc.open(audio);
	    }    
	    catch(UnsupportedAudioFileException uae) {}
	    catch(IOException ioe) {}
	    catch(LineUnavailableException lua) {}
		lc.start();
		pct+=2;
		spd=spd-15;
		if(pct%6==0)
			spd=spd-5;
		System.out.println(spd);
		puncte.setText("<html><span style='font-size:24px'>"+pct+"</span></html>");
		for(i=linie;i<linie+10;i++){
			v.get(i).setIcon(n);
			v2.set(i, 0);
			if(v2.get(i-10)==0)
				v2.set(i,0);
		}
		for(i=linie+9;i>9;i--)
		{
				if(v2.get(i)==1){
					if(v2.get(i-10)==0)
						v2.set(i,0);
					if(i<160)
					{
						Culoare(i+10,v2c.get(i));
						v2.set(i+10, 1);
						v2c.set(i+10,v2c.get(i));
					}
					v.get(i).setIcon(n);
				}
		}
	}
	
	// Funcite ce verifica daca pe ultima linie a board-ului se afla vreo forma 
	// -daca se afla inseamna ca jocul este pierdut
	public int VerificarePierdere(){
		for(i=10;i<=19;i++)
			if(v2.get(i)==1)
			{
				fin.setIcon(los);
				Pierdut();
				return 0;
			}
		return 1;
	}
	
	// Functie ce este apelata cand jocul este pierdut , aceasta sterge board-ul
    // adaugand un buton de Play Again
	public void Pierdut()
	{
		try {
	        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Lose.wav"));
	        loos = AudioSystem.getClip();
	        loos.open(audio);
	    }    
	    catch(UnsupportedAudioFileException uae) {}
	    catch(IOException ioe) {}
	    catch(LineUnavailableException lua) {}
    	loos.start();
		i=10;
		time = new Timer();
		time.schedule(new Lose(), 10);
	}
	
	// Functie folosita pentru aparitia unei noi forme random si pentru culoarea 
	// culoarea acesteia
	public static int randInt(int min, int max) {

	    Random rand = new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
   
	// Functie ce randeaza board-ul dupa fiecare miscare a unei forme
	// -este folosita pentru depistarea anumitor bug-uri
	public void Randare()
	{
		for(i=10;i<170;i++)
			if(v2.get(i)==1)
				Culoare(i,v2c.get(i));
			else v.get(i).setIcon(n);
	}
	
	// Functie ce verifica , cand un buton este apasat , ce buton este 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==again)
		{
			try {
		        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Start.wav"));
		        sta = AudioSystem.getClip();
		        sta.open(audio);
		    }    
		    catch(UnsupportedAudioFileException uae) {}
		    catch(IOException ioe) {}
		    catch(LineUnavailableException lua) {}
	    	sta.start();
			spd=300;
			pct=0;
			puncte.setText("<html><span style='font-size:24px'>"+pct+"</span></html>");
			again.setVisible(false);
			for(i=0;i<170;i++)
			{
				v2.set(i,0);
				v2c.set(i,0);
				v.get(i).setVisible(true);
			}
			FormaNoua();
		}
		if(e.getSource()==start)
		{
			try {
		        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Start.wav"));
		        sta = AudioSystem.getClip();
		        sta.open(audio);
		    }    
		    catch(UnsupportedAudioFileException uae) {}
		    catch(IOException ioe) {}
		    catch(LineUnavailableException lua) {}
	    	sta.start();
			start.setVisible(false);
			FormaNoua();
		}
	}

	// Functie ce verifica , cand o tasta este apasata , ce tasta este 
	public void keyPressed(KeyEvent e) {
		code = e.getKeyCode();
		switch(q3){
		case 1:{	
			if(v2.get(k)==0){
				if(code==37 && k%10!=0 && v2.get(k-1)==0)
				{
				    if(v2.get(k-10)==0 && k>19)v.get(k-10).setIcon(n);
					k=k-1;
				}
				if(code==39 && k%10!=9 && v2.get(k+1)==0)
				{
					if(v2.get(k-10)==0 && k>19)v.get(k-10).setIcon(n);
					k=k+1;
				}
			}
		}break;
		case 2:{
			if(v2.get(a)==0 && v2.get(b)==0){
				if(code==32 && v2.get(a+10)==0 && v2.get(b+10)==0){
					if(q2==0){
						v.get(b).setIcon(n);
						b=a+10;
						q2=1;
						try {
					        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Switch.wav"));
					        swit = AudioSystem.getClip();
					        swit.open(audio);
					    }    
					    catch(UnsupportedAudioFileException uae) {}
					    catch(IOException ioe) {}
					    catch(LineUnavailableException lua) {}
				    	swit.start();
					}else if(a%10!=9){
						v.get(b).setIcon(n);
						b=a+1;
						q2=0;
						try {
					        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Switch.wav"));
					        swit = AudioSystem.getClip();
					        swit.open(audio);
					    }    
					    catch(UnsupportedAudioFileException uae) {}
					    catch(IOException ioe) {}
					    catch(LineUnavailableException lua) {}
				    	swit.start();
						
					}
					
				}
				if(code==37 && a%10!=0 && v2.get(a-1)==0)
				{
					if(a>19){
						if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
					    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
					}
					a=a-1;
					b=b-1;
				}
				if(code==39 && b%10!=9 && v2.get(b+1)==0)
				{
					if(a>19){
					    if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
					    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
					}
					a=a+1;
					b=b+1;
				}
			}
		}break;
		case 3:{
			if(v2.get(d)==0){
				if(code==32){
					if(q2==0){
						x=b;
						b=b+10;
						a=b+10;
						d=b+1;
						q2=1;
						try {
					        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Switch.wav"));
					        swit = AudioSystem.getClip();
					        swit.open(audio);
					    }    
					    catch(UnsupportedAudioFileException uae) {}
					    catch(IOException ioe) {}
					    catch(LineUnavailableException lua) {}
				    	swit.start();
					}else if(q2==1 && x%10!=0){
						x=b-1;
						a=d;
						d=b-10;
						q2=2;
						try {
					        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Switch.wav"));
					        swit = AudioSystem.getClip();
					        swit.open(audio);
					    }    
					    catch(UnsupportedAudioFileException uae) {}
					    catch(IOException ioe) {}
					    catch(LineUnavailableException lua) {}
				    	swit.start();
					}else if(q2==2){
						a=b-10;
						d=b-1;
						x=b+10;
						q2=3;
						try {
					        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Switch.wav"));
					        swit = AudioSystem.getClip();
					        swit.open(audio);
					    }    
					    catch(UnsupportedAudioFileException uae) {}
					    catch(IOException ioe) {}
					    catch(LineUnavailableException lua) {}
				    	swit.start();
					}else if(q2==3 && a%10!=9){
						a=b-1;
						x=b+1;
						d=b+10;
						q2=0;
						try {
					        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Tetris/Sounds/Switch.wav"));
					        swit = AudioSystem.getClip();
					        swit.open(audio);
					    }    
					    catch(UnsupportedAudioFileException uae) {}
					    catch(IOException ioe) {}
					    catch(LineUnavailableException lua) {}
				    	swit.start();
					}
				}
				if(q2==0){
					if(code==37 && a%10!=0 && v2.get(a-1)==0 && v2.get(d+9)==0)
					{
						if(a>19){
							if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
						    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
						    if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
						}
						a=a-1;
						b=b-1;
						x=x-1;
						d=d-1;
					}
					if(code==39 && x%10!=9 && v2.get(x+1)==0 && v2.get(d+11)==0)
					{
						if(a>19){
						    if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
						    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
						    if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
						}
						a=a+1;
						b=b+1;
						x=x+1;
						d=d+1;
					}
				}
				if(q2==1){
					if(code==37 && a%10!=0 && v2.get(a-1)==0 && v2.get(b-1)==0 && v2.get(x-1)==0)
					{
						if(a>19){
							if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
						    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
						    if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
						}
						a=a-1;
						b=b-1;
						x=x-1;
						d=d-1;
					}
					if(code==39 && d%10!=9 && v2.get(d+1)==0 && v2.get(a+1)==0)
					{
						if(a>19){
						    if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
						    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
						    if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
						}
						a=a+1;
						b=b+1;
						x=x+1;
						d=d+1;
					}
				}
					if(q2==2){
						if(code==37 && x%10!=0 && v2.get(x-1)==0)
						{
							if(a>19){
								if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
							    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
							    if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
							}
							a=a-1;
							b=b-1;
							x=x-1;
							d=d-1;
						}
						if(code==39 && a%10!=9 && v2.get(a+1)==0)
						{
							if(a>19){
							    if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
							    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
							    if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
							}
							a=a+1;
							b=b+1;
							x=x+1;
							d=d+1;
						}
					}
					if(q2==3){
						if(code==37 && d%10!=0 && v2.get(d-1)==0 && v2.get(x-1)==0)
						{
							if(a>19){
								if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
							    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
							    if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
							}
							a=a-1;
							b=b-1;
							x=x-1;
							d=d-1;
						}
						if(code==39 && a%10!=9 && v2.get(a+1)==0 && v2.get(b+1)==0 && v2.get(x+1)==0)
						{
							if(a>19){
							    if(v2.get(a-10)==0)v.get(a-10).setIcon(n);
							    if(v2.get(b-10)==0)v.get(b-10).setIcon(n);
							    if(v2.get(x-10)==0)v.get(x-10).setIcon(n);
							}
							a=a+1;
							b=b+1;
							x=x+1;
							d=d+1;
						}
					}
				}
		}break;
	}
		
	}

	// Inutila dar necesara , nu face nimic pt acest joc
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	// Inutila dar necesara , nu face nimic pt acest joc
	public void keyTyped(KeyEvent e) {
		
	}
	
}