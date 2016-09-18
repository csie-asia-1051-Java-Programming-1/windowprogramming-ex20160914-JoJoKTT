import java.awt.*;
import java.awt.event.*;
public class hw01_1_104021046 extends Frame{
	private Button add=new Button("+");
	private Button minus=new Button("-");
	private Button exit=new Button("exit");
	private Button zero=new Button("zero");
	private int n=0;

	public hw01_1_104021046(){
		initCamp();
	}
	private void initCamp(){
		this.setBounds(300,150,300,350);
		this.setTitle(Integer.toString(n));
		this.setBackground(Color.lightGray);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		this.setLayout(null);
		add.setBounds(62,50,75,100);
		add.setBackground(Color.CYAN);
		add.setFont(new Font("Arial",Font.PLAIN,40));
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				n++;
				get();
			}
		});
		minus.setBounds(162,50,75,100);
		minus.setBackground(Color.black);
		minus.setForeground(Color.LIGHT_GRAY);
		minus.setFont(new Font("Arial",Font.PLAIN,40));
		minus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				n--;
				get();
			}
		});
		zero.setBounds(62,175,175,50);
		zero.setBackground(Color.magenta);
		zero.setFont(new Font("Arial",Font.PLAIN,40));
		zero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				n=0;
				get();
			}
		});
		exit.setBounds(62,250,175,50);
		exit.setBackground(Color.YELLOW);
		exit.setFont(new Font("Arial",Font.PLAIN,40));
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		this.add(add);
		this.add(minus);
		this.add(zero);
		this.add(exit);
		
	}
	public void get(){
		this.setTitle(Integer.toString(n));
	}
}
