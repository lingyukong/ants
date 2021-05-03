package com.kly.ants.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/16 21:35
 */
@Component
public class ApiConfig {

    @Value("${hello.name}")
    public String name;

    @Value("${hello.value}")
    public String value;

    @Value("${hello.number}")
    public String number;

    @Value("${hello.bignumber}")
    public String bigNumber;

    @Value("${hello.test1}")
    public String test1;

    @Value("$hello.test2")
    public String test2;
}
