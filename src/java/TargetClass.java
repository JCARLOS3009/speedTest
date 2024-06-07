public class TargetClass {
    public void execute() {
        // Simulação de um bloco de código
        for (int i = 0; i < 100000000; i++) {
            Math.sqrt(i); // Exemplo de operação a ser medida
        }
    }

    public static void main(String[] args) {
        new TargetClass().execute();
    }
}
