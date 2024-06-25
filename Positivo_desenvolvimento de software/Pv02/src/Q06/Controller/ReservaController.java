package Q06.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Q02.Barco;
import Q03.Aviao;
import Q04.Hospedagem;
import Q05.Reserva;

public class ReservaController {
    private List<Reserva> reservas;
    private float valor;
    private int id;
    
    public void gerarId(){
        this.id++;
    }
    public void salvarReserva(String origem, String destino, String dataInicio, String dataFim, Hospedagem hospedagem, String veiculo) {
        if (veiculo == "barco") {
            this.valor = 150.69f;
        } else if (veiculo == "aviao") {
            this.valor = 1250.00f;
        } else System.out.println("Veiculo não encontardo");

        this.valor = this.valor + (hospedagem.getValorPorPessoa() * hospedagem.getQntPessoas());

        Reserva novaReserva = new Reserva(id, origem, destino, dataInicio, dataFim, dataFim, veiculo, valor);

        // Reserva.adicionarReserva(novaReserva);
    }


    public void listarReserva() {
        this.reservas = new ArrayList<>();
    }
}
    