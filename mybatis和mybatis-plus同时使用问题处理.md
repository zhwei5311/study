# mybatis和mybatis-plus同时使用问题处理

项目同时引入两个jar包mybatis-spring-boot-starter/mybatis-plus-boot-starter

项目启动报错：**java.lang.NoClassDefFoundError: org/mybatis/logging/LoggerFactory**

Unsatisfied dependency expressed through bean property 'sqlSessionFactory'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in class path resource [com/baomidou/mybatisplus/autoconfigure/MybatisPlusAutoConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.apache.ibatis.session.SqlSessionFactory]: Factory method 'sqlSessionFactory' threw exception; nested exception is java.lang.NoClassDefFoundError: org/mybatis/logging/LoggerFactory

解决方式：

​		删除 mybatis-spring-boot-starter依赖，更新依赖

启动后错：Invalid bound statement (not found)

[TRACEID:] 2021-03-26T10:48:21,900 ERROR [main] c.a.b.c.DualCurrencyStatisticsDataLoader:31 DefaultRangeDataLoader error info = Invalid bound statement (not found): com.amber.backend.dao.mapper.DualCurrencyMapper.subscribeSizeStatistics
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.amber.backend.dao.mapper.DualCurrencyMapper.subscribeSizeStatistics
	at org.apache.ibatis.binding.MapperMethod$SqlCommand.<init>(MapperMethod.java:235)
	at com.baomidou.mybatisplus.core.override.MybatisMapperMethod.<init>(MybatisMapperMethod.java:50)
	at com.baomidou.mybatisplus.core.override.MybatisMapperProxy.lambda$cachedMapperMethod$0(MybatisMapperProxy.java:101)
	at java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660)
	at com.baomidou.mybatisplus.core.override.MybatisMapperProxy.cachedMapperMethod(MybatisMapperProxy.java:100)
	at com.baomidou.mybatisplus.core.override.MybatisMapperProxy.invoke(MybatisMapperProxy.java:95)
	at com.sun.proxy.$Proxy250.subscribeSizeStatistics(Unknown Source)

解决方式：

​		将服务配置文件中mybatis.mapper-locations的配置挪到mybatis-plus下；

原配置如下：

	mybatis:
		mapper-locations: classpath:mybatis/*.xml
新配置：

mybatis-plus:
    mapper-locations: classpath:mybatis/*.xml,classpath:/mybatis-plus/*.xml