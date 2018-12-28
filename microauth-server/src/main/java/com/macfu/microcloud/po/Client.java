package com.macfu.microcloud.po;

import java.io.Serializable;

/**
 * @Author: liming
 * @Date: 2018/12/27 19:48
 * @Description:
 */
public class Client implements Serializable {
    private static final long serialVersionUID = -6044593939820238484L;

    private String clientid;
    private String clientsecret;
    private String scope;
    private Integer locked;
    private String authorizedgranttypes;

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getClientsecret() {
        return clientsecret;
    }

    public void setClientsecret(String clientsecret) {
        this.clientsecret = clientsecret;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public String getAuthorizedgranttypes() {
        return authorizedgranttypes;
    }

    public void setAuthorizedgranttypes(String authorizedgranttypes) {
        this.authorizedgranttypes = authorizedgranttypes;
    }
}
