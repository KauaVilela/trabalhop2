package entity;

public class Aluno extends Pessoa {
    protected String matricula;


    public Aluno(int id, String nome, String dataNascimento,String email, String telefone, String tipo, String matricula) {
        super(id, nome, dataNascimento,email,telefone, tipo);
        this.matricula = matricula;

    }

    public String getMatricula() { return matricula;
    }

    public void setMatricula(String matricula) { this.matricula = matricula;
    }

    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nMatrícula: " + this.matricula + "\nTipo : " + this.tipo);
    }
    
}
