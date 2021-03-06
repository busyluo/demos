package com.dbc.user.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbc.user.sys.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dbc
 * @since 2018-11-12
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<Map<String, String>> xmlPage(Map<String, String> params);

}
