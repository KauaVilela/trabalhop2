package interfacepg;

public interface Pagamento {
    void receberPagamento(String tipoPagamento, double valor);
    void consultarContracheque();
    
}
