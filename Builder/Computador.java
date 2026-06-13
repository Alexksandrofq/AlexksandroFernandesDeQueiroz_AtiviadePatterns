package Builder;

public class Computador {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public Computador(ComputadorBuilder builder) {
        this.processador = builder.processador;
        this.memoriaRam = builder.memoriaRam;
        this.armazenamento = builder.armazenamento;
        this.placaDeVideo = builder.placaDeVideo;
        this.sistemaOperacional = builder.sistemaOperacional;
    }

    public String getProcessador() { return processador; }
    public String getMemoriaRam() { return memoriaRam; }
    public String getArmazenamento() { return armazenamento; }
    public String getPlacaDeVideo() { return placaDeVideo; }
    public String getSistemaOperacional() { return sistemaOperacional; }

    public void exibirInfo() {
        System.out.println("Processador: " + (processador != null ? processador : "N/A"));
        System.out.println("RAM: " + (memoriaRam != null ? memoriaRam : "N/A"));
        System.out.println("Armazenamento: " + (armazenamento != null ? armazenamento : "N/A"));
        System.out.println("Placa de vídeo: " + (placaDeVideo != null ? placaDeVideo : "N/A"));
        System.out.println("Sistema operacional: " + (sistemaOperacional != null ? sistemaOperacional : "N/A"));
        System.out.println();
    }


}