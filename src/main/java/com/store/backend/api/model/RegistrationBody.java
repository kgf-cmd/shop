package com.store.backend.api.model;

import jakarta.validation.constraints.*;

public class RegistrationBody {
  /*  private String username;
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
    }*/
  @NotNull
  @NotBlank
  @Size(min=3, max=255)
  private String username;
    /** The email. */
    @NotNull
    @NotBlank
    @Email
    private String email;
    /** The password. */
    @NotNull
    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$")
    @Size(min=6, max=32)
    private String password;
    /** The first name. */
    @NotNull
    @NotBlank
    private String firstName;
    /** The last name. */
    @NotNull
    @NotBlank
    private String lastName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
