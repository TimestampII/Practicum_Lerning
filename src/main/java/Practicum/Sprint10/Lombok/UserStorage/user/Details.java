package Practicum.Sprint10.Lombok.UserStorage.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

// детализированная информация о пользователе
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Details {
    // электронная почта
    @NonNull
    private String email;
    // имя
    @NonNull
    private String firstName;
    // фамилия
    @NonNull
    private String lastName;

    // дополнительная информация
    private String information;
    // дата рождения
    private Date dayOfBirthday;
    // пол
    private Gender gender = Gender.UNKNOWN;
}