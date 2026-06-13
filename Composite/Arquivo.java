package Composite;

public class Arquivo implements FileSystemComponent {
    private String name;
    private long size;

    public Arquivo(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display(String indentation) {
        double sizeInMb = (double) size / 1000000;
        System.out.println(indentation + "├─ " + name + " (" + sizeInMb + " MB)");
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Não é possível adicionar componentes a um arquivo.");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Não é possível remover componentes de um arquivo.");
    }
}