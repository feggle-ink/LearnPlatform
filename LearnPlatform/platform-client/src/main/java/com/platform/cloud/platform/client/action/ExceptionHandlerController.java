package com.platform.cloud.platform.client.action;

import com.platform.cloud.platform.api.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author: yin fei
 * @description:异常处理全局处理器
 * @date:2021/2/4
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandlerController {

    @ExceptionHandler(Throwable.class)
    public Object exceptionHandler(Throwable throwable){
        log.error(throwable.getMessage());
        return ApiResult.error("-1","服务器内部异常！");
    }


}
