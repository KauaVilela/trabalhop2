package entity;

import interfacepg.Pagamento;

public class Professor extends Pessoa implements Pagamento {
    protected String numeroDeFuncionario;
    protected Disciplina disciplinasLecionadas;

    public Professor(int id, String nome, String dataNascimento,String email,String telefone, String tipo) {
        super(id, nome, dataNascimento,email,telefone, tipo);
    }
    public void atribuirNota(AlunonaDisciplina aluno, Nota nota) {
        aluno.getNotas().add(nota);
    }
    public void DisciplinaLecionada(Disciplina disciplina)
    {
        this.disciplinasLecionadas = disciplina;
    }
    public void setNumeroDeFuncionario(String numeroDeFuncionario) {
        this.numeroDeFuncionario = numeroDeFuncionario;
    }
    public String getNumeroDeFuncionario() {
        return numeroDeFuncionario;
    }

    public Disciplina getDisciplinasLecionadas()
    {
        return this.disciplinasLecionadas;
    }
    public void exibirDetalhes()
    {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.dataNascimento + "\n ID: " + this.id + "\nemail: " + this.email + "\nTelefone: " + this.telefone + "\nNúmero de Funcionário: " + this.numeroDeFuncionario + "\nTipo : " + this.tipo);
    }
    public void receberPagamento(String tipoPagamento, double valor) {
        System.out.println("Pagamento recebido com sucesso! Tipo de pagamento: " + tipoPagamento + " Valor: R$" + valor);
    }
    public void consultarContracheque() {
        // Implementar lógica para consultar contracheque
        System.out.println("Contracheque disponível para consulta!");
    }

}
