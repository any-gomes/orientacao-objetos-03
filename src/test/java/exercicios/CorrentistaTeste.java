package exercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    private Correntista c1;

    @BeforeEach
    public void beforeEach(){
        c1 = new Correntista(1.0,"Any Gomes","any.gomes@outlook.com.br","11987643546");
    }

    @Test
    public void criarObjetoCorrentista() { assertNotNull(c1);
    }

    @Test
    public void presencaAtributoCodigo() {
        assertEquals(1.0, c1.getCodigo());
        assertEquals("Any Gomes", c1.getNome());
        assertEquals("any.gomes@outlook.com.br", c1.getEmail());
        assertEquals("11987643546", c1.getTelefone());
    }

    @Test
    public void presencaAtributoNome() {
        assertNotNull(c1.getNome());
    }

    @Test
    public void presencaAtributoEmail() {
        assertNotNull(c1.getEmail());
    }

    @Test
    public void presencaAtributoTelefone() {
        assertNotNull(c1.getTelefone());
    }

    /*@Test
    public void metodoSetCodigo() {
        assertEquals(1.0, c1.getCodigo());
    }*/

    @Test
    public void metodoSetCodigoIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setCodigo(-2.0));
        assertEquals("Código tem que ser maior que zero", exception.getMessage());
    }

    /*@Test
    public void metodoSetNome() {
        assertEquals("Any Gomes", c1.getNome());
    }*/

    @Test
    public void metodoSetNomeIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setNome("r"));
        assertEquals("Nome Inválido", exception.getMessage());
    }

    /*@Test
    public void metodoSetEmail() {
        assertEquals("any.gomes@outlook.com.br", c1.getEmail());
    }*/

    @Test
    public void metodoSetEmailIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setEmail("teste.br"));
        assertEquals("E-mail Inválido", exception.getMessage());
    }

    /*@Test
    public void metodoSetTelefone() {
        assertEquals("11987643546", c1.getTelefone());
    }*/

    @Test
    public void metodoSetTelefoneIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setTelefone("0800"));
        assertEquals("Telefone Inválido", exception.getMessage());
    }
}