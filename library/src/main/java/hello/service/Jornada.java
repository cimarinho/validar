package hello.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Jornada implements Serializable {

    @JsonProperty("numero_jornada")
    private Long numeroJornada;

    @JsonProperty("nome_cliente")
    private String nomeCliente;

    @JsonProperty("sobre_nome_cliente")
    private String sobreNomeCliente;

    @JsonProperty("data_jornada")
    private LocalDateTime dataJornada;

    public String getSobreNomeCliente() {
        return sobreNomeCliente;
    }

    public void setSobreNomeCliente(String sobreNomeCliente) {
        this.sobreNomeCliente = sobreNomeCliente;
    }

    public LocalDateTime getDataJornada() {
        return dataJornada;
    }

    public void setDataJornada(LocalDateTime dataJornada) {
        this.dataJornada = dataJornada;
    }

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
