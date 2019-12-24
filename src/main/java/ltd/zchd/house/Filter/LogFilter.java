package ltd.zchd.house.Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {


    private Logger logger = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        //在方法拦截的时候
        logger.info("Request--coming");
        //把它交给原始的filteC
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        //容器销毁的时间
    }
}
