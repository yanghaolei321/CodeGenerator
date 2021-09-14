package com.galaxy.codegenerator.entity;

import lombok.Data;

/**
 * 生成配置
 *
 * @author yanghaolei
 * @date 2021/9/14 上午10:47
 */

@Data
public class GenConfig {
    /**
     * 包名
     */
    private String packageName;
    /**
     * 作者
     */
    private String author;
    /**
     * 模块名称
     */
    private String moduleName;
    /**
     * 表前缀
     */
    private String tablePrefix;

    /**
     * 表名称
     */
    private String tableName;

    /**
     * 表备注
     */
    private String comments;
}
