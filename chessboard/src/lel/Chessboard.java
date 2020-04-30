package lel;



import javax.swing.JButton;

public class Chessboard {
	
	int width = 50;
	int  height = 50;
	
	
	public Chessboard(int width, int height ) {
		this.height=height;
		this.width=width;
	}
	
	void Cover(int tr,int tc,int dr,int dc,int size)
	{
	    int s;
	    if(size<2)
	        return ;
	   
	    s=size/2;
	    int x=tr+s;
    	int y=tc+s;
	    if(dr<tr+s&&dc<tc+s)
	    {
//			获取三个一样颜色的按钮数组
//	    	给其设置边界
	    	JButton[] jb = Myframe.initButton();
			jb[0].setBounds((x-1)*width, (y)*height, width, height);
			jb[1].setBounds((x)*width, (y-1)*height, width, height);
			jb[2].setBounds((x)*width, (y)*height, width, height);
//			将按钮组加到面板中
			Myframe.addToPanel(jb);
	        
	        Cover(tr,tc,dr,dc,s);
	        Cover(tr,tc+s,tr+s-1,tc+s,s);
	        Cover(tr+s,tc,tr+s,tc+s-1,s);
	        Cover(tr+s,tc+s,tr+s,tc+s,s);
	    }
	    else if(dr<tr+s&&dc>=tc+s)
	    {
	        JButton[] jb = Myframe.initButton();
	    	jb[0].setBounds((x-1)*width, (y-1)*height, width, height);
			jb[1].setBounds((x)*width, (y-1)*height, width, height);
			jb[2].setBounds((x)*width, (y)*height, width, height);
			Myframe.addToPanel(jb);
	        Cover(tr,tc,tr+s-1,tc+s-1,s);
	        Cover(tr,tc+s,dr,dc,s);
	        Cover(tr+s,tc,tr+s,tc+s-1,s);
	        Cover(tr+s,tc+s,tr+s,tc+s,s);
	    }
	    else if(dr>=tr+s&&dc<tc+s)
	    {
	    	JButton[] jb = Myframe.initButton();
	    	jb[0].setBounds((x-1)*width, (y-1)*height, width, height);
			jb[1].setBounds((x-1)*width, (y)*height, width, height);
			jb[2].setBounds((x)*width, (y)*height, width, height);
			Myframe.addToPanel(jb);
	        Cover(tr,tc,tr+s-1,tc+s-1,s);
	        Cover(tr,tc+s,tr+s-1,tc+s,s);
	        Cover(tr+s,tc,dr,dc,s);
	        Cover(tr+s,tc+s,tr+s,tc+s,s);
	    }
	    else
	    {

	    	JButton[] jb = Myframe.initButton(); 
	    	jb[0].setBounds((x-1)*width, (y-1)*height, width, height);
			jb[1].setBounds((x-1)*width, (y)*height, width, height);
			jb[2].setBounds((x)*width, (y-1)*height, width, height);
			Myframe.addToPanel(jb);

	        Cover(tr,tc,tr+s-1,tc+s-1,s);
	        Cover(tr,tc+s,tr+s-1,tc+s,s);
	        Cover(tr+s,tc,tr+s,tc+s-1,s);
	        Cover(tr+s,tc+s,dr,dc,s);
	    }
	}

	

}
