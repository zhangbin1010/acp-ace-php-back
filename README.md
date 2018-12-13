# acp-ace-php-back 
###### v1.0
java 语言编写，配合 acp-ace-php 的后端工程，为php前端工程创建数据库，初始化数据，及一些扩展功能
## 相关组件版本及官方文档
- [Spring Boot 2.1.1.RELEASE](https://projects.spring.io/spring-boot)
## 一、环境要求
- jdk 11
- gradle 4.10.2

## 二、gralde 配置及使用
### （一）配置文件
##### 1.gradle/dependencies.gradle
定义外部依赖版本号
    
##### 2.settings.gradle
定义项目/模块结构

##### 3.gradle.properties
gradle全局参数：
- gradleVersion：gradle版本号
- group：对应打包时的groupid
- version：工程版本号
- encoding：编译字符集
- mavenCentralUrl：maven中央仓库地址
- org.gradle.jvmargs：gradle执行时的jvm参数
- javaVersion：jdk版本号
    
##### 4.build.gradle
公共构建脚本
    
##### 5.模块根路径/build.gradle
单个模块特有的构建脚本

### （二）自定义任务
- clearPj 清理所有输出文件
- release 编译、打包并输出

### （三）升级命令
``
    gradlew wrapper --gradle-version=4.10.2 --distribution-type=all
``

## 三、工程说明
- 工程全局默认使用 UTF-8 字符集
- manager 目录为程序源代码模块
- gradle 目录下为相关配置文件
- swagger url : /swagger-ui.html
- 运行 manager test 下的 ManageTestApplication.java 可初始化数据库及数据（只可执行一次），后续需执行 ManageApplication.java