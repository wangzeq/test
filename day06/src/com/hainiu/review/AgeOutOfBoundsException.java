package com.hainiu.review;


public class AgeOutOfBoundsException extends RuntimeException {

    public AgeOutOfBoundsException() {
    }

    // 传递一个异常信息
    public AgeOutOfBoundsException(String message) {
        super(message);
    }

}
