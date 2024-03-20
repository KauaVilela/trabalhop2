package entity;

import java.util.ArrayList;
import java.util.List;
import DAO.AlunoDAO;
import DAO.ProfessorDAO;
import interfacepg.Pagamento;

public class Gestoracademico extends Pessoa implements Pagamento {
    private String setor;
    private List<Professor> professores;
    private List<Aluno> alunos;


    public Gestoracademico(int id, String nome, String dataNascimento,String email,String telefone, String tipo) {
        super(id, nome,dataNascimento,email,telefone, tipo);
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        new ProfessorDAO().cadastrarprofessor(professor);
    }

    public void excluirProfessor(Professor professor) {
        professores.remove(professor);
        new ProfessorDAO().excluirprofessor(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        new AlunoDAO().cadastraraluno(aluno);
    }

    public void excluirAluno(Aluno aluno) {
        alunos.remove(aluno);
        new AlunoDAO().excluirAluno(aluno);

    }
    public void listaralunos(){
        for(Aluno aluno : alunos){
            System.out.println("Nome: " + aluno.getNome());
        }
    }
    public void listarprofessores(){
        for(Professor professor : professores){
            System.out.println("Nome: " + professor.getNome() + " Disciplina Lecionada: " + professor.getDisciplinasLecionadas().getNome());
        }
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nSetor: " + this.setor + "\nTipo : " + this.tipo);
    }
    public void receberPagamento(String tipoPagamento, double valor) {
        System.out.println("Pagamento recebido com sucesso! Tipo de pagamento: " + tipoPagamento + " Valor: R$" + valor);
    }
    public void consultarContracheque() {
        // Implementar lógica para consultar contracheque
        System.out.println("Contracheque disponível para consulta!");
    }

}

