package registrationform;
import java.awt.*;  

public class example1 extends Frame {    

	   example1() { 
		  Frame f = new Frame();    
		  Button b = new Button("Submit!!"); 
		  Label l = new Label("name:");
	      Label p = new Label("id:");
	      Label q = new Label("ph no:");
	      Label r = new Label("mail id:");   
	      TextField t = new TextField(); 
	      TextField m = new TextField(); 
	      TextField n = new TextField(); 
	      TextField o = new TextField();
	      b.setBounds(200, 300, 80, 30);
	      l.setBounds(100, 40, 80, 30); 
	      t.setBounds(100, 70, 170, 20);
	      p.setBounds(100, 100, 80, 30);
	      m.setBounds(100, 130, 170, 20); 
	      q.setBounds(100, 160, 80, 30);
	      n.setBounds(100, 190, 170, 20);
	      r.setBounds(100, 220, 80, 30); 
	      o.setBounds(100, 250, 170, 20); 
	      f.add(b);  
	      f.add(l);  
	      f.add(t);   
	      f.add(l); 
	      f.add(p); 
	      f.add(q); 
	      f.add(r); 
	      f.add(m);
	      f.add(n);
	      f.add(o); 
	      
	      f.setSize(400,400); 
	      f.setTitle("This is a basic registration form");     
	      f.setLayout(null);   
	      f.setVisible(true);   
	}    
	public static void main(String[] args) {
		example1 n = new example1();

	}

}
