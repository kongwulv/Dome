package test1.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2022</p>
 * <p>公司: 北京南北天地科技股份有限公司</p>
 * <p>创建日期：2022/2/11 14:59</p>
 * <p>类全名：test1.util.MyBatisUtil</p>
 *
 * @author 作者：lxp
 * 初审：
 * 复审：
 * @version 1.0
 */
public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession(true);
    }


}
