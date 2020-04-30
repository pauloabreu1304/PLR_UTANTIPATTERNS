import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class testeantipatterns {

    private static Livraria livraria;
    private static Livro livro;
    private static Cliente cliente;
    private static RequisicaoLivro requisicaolivro;

    @BeforeAll
    static void initialize(){
    }

    //the liar
    @Test
    public void RegistoRequisicao(){
        livraria = new Livraria("Bertrand","Guimaraes");
        cliente = new Cliente(1, 21 ,"Paulo", "Guimaraes");
        livro = new Livro(1,"O cavaleiro da Dinamarca","PortoEditora", livraria);
        livraria.ReguisitarLivro(livro, cliente);

    }

    //Test-per-Method
    //Dodger
    @Test
    public void nomecliente(){
        cliente = new Cliente(1, 21 ,"Paulo", "Guimaraes");
        cliente.setNome("Paulito");
        assertEquals("Paulito", cliente.getNome());
    }

    //secret catcher
    @Test
    public void verificadisponibilidadelivro(){
        livraria = new Livraria("Bertrand","Guimaraes");
        livro = new Livro(20,"O cavaleiro da Dinamarca","PortoEditora", livraria);
        livraria.AdicionaLivro(livro);
        assertEquals(1,livraria.ProcuraLivro(livro));
    }

    //Enumerator
    //FreeRide
    @Test
    public void testXPTO(){
        livraria = new Livraria("Bertrand","Guimaraes");
        livro = new Livro(1,"O cavaleiro da Dinamarca","PortoEditora", livraria);
        assertEquals(livraria, livro.getLivraria());
    }
}