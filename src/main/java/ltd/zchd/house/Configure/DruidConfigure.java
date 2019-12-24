package ltd.zchd.house.Configure;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.google.common.collect.Lists;
import org.eclipse.jetty.servlet.StatisticsServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRequest;

@Configuration
public class DruidConfigure {

    @ConfigurationProperties(prefix = "spring.druid")
    @Bean(initMethod = "init",destroyMethod = "close")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        //设置filter 加入连接池
        dataSource.setProxyFilters(Lists.newArrayList(statFilter()));
        return dataSource;
    }
    @Bean
    public Filter statFilter() {
        StatFilter statFilter = new StatFilter();
        //设置慢日志
        statFilter.setSlowSqlMillis(1);
        //是否显示慢日志
        statFilter.setLogSlowSql(true);
        //是否合并
        statFilter.setMergeSql(true);
        return statFilter;
    }
    //开启mysql监控
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
    }
}
