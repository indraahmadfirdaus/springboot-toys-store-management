package com.program.toystore.helpers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

    public static <T> ResponseEntity<?> success(T data) {
        return ResponseEntity.ok().body(createResponse("success", data));
    }

    public static ResponseEntity<?> error(String message, HttpStatus status) {
        ErrorResponse errorResponse = new ErrorResponse(message, status);
        return ResponseEntity.status(status).body(createResponse("error", errorResponse));
    }

    private static <T> Response<T> createResponse(String status, T data) {
        return new Response<>(status, data);
    }

    public static class Response<T> {
        private String status;
        private T data;

        public Response(String status, T data) {
            this.status = status;
            this.data = data;
        }

        public String getStatus() {
            return status;
        }

        public T getData() {
            return data;
        }
    }

    public static class ErrorResponse {
        private String message;
        private int statusCode;

        public ErrorResponse(String message, HttpStatus status) {
            this.message = message;
            this.statusCode = status.value();
        }

        public String getMessage() {
            return message;
        }

        public int getStatusCode() {
            return statusCode;
        }
    }
}

