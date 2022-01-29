public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("Elvis");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(10);
        cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
