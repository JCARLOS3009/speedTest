import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main <class-name> <method-name>");
            return;
        }

        String className = args[0];
        String methodName = args[1];

        try {
            // Carrega a classe dinamicamente
            Class<?> cls = Class.forName(className);

            // Obtém o método especificado (sem parâmetros)
            Method method = cls.getMethod(methodName);

            // Cria uma instância da classe
            Object instance = cls.getDeclaredConstructor().newInstance();

            // Obtém o tempo inicial em nanossegundos
            long startTime = System.nanoTime();

            // Invoca o método
            method.invoke(instance);

            // Obtém o tempo final em nanossegundos
            long endTime = System.nanoTime();

            // Calcula a diferença de tempo e converte para milissegundos
            long durationInMilliseconds = (endTime - startTime) / 1_000_000;

            // Imprime o tempo de execução
            System.out.println("Tempo de execução: " + durationInMilliseconds + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
