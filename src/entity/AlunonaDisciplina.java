package entity;

import java.util.ArrayList;
import java.util.List;

import DAO.AlunonaDisciplinaDAO;

/**
 * AlunonaDisciplina
 */
public class AlunonaDisciplina {
    private Aluno aluno;
    private List<Disciplina> disciplinas;
    private List<Nota> notas;

    public void AlunoNaDisciplina(Aluno aluno)
    {
        this.aluno = aluno;
        this.notas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno)
    {
        this.aluno = aluno;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void fazerMatriculaDisciplina(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);
        disciplinas.getAlunos().add(this.aluno); 
        new AlunonaDisciplinaDAO().cadastrardisciplina(disciplinas, this.aluno);
    }

    public void listarNotas(AlunonaDisciplina aluno)//mudar método
    {
        System.out.println("Bem vindo " + aluno.getAluno().getNome() + ",suas notas são: ");
        for(Nota nota: notas)
        {
            System.out.println("Disciplina: " + nota.getDisciplina().getNome());
            System.out.println("-Suas notas na disciplina: " + nota.getNotap1() + " e " + nota.getNotap2());
            System.out.println("----------------------------------------------------------------------");
        }

    }

    public void imprimeMedianaDisciplina(Nota nota)
    {
        System.out.println("A média do aluno "+ aluno.getNome()  +"na disciplina " + nota.getDisciplina().getNome() + " é :");
        System.out.println("- " + nota.calcularMediaAlunoDisciplina());
    }

    
}