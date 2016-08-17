package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import config.MysqlConfig;

@EnableConfigurationProperties({MysqlConfig.class})
public class Test {
    @Autowired
    private MysqlConfig config;

    public void t() {
        System.out.print(config.getDb());
    }
}
