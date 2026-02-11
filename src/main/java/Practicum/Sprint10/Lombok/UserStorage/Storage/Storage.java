package Practicum.Sprint10.Lombok.UserStorage.Storage;

import Practicum.Sprint10.Lombok.UserStorage.user.User;

// интерфейс для сохранения и получения данных о пользователе
public interface Storage {
    void put(User user);
    User get(String email);
}