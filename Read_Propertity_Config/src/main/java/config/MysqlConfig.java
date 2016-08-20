package config;
//import java.awt.SystemColor;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "zuul.mysql")
public class MysqlConfig {

    private String db;

    public static void hello() {
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

}
