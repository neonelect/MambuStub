package com.ezdihar.model.user;

import com.ezdihar.model.user.ManagedBranch;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Access {
    private Boolean administratorAccess;
    private Boolean apiAccess;
    private Boolean canManageAllBranches;
    private Boolean canManageEntitiesAssignedToOtherOfficers;
    private Boolean creditOfficerAccess;
    private Boolean mambuAccess;
    private List<ManagedBranch> managedBranches;
    private List<String> permissions;
    private Boolean tellerAccess;
}

