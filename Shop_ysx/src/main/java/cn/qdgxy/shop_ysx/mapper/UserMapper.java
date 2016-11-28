package cn.qdgxy.shop_ysx.mapper;

import cn.qdgxy.shop_ysx.pojo.User;
import cn.qdgxy.shop_ysx.pojo.UserCustom;

public interface UserMapper {

    User getUser(int id);

    UserCustom findUserByUsername(String username);
}
