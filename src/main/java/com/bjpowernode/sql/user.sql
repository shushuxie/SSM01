drop table if exists student;
CREATE TABLE student(
 ID int primary key auto_increment comment 'id',
SNAME varchar (30) comment '姓名',
EMAIL varchar (50) comment '邮箱',
 AGE varchar (3) comment '年龄'
)comment = '学生信息表';

drop table if exists user;
CREATE TABLE user(
ID int primary key auto_increment comment 'id',
NAME varchar (30) not null comment '姓名',
PASSWORD VARCHAR (32) NOT NULL COMMENT '密码',
EMAIL varchar (50) comment '邮箱',
PHONE VARCHAR (11) COMMENT'电话',
SEX varchar(1) COMMENT '性别:1-男,0-女',
AGE varchar (3) comment '年龄',
HEAD VARCHAR (300) comment '头像',
RMARK VARCHAR (500) comment '备注',
CREATETIME VARCHAR (19) COMMENT '创建时间:YYYY-MM-dd HH:mm:ss',
LASTLOGINTIME VARCHAR(19) COMMENT '最后登陆时间',
LOGINSUM VARCHAR(10) COMMENT'登陆次数',
LOGINTIMESUM VARCHAR (10) COMMENT'在线总时长'
)comment = '用户信息表';