import java.time.LocalDate;
import java.util.ArrayList;

public class Livraria {
    private static volatile Livraria instance;
    private ArrayList<Livro> LLivros = new ArrayList<>();
    private ArrayList<Cliente> LClientees = new ArrayList<>();
    private ArrayList<RequisicaoLivro> LRequisicoes = new ArrayList<>();
    private String nome, cidade;

    public Livraria(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        for (int i = 1; i < 5; i++) {
            Livro livro = new Livro(i,"O cavaleiro da Dinamarca","PortoEditora", this);
            LLivros.add(livro);
        }
    }

    public static Livraria getInstance() {
        if (instance == null) {
            synchronized (Livraria.class) {
                if (instance == null) {
                    instance = new Livraria("Bertrand","Guimaraes");
                }
            }
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public synchronized void RegistarCliente (Cliente cliente) {
        if (LClientees.contains(cliente)){
            System.out.println("Cliente já existe");
        }
        else{
            LClientees.add(cliente);
        }
    }

    public synchronized RequisicaoLivro ReguisitarLivro (Livro livro, Cliente cliente) {
        if (LLivros.contains(livro)){
            System.out.println("Livro não existe");
        }

        else if (LClientees.contains(cliente)){
            System.out.println("Cliente não existe");
        }
        else{
            RequisicaoLivro ReqLivro = new RequisicaoLivro(cliente.getId(), LocalDate.now(), cliente, livro);
            LRequisicoes.add(ReqLivro);
            return ReqLivro;
        }
        return null;
    }
}
