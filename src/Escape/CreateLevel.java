package Escape;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;


public class CreateLevel implements ActionListener{
	
	int i,j,x,q,textur,a,b,but,pozc,q2,texi=1;
	
	int pc;
	Rectangle bc;
	
	JFrame f = new JFrame("Create");
	
	static Icon road = new ImageIcon("Resource/Escape/Img/road.png");
	static Icon wall = new ImageIcon("Resource/Escape/Img/wall.png"); 
	static Icon X = new ImageIcon("Resource/Escape/Img/X.png");
	static Icon doorc = new ImageIcon("Resource/Escape/Img/doorc.png");
	static Icon obs = new ImageIcon("Resource/Escape/Img/obs1.png");
	static Icon chri = new ImageIcon("Resource/Escape/Img/Om3.png");
	
	
	JButton c1 = new JButton();
	JButton c2 = new JButton();
	JButton c3 = new JButton();
	JButton c4 = new JButton();
	JButton c5 = new  JButton();
	JButton c6 = new  JButton();
	JButton c7 = new  JButton();
	JButton c8 = new  JButton();
	JButton c9 = new  JButton();
	JButton c10 = new  JButton();
	JButton c11 = new  JButton();
	JButton c12 = new  JButton();
	JButton c13 = new  JButton();
	JButton c14 = new  JButton();
	JButton c15 = new  JButton();
	JButton c16 = new  JButton();
	JButton c17 = new  JButton();
	JButton c18 = new  JButton();
	JButton c19 = new  JButton();
	JButton c20 = new  JButton();
	JButton c21 = new  JButton();
	JButton c22 = new  JButton();
	JButton c23 = new  JButton();
	JButton c24 = new  JButton();
	JButton c25 = new  JButton();
	JButton c26 = new  JButton();
	JButton c27 = new  JButton();
	JButton c28 = new  JButton();
	JButton c29 = new  JButton();
	JButton c30 = new  JButton();
	JButton c31 = new  JButton();
	JButton c32 = new  JButton();
	JButton c33 = new  JButton();
	JButton c34 = new  JButton();
	JButton c35 = new  JButton();
	JButton c36 = new  JButton();
	JButton c37 = new  JButton();
	JButton c38 = new  JButton();
	JButton c39 = new  JButton();
	JButton c40 = new  JButton();
	JButton c41 = new  JButton();
	JButton c42 = new  JButton();
	JButton c43 = new  JButton();
	JButton c44 = new  JButton();
	JButton c45 = new  JButton();
	JButton c46 = new  JButton();
	JButton c47 = new  JButton();
	JButton c48 = new  JButton();
	JButton c49 = new  JButton();
	JButton c50 = new  JButton();
	JButton c51 = new  JButton();
	JButton c52 = new  JButton();
	JButton c53 = new  JButton();
	JButton c54 = new  JButton();
	JButton c55 = new  JButton();
	JButton c56 = new  JButton();
	JButton c57 = new  JButton();
	JButton c58 = new  JButton();
	JButton c59 = new  JButton();
	JButton c60 = new  JButton();
	JButton c61 = new  JButton();
	JButton c62 = new  JButton();
	JButton c63 = new  JButton();
	JButton c64 = new  JButton();
	JButton c65 = new  JButton();
	JButton c66 = new  JButton();
	JButton c67 = new  JButton();
	JButton c68 = new  JButton();
	JButton c69 = new  JButton();
	JButton c70 = new  JButton();
	JButton c71 = new  JButton();
	JButton c72 = new  JButton();
	JButton c73 = new  JButton();
	JButton c74 = new  JButton();
	JButton c75 = new  JButton();
	JButton c76 = new  JButton();
	JButton c77 = new  JButton();
	JButton c78 = new  JButton();
	JButton c79 = new  JButton();
	JButton c80 = new  JButton();
	JButton c81 = new  JButton();
	JButton c82 = new  JButton();
	JButton c83 = new  JButton();
	JButton c84 = new  JButton();
	JButton c85 = new  JButton();
	JButton c86 = new  JButton();
	JButton c87 = new  JButton();
	JButton c88 = new  JButton();
	JButton c89 = new  JButton();
	JButton c90 = new  JButton();
	JButton c91 = new  JButton();
	JButton c92 = new  JButton();
	JButton c93 = new  JButton();
	JButton c94 = new  JButton();
	JButton c95 = new  JButton();
	JButton c96 = new  JButton();
	JButton c97 = new  JButton();
	JButton c98 = new  JButton();
	JButton c99 = new  JButton();
	JButton c100 = new  JButton();
	JButton c101 = new  JButton();
	JButton c102 = new  JButton();
	JButton c103 = new  JButton();
	JButton c104 = new  JButton();
	JButton c105 = new  JButton();
	JButton c106 = new  JButton();
	JButton c107 = new  JButton();
	JButton c108 = new  JButton();
	JButton c109 = new  JButton();
	JButton c110 = new  JButton();
	JButton c111 = new  JButton();
	JButton c112 = new  JButton();
	JButton c113 = new  JButton();
	JButton c114 = new  JButton();
	JButton c115 = new  JButton();
	JButton c116 = new  JButton();
	JButton c117 = new  JButton();
	JButton c118 = new  JButton();
	JButton c119 = new  JButton();
	JButton c120 = new  JButton();
	JButton c121 = new  JButton();
	JButton c122 = new  JButton();
	JButton c123 = new  JButton();
	JButton c124 = new  JButton();
	JButton c125 = new  JButton();
	JButton c126 = new  JButton();
	JButton c127 = new  JButton();
	JButton c128 = new  JButton();
	JButton c129 = new  JButton();
	JButton c130 = new  JButton();
	JButton c131 = new  JButton();
	JButton c132 = new  JButton();
	JButton c133 = new  JButton();
	JButton c134 = new  JButton();
	JButton c135 = new  JButton();
	JButton c136 = new  JButton();
	JButton c137 = new  JButton();
	JButton c138 = new  JButton();
	JButton c139 = new  JButton();
	JButton c140 = new  JButton();
	JButton c141 = new  JButton();
	JButton c142 = new  JButton();
	JButton c143 = new  JButton();
	JButton c144 = new  JButton();
	
