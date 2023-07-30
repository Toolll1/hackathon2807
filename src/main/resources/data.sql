insert into users (last_name, first_name, patronymic, date_of_bird, email, telephone, passport_series, passport_number, passport_issued, passport_date, passport_kp)
values ('Иванов', 'Иван', 'Иванович', '2005-10-10', 'user@user.com', '88005553535', '0310', '351351', 'ОУФМС', '2020-10-10', '230003');

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

insert into banks (bank_name, logo) values ('ВТБ', 'https://static4.banki.ru/ugc/ed/5f/1a/1c/327.png');
insert into banks (bank_name, logo) values ('Сбербанк', 'https://static4.banki.ru/ugc/9d/12/0b/81/322.png');
insert into banks (bank_name, logo) values ('Альфабанк', 'https://static4.banki.ru/ugc/a8/9c/55/8e/325.png');
insert into banks (bank_name, logo) values ('Банк Центр-Инвест', 'https://static4.banki.ru/ugc/69/40/09/8f/124449.png');

insert into credits (credit_name, min_amount, max_amount, min_tern, max_tern, interest_rate, bank_id) values ('Учебный', 50000, 3000000, 6, 60, 5.55, 1);
insert into credits (credit_name, min_amount, max_amount, min_tern, max_tern, interest_rate, bank_id) values ('На учебу', 50000, 3000000, 6, 120, 6, 2);
insert into credits (credit_name, min_amount, max_amount, min_tern, max_tern, interest_rate, bank_id) values ('Учебный Альфа', 50000, 3000000, 6, 90, 5, 3);
insert into credits (credit_name, min_amount, max_amount, min_tern, max_tern, interest_rate, bank_id) values ('Лучший учебный кредит на свете', 50000, 3000000, 6, 120, 4, 4);

insert into insurance (insurance_name, description, bank_id) values ('ВТБ Страхование', 'для непредвиденных ситуаций. Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 1);
insert into insurance (insurance_name, description, bank_id) values ('Сбербанк Страхование', 'для непредвиденных ситуаций. Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 2);
insert into insurance (insurance_name, description, bank_id) values ('Альфабанк Страхование', 'для непредвиденных ситуаций. Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 3);
insert into insurance (insurance_name, description, bank_id) values ('Центр-Инвест Страхование', 'для непредвиденных ситуаций. Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 4);

insert into debit_cards (debit_card_name, description, bank_id) values ('ВТБ дебетовая карта', 'Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 1);
insert into debit_cards (debit_card_name, description, bank_id) values ('Сбербанк дебетовая карта', 'Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 2);
insert into debit_cards (debit_card_name, description, bank_id) values ('Альфабанк дебетовая карта', 'Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 3);
insert into debit_cards (debit_card_name, description, bank_id) values ('Центр-Инвест дебетовая карта', 'Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 4);

insert into credit_cards (credit_card_name, description, bank_id) values ('ВТБ кредитная карта', 'для непредвиденных трат. Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 1);
insert into credit_cards (credit_card_name, description, bank_id) values ('Сбербанк кредитная карта', 'для непредвиденных трат. Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 2);
insert into credit_cards (credit_card_name, description, bank_id) values ('Альфабанк кредитная карта', 'для непредвиденных трат. Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 3);
insert into credit_cards (credit_card_name, description, bank_id) values ('Центр-Инвест кредитная карта', 'для непредвиденных трат. Даёт дисконт по кредиту в размере 0,5 от процентной ставки', 4);
