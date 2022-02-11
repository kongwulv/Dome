package test1.pojo;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2022</p>
 * <p>公司: 北京南北天地科技股份有限公司</p>
 * <p>创建日期：2022/2/11 14:47</p>
 * <p>类全名：test1.pojo.User</p>
 *
 * @author 作者：lxp
 * 初审：
 * 复审：
 * @version 1.0
 */
public class User {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
