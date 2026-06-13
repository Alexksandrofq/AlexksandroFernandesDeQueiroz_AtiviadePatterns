package Composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent root = new Directory("root");
        FileSystemComponent docs = new Directory("docs");
        FileSystemComponent fotos = new Directory("fotos");
        FileSystemComponent familia = new Directory("familia");

        FileSystemComponent projeto = new Arquivo("projeto.pdf", 2000000);
        FileSystemComponent relatorio = new Arquivo("relatorio.docx", 1000000);

        FileSystemComponent vacacao = new Arquivo("vacacao.jpg", 3000000);
        FileSystemComponent casal = new Arquivo("casal.jpg", 2000000);
        FileSystemComponent filhos = new Arquivo("filhos.jpg", 1000000);

        FileSystemComponent readme = new Arquivo("readme.txt", 500000);

        docs.add(projeto);
        docs.add(relatorio);

        familia.add(casal);
        familia.add(filhos);

        fotos.add(vacacao);
        fotos.add(familia);

        root.add(docs);
        root.add(fotos);
        root.add(readme);


        root.display("");
        System.out.println();

        System.out.println("Tamanho total: " + (double) root.getSize() / 1000000 + " MB");
        System.out.println("Tamanho da pasta 'docs': " + (double) docs.getSize() / 1000000 + " MB");
        System.out.println("Tamanho da pasta 'familia': " + (double) familia.getSize() / 1000000 + " MB");
    }
}