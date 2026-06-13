package Builder;

public class Main {
    public static void main(String[] args) {

        Computador computadorBasico = new ComputadorBuilder()
                .setProcessador("Intel Core i5")
                .setMemoriaRam("8GB")
                .setArmazenamento("256GB SSD")
                .build();

        Computador computadorGamer = new ComputadorBuilder()
                .setProcessador("Intel Core i9")
                .setMemoriaRam("32GB")
                .setArmazenamento("1TB SSD")
                .setPlacaDeVideo("NVIDIA RTX 4070")
                .build();

        System.out.println("=== Computador Básico ===");
        computadorBasico.exibirInfo();

        System.out.println("=== Computador Gamer ===");
        computadorGamer.exibirInfo();
    }
}
