package ltd.zchd.house.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "spring.httpclinet")
public class HttpClientProperties {
    private Integer cnnectTimeOut = 100;
    private Integer socketTimeOut = 10000;

    private String agent = "agent";
    private Integer maxConnPerRoute = 10;
    private Integer maxConnTotoal = 50;

    public Integer getCnnectTimeOut() {
        return cnnectTimeOut;
    }

    public void setCnnectTimeOut(Integer cnnectTimeOut) {
        this.cnnectTimeOut = cnnectTimeOut;
    }

    public Integer getSocketTimeOut() {
        return socketTimeOut;
    }

    public void setSocketTimeOut(Integer socketTimeOut) {
        this.socketTimeOut = socketTimeOut;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Integer getMaxConnPerRoute() {
        return maxConnPerRoute;
    }

    public void setMaxConnPerRoute(Integer maxConnPerRoute) {
        this.maxConnPerRoute = maxConnPerRoute;
    }

    public Integer getMaxConnTotoal() {
        return maxConnTotoal;
    }

    public void setMaxConnTotoal(Integer maxConnTotoal) {
        this.maxConnTotoal = maxConnTotoal;
    }
}
