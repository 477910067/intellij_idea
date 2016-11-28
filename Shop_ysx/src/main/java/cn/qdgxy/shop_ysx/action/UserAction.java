package cn.qdgxy.shop_ysx.action;

import cn.qdgxy.shop_ysx.exception.MyException;
import cn.qdgxy.shop_ysx.pojo.User;
import cn.qdgxy.shop_ysx.pojo.UserCustom;
import cn.qdgxy.shop_ysx.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;

/**
 * Created by 于善心 on 2016/11/25.
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private UserService userService = new UserService();
    private UserCustom user = new UserCustom();

    private String msg;

    public String login() throws Exception {
        try {
            UserCustom userCustom = userService.login(user.getUsername(), user.getPassword());

            // 存入session
            Map<String, Object> session = ActionContext.getContext().getSession();
            session.put("user", userCustom);

            // 转发到另一个页面
            return "login_success";
        } catch (MyException e) {
            // 保存错误信息到request
            msg = e.getMessage();
            // 转发到登录页面
            return INPUT;
        }
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public User getModel() {
        return user;
    }
}
