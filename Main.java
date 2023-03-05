class Conta {
    String numerodaconta;
    String titular;
    String saldo;
    String limitedesaque;

    public void imprimirInformacoes(){
        System.out.println("NumerodaConta: " + numerodaconta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limitedesaque: " + limitedesaque);
    }
}
public class Main {
  public static void main(String[] args) {
    Conta minhaconta = new Conta();
    minhaconta.numerodaconta = "15700-2";
    minhaconta.titular = "Debora Silva";
    minhaconta.saldo = "500";
    minhaconta.limitedesaque = "200";

    minhaconta.imprimirInformacoes();

 }
}
