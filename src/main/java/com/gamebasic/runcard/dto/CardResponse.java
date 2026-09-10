package com.gamebasic.runcard.dto;

import com.gamebasic.runcard.entity.RunCard;
import lombok.Getter;

@Getter
public class CardResponse {
    // TODO (Lv 5): API 명세의 카드 응답 JSON에 맞게 필드를 만들고 생성자에서 채우세요.
    private final Long id;
    private final String cardType;
    private final int acquiredFloor;

    public CardResponse(
        Long id,
        String cardType,
        int acquiredFloor
    ) {
        this.id = id;
        this.cardType = cardType;
        this.acquiredFloor = acquiredFloor;
    }

    public static CardResponse from(RunCard card) {
        return new CardResponse(
                card.getId(),
                card.getCardType(),
                card.getAcquiredFloor()
        );
    }
}
