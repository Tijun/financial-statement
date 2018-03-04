package com.financial.statement.common.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.val;

import java.util.stream.Collectors;

@Getter
@EqualsAndHashCode
public class TableField {

    // 数据库表
    private final String table;

    // 数据库字段
    private final String field;

    private TableField(String table, String field) {
        this.table = table;
        this.field = field;
    }

    /**
     *
     * @param table 数据库表名
     * @param field 数据库表字段
     * @return 表和字段的映射
     */
    public static TableField create(@NonNull String table, @NonNull String field){
        return new TableField(table,field);
    }


    public BaseTableAttr getTableAttr(){
       return BaseTableAttr.tableMap.get(table);
    }
    public String baseColumn(){
        val tableAttr = getTableAttr();
       return tableAttr.getTableFields()
                .stream().map(TableField::getField)
                .collect(Collectors.joining(","));
    }

}
