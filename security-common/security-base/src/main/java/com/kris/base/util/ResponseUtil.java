package com.kris.base.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kris.base.constant.KrisConstant;
import com.kris.base.domain.R;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
public final class ResponseUtil {

    public static void out(HttpServletResponse response, R<?> r) {
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(HttpStatus.OK.value());
        response.setContentType(KrisConstant.APPLICATION_JSON_UTF8_VALUE);
        try {
            mapper.writeValue(response.getWriter(), r);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
