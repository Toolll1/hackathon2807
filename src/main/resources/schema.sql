drop table if exists users cascade;
drop table if exists universities cascade;
drop table if exists faculties cascade;
drop table if exists credits cascade;
drop table if exists insurance cascade;
drop table if exists debit_cards cascade;
drop table if exists credit_cards cascade;

create table if not exists users (
user_id bigint not null generated by default as identity primary key,
last_name varchar(100) not null,
first_name varchar(100) not null,
patronymic varchar(100),
date_of_bird timestamp without time zone not null,
email varchar(320) UNIQUE not null,
telephone varchar(11) UNIQUE not null,
passport_series varchar(4) not null,
passport_number varchar(6) not null,
passport_issued varchar(320) not null,
passport_date timestamp without time zone not null,
passport_kp varchar(6) not null
);

create table if not exists universities (
university_id bigint not null generated by default as identity primary key,
description varchar(1000) not null,
university_name varchar(320) not null,
logo text
);

create table if not exists faculties (
faculty_id bigint not null generated by default as identity primary key,
faculty_name varchar(320) not null,
programs varchar(320) not null,
tuition_fees int not null
);

create table if not exists university_faculties (
university_id bigint not null references universities(university_id),
faculty_id bigint not null references faculties(faculty_id)
);

create table if not exists banks (
bank_id bigint not null generated by default as identity primary key,
bank_name varchar(320) not null,
logo text
);

create table if not exists credits (
credit_id bigint not null generated by default as identity primary key,
credit_name varchar(320) not null,
min_amount int not null,
max_amount int not null,
min_tern int not null,
max_tern int not null,
interest_rate float not null,
bank_id bigint not null references banks(bank_id)
);

create table if not exists insurance (
insurance_id bigint not null generated by default as identity primary key,
insurance_name varchar(320) not null,
description varchar(1000) not null,
bank_id bigint not null references banks(bank_id)
);

create table if not exists debit_cards (
debit_card_id bigint not null generated by default as identity primary key,
debit_card_name varchar(320) not null,
description varchar(1000) not null,
bank_id bigint not null references banks(bank_id)
);

create table if not exists credit_cards (
credit_card_id bigint not null generated by default as identity primary key,
credit_card_name varchar(320) not null,
description varchar(1000) not null,
bank_id bigint not null references banks(bank_id)
);