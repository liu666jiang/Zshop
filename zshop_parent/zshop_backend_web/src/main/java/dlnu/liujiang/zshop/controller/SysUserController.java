package dlnu.liujiang.zshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: liujiang
 * @Date: 2019/5/8 0008
 * Description: dlnu.liujiang.zshop.controller
 * @version: 1.0
 */

@Controller
@RequestMapping("/backend/sysuser")
public class SysUserController {


    @RequestMapping("/login")
    public String login(){


        return "main";
    }



}
