
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author thalita
 */
public class Todos {
    
    public static void Cadastrar(){
    //Metodo cadastrarCliente
        try {
             CursoA curso = new CursoA();
            //1 passo  - criar o comando sql
            String sql = "insert into CursoA (NomeCurso,TipoCurso,CargaHoraria,CodInstituto) "
                    + " values (?,?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, curso.getNomeCurso());
            stmt.setString(2, curso.getTipoCurso());
            stmt.setInt(3, curso.getCargaHoraria());
            stmt.setInt(4, curso.getCodInstituto());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

    //Metodo AlterarCliente
    public static void alterar(){
        try {
            CursoA curso = new CursoA();
            //1 passo  - criar o comando sql
            String sql = "update CursoA set  NomeCurso=?, TipoCurso=?, CargaHoraria=?, CodInstituto=? where CodCurso =?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, curso.getNomeCurso());
            stmt.setString(2, curso.getTipoCurso());
            stmt.setInt(3, curso.getCargaHoraria());
            stmt.setInt(4, curso.getCodInstituto());

            stmt.setInt(5, curso.getCodCurso());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }
    }

    //Metodo ExcluirCliente
    public static void excluir() {
        try {
            CursoA curso = new CursoA();
            //1 passo  - criar o comando sql
            String sql = "delete from CursoA where CodCurso = ?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, curso.getCodCurso());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }
    
    
    
}
