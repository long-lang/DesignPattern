package lel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

public class Myframe {
	static JPanel jp = new  JPanel(null);
	static JPanel jp2 = new JPanel(null);	
	static int width;
	static int height;
	 
		public  void show() {
			JFrame jf = new JFrame();	
			jf.setSize(1200, 850);
			JPanel jp3 = getPanel();		
			jp2.add(jp3);
			jf.add(jp2);		
			jf.setVisible(true);						
		}
		
		//获得面板
		public static JPanel getPanel() {
			JPanel jp3 = new JPanel(new GridLayout(4,1));
			JPanel jp4 = new JPanel(new GridLayout(1,2));
			JPanel jp5 = new JPanel(new GridLayout(1,2));
			JPanel jp6 = new JPanel(new GridLayout(1,2));
			jp3.setBounds(800, 0, 400, 850);
			
			JLabel jl = new JLabel("请输入矩阵的维数：");
			JTextField jt = new JTextField();
			jp4.add(jl);
			jp4.add(jt);
			
			JLabel jl1 = new JLabel("请输入残缺棋子的x坐标");
			JTextField jt1 = new JTextField();
			jp5.add(jl1);
			jp5.add(jt1);
			
			JLabel jl2 = new JLabel("请输入残缺棋子的y坐标");
			JTextField jt2 = new JTextField();
			jp6.add(jl2);
			jp6.add(jt2);
			
			JButton jb = new JButton("确定");
//			给按钮设置监听事件 生成残缺棋盘的解
			jb.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
//                  点击按钮重新生成棋盘
					jp2.remove(jp);
					jp = new JPanel(null);
					jp.setBounds(0, 0, 800, 800);
//					获取数据ֵ
					int s = Integer.parseInt(jt.getText());
					int x = Integer.parseInt(jt1.getText());
					int y = Integer.parseInt(jt2.getText());
					
					width = 800/s;
				    height = 800/s;
					Chessboard chessboard = new Chessboard(width,height);
					colorButtorn(x-1,y-1);					
					chessboard.Cover(0, 0, x-1, y-1, s);
					
					jp.repaint();
					jp2.repaint();
				
					jp2.add(jp);
				
				}
			});
			
			
			jp3.add(jp4);
			jp3.add(jp5);
			jp3.add(jp6);
			jp3.add(jb);
			return jp3;
		}
		//给连续三个同色的棋子上色 颜色随机
		public static JButton[] initButton() {
			JButton[] jb =new JButton[3];
			Color cr = Utils.getColor();
			for(int i=0;i<=2;i++){
				jb[i]=new JButton();
				jb[i].setBackground(cr);
			}
			return jb;
		}
		
		
		//给残缺的棋子涂上黑色
		public static void colorButtorn(int x,int y) {
			JButton jb = new JButton();	
			jb.setBounds((x)*width, (y)*height, width, height);
			jb.setBackground(Color.BLACK);
			jp.add(jb);
		}
		
		
//		将动态生成的按钮加到panel面板上
		public static void  addToPanel(JButton[] jb) {
			for(int i=0;i<=jb.length-1;i++){
				jp.add(jb[i]);
			}
			
			
		}
		

		
		
}
