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

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Seu curso está disponivel',TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z',FALSE ,'cursos/Bootcamp JAVA',1)

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp HTML','https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d','https://imagehost9.online-image-editor.com/oie_upload/images/2815344s1CPifwU05/2817328XFF47ZGy.jpg');
INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp JAVA','https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d','https://imagehost9.online-image-editor.com/oie_upload/images/2815344s1CPifwU05/2817328XFF47ZGy.jpg');
INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp TEST','https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d','https://imagehost9.online-image-editor.com/oie_upload/images/2815344s1CPifwU05/2817328XFF47ZGy.jpg');
INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp REST','https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d','https://imagehost9.online-image-editor.com/oie_upload/images/2815344s1CPifwU05/2817328XFF47ZGy.jpg');

INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('1.0',TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z',TIMESTAMP WITH TIME ZONE '2021-11-20T03:00:00Z',1);
INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) VALUES ('2.0',TIMESTAMP WITH TIME ZONE '2021-12-20T03:00:00Z',TIMESTAMP WITH TIME ZONE '2022-12-20T03:00:00Z',1);

INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES('Trilha de HTML','Trilha principal do curso', 1, 'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES('Forum','Tire suas duvidas do curso', 2, 'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d', 2, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) VALUES('Lives','Lives bonus o curso', 3, 'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d', 0, 1);

INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 1', 'Introdução ao Html', 1,'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d', 1, null);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 2', 'Tags', 2,'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d', 1, 1);
INSERT INTO tb_section (title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Capitulo 3', 'Ancoras', 3,'https://c.pxhere.com/images/07/b2/f8ed07d6f1a9c740e7703cbb99ee-1443423.jpg!d', 1, 2);

INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refound_Moment, available, only_Update) VALUES ( 1, 1, TIMESTAMP WITH TIME ZONE '2020-11-20T13:00:00Z',null,TRUE,FALSE);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_Moment, refound_Moment, available, only_Update) VALUES ( 2, 1, TIMESTAMP WITH TIME ZONE '2020-11-20T13:00:00Z',null,TRUE,FALSE);

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 1', 1, 1);
INSERT INTO tb_content(text_Content, video_Uri, id) VALUES ('Aula sobre html', 'https://www.youtube.com/watch?v=vNS-54QlcEg', 1);
INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 2', 2, 1);
INSERT INTO tb_content(text_Content, video_Uri, id) VALUES ('Aula sobre html', 'https://www.youtube.com/watch?v=vNS-54QlcEg', 2);
INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula 3', 3, 1);
INSERT INTO tb_content(text_Content, video_Uri, id) VALUES ('Aula sobre html', 'https://www.youtube.com/watch?v=vNS-54QlcEg', 3);
INSERT INTO tb_lesson (title, position, section_id) VALUES ('Tarefa do capitulo 1', 4, 1);
INSERT INTO tb_task (id ,description, question_Count, approval_Count, weight, due_Date) VALUES (4, 'Monte sua pagina html', 5, 4, 1, TIMESTAMP WITH TIME ZONE '2020-11-20T03:00:00Z');

INSERT INTO tb_lessons_done (lesson_id,user_id, offer_id) VALUES ( 1,1,1);
INSERT INTO tb_lessons_done (lesson_id,user_id, offer_id) VALUES ( 2,1,1);

INSERT INTO tb_deliver (uri, moment, status, feedback, correct_Count, lesson_id, user_id, offer_id) VALUES ('https://github.com/devsuperior/bds-dslearn', TIMESTAMP WITH TIME ZONE '2020-12-10T10:00:00Z', 0, null, null, 4, 1, 1);