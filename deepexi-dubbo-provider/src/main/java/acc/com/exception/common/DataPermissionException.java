package acc.com.exception.common;

import acc.com.constant.BizCode;
import acc.com.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_PERMISSION_ERROR)
public class DataPermissionException extends RuntimeException {

    public DataPermissionException(String message) {
        super(message);
    }

}
