package acc.com.exception.common;

import acc.com.constant.BizCode;
import acc.com.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_NOT_FOUND)
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message) {
        super(message);
    }

}
