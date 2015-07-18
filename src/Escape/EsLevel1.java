package Escape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
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
import javax.swing.JFrame;
import javax.swing.JLabel;



public class EsLevel1 implements KeyListener , ActionListener {
	
	JFrame f = new JFrame("Level 1");

	JFrame f2 = new JFrame("Restart");
	
	
	
	int i,j,x,q,textur,a,b,but,pozc,q2; // la nevoie
	int dor,dor2=0; // usa
	int ob=1,ob1,ob2,ob3; //,on(n) , AICI ADAUGI ob(n) , target-uri noi 
	int pozo1,o,p; // obstacol 1
	int pozo2,o2,p2; // obstacol 2
	int pozo3,o3,p3; // obstacol 3
	//int pozo(n),o(n),p(n); 
	////////////////////////////////////////////// AICI ADAUGI VARIABILELE OBSTACOLELOR NOI
	
	Clip d = null;
	Timer time = new Timer();
	
	Icon road = new ImageIcon("Resource/Escape/Img/road.png");
	Icon wall = new ImageIcon("Resource/Escape/Img/wall.png"); 
	Icon chri = new ImageIcon("Resource/Escape/Img/Om3.png");
	Icon obs = new ImageIcon("Resource/Escape/Img/obs1.png");
	Icon X = new ImageIcon("Resource/Escape/Img/X.png");
	Icon doorc = new ImageIcon("Resource/Escape/Img/doorc.png");
	Icon Res = new ImageIcon("Resource/Escape/Img/Res.png");

