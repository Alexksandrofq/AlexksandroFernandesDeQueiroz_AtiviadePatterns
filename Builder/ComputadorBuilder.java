package Builder;

public class ComputadorBuilder {
    protected String processador;
    protected String memoriaRam;
    protected String armazenamento;
    protected String placaDeVideo;
    protected String sistemaOperacional;

    public ComputadorBuilder setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    public ComputadorBuilder setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        return new Computador(this);
    }
}