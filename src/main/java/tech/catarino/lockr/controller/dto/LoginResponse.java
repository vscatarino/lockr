package tech.catarino.lockr.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {

}
