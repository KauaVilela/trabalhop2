package entity;

import java.util.ArrayList;
import java.util.List;


public class Disciplina  {
    private int id;
    private String nome;
    private int cargaHoraria;

    private List<Aluno> alunos;

    public Disciplina(int id, String nome, int cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = new ArrayList<>();
    }public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos da disciplina: " + this.nome);
        for(Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
    
}