	JLabel c1 = new JLabel();
	JLabel c2 = new JLabel();
	JLabel c3 = new JLabel();
	JLabel c4 = new JLabel();
	JLabel c5 = new  JLabel();
	JLabel c6 = new  JLabel();
	JLabel c7 = new  JLabel();
	JLabel c8 = new  JLabel();
	JLabel c9 = new  JLabel();
	JLabel c10 = new  JLabel();
	JLabel c11 = new  JLabel();
	JLabel c12 = new  JLabel();
	JLabel c13 = new  JLabel();
	JLabel c14 = new  JLabel();
	JLabel c15 = new  JLabel();
	JLabel c16 = new  JLabel();
	JLabel c17 = new  JLabel();
	JLabel c18 = new  JLabel();
	JLabel c19 = new  JLabel();
	JLabel c20 = new  JLabel();
	JLabel c21 = new  JLabel();
	JLabel c22 = new  JLabel();
	JLabel c23 = new  JLabel();
	JLabel c24 = new  JLabel();
	JLabel c25 = new  JLabel();
	JLabel c26 = new  JLabel();
	JLabel c27 = new  JLabel();
	JLabel c28 = new  JLabel();
	JLabel c29 = new  JLabel();
	JLabel c30 = new  JLabel();
	JLabel c31 = new  JLabel();
	JLabel c32 = new  JLabel();
	JLabel c33 = new  JLabel();
	JLabel c34 = new  JLabel();
	JLabel c35 = new  JLabel();
	JLabel c36 = new  JLabel();
	JLabel c37 = new  JLabel();
	JLabel c38 = new  JLabel();
	JLabel c39 = new  JLabel();
	JLabel c40 = new  JLabel();
	JLabel c41 = new  JLabel();
	JLabel c42 = new  JLabel();
	JLabel c43 = new  JLabel();
	JLabel c44 = new  JLabel();
	JLabel c45 = new  JLabel();
	JLabel c46 = new  JLabel();
	JLabel c47 = new  JLabel();
	JLabel c48 = new  JLabel();
	JLabel c49 = new  JLabel();
	JLabel c50 = new  JLabel();
	JLabel c51 = new  JLabel();
	JLabel c52 = new  JLabel();
	JLabel c53 = new  JLabel();
	JLabel c54 = new  JLabel();
	JLabel c55 = new  JLabel();
	JLabel c56 = new  JLabel();
	JLabel c57 = new  JLabel();
	JLabel c58 = new  JLabel();
	JLabel c59 = new  JLabel();
	JLabel c60 = new  JLabel();
	JLabel c61 = new  JLabel();
	JLabel c62 = new  JLabel();
	JLabel c63 = new  JLabel();
	JLabel c64 = new  JLabel();
	JLabel c65 = new  JLabel();
	JLabel c66 = new  JLabel();
	JLabel c67 = new  JLabel();
	JLabel c68 = new  JLabel();
	JLabel c69 = new  JLabel();
	JLabel c70 = new  JLabel();
	JLabel c71 = new  JLabel();
	JLabel c72 = new  JLabel();
	JLabel c73 = new  JLabel();
	JLabel c74 = new  JLabel();
	JLabel c75 = new  JLabel();
	JLabel c76 = new  JLabel();
	JLabel c77 = new  JLabel();
	JLabel c78 = new  JLabel();
	JLabel c79 = new  JLabel();
	JLabel c80 = new  JLabel();
	JLabel c81 = new  JLabel();
	JLabel c82 = new  JLabel();
	JLabel c83 = new  JLabel();
	JLabel c84 = new  JLabel();
	JLabel c85 = new  JLabel();
	JLabel c86 = new  JLabel();
	JLabel c87 = new  JLabel();
	JLabel c88 = new  JLabel();
	JLabel c89 = new  JLabel();
	JLabel c90 = new  JLabel();
	JLabel c91 = new  JLabel();
	JLabel c92 = new  JLabel();
	JLabel c93 = new  JLabel();
	JLabel c94 = new  JLabel();
	JLabel c95 = new  JLabel();
	JLabel c96 = new  JLabel();
	JLabel c97 = new  JLabel();
	JLabel c98 = new  JLabel();
	JLabel c99 = new  JLabel();
	JLabel c100 = new  JLabel();
	JLabel c101 = new  JLabel();
	JLabel c102 = new  JLabel();
	JLabel c103 = new  JLabel();
	JLabel c104 = new  JLabel();
	JLabel c105 = new  JLabel();
	JLabel c106 = new  JLabel();
	JLabel c107 = new  JLabel();
	JLabel c108 = new  JLabel();
	JLabel c109 = new  JLabel();
	JLabel c110 = new  JLabel();
	JLabel c111 = new  JLabel();
	JLabel c112 = new  JLabel();
	JLabel c113 = new  JLabel();
	JLabel c114 = new  JLabel();
	JLabel c115 = new  JLabel();
	JLabel c116 = new  JLabel();
	JLabel c117 = new  JLabel();
	JLabel c118 = new  JLabel();
	JLabel c119 = new  JLabel();
	JLabel c120 = new  JLabel();
	JLabel c121 = new  JLabel();
	JLabel c122 = new  JLabel();
	JLabel c123 = new  JLabel();
	JLabel c124 = new  JLabel();
	JLabel c125 = new  JLabel();
	JLabel c126 = new  JLabel();
	JLabel c127 = new  JLabel();
	JLabel c128 = new  JLabel();
	JLabel c129 = new  JLabel();
	JLabel c130 = new  JLabel();
	JLabel c131 = new  JLabel();
	JLabel c132 = new  JLabel();
	JLabel c133 = new  JLabel();
	JLabel c134 = new  JLabel();
	JLabel c135 = new  JLabel();
	JLabel c136 = new  JLabel();
	JLabel c137 = new  JLabel();
	JLabel c138 = new  JLabel();
	JLabel c139 = new  JLabel();
	JLabel c140 = new  JLabel();
	JLabel c141 = new  JLabel();
	JLabel c142 = new  JLabel();
	JLabel c143 = new  JLabel();
	JLabel c144 = new  JLabel();
	
	JLabel chr = new JLabel();
	JLabel obs1 = new JLabel();
	JLabel obs2 = new JLabel();
	JLabel obs3 = new JLabel();
	
	JButton r = new JButton("Restart");
	
	// JLabel obs(n) = new JLabel();
	/////////////////////////////////////////// AICI CREEZI OBSTACOLELE NOI 
	
	Vector<JLabel> v = new Vector<JLabel>(144,1);
	Vector<Integer> mapa = new Vector<Integer>(144,1);
	Vector<Integer> poz = new Vector<Integer>(144,1);
	
	private Scanner s;
	
