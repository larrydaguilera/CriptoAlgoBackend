package com.C722.CriptoAlgo.criptoAlgo.models.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateRequest {


        private String firstName;


        private String lastName;

        private String email;

        private String password;

    }
