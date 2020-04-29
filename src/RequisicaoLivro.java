import java.time.LocalDate;

public class RequisicaoLivro {
    private int numrequisicao, numdias;
    private LocalDate data;
    private Cliente cliente;
    private Livro livro;

    public RequisicaoLivro(int numrequisicao, LocalDate data, Cliente cliente, Livro livro) {
        this.numrequisicao = numrequisicao;
        this.numdias = numdias;
        this.data = data;
        this.cliente = cliente;
        this.livro = livro;
    }

    public int getNumrequisicao() {
        return numrequisicao;
    }

    public void setNumrequisicao(int numrequisicao) {
        this.numrequisicao = numrequisicao;
    }

    public int getNumdias() {
        return numdias;
    }

    public void setNumdias(int numdias) {
        this.numdias = numdias;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
