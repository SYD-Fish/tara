/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/6/29 23:23:04                           */
/*==============================================================*/


drop table if exists admin;

drop table if exists contact;

drop table if exists enterprise_video;

drop table if exists goods;

drop table if exists news;

drop table if exists goods_order;

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
  admin_id             int not null auto_increment,
  username             varchar(20),
  password             varchar(50),
  website              varchar(100),
  create_time          varchar(20),
  last_update          varchar(20),
  expiry_time          varchar(20),
  primary key (admin_id)
);

/*==============================================================*/
/* Table: contact                                               */
/*==============================================================*/
create table contact
(
  contact_id           int not null auto_increment,
  admin_id             int,
  telephone            int,
  phone                int,
  address              varchar(255),
  wx                   varchar(50),
  qq                   varchar(50),
  QR_code              varchar(255),
  primary key (contact_id)
);

/*==============================================================*/
/* Table: enterprise_video                                      */
/*==============================================================*/
create table enterprise_video
(
  video_id             int not null auto_increment,
  video_link           varchar(255),
  video_title          varchar(100),
  create_time          date,
  last_update          date,
  status               char(1),
  admin_id             int,
  primary key (video_id)
);

/*==============================================================*/
/* Table: goods                                                 */
/*==============================================================*/
create table goods
(
  goods_id             int not NULL auto_increment,
  goods_kind           varchar(100),
  goods_type           varchar(20),
  price                int(10),
  stock_amount         int,
  create_time          date,
  last_update          date,
  admin_id           int,
  PRIMARY KEY (goods_id)
);

/*==============================================================*/
/* Table: news                                                  */
/*==============================================================*/
create table news
(
  news_id              int not null auto_increment,
  news_title           varchar(255),
  news_link            varchar(255),
  create_time          varchar(20),
  level                varchar(2),
  admin_id             int,
  primary key (news_id)
);

/*==============================================================*/
/* Table: "order"                                               */
/*==============================================================*/
create table goods_order
(
  order_id             int not null auto_increment,
  number               int,
  price                int,
  total_amount         int,
  create_time          date,
  goods_id             int,
  primary key (order_id)
);

