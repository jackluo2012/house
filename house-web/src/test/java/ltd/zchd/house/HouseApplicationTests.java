package ltd.zchd.house;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class HouseApplicationTests {

    @Autowired
    private HttpClient httpClient;

    @Test
    public void testHttpclient() throws IOException {
        System.out.println(EntityUtils.toString(httpClient.execute(new HttpGet("https://www.baidu.com")).getEntity()));
    }

    @Test
    void contextLoads() {
    }


}
