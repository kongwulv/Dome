package threadDome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @ProjectName: Dome
 * @Package: threadDome
 * @ClassName: CountOperateTest
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 18-12-6 下午10:55
 * @UpdateUser: 更新者
 * @UpdateDate: 18-12-6 下午10:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class CountOperateTest {

    @Test
    public void run() {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();


        t1.start();
       /* for (int i = 0; i < 100; i++) {
        }*/

    }
}