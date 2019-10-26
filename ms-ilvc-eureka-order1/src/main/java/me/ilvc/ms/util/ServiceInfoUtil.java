package me.ilvc.ms.util;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Lvc
 * @create 2019/10/25 09:53
 */
public  class ServiceInfoUtil implements ApplicationListener<ServletWebServerInitializedEvent> {

    private static ServletWebServerApplicationContext applicationContext;

    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
        applicationContext=servletWebServerInitializedEvent.getApplicationContext();

    }

    public static int getPort(){
        return applicationContext.getWebServer().getPort();
    }
}
