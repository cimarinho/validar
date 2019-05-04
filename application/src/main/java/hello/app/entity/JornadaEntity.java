package hello.app.entity;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@ToString
public class JornadaEntity {

    @Min(2)
    private Long numeroJornada;

    @NotNull
    private String nomeCliente;

    @NotNull
    private String sobreNomeCliente;

    @NotNull
    private LocalDateTime dataJornada;

}
