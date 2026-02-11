package Practicum.Sprint10.Lombok.UserStorage.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class User {
    // детализированная информация о пользователе
    @NonNull
    private Details details;
    // информация о покупках пользователя
    private PurchasesInformation purchasesInformation = new PurchasesInformation();
}

