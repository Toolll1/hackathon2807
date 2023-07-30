insert into users (last_name, first_name, patronymic, date_of_bird, email, telephone, passport_series, passport_number, passport_issued, passport_date, passport_kp)
values ('Иванов', 'Иван', 'Иванович', '2005-10-10', 'user@user.com', '88005553535', '0310', '351351', 'ОУФМС', '2020-10-10', '230003');

insert into universities (university_name, description, logo) values ('КубГАУ', '«Кубанский государственный аграрный университет имени И.Т. Трубилина» (КубГАУ; сельхоз) — высшее учебное заведение в Краснодаре. Один из крупнейших аграрных университетов России.', 'https://uspehbogatstvo.ru/wp-content/uploads/2020/08/kubgau-kubanskiy-gosudarstvennyy-agrarnyy-universitet-2020.jpg');
insert into universities (university_name, description, logo) values ('КубГУ', 'Куба́нский госуда́рственный университе́т (КубГУ) — высшее учебное заведение в Краснодаре. Является одним из крупнейших и старейших университетов юга России.', 'https://kubnews.ru/upload/resize_cache/iblock/b9b/1200_630_2/b9beae20df13fec7d94e968cbf9e52d6.jpeg');
insert into universities (university_name, description, logo) values ('КубГТУ', 'Куба́нский госуда́рственный технологи́ческий университе́т (КубГТУ) — федеральное государственное бюджетное образовательное учреждение высшего образования, расположенное в Краснодаре, один из крупнейших вузов Краснодарского края.', 'https://russiaedu.ru/media/cache/image_md_resize/uploads/upload-images/2018/09/28/O2h19f08jBw.jpg');
insert into universities (university_name, description, logo) values ('МГУ', 'Моско́вский госуда́рственный университе́т и́мени М. В. Ломоно́сова (с 1755 по 1917 год — Императорский Московский университет) — один из старейших и крупнейших классических университетов России, один из центров российской науки и культуры, расположенный в Москве. C 1940 года носит имя Михаила Васильевича Ломоносова.', 'https://newizv.ru/attachments/dab2443d4353baf4eb793bdb592f1c05cf0fdcad/store/crop/0/0/1369/912/1369/912/0/54f001227aa07076b730918cdc4b0b6004711929dd2da84f2377f6b21d81/5462191f368c461649553f79e20a79f103c6845bac55c2fb96cca208e0a8');

insert into faculties (faculty_name, tuition_fees, programs) values ('Финансы и Кредит', 300000, 'специалитет, бакалавриат');
insert into university_faculties (university_id, faculty_id) values (1, 1);
insert into faculties (faculty_name, tuition_fees, programs) values ('Управление персоналом', 250000, 'специалитет, бакалавриат');
insert into university_faculties (university_id, faculty_id) values (1, 2);
insert into faculties (faculty_name, tuition_fees, programs) values ('Финансы и Кредит', 350000, 'специалитет, бакалавриат');
insert into university_faculties (university_id, faculty_id) values (2, 3);
insert into faculties (faculty_name, tuition_fees, programs) values ('Управление персоналом', 300000, 'специалитет, бакалавриат');
insert into university_faculties (university_id, faculty_id) values (2, 4);
insert into faculties (faculty_name, tuition_fees, programs) values ('Тестировние ПО', 200000, 'специалитет, бакалавриат');
insert into university_faculties (university_id, faculty_id) values (3, 5);
insert into faculties (faculty_name, tuition_fees, programs) values ('Администрирование БД', 200000, 'специалитет, бакалавриат');
insert into university_faculties (university_id, faculty_id) values (3, 6);
insert into faculties (faculty_name, tuition_fees, programs) values ('Журналистика', 500000, 'специалитет, бакалавриат');
insert into university_faculties (university_id, faculty_id) values (4, 7);
insert into faculties (faculty_name, tuition_fees, programs) values ('Международное право', 600000, 'специалитет, бакалавриат');
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
