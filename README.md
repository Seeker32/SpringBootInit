# SpringBoot项目初始化模板

## 技术栈

- SpringBoot 2.7.6
- Mybatis 2.3.0
- MybatisPlus 3.5.2
- Knife4j 4.4.0 + OpenAPI 3

所有配置在resources里的application.yml中修改

## 快速开始

使用sql文件夹下的sql文件初始化数据库，修改application.yml配置，启动项目运行。

项目启动后，访问http://localhost:8080/doc.html 即可看到接口文档，想要使用swagger-ui，可以访问http://localhost:8080/swagger-ui/index.html

模板中有关于用户的接口和业务逻辑实现，还有自定义异常处理和统一返回结果封装。