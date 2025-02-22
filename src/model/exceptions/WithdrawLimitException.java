package model.exceptions;

public class WithdrawLimitException extends Exception{

    public WithdrawLimitException(String str){
        super(str);
    }
}
