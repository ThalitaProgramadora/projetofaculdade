
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Disciplina extends Frame{
        Label L1, L2, L3, L4, L5;
        Button B1;
	Button B2;
        CheckboxGroup Cbg;
        Checkbox Cb1, Cb2, Cb3, Cb4, Cb5, Cb6 ;
        TextField Tx1 ;
        TextField Tx2 ;
        TextField Tx3 ;
        
    public Disciplina(){
                Dimension dim1 = new Dimension(500,430);
		setTitle("Thalita Logada");
		setResizable(false);
		setSize(dim1);
		setLocation(100,100);
                setLayout(null);
                
                L1 = new Label("cadastramento de Disciplina");
		L1.setLocation(0,15);
		L1.setSize(500,75);
                L1.setFont(new Font("Arial", Font.BOLD ,25));
                L1.setBackground(new Color(86,143,170));
                L1.setForeground(Color.white);
                
                L2 = new Label("CodDisc:");
		L2.setLocation(15,140);
		L2.setSize(100,30);
                L2.setForeground(Color.black);
                
                Tx1 = new TextField("");
                Tx1.setSize(100,30);
		Tx1.setLocation(120,140);
                Tx1.setForeground(Color.black);
                
               
                L3 = new Label("Nome Disciplina:");
		L3.setLocation(15,200);
		L3.setSize(100,30);
                L3.setForeground(Color.black);
                
                Tx2 = new TextField("");
                Tx2.setSize(150,30);
		Tx2.setLocation(120,200);
                Tx2.setForeground(Color.black);
                
                L4 = new Label("Carga Horária:");
		L4.setLocation(15,250);
		L4.setSize(100,30);
                L4.setForeground(Color.black);
                
                Tx3 = new TextField("");
                Tx3.setSize(100,30);
		Tx3.setLocation(120,250);
                
                L5 = new Label("Aulas Semanais:");
		L5.setLocation(300,140);
		L5.setSize(100,30);
                L5.setForeground(Color.black);
                
                Cbg = new CheckboxGroup();

	        Cb1 = new Checkbox("01",Cbg,false);
		Cb1.setLocation(300,170);
		Cb1.setSize(100,30);
	        Cb2 = new Checkbox("02",Cbg,false);
		Cb2.setLocation(300,200);
		Cb2.setSize(100,30);
	        Cb3 = new Checkbox("03",Cbg,false);
		Cb3.setLocation(300,230);
		Cb3.setSize(100,30);
                Cb4 = new Checkbox("04",Cbg,true);
		Cb4.setLocation(300,270);
		Cb4.setSize(100,30);
                Cb5 = new Checkbox("05",Cbg,false);
		Cb5.setLocation(300,310);
		Cb5.setSize(100,30);
                Cb6 = new Checkbox("06",Cbg,false);
		Cb6.setLocation(300,340);
		Cb6.setSize(100,30);
                
                B1 = new Button("Salvar");
		B1.setSize(80,30);
		B1.setLocation(160,380);
                B1.setForeground(Color.white);
		B1.setBackground(new Color(86,143,170));

		B2 = new Button("sair");
		B2.setSize(80,30);
		B2.setLocation(250,380);
                B2.setForeground(Color.white);
		B2.setBackground(new Color(86,143,170));
                
                
                add(L1); 		
		add(L2); 		
		add(L3);
                add(L4); 
                add(L5);
                add(Tx1);
                add(Tx2);
                add(Tx3);
                add(B1);  
		add(B2); 
		add(Cb1);
		add(Cb2);
		add(Cb3);
                add(Cb4);
                add(Cb5);
                add(Cb6);
                
                ButtonHandler handler = new ButtonHandler();
                B1.addActionListener(handler);
                B2.addActionListener(handler);
    }
            public static void main (String arg[])
	{
		new Disciplina().setVisible(true);
	}

        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {//tem que trocar o codigo.
           if(e.getActionCommand() == "Salvar")
         JOptionPane.showMessageDialog(null,Tx1.getText() + " Salvo com sucesso");
      else
      { 
                               
                        } 
                        if (e.getActionCommand() == "sair")
                            dispose();  
                        else
                        {
                            
                        }

                }    
    }
}
