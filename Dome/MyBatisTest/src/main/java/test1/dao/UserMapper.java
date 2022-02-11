package test1.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import test1.pojo.User;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2022</p>
 * <p>公司: 北京南北天地科技股份有限公司</p>
 * <p>创建日期：2022/2/11 14:54</p>
 * <p>类全名：test1.dao.UserMapper</p>
 *
 * @author 作者：lxp
 * 初审：
 * 复审：
 * @version 1.0
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Select("select * from user where id=${id}")
    User getUserById(@Param("id") int id);
}
