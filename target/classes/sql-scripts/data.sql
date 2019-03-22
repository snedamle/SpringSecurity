INSERT INTO app_role (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standard User');
INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User');

-- USER
-- non-encrypted password: jwtpass
INSERT INTO app_user (id, first_name, last_name, password, username,address,email,father_name,gender,last_login,maiden_name,
marital_status,mobile,mother_name)
VALUES (1, 'sneha', 'damle', '$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe', 'sneha.damle','marine lines',null,null,null,null,null,null,null,null);
INSERT INTO app_user (id, first_name, last_name, password, username,address,email,father_name,gender,last_login,maiden_name,
                     marital_status,mobile,mother_name)
VALUES (2, 'Admin', 'Admin', '$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe', 'admin.admin',null,null,null,null,null,null,null,null,null);


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);
