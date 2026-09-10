package com.gamebasic.game.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RenameRequest {

	@NotBlank(message = "플레이어 이름은 비어 있을 수 없습니다.")
	private String playerName;

	public RenameRequest(String playerName) {
		this.playerName = playerName;
	}
}
