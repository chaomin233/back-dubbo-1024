package acc.com.exception.common;

import acc.com.constant.BizCode;
import acc.com.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_EXIST_ERROR)
public class DataExistException extends RuntimeException {

    public DataExistException(String message) {
        super(message);
    }

}
