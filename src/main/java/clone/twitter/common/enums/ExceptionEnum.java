package clone.twitter.common.enums;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum ExceptionEnum {
    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, "E0001"),
    ACCESS_DENIED_EXCEPTION(HttpStatus.UNAUTHORIZED, "E002"),
    INTERNAL_SERVER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "E003"),
    PAGE_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "EOO4");

    private final HttpStatus httpStatus;
    private final String code;
    private String message;

    ExceptionEnum(HttpStatus httpStatus, String code) {
        this.httpStatus = httpStatus;
        this.code = code;
    }

    ExceptionEnum(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }
}
