package hello.app.valida;

import hello.app.entity.JornadaEntity;
import hello.service.Jornada;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JornadaValidator implements ValidatorCommon<JornadaEntity> {

    @Autowired
    private DozerBeanMapper mapper;

    public JornadaEntity validate(Jornada target){
        JornadaEntity jornadaEntity = new JornadaEntity();
        this.mapper.map(target, jornadaEntity);
        this.validar(jornadaEntity);
        return jornadaEntity;

    }
}
