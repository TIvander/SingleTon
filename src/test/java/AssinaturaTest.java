import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssinaturaTest {
    @Test
    public void retornaStatusAssinatura(){
        Assinatura.getAssinatura().setStatus("desativado");
        assertEquals("desativado", Assinatura.getAssinatura().getStatus());
    }

    @Test
    public void retornaExpiracaoAssinatura(){
        Assinatura.getAssinatura().setExpiracao(30);
        assertEquals(30, Assinatura.getAssinatura().getExpiracao());
    }
}