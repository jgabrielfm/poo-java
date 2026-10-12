public abstract class Unidade {
    private String tipo;

    public Unidade(String tipo) { this.tipo = tipo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public abstract boolean ganhaQuandoAtacadoPor(Unidade a);
}
