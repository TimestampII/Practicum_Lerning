package Practicum.Sprint10.Lombok.UserStorage.user;

import lombok.*;
import lombok.Builder;

import java.util.Date;

// детализированная информация о пользователе
@Value
@Builder
@RequiredArgsConstructor
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