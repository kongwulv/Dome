package dome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @ProjectName: Dome
 * @Package: dome
 * @ClassName: HelloWordTest
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 2018/11/14 10:27
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/14 10:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class HelloWordTest {

    @Test
    public void sayHello() {
        HelloWord helloWord = new HelloWord();
        String re = helloWord.sayHello();
        assertEquals("helloword", re);

    }


}