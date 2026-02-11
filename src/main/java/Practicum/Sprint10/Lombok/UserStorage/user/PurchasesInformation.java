package Practicum.Sprint10.Lombok.UserStorage.user;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.Date;

// информация о покупках пользователя
@Value
@Builder
public class PurchasesInformation {
    // дата последней покупки
    private Date lastPurchase;
    // общее количество покупок
    private long purchaseCounts = 0;
}

