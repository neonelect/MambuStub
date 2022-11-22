package com.ezdihar.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    private Access access;
    private String assignedBranchKey;
    private String email;
    private String firstName;
    private String homePhone;
    private String language;
    private String lastName;
    private String mobilePhone;
    private String notes;
    private Role role;
    private String title;
    private TransactionLimits transactionLimits;
    private Boolean twoFactorAuthentication;
    private String userState;
    private String username;
}
