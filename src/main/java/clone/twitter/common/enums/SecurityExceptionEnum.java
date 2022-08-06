package clone.twitter.common.enums;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum SecurityExceptionEnum {
    SECURITY_ACCOUNT_EXPIRED_EXCEPTION(HttpStatus.UNAUTHORIZED, "S001", "Account Expired."),
    SECURITY_ACCOUNT_STATUS_EXCEPTION(HttpStatus.UNAUTHORIZED, "S002", "Account Status."),
    SECURITY_AUTHENTICATION_CREDENTIALS_NOT_FOUND_EXCEPTION(HttpStatus.UNAUTHORIZED, "S003", " Authentication Credentials Not Found."),
    SECURITY_AUTHENTICATION_SERVICE_EXCEPTION(HttpStatus.UNAUTHORIZED, "S004", "Authentication Service."),
    SECURITY_BAD_CREDENTIALS_EXCEPTION(HttpStatus.UNAUTHORIZED, "S005", "Bad Credentials."),
    SECURITY_CREDENTIALS_EXPIRED_EXCEPTION(HttpStatus.UNAUTHORIZED, "S006", "Credentials Expired."),
    SECURITY_DISABLED_EXCEPTION(HttpStatus.UNAUTHORIZED, "S007", "Disabled."),
    SECURITY_INSUFFICIENT_AUTHENTICATION_EXCEPTION(HttpStatus.UNAUTHORIZED, "S008", "Insufficient Authentication."),
    SECURITY_INTERNAL_AUTHENTICATION_SERVICE_EXCEPTION(HttpStatus.UNAUTHORIZED, "S009", "Internal Authentication Service."),
    SECURITY_LOCKED_EXCEPTION(HttpStatus.UNAUTHORIZED, "S010", "Locked."),
    SECURITY_PROVIDER_NOT_FOUND_EXCEPTION(HttpStatus.UNAUTHORIZED, "S011", "Provide Not Found."),;

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    SecurityExceptionEnum(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }
}
