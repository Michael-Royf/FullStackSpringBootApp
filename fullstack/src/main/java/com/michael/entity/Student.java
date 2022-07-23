package com.michael.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString

public class Student {

    private Long id;
    private String name;
    private String email;
    private Gender gender;


}
