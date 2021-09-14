package com.galaxy.codegenerator.entity;

import lombok.Data;

import java.util.List;

/**
 * 表属性： https://blog.csdn.net/lkforce/article/details/79557482
 *
 * @author yanghaolei
 * @date 9/14/21 上午10:47
 */
@Data
public class TableEntity {
    /**
     * 名称
     */
    private String tableName;
    /**
     * 备注
     */
    private String comments;
    /**
     * 主键
     */
    private ColumnEntity pk;
    /**
     * 列名
     */
    private List<ColumnEntity> columns;
    /**
     * 驼峰类型
     */
    private String caseClassName;
    /**
     * 普通类型
     */
    private String lowerClassName;
}
