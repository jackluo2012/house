package ltd.zchd.house.web.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FilterBeanConfigure {
    /**
     * 创建filterBean 需要3部
     * 1.构建filter
     * 2.配置拦截的pattern
     * 3.利用FilterRegistrationBean 进行包装
     */

    @Bean
    public FilterRegistrationBean logFilter() {
        //*
        //1.构建filter
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        //2.配置拦截的pattern
        List<String> urlList = new ArrayList<>();
        urlList.add("/api/*");
        //3.利用FilterRegistrationBean 进行包装

        filterRegistrationBean.setUrlPatterns(urlList);
        return filterRegistrationBean;

        //*/
    }

}
