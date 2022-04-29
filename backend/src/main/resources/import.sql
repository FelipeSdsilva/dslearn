INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Seu curso está disponivel',TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z','FALSE' ,'cursos/Bootcamp JAVA',1)

INSERT INTO tb_course (name, img_Url, img_Gray_Url) VALUES ('Bootcamp HTML','https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d','https://imagehost9.online-image-editor.com/oie_upload/images/2815344s1CPifwU05/2817328XFF47ZGy.jpg');
INSERT INTO tb_course (name, img_Url, img_Gray_Url) VALUES ('Bootcamp JAVA','https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d','https://imagehost9.online-image-editor.com/oie_upload/images/2815344s1CPifwU05/2817328XFF47ZGy.jpg');
INSERT INTO tb_course (name, img_Url, img_Gray_Url) VALUES ('Bootcamp TEST','https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d','https://imagehost9.online-image-editor.com/oie_upload/images/2815344s1CPifwU05/2817328XFF47ZGy.jpg');
INSERT INTO tb_course (name, img_Url, img_Gray_Url) VALUES ('Bootcamp REST','https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d','https://imagehost9.online-image-editor.com/oie_upload/images/2815344s1CPifwU05/2817328XFF47ZGy.jpg');

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0',TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z',TIMESTAMP WITH TIME ZONE '2021-11-20T03:00:00Z',1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0',TIMESTAMP WITH TIME ZONE '2021-12-20T03:00:00Z',TIMESTAMP WITH TIME ZONE '2022-12-20T03:00:00Z',1);