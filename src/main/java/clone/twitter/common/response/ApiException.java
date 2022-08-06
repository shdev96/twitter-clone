package clone.twitter.common.response;

import clone.twitter.common.enums.ExceptionEnum;
import lombok.Getter;


/**
 * throw new ApiException(ExceptionEnum.SECURITY_01);
 * */
@Getter
public class ApiException extends RuntimeException{
    private final ExceptionEnum error;

    public ApiException(ExceptionEnum exceptionEnum) {
        this.error = exceptionEnum;
    }
}
