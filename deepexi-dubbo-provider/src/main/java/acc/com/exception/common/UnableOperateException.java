package acc.com.exception.common;

import acc.com.constant.BizCode;
import acc.com.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.UNABLE_OPERATE_ERROR)
public class UnableOperateException extends RuntimeException {

    public UnableOperateException(String message) {
        super(message);
    }

}
