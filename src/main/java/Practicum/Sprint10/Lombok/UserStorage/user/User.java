package Practicum.Sprint10.Lombok.UserStorage.user;

import lombok.*;

@Data
@Builder
public class User {
    // детализированная информация о пользователе
    @NonNull
    private Details details;
    @Builder.Default
    // информация о покупках пользователя
    private PurchasesInformation purchasesInformation = PurchasesInformation.builder().build();
}

