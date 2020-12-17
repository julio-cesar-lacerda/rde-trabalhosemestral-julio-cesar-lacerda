package com.company;
import carros.Mecanica;
import carros.Servico;
import carros.Veiculo;

public class Main {
    public static void main(String[] args){
        Servico carro = new Servico(00031,"Pintura",1.999);
        Veiculo carro2 = new Veiculo(0003,"Fda112",1999,"AFA","cesar");
        Mecanica mecanica = new Mecanica("Teste");
        mecanica.cadastraVeiculo(0003,"Fda112",1999,"AFA","cesar");
        mecanica.cadastraVeiculo("Fda11",1999,"AFA","cesar");
        mecanica.cadastraVeiculo(0004,"Fda112",1999,"AFA","cesar");
//        mecanica.cadastraServico(carro);

        System.out.println(mecanica);
    }
}