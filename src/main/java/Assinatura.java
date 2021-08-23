public class Assinatura {
    private static Assinatura assinatura = new Assinatura();

    private Assinatura(){
    };

    private int expiracao;
    private String status;

    public static Assinatura getAssinatura(){
        return assinatura;
    }

    public void setExpiracao(int dias) {
        this.expiracao = dias;
    }

    public int getExpiracao(){
        return expiracao;
    }

    public void setStatus(String state) {
        this.status = state;
    }

    public String getStatus() {
        return status;
    }

}
