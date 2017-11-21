基于 spring boot 项目应用
===
##### 目录 #####
*   关于bluesky
*   系统要求
*   快速启动应用
*   应用结构
*   示例

## 关于bluesky

        我们发起了bluesky项目，该项目基于spring boot的Web应用.任何人多可以修改并提交自己的构建模块，或者构建公用项目及其他。
    spring boot可轻松创建基于spring平台的独立的，产品级别的运行应用。spring作为企业级的开发平台，包含模块众多，我们的业务应用
    构建由各个擅长各自领域的攻城师共同开发完善，属于集体开发应用。

## 系统要求
  
        Spring Boot 2.0.0.BUILD-SNAPSHOT 要求JDK1.8 及 srping框架5.0.2.BUILD-SNAPSHOT或者以上。构建工具版本要求Maven 3.2+ and Gradle 4.
        
## 快速启动应用

     运行代码的方式可以有  IDE | Packaged | Maven | Gradle
     
     1. IDE环境，直接运行 Application.java类

     2. maven package 为jar包，执行 java -jar bluesky-web.jar
     
     3. mvn spring-boot:run
     
## 应用结构   

>**bean**       定义spring bean组件，使用注释@Component，如jdbc Bean，mongoDb bean, redis bean..

>**config**     定义Javaconfig配置，属性配置

>>filter    自定义过滤器

>>interceptors 自定义拦截器

>>servlets  自定义servlet类

>**controller**  Web控制器

>**domain**  领域模型

>>entity  提供JPA支持的实体模型

>>mybaits 提供mybatis支持的模型

>>pojo  提供自定义的简单java类

>**respository** 仓库

>**service**  业务层

>>impl  业务接口实现类型

>>mybatis mybatis映射接口
    
## 示例
运行Application.java,在浏览器输入

访问欢迎页面:
```
http://localhost:8080/
```
*************

thymeLeaf示例:
```
http://localhost:8080/hello
```

跳转示例:
```
http://localhost:8080/home
```
重定向示例

```
http://localhost:8080/home
```
错误页面示例
```
http://localhost:8080/upload
```

返回xml格式数据
```
http://localhost:8080/getActorList
```
返回json格式数据
```
http://localhost:8080/getPerson
```

多表查询示例：
```
http://localhost:8080/getPersonList
```
mybatis示例：
```
http://localhost:8080/findCity
```









     
     
     
     
     

