package clone.twitter.common.response;

import clone.twitter.common.enums.ExceptionEnum;
import clone.twitter.common.enums.SecurityExceptionEnum;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.security.auth.login.CredentialExpiredException;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.locks.Lock;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SecurityExceptionAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler({AccountExpiredException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final AccountExpiredException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_ACCOUNT_EXPIRED_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_ACCOUNT_EXPIRED_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_ACCOUNT_EXPIRED_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({AccountStatusException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final AccountStatusException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_ACCOUNT_STATUS_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_ACCOUNT_STATUS_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_ACCOUNT_STATUS_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({AuthenticationCredentialsNotFoundException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final AuthenticationCredentialsNotFoundException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_AUTHENTICATION_CREDENTIALS_NOT_FOUND_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_AUTHENTICATION_CREDENTIALS_NOT_FOUND_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_AUTHENTICATION_CREDENTIALS_NOT_FOUND_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({AuthenticationServiceException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final AuthenticationServiceException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_AUTHENTICATION_SERVICE_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_AUTHENTICATION_SERVICE_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_AUTHENTICATION_SERVICE_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({BadCredentialsException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final BadCredentialsException e) {
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_BAD_CREDENTIALS_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_BAD_CREDENTIALS_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_BAD_CREDENTIALS_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({CredentialsExpiredException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final CredentialsExpiredException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_CREDENTIALS_EXPIRED_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_CREDENTIALS_EXPIRED_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_CREDENTIALS_EXPIRED_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({DisabledException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final DisabledException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_DISABLED_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_DISABLED_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_DISABLED_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({InsufficientAuthenticationException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final InsufficientAuthenticationException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_INSUFFICIENT_AUTHENTICATION_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_INSUFFICIENT_AUTHENTICATION_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_INSUFFICIENT_AUTHENTICATION_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({InternalAuthenticationServiceException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final InternalAuthenticationServiceException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_INTERNAL_AUTHENTICATION_SERVICE_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_INTERNAL_AUTHENTICATION_SERVICE_EXCEPTION.getCode())
//                        .errorMessage(SecurityExceptionEnum.SECURITY_INTERNAL_AUTHENTICATION_SERVICE_EXCEPTION.getMessage())
                        .errorMessage(e.getMessage())
                        .build());
    }

    @ExceptionHandler({LockedException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final LockedException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_LOCKED_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_LOCKED_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_LOCKED_EXCEPTION.getMessage())
                        .build());
    }

    @ExceptionHandler({ProviderNotFoundException.class})
    public ResponseEntity<ApiExceptionEntity> exceptionHandler(HttpServletRequest request, final ProviderNotFoundException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(SecurityExceptionEnum.SECURITY_PROVIDER_NOT_FOUND_EXCEPTION.getHttpStatus())
                .body(ApiExceptionEntity.builder()
                        .errorCode(SecurityExceptionEnum.SECURITY_PROVIDER_NOT_FOUND_EXCEPTION.getCode())
                        .errorMessage(SecurityExceptionEnum.SECURITY_PROVIDER_NOT_FOUND_EXCEPTION.getMessage())
                        .build());
    }
}
