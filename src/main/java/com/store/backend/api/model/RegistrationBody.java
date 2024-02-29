package com.store.backend.api.model;

import jakarta.validation.constraints.*;

public class RegistrationBody {
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @NotBlank
    @NotNull
    @Size(min=3, max=255)
    public String getUsername() {
        return username;
    }
    @NotBlank
    @NotNull
    @Email
    public String getEmail() {
        return email;
    }
    @NotBlank
    @NotNull
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$")
    @Size(min=6, max=32)
    public String getPassword() {
        return password;
    }
    @NotBlank
    @NotNull
    public String getFirstName() {
        return firstName;
    }
    @NotBlank
    @NotNull
    public String getLastName() {
        return lastName;
    }
}
