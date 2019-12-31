package level2.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 使用mysql创建一个用户表(包含字段：用户编号，用户名，性别，地址)
 * 然后使用JdbcTemplate完成以下需求:
 * 1.向用户表添加多条用户记录
 * 2.更新用户表中id为2的记录，修改性别和居住地
 * 3.删除用户表中id为3的记录
 * 4.查询用户表的所有用户数据,查询结果是一个集合，集合中存放所有的用户对象
 */
public class JdbcTemplateExe {
    new JdbcTemplate();
}
