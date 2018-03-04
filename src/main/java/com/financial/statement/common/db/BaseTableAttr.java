package com.financial.statement.common.db;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tijun
 */
@Getter
@Setter
public class BaseTableAttr {
    /**
     * 如何保证 table唯一，在多数据库情况下
     */
    private String table;

    public static final Map<String,BaseTableAttr> tableMap = new HashMap<>();


    private final List<TableField> tableFields = new ArrayList<>();

    protected BaseTableAttr(String table) {
        this.table = table;
        tableMap.put(table,this);
    }

    public List<TableField> getRfTableFields() {
        return tableFields;
    }

    public  TableField create(@NonNull String field){
        val tableField = TableField.create(table,field);
        tableFields.add(tableField);
        return tableField;
    }

    public static BaseTableAttr getBaseTableAttr(String table){
        return tableMap.get(table);
    }
}
