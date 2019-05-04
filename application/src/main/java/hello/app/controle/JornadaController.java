package hello.app.controle;

import hello.app.entity.JornadaEntity;
import hello.app.valida.JornadaValidator;
import hello.service.Jornada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JornadaController {

    @Autowired
    JornadaValidator validator;

    @PostMapping("/")
    public JornadaEntity home(@RequestBody Jornada jornada) {
        JornadaEntity jornadaEntity = validator.validate(jornada);
        return jornadaEntity;
    }


}
