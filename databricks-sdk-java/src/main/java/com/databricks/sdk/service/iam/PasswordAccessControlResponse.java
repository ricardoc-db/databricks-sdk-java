// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PasswordAccessControlResponse {
  /** All permissions. */
  @JsonProperty("all_permissions")
  private Collection<PasswordPermission> allPermissions;

  /** Display name of the user or service principal. */
  @JsonProperty("display_name")
  private String displayName;

  /** name of the group */
  @JsonProperty("group_name")
  private String groupName;

  /** Name of the service principal. */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** name of the user */
  @JsonProperty("user_name")
  private String userName;

  public PasswordAccessControlResponse setAllPermissions(
      Collection<PasswordPermission> allPermissions) {
    this.allPermissions = allPermissions;
    return this;
  }

  public Collection<PasswordPermission> getAllPermissions() {
    return allPermissions;
  }

  public PasswordAccessControlResponse setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public PasswordAccessControlResponse setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public PasswordAccessControlResponse setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public PasswordAccessControlResponse setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PasswordAccessControlResponse that = (PasswordAccessControlResponse) o;
    return Objects.equals(allPermissions, that.allPermissions)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPermissions, displayName, groupName, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(PasswordAccessControlResponse.class)
        .add("allPermissions", allPermissions)
        .add("displayName", displayName)
        .add("groupName", groupName)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
