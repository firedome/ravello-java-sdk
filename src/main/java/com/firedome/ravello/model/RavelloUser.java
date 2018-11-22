package com.firedome.ravello.model;

import com.firedome.ravello.Resource;

import java.util.List;

/**
 * Describes Ravello Authenticated User model
 *
 * @see <a href="URL#https://www.ravellosystems.com/ravello-api-doc/#users></a>
 */
public class RavelloUser extends Resource {

    private Long id;
    private List<String> roles;
    private String uuid;
    private String name;
    private String surname;
    private String email;
    private String username;
    private Boolean enabled;
    private Boolean activated;
    private Boolean deleted;
    private Long organization;
    private Long invitationTime;
    private Long activateTime;
    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getOrganization() {
        return organization;
    }

    public void setOrganization(Long organization) {
        this.organization = organization;
    }

    public Long getInvitationTime() {
        return invitationTime;
    }

    public void setInvitationTime(Long invitationTime) {
        this.invitationTime = invitationTime;
    }

    public Long getActivateTime() {
        return activateTime;
    }

    public void setActivateTime(Long activateTime) {
        this.activateTime = activateTime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
