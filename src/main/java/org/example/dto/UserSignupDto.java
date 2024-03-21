package org.example.dto;

public record UserSignupDto(
        String username,
        String email,
        String password
) {
}
