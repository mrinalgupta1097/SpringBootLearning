package com.mrinalgupta.sbl.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private String email;
    private String address;
    private int age;
    private String gender;
}
