/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Frame;
import javax.swing.JOptionPane;
/**
 *
 * @author thalita
 */
public class AlunoAlt extends Frame{
                Dimension dim11 ;
		TextField Tx1 ;
		TextField Tx2 ;
                TextField Tx3 ;
                TextField Tx4 ;
                TextField Tx5 ;
                TextField Tx6 ;
                TextField Tx7 ;
                TextField Tx8 ;
		Label L1, L2, L3, L4, L5, L6, L7, L8, L9, L10;
                Button B1;
		Button B2;
                List Li;
               
                
         public AlunoAlt(){
                Dimension dim1 = new Dimension(500,500);
              
		setTitle("Thalita Logada");
		setResizable(false);
		setSize(dim1);
		setLocation(100,100);
                setLayout(null);
                
                L1 = new Label("Fazendo o alteração de Alunos");
		L1.setLocation(0,30);
		L1.setSize(500,75);
                L1.setFont(new Font("Arial", Font.BOLD ,25));
                L1.setBackground(new Color(138,5,22));
                L1.setForeground(Color.white);
                
                L2 = new Label("Matricula:");
		L2.setLocation(15,110);
		L2.setSize(100,30);
                L2.setForeground(Color.black);
                
                Tx1 = new TextField("");
                Tx1.setSize(120,30);
		Tx1.setLocation(115,110);
                Tx1.setForeground(Color.black);
               
                L3 = new Label("Nome:");
		L3.setLocation(245,110);
		L3.setSize(100,30);
                L3.setForeground(Color.black);
                
                Tx2 = new TextField("");
                Tx2.setSize(120,30);
		Tx2.setLocation(345,110);
                Tx2.setForeground(Color.black);
                
                L4 = new Label("Data de nasc:");
		L4.setLocation(15,150);
		L4.setSize(100,30);
                L4.setForeground(Color.black);
                
                Tx3 = new TextField("");
                Tx3.setSize(120,30);
		Tx3.setLocation(115,150);
                Tx3.setForeground(Color.black);
                
                L5 = new Label("CodCurso:");
		L5.setLocation(245,150);
		L5.setSize(100,30);
                L5.setForeground(Color.black);
                
                Tx4 = new TextField("");
                Tx4.setSize(120,30);
		Tx4.setLocation(345,150);
                Tx4.setForeground(Color.black);
                
                L6 = new Label("Nome Curso:");
		L6.setLocation(15,220);
		L6.setSize(100,30);
                L6.setForeground(Color.black);
                                  
                Li = new List(2, false);
		Li.setLocation(115,200);
		Li.setSize(110,90);
                Li.addItem("CodDisciplina");
                Li.addItem("NomeDisciplina");
           
                L7 = new Label("Nota NP1:");
		L7.setLocation(15,300);
		L7.setSize(100,30);
                L7.setForeground(Color.black);
                
                Tx5 = new TextField("");
                Tx5.setSize(120,30);
		Tx5.setLocation(115,300);
                
                L8 = new Label("Nota NP2:");
		L8.setLocation(15,350);
		L8.setSize(100,30);
                L8.setForeground(Color.black);
                
                
                Tx6 = new TextField("");
                Tx6.setSize(120,30);
		Tx6.setLocation(115,350);
               
                
                L9 = new Label("Média:");
		L9.setLocation(245,300);
		L9.setSize(100,30);
                L9.setForeground(Color.black);
               
                Tx7 = new TextField("");
                Tx7.setSize(100,30);
		Tx7.setLocation(345,300);
                
                L10 = new Label("Faltas:");
		L10.setLocation(245,350);
		L10.setSize(100,30);
                L10.setForeground(Color.black);
               
                Tx8 = new TextField("");
                Tx8.setSize(100,30);
		Tx8.setLocation(345,350);
                
                
                B1 = new Button("Alterar");
		B1.setSize(80,30);
		B1.setLocation(160,450);
                B1.setForeground(Color.white);
		B1.setBackground(new Color(138,5,22));

		B2 = new Button("sair");
		B2.setSize(80,30);
		B2.setLocation(250,450);
                B2.setForeground(Color.white);
		B2.setBackground(new Color(138,5,22));
                
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
		add(Li);
		
                
                ButtonHandler handler = new ButtonHandler();
                B1.addActionListener(handler);
                B2.addActionListener(handler);
         }       
                 public static void main (String arg[])
	{
		new AlunoAlt().setVisible(true);
	}

        private class ButtonHandler implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {//tem que trocar o codigo.
           if(e.getActionCommand() == "Alterar")
         JOptionPane.showMessageDialog(null,Tx1.getText() + " Alterado com sucesso");
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
