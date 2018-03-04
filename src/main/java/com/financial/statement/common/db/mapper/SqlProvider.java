package com.financial.statement.common.db.mapper;

import com.financial.statement.common.db.BaseTableAttr;
import com.financial.statement.common.db.TableField;
import com.financial.statement.common.db.UserTableAttr;
import lombok.val;
import org.apache.ibatis.jdbc.SQL;

public class SqlProvider {

    /**
     * 此处传入的是 uuid，例如 UserTableAttr.UUID
     * @param field
     * @param key
     * @return
     */
    public String findById(TableField field,Object key) {
       return this.findBy(field,key);
    }

    public String findBy(TableField field,Object key){
        val sql = new SQL();
        String columns = field.baseColumn();
        sql.SELECT(columns)
                .FROM(field.getTable())
                .WHERE(field.getField() + " = " + key);
        return sql.toString();
    }
}
