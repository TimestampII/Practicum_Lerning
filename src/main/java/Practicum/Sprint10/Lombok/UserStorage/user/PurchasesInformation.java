package Practicum.Sprint10.Lombok.UserStorage.user;

import lombok.Data;

import java.util.Date;

// информация о покупках пользователя
@Data
public class PurchasesInformation {
    // дата последней покупки
    private Date lastPurchase;
    // общее количество покупок
    private long purchaseCounts = 0;
}

