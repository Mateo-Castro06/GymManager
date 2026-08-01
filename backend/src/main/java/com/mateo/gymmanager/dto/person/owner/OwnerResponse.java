package com.mateo.gymmanager.dto.person.owner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerResponse {
    private Long ownerId;
    private String firstName;
    private String lastName;
    private String username;
}
