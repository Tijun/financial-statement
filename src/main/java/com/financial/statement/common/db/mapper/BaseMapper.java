package com.financial.statement.common.db.mapper;

import com.financial.statement.common.db.TableField;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface BaseMapper {

    /**
     * 根据主键查找id
     * @param primaryKey
     * @param <T>
     * @return
     */
   <T> T findById(Object primaryKey);

    /**
     * 根据 字段和值查找
     * @param field 字段属性
     * @param value 值
     * @param <T>
     * @return
     */
    @SelectProvider()
   <T> List<T> findBy(TableField field,Object value);

    /**
     * 根据某个字段查询对表进行更新
     * @return
     */
   int updateBy();


//   <T> findByAnd(TableField ...fields,Object ...values);


}
