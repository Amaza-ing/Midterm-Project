package com.ironhack.midtermproject.controller.dto.users;

import javax.validation.constraints.NotNull;

public class ThirdPartyDTO {
	@NotNull
	private String name;
	@NotNull
	private String hashedKey;

	public ThirdPartyDTO() {
	}

	public ThirdPartyDTO(String name, String hashedKey) {
		this.name = name;
		this.hashedKey = hashedKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHashedKey() {
		return hashedKey;
	}

	public void setHashedKey(String hashedKey) {
		this.hashedKey = hashedKey;
	}
}
