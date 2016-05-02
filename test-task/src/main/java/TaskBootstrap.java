import com.taobao.pamirs.schedule.strategy.TBScheduleManagerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Properties;

/**
 * Created by jankie on 16/5/2.
 */
public class TaskBootstrap {

    public static void main(String[] args) throws Exception {

        // 初始化Spring
        ApplicationContext ctx = new FileSystemXmlApplicationContext(
                "classpath:applicationContext.xml");

        // 初始化调度工厂
        TBScheduleManagerFactory scheduleManagerFactory = new TBScheduleManagerFactory();

        Properties p = new Properties();
        p.put("zkConnectString", "127.0.0.1:2181");
        p.put("rootPath", "/tbschedule/test");
        p.put("zkSessionTimeout", "60000");
        p.put("userName", "admin");
        p.put("password", "1");
        p.put("isCheckParentPath", "true");

        scheduleManagerFactory.setApplicationContext(ctx);

        scheduleManagerFactory.init(p);
    }
}
