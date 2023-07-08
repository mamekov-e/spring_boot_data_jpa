package com.example.spring_boot_data_jpa.exception_handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeIncorrectData {
    private String info;
}
