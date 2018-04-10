package cathc;


import javax.swing.JFrame;


public class dlc {
	static String a;
	public static void main(String[] args) {
		Reader r = new Reader("Calculator");
	r.setVisible(true);
	r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	r.setSize(300, 200);
	r.setResizable(false);
	r.setLocationRelativeTo(null);
	}
	public static String count(String d1, int m){
		if(!d1.equals("0")){
			a = d1;
			a += Integer.toString(m);
		}else{
			a = d1;
			a = Integer.toString(m);
		}
		return a;
	}
	}
