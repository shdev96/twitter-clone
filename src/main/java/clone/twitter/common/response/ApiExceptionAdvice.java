package clone.twitter.common.response;

import clone.twitter.common.enums.ExceptionEnum;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.nio.file.AccessDeniedException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestControllerAdvice
public class ApiExceptionAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ApiException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final ApiException e) {
        return ResponseEntity
                .status(e.getError().getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(e.getError().getCode())
                        .errorMessage(e.getError().getMessage())
                        .build());
    }

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final RuntimeException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(ExceptionEnum.RUNTIME_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(ExceptionEnum.RUNTIME_EXCEPTION.getCode())
                        .errorMessage(e.getMessage())
                        .build());
    }

    @ExceptionHandler({AccessDeniedException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final AccessDeniedException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(ExceptionEnum.ACCESS_DENIED_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(ExceptionEnum.ACCESS_DENIED_EXCEPTION.getCode())
                        .errorMessage(e.getMessage())
                        .build());
    }

    @ExceptionHandler({NoHandlerFoundException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final NoHandlerFoundException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(ExceptionEnum.PAGE_NOT_FOUND_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(ExceptionEnum.PAGE_NOT_FOUND_EXCEPTION.getCode())
                        .errorMessage(e.getMessage())
                        .build());
    }
}
