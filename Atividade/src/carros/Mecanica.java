package carros;
public class Mecanica {

    private static int MAX_VEICULO = 50;
    private static int totalVeiculo = 0;
    private static int MAX_Servico = 50;
    private static int totalServico = 0;

    private String nome;
    private Veiculo[] veiculos;
    private Servico[] servicos;

    public Mecanica(String nome){
        this.nome = nome;
        this.veiculos = new Veiculo[MAX_VEICULO];
        this.servicos = new Servico[MAX_Servico];
    }

    public String toString(){
        String str = nome+"\n";
        str += "Veiculo:[\n";
        for (int i = 0; i < totalVeiculo;i++){
            str += "\t"+this.veiculos[i];
        }
        str += "]\n";

        str += "Servico:[\n";
        for (int i = 0; i < totalServico;i++){
            str += "\t"+this.servicos[i];
        }
        str += "\n]";
        return str;
    }

    public boolean cadastraVeiculo(int codigo,String placa,int ano,String modelo,String cliente){
        Veiculo veiculo1 = new Veiculo(codigo,placa,ano,modelo,cliente);
        this.veiculos[totalVeiculo] = veiculo1;
        totalVeiculo += 1;
        return true;
    }

    public boolean cadastraVeiculo(String placa,int ano,String modelo,String cliente){
        Veiculo veiculo1 = new Veiculo(0001,placa,ano,modelo,cliente);
        this.veiculos[totalVeiculo] = veiculo1;
        totalVeiculo += 1;
        return true;
    }
//
//    public boolean cadastraServico(int codigo,String placa,int ano,String modelo,String cliente){
//        this.servicos[totalServico] = servicos;
//        totalServico += 1;
//        return true;
//    }
}
