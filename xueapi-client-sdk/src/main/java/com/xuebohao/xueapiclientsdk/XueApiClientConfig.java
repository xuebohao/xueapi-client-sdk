package com.xuebohao.xueapiclientsdk;

import com.xuebohao.xueapiclientsdk.client.XueApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuebohao
 */
@Configuration
@ConfigurationProperties("xueapi.client")
@Data
@ComponentScan
public class XueApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public XueApiClient xueApiClient() {
        return new XueApiClient(accessKey,secretKey);
    }

}
