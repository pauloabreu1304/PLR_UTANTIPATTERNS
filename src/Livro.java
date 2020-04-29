public class Livro {
    private int isbn;
    private String nome, editora;
    private Livraria livraria;

    public Livro(int isbn, String nome, String editora, Livraria livraria) {
        this.isbn = isbn;
        this.nome = nome;
        this.editora = editora;
        this.livraria = livraria;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Livraria getLivraria() {
        return livraria;
    }

    public void setLivraria(Livraria livraria) {
        this.livraria = livraria;
    }
}
