
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class Curso extends Frame{
                Dimension dim11;
		TextField Tx1 ;
		TextField Tx2 ;
                TextField Tx3 ;
		Label L1, L2, L3, L4, L5, L6;
                Button B1;
		Button B2;
                Button B3;
                List Li;
                CheckboxGroup Cbg;
                Checkbox Cb1, Cb2, Cb3;
                
         public Curso(){
                Dimension dim1 = new Dimension(500,500);
		setTitle("Thalita Logada");
		setResizable(false);
		setSize(dim1);
		setLocation(100,100);
                setLayout(null);
                
                L1 = new Label("Fazendo o cadastro de Cursos");
		L1.setLocation(0,30);
		L1.setSize(500,75);
                L1.setFont(new Font("Arial", Font.BOLD ,25));
                L1.setBackground(new Color(138,5,22));
                L1.setForeground(Color.white);
                
                L2 = new Label("CodCurso:");
		L2.setLocation(15,130);
		L2.setSize(100,30);
                L2.setForeground(Color.black);
                
                Tx1 = new TextField("");
                Tx1.setSize(120,30);
		Tx1.setLocation(115,130);
                Tx1.setForeground(Color.black);
               
                L3 = new Label("NomeCurso");
		L3.setLocation(15,180);
		L3.setSize(100,30);
                L3.setForeground(Color.black);
                L3.setFont(new Font("Arial", Font.BOLD ,14));
                        
                Li = new List(8, false);
		Li.setLocation(15,210);
		Li.setSize(150,150);
                Li.addItem("Administração de Empresas");
                Li.addItem("BioMedicina");
                Li.addItem("Ciências Biológico");
                Li.addItem("Direito");
                Li.addItem("Educação Física");
                Li.addItem("Farmacologia");
                Li.addItem("Redes de computadores");
                Li.addItem("Sistema de informação");
                
                L4 = new Label("TipoCurso");
		L4.setLocation(300,190);
		L4.setSize(100,30);
                L4.setForeground(Color.black);
                L4.setFont(new Font("Arial", Font.BOLD ,14));
                
                Cbg = new CheckboxGroup();

	        Cb1 = new Checkbox("Bacharel",Cbg,false);
		Cb1.setLocation(300,230);
		Cb1.setSize(100,30);
	        Cb2 = new Checkbox("Gestão",Cbg,false);
		Cb2.setLocation(300,275);
		Cb2.setSize(100,30);
	        Cb3 = new Checkbox("Outros",Cbg,true);
		Cb3.setLocation(300,310);
		Cb3.setSize(100,30);
                
                L5 = new Label("Carga Horária:");
		L5.setLocation(15,380);
		L5.setSize(100,30);
                L5.setForeground(Color.black);
                
                Tx2 = new TextField("");
                Tx2.setSize(120,30);
		Tx2.setLocation(115,380);
               
                L6 = new Label("CodInstituto:");
		L6.setLocation(300,380);
		L6.setSize(100,30);
                L6.setForeground(Color.black);
               
                Tx3 = new TextField("");
                Tx3.setSize(100,30);
		Tx3.setLocation(380,380);
                
                B1 = new Button("Salvar");
		B1.setSize(80,30);
		B1.setLocation(160,450);
                B1.setForeground(Color.white);
		B1.setBackground(new Color(138,5,22));
                
                B2 = new Button("Excluir");
		B2.setSize(80,30);
		B2.setLocation(250,450);
                B2.setForeground(Color.white);
		B2.setBackground(new Color(138,5,22));
               

		B3 = new Button("sair");
		B3.setSize(80,30);
		B3.setLocation(350,450);
                B3.setForeground(Color.white);
		B3.setBackground(new Color(138,5,22));
                
                add(L1); 		
		add(L2); 		
		add(L3);
                add(L4); 
                add(L5);
                add(L6);
                add(B1);  
		add(B2);
                add(B3);
                add(Tx1); 
                add(Tx2); 
                add(Tx3); 
		add(Li);
		add(Cb1);
		add(Cb2);
		add(Cb3);
                
                ButtonHandler handler = new ButtonHandler();
                B1.addActionListener(handler);
                B2.addActionListener(handler);
                B3.addActionListener(handler);
         }       
                 public static void main (String arg[])
	{
		new Curso().setVisible(true);
	}

        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {//tem que trocar o codigo.
           if(e.getSource() == "Salvar"){
               JOptionPane.showMessageDialog(null,Tx1.getText() + " Cadastrao com sucesso");
               Todos todos = new Todos();
               todos.Cadastrar();
         
           }
         else
      { 
                               
                        } 

                        if (e.getActionCommand() == "sair")
                            dispose(); 
                        else
                        {
                            
                        }if (e.getActionCommand() == "Excluir") 
                            JOptionPane.showMessageDialog(null,Tx1.getText() + " Excluído com sucesso");
                            Todos.excluir(); 
                        
                      
          }   
        }          
   }      
                
                
                

