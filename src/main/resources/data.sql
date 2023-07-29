insert into universities (university_name) values ('КубГАУ');
insert into universities (university_name) values ('КубГУ');
insert into universities (university_name) values ('КубГТУ');
insert into universities (university_name) values ('МГУ');

insert into faculties (faculty_name, tuition_fees) values ('Финансы и Кредит', 300000);
insert into university_faculties (university_id, faculty_id) values (1, 1);
insert into faculties (faculty_name, tuition_fees) values ('Управление персоналом', 250000);
insert into university_faculties (university_id, faculty_id) values (1, 2);
insert into faculties (faculty_name, tuition_fees) values ('Финансы и Кредит', 350000);
insert into university_faculties (university_id, faculty_id) values (2, 3);
insert into faculties (faculty_name, tuition_fees) values ('Управление персоналом', 300000);
insert into university_faculties (university_id, faculty_id) values (2, 4);
insert into faculties (faculty_name, tuition_fees) values ('Тестировние ПО', 200000);
insert into university_faculties (university_id, faculty_id) values (3, 5);
insert into faculties (faculty_name, tuition_fees) values ('Администрирование БД', 200000);
insert into university_faculties (university_id, faculty_id) values (3, 6);
insert into faculties (faculty_name, tuition_fees) values ('Журналистика', 500000);
insert into university_faculties (university_id, faculty_id) values (4, 7);
insert into faculties (faculty_name, tuition_fees) values ('Международное право', 600000);
insert into university_faculties (university_id, faculty_id) values (4, 8);

insert into banks (bank_name) values ('ВТБ');
insert into banks (bank_name) values ('Сбербанк');
insert into banks (bank_name) values ('Альфабанк');
insert into banks (bank_name) values ('Банк Центр-Инвест');

insert into credits (credit_name, min_amount, max_amount, min_tern, max_tern, interest_rate, bank_id) values ('Учебный', 50000, 3000000, 6, 60, 5.55, 1);
insert into credits (credit_name, min_amount, max_amount, min_tern, max_tern, interest_rate, bank_id) values ('На учебу', 50000, 3000000, 6, 120, 6, 2);
insert into credits (credit_name, min_amount, max_amount, min_tern, max_tern, interest_rate, bank_id) values ('Учебный Альфа', 50000, 3000000, 6, 90, 5, 3);
insert into credits (credit_name, min_amount, max_amount, min_tern, max_tern, interest_rate, bank_id) values ('Лучший учебный кредит на свете', 50000, 3000000, 6, 120, 4, 4);