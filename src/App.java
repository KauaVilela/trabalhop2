import DAO.AlunoDAO;
import DAO.PessoaDAO;
import entity.Aluno;
import entity.Gestoracademico;
import entity.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno(1, "Kauã", "2003/07/14", "3442432553425", "254526246","aluno","4334414");

        Gestoracademico g1 = new Gestoracademico(1, "dimitri", "2003/12/27", "2432235", "34325524", "gestor");
        Aluno a2 = new Aluno(21, "askjsls", "2000/12/09", "sjkfslf", "kafjlkfafç", "fdhlfdkldfk", "48324234032");
       
    }
}
