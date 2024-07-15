public class Main {

    public static void main(String[] args) {
        Cliente willian = new Cliente();
        willian.setNome("Willian");

        Conta cc = new ContaCorrente(willian);
        Conta cp = new ContaPoupanca(willian);
        cc.depositar(100);
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}