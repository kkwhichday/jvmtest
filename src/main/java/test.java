import com.remote.service.RemoteServiceImpl;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * User 昶乐 Date 16/4/14 Time 15:11
 */
public class test {

    public static void main(String args[]) {
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        RemoteServiceImpl remoteService = (RemoteServiceImpl)wac.getBean("remoteService");
        System.out.print("修改...使用Idea在远程服务器上执行本地代码测试"+remoteService.getSth("1234welldone123123123222"));
    }
}
