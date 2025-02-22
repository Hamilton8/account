package model.exceptions;

public class WithdrawLimitException extends RuntimeException{

    public WithdrawLimitException(String str){
        super(str);
    }
}
