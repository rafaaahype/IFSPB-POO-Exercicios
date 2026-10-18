public abstract class Pagamento {
    public abstract void processar(double valor);
}

class CartaoCredito extends Pagamento {
    @Override
    public void processar(double valor) {
        double valorFinal = valor * 1.05; // 5% de taxa
        System.out.printf("Cartão de Crédito (+5%% de taxa): R$ %.2f%n", valorFinal);
    }
}

class Boleto extends Pagamento {
    @Override
    public void processar(double valor) {
        double valorFinal = valor * 0.90; // 10% de desconto
        System.out.printf("Boleto (-10%% de desconto): R$ %.2f%n", valorFinal);
    }
}

class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        double valorFinal = valor * 0.95; // 5% de desconto
        System.out.printf("Pix (-5%% de desconto): R$ %.2f%n", valorFinal);
    }
}

