
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 *
 * @author thalita
 */
public class MenuA extends JFrame implements ActionListener{
                MenuBar bMenu;
                Menu menu11, menu22, menu33, menu44;
                MenuItem m1, m2, m3, m4, m5, m6, m7, m8, m11, m22, m33, m44, m55, m66, m77, m88, m99;

	public MenuA()
	{
	      setTitle("Thalita Logada");
	      setResizable(false);
	      setSize(900,650);
	      setLocation(100,100);
	      setBackground(new Color(175,238,238));
	      setLayout(null);

                menu11 = new Menu("Cadastrar");
                m1 = new MenuItem("Curso");
                m1.addActionListener(this);
                m2 = new MenuItem("Disciplina");
                m2.addActionListener(this);
                m3 = new MenuItem("Aluno");
                m3.addActionListener(this);
                m4 = new MenuItem("Professor");
                m4.addActionListener(this);
                menu11.add(m1);
                menu11.add(m2);
                menu11.add(m3);
                menu11.add(m4);

                menu22 = new Menu("Alterar");
                m5 = new MenuItem("Curso");
                m5.addActionListener(this);
                m6 = new MenuItem("Disciplina");
                m6.addActionListener(this);
                m7 = new MenuItem("Aluno");
                m7.addActionListener(this);
                m8 = new MenuItem("Professor");
                m8.addActionListener(this);
                menu22.add(m5);
                menu22.add(m6);
                menu22.add(m7);
                menu22.add(m8);
                
                menu33 = new Menu("Mostrar");
                m11 = new MenuItem("Curso");
                m11.addActionListener(this);
                m22 = new MenuItem("Disciplina");
                m22.addActionListener(this);
                m33 = new MenuItem("Aluno");
                m33.addActionListener(this);
                m44 = new MenuItem("Professor");
                m44.addActionListener(this);
                m55 = new MenuItem("Curso/Professor");
                m55.addActionListener(this);
                m66 = new MenuItem("Curso/Disciplina");
                m66.addActionListener(this);
                m77 = new MenuItem("Professor/Disciplina");
                m77.addActionListener(this);
                m88 = new MenuItem("Aluno/Disciplina");
                m88.addActionListener(this);
                menu33.add(m11);
                menu33.add(m22);
                menu33.add(m33);
                menu33.add(m44);
                menu33.addSeparator();
                menu33.add(m55);
                menu33.add(m66);
                menu33.add(m77);
                menu33.add(m88);
                
                menu44 = new Menu("Sair");
                m99 = new MenuItem("Sair");
                m99.addActionListener(this);
                menu44.add(m99);
                menu44.addSeparator();
               

	        bMenu = new MenuBar();
	        bMenu.add(menu11);
	        bMenu.add(menu22);
                bMenu.add(menu33);
                bMenu.add(menu44);

	        setMenuBar(bMenu);

	}
          public boolean handleEvent(Event e)
          {
             if (e.id == Event.WINDOW_DESTROY) 
                System.exit(0);           
                return (super.handleEvent(e));
          }
             public static void main(String arg[])
	{
		new MenuA().setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
               {
         if (e.getSource() == m99)
            System.exit(0); 
         else
            if (e.getSource() == m1)
            {
	       Curso obj = new Curso();
	       obj.setVisible(true);
            }
            else
               if (e.getSource() == m2)
               {
	          Disciplina obj = new Disciplina();
	          obj.setVisible(true);
               }
               else
                  if (e.getSource() == m3)
                  {
	             Aluno obj = new Aluno();
	             obj.setVisible(true);
                  }
                  else
                     if (e.getSource() == m4)
                     {
	                Professor obj = new Professor();
	                obj.setVisible(true);
                     }
                    else
                         if (e.getSource() == m5)
                         {
                            CursoAlt obj = new CursoAlt();
                            obj.setVisible(true);
                          }
                    else
                     if (e.getSource() == m6)
                     {
	                DisciplinaAlt obj = new DisciplinaAlt();
	                obj.setVisible(true);
                     }
                    else
                     if (e.getSource() == m7)
                     {
	                AlunoAlt obj = new AlunoAlt();
	                obj.setVisible(true);
                     }
                    else
                     if (e.getSource() == m8)
                     {
	                ProfessorAlt obj = new ProfessorAlt();
	                obj.setVisible(true);
                     }
          else
                     if (e.getSource() == m11)
                     {
	                CursoConsulta obj = new CursoConsulta();
	                obj.setVisible(true);
                     }
          else
                     if (e.getSource() == m22)
                     {
	                DisciplinaConsulta obj = new DisciplinaConsulta();
	                obj.setVisible(true);
                     }
          else
                     if (e.getSource() == m33)
                     {
	                AlunoConsulta obj = new AlunoConsulta();
	                obj.setVisible(true);
                     }
          else
                     if (e.getSource() == m44)
                     {
	                ProfessorConsulta obj = new ProfessorConsulta();
	                obj.setVisible(true);
                     }
          else
                     if (e.getSource() == m55)
                     {
	                CursoConsulta obj = new CursoConsulta();
	                obj.setVisible(true);
                        
                     }
          else
                     if (e.getSource() == m66)
                     {
	               CursoConsulta obj = new CursoConsulta();
	                obj.setVisible(true);
                     }
          else
                     if (e.getSource() == m77)
                     {
	                ProfessorConsulta obj = new ProfessorConsulta();
	                obj.setVisible(true);
                     }
         else
                     if (e.getSource() == m88)
                     {
	                AlunoConsulta obj = new AlunoConsulta();
	                obj.setVisible(true);
                     }
	}
        }
}
