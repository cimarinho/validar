package hello.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Jornada implements Serializable {

    @JsonProperty("numero_jornada")
    private Long numeroJornada;

    @JsonProperty("nome_cliente")
    private String nomeCliente;

    public Long getNumeroJornada() {
        return numeroJornada;
    }

    public void setNumeroJornada(Long numeroJornada) {
        this.numeroJornada = numeroJornada;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Jornada{" +
                "numeroJornada=" + numeroJornada +
                ", nomeCliente='" + nomeCliente + '\'' +
                '}';
    }
}
