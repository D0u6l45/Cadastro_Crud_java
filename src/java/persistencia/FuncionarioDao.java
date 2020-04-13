
package persistencia;
import entidade.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao extends Dao{
    
     public void cadastrar(Funcionario f)throws Exception{
            abrirConexao();
            
            String sql = "insert into funcionario values(null,?,?,md5(?))";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getLogin());
            stmt.setString(3, f.getSenha());
            stmt.execute();
           fecharConexao();
        }
    
    public Funcionario autenticar(String login,String senha)throws Exception{
        abrirConexao();
       String sql = "select * from funcionario where login=? and senha=md5(?)";
       stmt = con.prepareStatement(sql);
       stmt.setString(1, login);
       stmt.setString(2, senha);
       rs = stmt.executeQuery();
       Funcionario f = null;
       if(rs.next()){
           f = new Funcionario();
           f.setLogin(rs.getString("login"));
       }
       
       fecharConexao();
       return f;
    }
    
    public List<Funcionario> consultar()throws Exception{
        abrirConexao();;
        String sql = "select * from funcionario order by nome asc";
        stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        List<Funcionario> dados = new ArrayList<Funcionario>();
        while(rs.next()){
            Funcionario f = new Funcionario();
            f.setId(rs.getInt("id"));
            f.setNome(rs.getString("nome"));
            f.setLogin(rs.getString("login"));
            f.setSenha(rs.getString("senha"));
            dados.add(f);
        }
        fecharConexao();
        return dados;
        }
    }

    
   /* public static void main(String[] args){
        try{
            Funcionario f = new FuncionarioDao().autenticar("?","?");
            if( f != null){
                System.out.println("Logado");
            }else{
                System.out.println("Acesso negado!");
            }
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
*/
    

