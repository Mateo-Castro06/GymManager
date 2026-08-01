package com.mateo.gymmanager.dto.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteUserAccountRequest {
    private Long branchManagerId;
    private Long ownerId;
}
