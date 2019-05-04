package hello.app.entity;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@ToString
public class JornadaEntity {

    @Min(2)
    private Long numeroJornada;

    @NotNull
    private String nomeCliente;

    @NotNull
    private String sobreNome;

}
