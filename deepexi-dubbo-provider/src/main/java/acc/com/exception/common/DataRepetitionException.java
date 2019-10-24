package acc.com.exception.common;

import acc.com.constant.BizCode;
import acc.com.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_REPETITION_ERROR)
public class DataRepetitionException extends RuntimeException {

    public DataRepetitionException(String message) {
        super(message);
    }

}
