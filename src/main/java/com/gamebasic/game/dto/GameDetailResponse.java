package com.gamebasic.game.dto;

import com.gamebasic.game.entity.Game;
import com.gamebasic.game.entity.GamePhase;
import com.gamebasic.game.entity.GameStatus;
import com.gamebasic.runcard.dto.CardResponse;
import com.gamebasic.runcard.entity.RunCard;
import lombok.Getter;

import java.util.List;

@Getter
public class GameDetailResponse {
    private final Long id;
    private final String playerName;
    private final int currentHp;
    private final int currentFloor;
    private final GamePhase phase;
    private final GameStatus status;
    private final List<CardResponse> deck;

    public GameDetailResponse(
        Long id,
        String playerName,
        int currentHp,
        int currentFloor,
        GamePhase phase,
        GameStatus status,
        List<CardResponse> deck
    ) {
        this.id = id;
        this.playerName = playerName;
        this.currentHp = currentHp;
        this.currentFloor = currentFloor;
        this.phase = phase;
        this.status = status;
        this.deck = List.copyOf(deck);
    }

    public static GameDetailResponse of(Game game, List<RunCard> cards) {
        List<CardResponse> deck = cards.stream()
                .map(CardResponse::from)
                .toList();

        return new GameDetailResponse(
                game.getId(),
                game.getPlayerName(),
                game.getCurrentHp(),
                game.getCurrentFloor(),
                game.getPhase(),
                game.getStatus(),
                deck
        );
    }
}
