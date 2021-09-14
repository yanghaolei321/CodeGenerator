package com.galaxy.codegenerator.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.galaxy.codegenerator.entity.GenConfig;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author yanghaolei
 * @date 下午 9/14/21 11:57
 */
public interface SysGeneratorService {
    /**
     * 生成代码
     *
     * @param tableNames 表名称
     * @return
     */
    byte[] generatorCode(GenConfig tableNames);

    /**
     * 分页查询表
     *
     * @param tableName 表名
     * @return
     */
    IPage<List<Map<String, Object>>> getPage(Page page, String tableName);
}