	JButton tex = new JButton();
	JButton gata = new JButton();
	
	Vector<JButton> v = new Vector<JButton>(144,1);
	Vector<Integer> mapa = new Vector<Integer>(144,1);
	Vector<Rectangle> bounds = new Vector<Rectangle>(3,1);
	Vector<Integer> poz = new Vector<Integer>(3,1);
	
	public CreateLevel() throws Exception{
		
		f.setSize(785,748);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
		tex.setBounds(720,0,60,60);
		tex.addActionListener(this);
		tex.setIcon(wall);
		f.add(tex);
		
		gata.setBounds(720,60,60,660);
		gata.addActionListener(this);
		f.add(gata);
		
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
		
		for(i=0;i<144;i++)
			v.get(i).addActionListener(this);
		
		for(i=0;i<12;i++)
		{
			for(j=0;j<12;j++){
				v.get(x).setBounds(j*60,i*60,60,60);
				f.add(v.get(x));
				mapa.add(0);
				x++;
			}
		}
	}
	
	public void Printare() throws IOException{
		x=0;
		Writer fis = new FileWriter("Level.txt");
		for(i=0;i<12;i++)
		{
			for(j=0;j<12;j++){
				fis.write(mapa.get(x)+" ");
				x++;
			}
			fis.write("\n");
		}
		fis.write("Carecter : \n");
		fis.write("    Bounds : "+(int)bc.getX()+" "+(int)bc.getY()+"\n");
		fis.write("    Pozitie : "+pc+"\n");
		for(i=0;i<bounds.size();i++){
			fis.write("Obstacol "+(i+1)+"\n");
			fis.write("    Bounds : "+(int)bounds.get(i).getX()+" "+(int)bounds.get(i).getY()+"\n");
			fis.write("    Pozitie : "+poz.get(i)+"\n");
		}
		fis.close();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tex){
			switch(texi){
				case 1:{
					tex.setIcon(road);
					texi=2;
				}break;
				case 2:{
					tex.setIcon(doorc);
					texi=3;
				}break;
				case 3:{
					tex.setIcon(X);
					texi=4;
				}break;
				case 4:{
					tex.setIcon(chri);
					texi=5;
				}break;
				case 5:{
					tex.setIcon(obs);
					texi=6;
				}break;
				case 6:{
					tex.setIcon(wall);
					texi=1;
				}break;
			}
		}
		if(e.getSource()==gata)
			try {
				Printare();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		for(i=0;i<144;i++)
			if(e.getSource()==v.get(i)){
				switch(texi){
					case 1:{
						v.get(i).setIcon(wall);
						mapa.set(i, 1);
					}break;
					case 2:{
						v.get(i).setIcon(road);
						mapa.set(i, 2);
					}break;
					case 3:{
						v.get(i).setIcon(doorc);
						mapa.set(i, 3);
					}break;
					case 4:{
						v.get(i).setIcon(X);
						mapa.set(i, 4);
					}break;
					case 5:{
						v.get(i).setIcon(chri);
						bc=v.get(i).getBounds();
						pc=i;
					}break;
					case 6:{
						v.get(i).setIcon(obs);
						bounds.add(v.get(i).getBounds());
						poz.add(i);
					}break;
				}
				
			}
		
	}
	
}
