package com.lxp.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2022</p>
 * <p>公司: 北京南北天地科技股份有限公司</p>
 * <p>创建日期：2022/2/20 0:11</p>
 * <p>类全名：com.lxp.control.TestControl</p>
 *
 * @author 作者：lxp
 * 初审：
 * 复审：
 * @version 1.0
 */
@Controller
public class TestControl {

    @RequestMapping("/t1")
    public String test1(Model model) {
        model.addAttribute("msg", "测试");
        System.out.println("进入方法");
        return "test";
    }
}
