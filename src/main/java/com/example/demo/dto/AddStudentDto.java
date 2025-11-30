package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentDto {
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 30, message = "Name should have at least 3 and more than 30 characters")
    private String name;

    @Email
    @NotBlank(message = "Email is required")
    private String email;
}
