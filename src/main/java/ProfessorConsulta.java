

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author thalita
 */
public class ProfessorConsulta extends Frame{
                Dimension dim11 ;
		TextField Tx1 ;
		TextField Tx2 ;
                TextField Tx3 ;
                TextField Tx4 ;
                TextField Tx5 ;
                TextField Tx6 ;
                TextField Tx7 ;
                TextField Tx8 ;
                TextField Tx9 ;
                TextField Tx10 ;
		Label L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13,L14;
                Button B1;
		Button B2;
                CheckboxGroup Cbg;
                Checkbox Cb1, Cb2, Cb3, Cb4;
                CheckboxGroup Cbgc;
                Checkbox Cb11, Cb22, Cb33, Cb44;
               
                
         public ProfessorConsulta(){
                Dimension dim1 = new Dimension(500,650);
              
		setTitle("Thalita Logada");
		setResizable(false);
		setSize(dim1);
		setLocation(100,100);
                setLayout(null);
                
                L1 = new Label("Fazer a consulta dos Professores");
		L1.setLocation(0,30);
		L1.setSize(500,75);
                L1.setFont(new Font("Arial", Font.BOLD ,25));
                L1.setBackground(new Color(0,96,100));
                L1.setForeground(Color.white);
                
                L2 = new Label("IdentProf:");
		L2.setLocation(15,110);
		L2.setSize(100,30);
                L2.setForeground(Color.black);
                
                Tx1 = new TextField("");
                Tx1.setSize(120,30);
		Tx1.setLocation(115,110);
                Tx1.setForeground(Color.black);
               
                L3 = new Label("NomeProf:");
		L3.setLocation(245,110);
		L3.setSize(100,30);
                L3.setForeground(Color.black);
                
                Tx2 = new TextField("");
                Tx2.setSize(120,30);
		Tx2.setLocation(345,110);
                Tx2.setForeground(Color.black);
                
                L4 = new Label("EndProf");
		L4.setLocation(15,150);
		L4.setSize(100,30);
                L4.setForeground(Color.black);
                L4.setFont(new Font("Serif", Font.BOLD, 16));
                
                L5 = new Label("Rua/Av:");
		L5.setLocation(15,200);
		L5.setSize(100,30);
                L5.setForeground(Color.black);
                
                Tx3 = new TextField("");
                Tx3.setSize(120,30);
		Tx3.setLocation(115,200);
                Tx3.setForeground(Color.black);
                
                L6 = new Label("Número:");
		L6.setLocation(245,200);
		L6.setSize(100,30);
                L6.setForeground(Color.black);
                
                Tx4 = new TextField("");
                Tx4.setSize(120,30);
		Tx4.setLocation(345,200);
                Tx4.setForeground(Color.black);
                
                L7 = new Label("Bairro:");
		L7.setLocation(15,240);
		L7.setSize(100,30);
                L7.setForeground(Color.black);
                
                Tx5 = new TextField("");
                Tx5.setSize(120,30);
		Tx5.setLocation(115,240);
           
                L8 = new Label("Cidade:");
		L8.setLocation(15,280);
		L8.setSize(100,30);
                L8.setForeground(Color.black);
                
                Tx6 = new TextField("");
                Tx6.setSize(120,30);
		Tx6.setLocation(115,280);
                
                L9 = new Label("Estado:");
		L9.setLocation(245,280);
		L9.setSize(100,30);
                L9.setForeground(Color.black);
                
                
                Tx7 = new TextField("");
                Tx7.setSize(120,30);
		Tx7.setLocation(345,280);
               
                
                L10 = new Label("TelFixo:");
		L10.setLocation(15,320);
		L10.setSize(100,30);
                L10.setForeground(Color.black);
               
                Tx8 = new TextField("");
                Tx8.setSize(120,30);
		Tx8.setLocation(115,320);
                
                L11 = new Label("Celular:");
		L11.setLocation(245,320);
		L11.setSize(100,30);
                L11.setForeground(Color.black);
               
                Tx9 = new TextField("");
                Tx9.setSize(120,30);
		Tx9.setLocation(345,320);
                
                L12 = new Label("DataNasc:");
		L12.setLocation(15,360);
		L12.setSize(100,30);
                L12.setForeground(Color.black);
               
                Tx10 = new TextField("");
                Tx10.setSize(120,30);
		Tx10.setLocation(115,360);
                
                L13 = new Label("EspecProf:");
		L13.setLocation(15,400);
		L13.setSize(100,30);
                L13.setForeground(Color.black);
                
                Cbgc = new CheckboxGroup();

	        Cb11 = new Checkbox("Informática",Cbg,false);
		Cb11.setLocation(15,435);
		Cb11.setSize(100,30);
	        Cb22 = new Checkbox("Matemática",Cbg,false);
		Cb22.setLocation(15,470);
		Cb22.setSize(100,30);
	        Cb33 = new Checkbox("Medicina",Cbg,false);
		Cb33.setLocation(15,505);
		Cb33.setSize(100,30);
                Cb44 = new Checkbox("Outros",Cbg,true);
		Cb44.setLocation(15,540);
		Cb44.setSize(100,30);
                
                L14 = new Label("TipoCurso:");
		L14.setLocation(245,400);
		L14.setSize(100,30);
                L14.setForeground(Color.black);
                
                Cbg = new CheckboxGroup();

	        Cb1 = new Checkbox("Bacharel",Cbg,false);
		Cb1.setLocation(245,435);
		Cb1.setSize(100,30);
	        Cb2 = new Checkbox("Especialista lato Sensu",Cbg,false);
		Cb2.setLocation(245,470);
		Cb2.setSize(180,30);
	        Cb3 = new Checkbox("Mestrado",Cbg,true);
		Cb3.setLocation(245,500);
		Cb3.setSize(100,30);
                Cb4 = new Checkbox("Doutorado",Cbg,true);
		Cb4.setLocation(245,540);
		Cb4.setSize(100,30);
                
                B1 = new Button("Pesquisar");
		B1.setSize(80,30);
		B1.setLocation(160,600);
                B1.setForeground(Color.white);
		B1.setBackground(new Color(0,96,100));

		B2 = new Button("sair");
		B2.setSize(80,30);
		B2.setLocation(250,600);
                B2.setForeground(Color.white);
		B2.setBackground(new Color(0,96,100));
                
                add(L1); 		
		add(L2); 		
		add(L3);
                add(L4); 
                add(L5);
                add(L6);
                add(L7);
                add(L8);
                add(L9);
                add(L10);
                add(L11);
                add(L12);
                add(L13);
                add(L14);
                add(B1);  
		add(B2);
                add(Tx1); 
                add(Tx2); 
                add(Tx3);
                add(Tx4);
                add(Tx5);
                add(Tx6);
                add(Tx7);
                add(Tx8);
                add(Tx9);
                add(Tx10);
                add(Cb1);
                add(Cb2);
                add(Cb3);
                add(Cb4);
                add(Cb11);
                add(Cb22);
                add(Cb33);
                add(Cb44);
               
		
                
                ButtonHandler handler = new ButtonHandler();
                B1.addActionListener(handler);
                B2.addActionListener(handler);
         }       
                 public static void main (String arg[])
	{
		new ProfessorConsulta().setVisible(true);
	}

        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {//tem que trocar o codigo.
           if(e.getActionCommand() == "Pesquisar")
         JOptionPane.showMessageDialog(null,Tx1.getText() + " Pesquisado com sucesso");
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
