基于 spring boot 项目应用
===
## 系统要求
  
        Spring Boot 2.0.0.BUILD-SNAPSHOT 要求JDK1.8 及 srping框架5.0.2.BUILD-SNAPSHOT或者以上。
    构建工具版本要求Maven 3.2+ and Gradle 4.
        
## 快速启动应用

     运行代码的方式可以有  IDE | Packaged | Maven | Gradle
     
     1. IDE环境，直接运行 Application.java类

     2. maven package 为jar包，执行 java -jar bluesky-web.jar
     
     3. mvn spring-boot:run
     
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









     
     
     
     
     

