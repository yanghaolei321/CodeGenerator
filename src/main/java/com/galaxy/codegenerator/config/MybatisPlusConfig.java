package com.galaxy.codegenerator.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus配置
 *
 * @author yanghaolei
 * @date 9/14/21 下午5:44
 */
@Configuration
@ConditionalOnClass(MybatisPlusConfig.class)
@MapperScan(MybatisPlusConfig.packageName)
public class MybatisPlusConfig {

    public static final String packageName = "com.galaxy.codegenerator.mapper";
    public static final long MAX_TIME = 100000;

//	/**
//	 * 分页插件，自动识别数据库类型
//	 * @ConditionalOnMissingBean 注解判断是否执行初始化代码，即如果用户已经创建了bean，则相关的初始化代码不再执行
//	 * @return
//	 */
//	@Bean
//	@ConditionalOnMissingBean
//	public PaginationInterceptor paginationInterceptor() {
//		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//		return paginationInterceptor;
//	}

//	/**
//	 * SQL执行效率插件,开发环境使用，线上不推荐
//	 * 设置 local dev test 环境开启
//	 * @return
//	 */
//	@Bean
//	@ConditionalOnMissingBean
//	@Profile({"local", "dev", "test"})
//	public PerformanceInterceptor performanceInterceptor() {
//		PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//		// sql最大执行时长
//		performanceInterceptor.setMaxTime(MAX_TIME);
//		// sql是否格式化
//		performanceInterceptor.setFormat(true);
//		return performanceInterceptor;
//	}

//	/**
//	 * mybatis-plus逻辑删除插件
//	 * @return
//	 */
//	@Bean
//	@ConditionalOnMissingBean
//	public LogicSqlInjector logicSqlInjector() {
//		return new LogicSqlInjector();
//	}
}
