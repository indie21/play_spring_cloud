package test;

import org.springframework.beans.factory.annotation.Autowired;
import config.MysqlConfig;


// import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

fwef

@RestController
public class TestController {

    @Autowired
    private MysqlConfig config;

    @RequestMapping("/test")
    public @ResponseBody String test(){
        System.out.println(config.getDb());
        return "ok";
    }

}
