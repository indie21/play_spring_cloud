package config;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "zuul.mysql")
public class MysqlConfig {

    private String db;

    public static void hello() {
        System.out.print("Hello, ");
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }


}
