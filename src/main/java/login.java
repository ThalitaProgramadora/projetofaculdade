
import conecction.ConnectionFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author thalita
 */
public class login extends JFrame  implements ActionListener{
   JTextField Tx1;
   JLabel L1, L2, L3;
   JPasswordField Sx;
                
   int Vezes = 0;
		
   public login()
   {
      Dimension dim1 = new Dimension(500,410);
      setTitle("Bem vindo a University");
      setSize(dim1);
      //setLocation(100,100);
      getContentPane().setBackground(new Color(175,238,238));
      setExtendedState(JFrame.MAXIMIZED_BOTH);  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
      L1 = new JLabel("Entre com o seu Usuário e senha:");
      L1.setLocation(250,100);	
      L1.setSize(700,60);
      L1.setFont(new Font("Serif", Font.BOLD, 36));

      L2 = new JLabel("Usuário: ");
      L2.setLocation(450,300);
      L2.setSize(180,30);
      L2.setFont(new Font("Serif", Font.BOLD, 24));

      Tx1 = new JTextField("");
      Tx1.setSize(150,30);
      Tx1.setLocation(570,300);
      Tx1.setFont(new Font("Serif", Font.BOLD, 24));

      L3 = new JLabel("Senha: ");
      L3.setLocation(460,380);
      L3.setSize(150,30);
      L3.setFont(new Font("Serif", Font.BOLD, 24));
		
      JPasswordField Sx = new JPasswordField();
      this.Sx = Sx ;
      Sx.setEchoChar('*');
      Sx.setSize(150,30);
      Sx.setLocation(570,380);
      Sx.addActionListener(this);
      Sx.setFont(new Font("Serif", Font.BOLD, 24));

      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(L2);
      getContentPane().add(L3);
      getContentPane().add(Tx1);
      getContentPane().add(Sx);

   }
   public static void main (String arg[])
   {
      new login().setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      Vezes = Vezes + 1;

      if((Tx1.getText().equals("Thalita")) && (Sx.getText().equals("Linda")))
         JOptionPane.showMessageDialog(null,Tx1.getText() + " Login efetuado com sucesso");
         try {
             new ConnectionFactory().getConnection();
             JOptionPane.showMessageDialog(null, "Banco de dados Conectado com sucesso!");             
         } catch (Exception erro) {
              JOptionPane.showMessageDialog(null, "Ops aconteceu o erro: "  + erro);    
         }
      if (Tx1.getText().equals("Thalita"))
            {
	      MenuA obj = new MenuA();
	      obj.setVisible(true);
            }
            else
          
      { 
         if(Vezes == 3)
         {
            JOptionPane.showMessageDialog(null,"VOCÊ UTILIZOU SUAS 3 TENTATIVAS ! TCHAAAAAUUUUU !");
  	        System.exit(0);
	     }
         else
	        JOptionPane.showMessageDialog(null,"SENHA INCORRETA !!! Verifique e tente novamente!!!");
         
      }
   }
}

