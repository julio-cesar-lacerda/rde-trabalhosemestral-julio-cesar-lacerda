package carros;

public class Servico{
    private int codigo;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorMaodeObra() {
        return valorMaodeObra;
    }

    public void setValorMaodeObra(double valorMaodeObra) {
        this.valorMaodeObra = valorMaodeObra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    private double valorMaodeObra;
    private double valorTotal;

    public Servico(int codigo,String descricao,double valorMaodeObra){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorMaodeObra = valorMaodeObra;
    }
}
