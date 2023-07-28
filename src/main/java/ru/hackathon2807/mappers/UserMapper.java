package ru.hackathon2807.mappers;

import org.springframework.stereotype.Service;
import ru.hackathon2807.adapters.DateTimeAdapter;
import ru.hackathon2807.dto.UserCreateDto;
import ru.hackathon2807.dto.UserReplyDto;
import ru.hackathon2807.models.User;

@Service
public class UserMapper {

    public static UserCreateDto objectToDto(User user) {

        return UserCreateDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .lastName(user.getLastName())
                .firstName(user.getFirstName())
                .patronymic(user.getPatronymic())
                .passportSeries(user.getPassportSeries())
                .passportNumber(user.getPassportNumber())
                .passportIssued(user.getPassportIssued())
                .passportDate(DateTimeAdapter.dateToString(user.getPassportDate()))
                .passportKp(user.getPassportKp())
                .build();
    }

    public static UserReplyDto objectToReplyDto(User user) {

        StringBuilder fullName = new StringBuilder();
        String passport = "ПаспортРФ " + user.getPassportSeries().substring(0,2) + " " + user.getPassportSeries().substring(2)
                + " " + user.getPassportNumber() + " выдан " + user.getPassportIssued()  + " " + DateTimeAdapter.dateToString(user.getPassportDate())
                + "г. кп " + user.getPassportKp().substring(0,3) + "-" + user.getPassportKp().substring(3);

        fullName.append(user.getFirstName()).append(" ").append(user.getLastName());

        if (user.getPatronymic() != null){
            fullName.append(" ").append(user.getPatronymic());
        }

        return UserReplyDto.builder()
                .fullName(fullName.toString())
                .email(user.getEmail())
                .passport(passport)
                .build();
    }

    public User dtoToObject(UserCreateDto dto) {

        return User.builder()
                .id(dto.getId())
                .email(dto.getEmail())
                .lastName(dto.getLastName())
                .firstName(dto.getFirstName())
                .patronymic(dto.getPatronymic())
                .passportSeries(dto.getPassportSeries())
                .passportNumber(dto.getPassportNumber())
                .passportIssued(dto.getPassportIssued())
                .passportDate(DateTimeAdapter.stringToDate(dto.getPassportDate()))
                .passportKp(dto.getPassportKp())
                .build();
    }
}
