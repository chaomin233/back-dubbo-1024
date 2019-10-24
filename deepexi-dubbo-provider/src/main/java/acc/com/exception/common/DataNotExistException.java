package acc.com.exception.common;

import acc.com.constant.BizCode;
import acc.com.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_NOT_EXIST_ERROR)
public class DataNotExistException extends RuntimeException {

    public DataNotExistException(String message) {
        super(message);
    }

}