	public EsLevel1() throws Exception{
		
	
		
		f2.setSize(120,90);
		f2.setLayout(null);
		f2.setResizable(false);
		f2.setVisible(true);
		f2.setLocation(f.getX()+f.getWidth() + 10, f.getY());
		time.schedule(new Time(), (long) 10);
		
		f.setSize(725,748);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		f.setLocation(PozF.PozX,PozF.PozY);
		f.addKeyListener(this);
		f.hasFocus();

		r.setBounds(0,0,130,63);
		r.addActionListener(this);
		r.setIcon(Res);
		f2.add(r);
	
		a=60;
		b=120;
		pozc = 25;
		chr.setBounds(a,b,60,60);
		chr.setIcon(chri);
		
		o=120;
		p=540;
		pozo1 = 110;
		obs1.setBounds(o,p,60,60);
		obs1.setIcon(obs);
		
		o2=300;
		p2=120;
		pozo2 = 29;
		obs2.setBounds(o2,p2,60,60);
		obs2.setIcon(obs);
		
		o3=540;
		p3=300;
		pozo3 = 69;
		obs3.setBounds(o3,p3,60,60);
		obs3.setIcon(obs);
		
		/*o(n)=540;
		p(n)=300;
		pozo(n) = 69;
		obs(n).setBounds(o(n),p(n),60,60);
		obs(n).setIcon(obs);*/
		//////////////////////////////////////AICI SETEZI BOUNDS-URILE OBSTACOLELOR NOI
		
		v.add(c1);v.add(c2);v.add(c3);v.add(c4);v.add(c5);v.add(c6);v.add(c7);v.add(c8);v.add(c9);v.add(c10);v.add(c11);v.add(c12);
		v.add(c13);v.add(c14);v.add(c15);v.add(c16);v.add(c17);v.add(c18);v.add(c19);v.add(c20);v.add(c21);v.add(c22);v.add(c23);v.add(c24);
		v.add(c25);v.add(c26);v.add(c27);v.add(c28);v.add(c29);v.add(c30);v.add(c31);v.add(c32);v.add(c33);v.add(c34);v.add(c35);v.add(c36);
		v.add(c37);v.add(c38);v.add(c39);v.add(c40);v.add(c41);v.add(c42);v.add(c43);v.add(c44);v.add(c45);v.add(c46);v.add(c47);v.add(c48);
		v.add(c49);v.add(c50);v.add(c51);v.add(c52);v.add(c53);v.add(c54);v.add(c55);v.add(c56);v.add(c57);v.add(c58);v.add(c59);v.add(c60);
		v.add(c61);v.add(c62);v.add(c63);v.add(c64);v.add(c65);v.add(c66);v.add(c67);v.add(c68);v.add(c69);v.add(c70);v.add(c71);v.add(c72);
		v.add(c73);v.add(c74);v.add(c75);v.add(c76);v.add(c77);v.add(c78);v.add(c79);v.add(c80);v.add(c81);v.add(c82);v.add(c83);v.add(c84);
		v.add(c85);v.add(c86);v.add(c87);v.add(c88);v.add(c89);v.add(c90);v.add(c91);v.add(c92);v.add(c93);v.add(c94);v.add(c95);v.add(c96);
		v.add(c97);v.add(c98);v.add(c99);v.add(c100);v.add(c101);v.add(c102);v.add(c103);v.add(c104);v.add(c105);v.add(c106);v.add(c107);v.add(c108);
		v.add(c109);v.add(c110);v.add(c111);v.add(c112);v.add(c113);v.add(c114);v.add(c115);v.add(c116);v.add(c117);v.add(c118);v.add(c119);v.add(c120);
		v.add(c121);v.add(c122);v.add(c123);v.add(c124);v.add(c125);v.add(c126);v.add(c127);v.add(c128);v.add(c129);v.add(c130);v.add(c131);v.add(c132);
		v.add(c133);v.add(c134);v.add(c135);v.add(c136);v.add(c137);v.add(c138);v.add(c139);v.add(c140);v.add(c141);v.add(c142);v.add(c143);v.add(c144);
		
		x=0;
		q=0;
		
		f.add(chr);
		f.add(obs1);
		f.add(obs2);
		f.add(obs3);
		//f.add(obs(n));
		//////////////////////////////////////AICI ADAUGI OBSTACOLELE NOI IN FRAME 
		
		for(i=0;i<144;i++)
			poz.add(-1);
		
		poz.set(pozc, 0);
		poz.set(pozo1 ,1);
		poz.set(pozo2 ,2);
		poz.set(pozo3 ,3);
		//poz.set(pozo(n), n);
		//////////////////////////////////////AICI ADAUGI POZITIA OBSTACOLELOR NOI 
		
		File file = new File("Resource/Escape/lvl/l1.txt");
		s = new Scanner(file);
		
		for(i=0;i<12;i++)
			for(j=0;j<12;j++){
				v.get(x).setBounds(j*60,i*60,60,60);
				f.add(v.get(x));
				textur = s.nextInt();
				mapa.add(textur);
			    if(textur==1)
			    	v.get(x).setIcon(wall);
			    if(textur==2)
			    	v.get(x).setIcon(road);
			    if(textur==3){
			    	v.get(x).setIcon(doorc);
			    	dor=x;
			    }
			    if(textur==4)
			    {
			    	if(ob==1)
			    		ob1=x;
			    	if(ob==2)
			    		ob2=x;
			    	if(ob==3)
			    		ob3=x;
			    	//////////////////////////////////////AICI Target-urile noi  
			    	v.get(x).setIcon(X);
			    	ob++;
			    }
				x++;
			}

	}
	
