package hello.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class DadosInvalidosException extends RuntimeException {

    public DadosInvalidosException(String errors) {
        super(errors);
    }
}
