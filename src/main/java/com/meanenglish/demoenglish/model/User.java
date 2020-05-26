package com.meanenglish.demoenglish.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
//https://www.youtube.com/watch?v=ksUpB2rEAPw&list=PLEd6LarmkKnXsqv0L2EL_njzGPV-e50-6&index=4 @Id
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
}
