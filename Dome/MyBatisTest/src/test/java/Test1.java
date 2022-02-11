import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import test1.dao.UserMapper;
import test1.pojo.User;
import test1.util.MyBatisUtil;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2022</p>
 * <p>公司: 北京南北天地科技股份有限公司</p>
 * <p>创建日期：2022/2/11 14:59</p>
 * <p>类全名：PACKAGE_NAME.Test</p>
 *
 * @author 作者：lxp
 * 初审：
 * 复审：
 * @version 1.0
 */
public class Test1 {

    @Test
    public void test1() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        System.out.println("=============");
        users.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println("=============");
        System.out.println(user);
        sqlSession.close();
    }
}
