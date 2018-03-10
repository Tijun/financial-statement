package com.financial.statement.common.db;

// 该类可以通过数据库表来生成

/**
 * 后面修改。现在太不灵活
 */
public class UserTableAttr extends BaseTableAttr{


    private static final  UserTableAttr TABLE_ATTR  = new UserTableAttr("user");
     // 数据库表明
    public static final TableField UUID = TABLE_ATTR.create("uuid");

    public static final TableField NICK_NAME = TABLE_ATTR.create("nick_name");

    public static final TableField PASSWORD = TABLE_ATTR.create("password");

    protected UserTableAttr(String table) {
        super(table);
    }

    /**
     * 利用 TableField 可以实现多表连接查询
     *  需要有方法来把这些字段生成部分SQL比如这里是 SELECT uuid, FROM user
     *  生成base colomn nick_name,password, 可以考虑把他们放到列表里面
     *  测试参考
     */

}
