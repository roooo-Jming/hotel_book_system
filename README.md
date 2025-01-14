# Team15Hotel_Book_System

#### 介绍
本项目是四川大学软件学院实训项目：酒店辅助订购系统，欢迎fork和star。

项目演示地址：http://101.35.31.134:8888/index.html

管理员账户：admin

管理员密码：admin

#### 项目结构
本项目是前后端分离项目

后端框架为：SpringBoot + MyBatis-Plus + Mysql

前端框架为：Vue + Element UI + Echarts UI + BaiduMap api

#### 使用教程
- 本项目编译器为idea，后端源码在back分支中，前端源码在front分支中
- git clone -b back https://github.com/huangchenzhao/hotel_book_system.git
- git clone -b front https://github.com/huangchenzhao/hotel_book_system.git
- 以上两个命令分别拷贝后端源码和前端源码

#### 功能
1. 两种角色，用户和管理员
<img width="454" alt="image" src="https://user-images.githubusercontent.com/69411580/158507320-e5a99817-07c4-4686-a02b-d0801907fcad.png">
2. 首页
<img width="454" alt="image" src="https://user-images.githubusercontent.com/69411580/158508483-0800dc41-b247-4696-a131-8bf3e516581a.png">


#### 使用说明
##### 后端配置
1.  拉取后端代码后，首先配置mysql数据库，注意，mysql的版本最好为5.6，若mysql为5.7及以上版本，请按链接网站中配置mysql的sql模式。https://stackoverflow.com/questions/41887460/select-list-is-not-in-group-by-clause-and-contains-nonaggregated-column-inc
2.  在mysql中导入back分支中hotelbook.sql。这个是项目运行所依赖的数据库文件。随后配置后端源码中的application.yml文件，更改数据库连接的url、用户名和密码
3.  修改UserServiceImpl中createMail方法的DataHandler dh = new DataHandler(new FileDataSource("/home/hcz/file/image/202203/-02a12b8d264c4616af8bb516a140ec6e.jpg"));这一行语句中图片的url，只有配置了这一句话才能保证发送邮箱验证码功能成功运行
##### 前端配置
1.  拉取前端代码后，在控制台执行npm install命令下载所需的包。修改config目录下index.js文件，配置前端端口和与其匹配的后端端口。这里已经写好了，后端运行端口为8888，前端运行端口为3000
##### 运行
1.  运行前后端项目
2.  浏览器输入127.0.0.1:3000。即可访问酒店辅助订购系统

#### 参与贡献

1.  姬茗瑞
2.  黄晨钊
3.  岳平勇
4.  谷子昕

#### 说明
本项目仅为大学本科期间的实训项目，因为时间仓促，并没有进行算法优化。