	class Time extends TimerTask {
	     public void run() {
	    	f2.setLocation(f.getX()+f.getWidth() + 10, f.getY());
	 		time.schedule(new Time(), (long) 10);
	     }
	}
	
	
	public void VerificareCastig(){
		//////////////////////////////////////////////////// AICI ADAUGI VERIFICAREA OBSTACOLELOR NOI (TE PRINZI TU CUM)
		if((pozo1==ob1 || pozo2==ob1 || pozo3==ob1)&&(pozo1==ob2 || pozo2==ob2 || pozo3==ob2)&&(pozo1==ob3 || pozo2==ob3 || pozo3==ob3))
		{
			try {
		        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Resource/Escape/dooro.wav"));
		        d = AudioSystem.getClip();
		        d.open(audio);
		    }    
		    catch(UnsupportedAudioFileException uae) {}
		    catch(IOException ioe) {}
		    catch(LineUnavailableException lua) {}
	    	d.start();
			v.get(dor).setIcon(new ImageIcon("Resource/Escape/Img/door.gif"));
			dor2=1;
		}
		
	}

	public void keyPressed(KeyEvent e) {
		but = e.getKeyCode();
		if(but==38 && pozc-12==dor && dor2==1)
		{
			chr.setBounds(a,b-60,60,60);
			b=b-60;
			poz.set(pozc, -1);
			pozc=pozc-12;
			poz.set(pozc, 0);
			f.dispose();
			f2.dispose();
			try {
				new EsLevel2();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(but==40 && pozc+12==dor && dor2==1)
		{
			chr.setBounds(a,b+60,60,60);
			b=b+60;
			poz.set(pozc, -1);
			pozc=pozc+12;
			poz.set(pozc, 0);
			f.dispose();
			f2.dispose();
			try {
				new EsLevel2();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(but==37 && pozc-1==dor && dor2==1)
		{
			chr.setBounds(a-60,b,60,60);
			a=a-60;
			poz.set(pozc, -1);
			pozc=pozc-1;
			poz.set(pozc, 0);
			f.dispose();
			f2.dispose();
			try {
				new EsLevel2();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(but==39 && pozc+1==dor && dor2==1)
		{
			chr.setBounds(a+60,b,60,60);
			a=a+60;
			poz.set(pozc, -1);
			pozc=pozc+1;
			poz.set(pozc, 0);
			f.dispose();
			f2.dispose();
			try {
				new EsLevel2();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(but==38 && mapa.get(pozc-12)!=1 && pozc-12!=dor) // Sus
		{
				q=0;
				q2=0;
				for(i=pozc-12;i>=pozc-24;i=i-12)
				{
					////////////////////////////////// AICI LAFEL poz.get(i)==(n)
					if(poz.get(i)==1 || poz.get(i)==2 || poz.get(i)==3) 
					{
						q++;
						q2++;
					}
					if(mapa.get(i)==1)
						q2++;
				}
				if(q!=2 && q2!=2)
				{
					chr.setBounds(a,b-60,60,60);
					b=b-60;
					poz.set(pozc, -1);
					pozc=pozc-12;
					poz.set(pozc, 0);
					if(pozc==pozo1)
					{
						obs1.setBounds(o,p-60,60,60);
						p=p-60;
						poz.set(pozo1, -1);
						pozo1=pozo1-12;
						poz.set(pozo1, 1);
						VerificareCastig();
					}
					if(pozc==pozo2)
					{
						obs2.setBounds(o2,p2-60,60,60);
						p2=p2-60;
						poz.set(pozo2, -1);
						pozo2=pozo2-12;
						poz.set(pozo2, 2);
						VerificareCastig();
					}
					if(pozc==pozo3)
					{
						obs3.setBounds(o3,p3-60,60,60);
						p3=p3-60;
						poz.set(pozo3, -1);
						pozo3=pozo3-12;
						poz.set(pozo3, 3);
						VerificareCastig();
					}
					/*if(pozc==pozo(n))
					{
						obs3.setBounds(o(n),p(n)-60,60,60);
						p(n)=p(n)-60;
						poz.set(pozo(n), -1);
						pozo(n)=pozo(n)-12;
						poz.set(pozo(n), (n));
						VerificareCastig();
					}*/
					///////////////////////// AICI ADAUGI MISCAREA OBSTACOLELOR NOI , SI LAFEL CA AICI SI PENTRU URMATOARELE 3 IF-URI
				}
		}
		if(but==40 && mapa.get(pozc+12)!=1 && pozc+12!=dor) // Jos
		{
			q=0;
			q2=0;
			for(i=pozc+12;i<=pozc+24;i=i+12){
				if(poz.get(i)==1 || poz.get(i)==2 || poz.get(i)==3)
				{
					q++;
					q2++;
				}
				if(mapa.get(i)==1)
					q2++;
			}
			if(q!=2 && q2!=2){
				chr.setBounds(a,b+60,60,60);
				b=b+60;
				poz.set(pozc, -1);
				pozc=pozc+12;
				poz.set(pozc, 0);
				if(pozc==pozo1)
				{
					obs1.setBounds(o,p+60,60,60);
					p=p+60;
					poz.set(pozo1, -1);
					pozo1=pozo1+12;
					poz.set(pozo1, 1);
					VerificareCastig();
				}
				if(pozc==pozo2)
				{
					obs2.setBounds(o2,p2+60,60,60);
					p2=p2+60;
					poz.set(pozo2, -1);
					pozo2=pozo2+12;
					poz.set(pozo2, 2);
					VerificareCastig();
				}
				if(pozc==pozo3)
				{
					obs3.setBounds(o3,p3+60,60,60);
					p3=p3+60;
					poz.set(pozo3, -1);
					pozo3=pozo3+12;
					poz.set(pozo3, 3);
					VerificareCastig();
				}
			}
		}
		if(but==37 && mapa.get(pozc-1)!=1 && pozc-1!=dor) // Stanga
		{
			q=0;
			q2=0;
			for(i=pozc-1;i>=pozc-2;i=i-1){
				if(poz.get(i)==1 || poz.get(i)==2 || poz.get(i)==3)
				{
					q++;
					q2++;
				}
				if(mapa.get(i)==1)
					q2++;
			}
			if(q!=2 && q2!=2)
			{
				chr.setBounds(a-60,b,60,60);
				a=a-60;
				poz.set(pozc, -1);
				pozc=pozc-1;
				poz.set(pozc, 0);
				if(pozc==pozo1)
				{
					obs1.setBounds(o-60,p,60,60);
					o=o-60;
					poz.set(pozo1, -1);
					pozo1=pozo1-1;
					poz.set(pozo1, 1);
					VerificareCastig();
				}
				if(pozc==pozo2)
				{
					obs2.setBounds(o2-60,p2,60,60);
					o2=o2-60;
					poz.set(pozo2, -1);
					pozo2=pozo2-1;
					poz.set(pozo2, 2);
					VerificareCastig();
				}
				if(pozc==pozo3)
				{
					obs3.setBounds(o3-60,p3,60,60);
					o3=o3-60;
					poz.set(pozo3, -1);
					pozo3=pozo3-1;
					poz.set(pozo3, 3);
					VerificareCastig();
				}
			}
		}
		if(but==39 && mapa.get(pozc+1)!=1 && pozc+1!=dor) // Dreapta
		{
			q=0;
			q2=0;
			for(i=pozc+1;i<=pozc+2;i=i+1){
				if(poz.get(i)==1 || poz.get(i)==2 || poz.get(i)==3)
				{
					q++;
					q2++;
				}
				if(mapa.get(i)==1)
					q2++;
			}
			if(q!=2 && q2!=2){
				chr.setBounds(a+60,b,60,60);
				a=a+60;
				poz.set(pozc, -1);
				pozc=pozc+1;
				poz.set(pozc, 0);
				if(pozc==pozo1)
				{
					obs1.setBounds(o+60,p,60,60);
					o=o+60;
					poz.set(pozo1, -1);
					pozo1=pozo1+1;
					poz.set(pozo1, 1);
					VerificareCastig();
				}
				if(pozc==pozo2)
				{
					obs2.setBounds(o2+60,p2,60,60);
					o2=o2+60;
					poz.set(pozo2, -1);
					pozo2=pozo2+1;
					poz.set(pozo2, 2);
					VerificareCastig();
				}
				if(pozc==pozo3)
				{
					obs3.setBounds(o3+60,p3,60,60);
					o3=o3+60;
					poz.set(pozo3, -1);
					pozo3=pozo3+1;
					poz.set(pozo3, 3);
					VerificareCastig();
				}
			}
		}
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		
		
	}

	public void actionPerformed(ActionEvent arg0) {
		PozF.PozX=f.getX();
		PozF.PozY=f.getY();
		try {
			new EsLevel1().finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		f2.dispose();
		f.dispose();
		
	}



}
