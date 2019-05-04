package hello.app.valida;

import hello.app.exception.DadosInvalidosException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public interface ValidatorCommon <T> {

    default void validar(T t) throws DadosInvalidosException {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> errors = validator.validate(t);
        if (errors.size() > 0 ){
            List<String> error = errors.stream().map(item -> "["+item.getPropertyPath()+ " " +item.getMessage()+"]\n").collect(Collectors.toList());
            throw new DadosInvalidosException(String.join(",", error));
        }
    }
}
