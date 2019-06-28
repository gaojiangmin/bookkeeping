DROP TABLE IF EXISTS tb_user;
CREATE TABLE tb_user (
  t_user_id bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  t_user_name varchar(32) DEFAULT NULL COMMENT '姓名',
  t_user_password varchar(32) DEFAULT NULL COMMENT '密码',
  t_user_phone varchar(32) DEFAULT NULL,
	t_user_sex varchar(32) DEFAULT NULL,
	t_user_age varchar(32) DEFAULT NULL,
  PRIMARY KEY (t_user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_user(t_user_name,t_user_password,t_user_phone,t_user_sex,t_user_age) VALUES
('张三','Abcd1234','13725567048','男','25'),
('李四','Abcd1234','13725567049','女','26'),
('王五','Abcd1234','13725567040','男','27');