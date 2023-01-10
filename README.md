# 基于SpringMVC的Spring Boot+MariaDB+Bootstrap学生宿舍管理系统

南京信息工程大学 夏天

## 主题

学生宿舍管理系统，已部署至 Azure 云服务器，演示时使用了`itx.pil0txia.com`个人域名访问。支持数据报表的生成与导入导出。

## 架构

Spring Boot Web

Spring Data Jpa

Spring Data Rest

SpringMVC

Bootstrap 4

Ajax

MariaDB

hikariCP

JQuery

gijgo

font-awesome

bootstrap-table

sweetalert

## 部署

1. 使用`init.sql`导入数据库
2. 解压代码后，使用`Idea`打开目录
3. Maven使用Idea自带的`Bundled (Maven 3)`即可。jdk 版本 1.8
4. 修改`application.yml`中的数据库连接池