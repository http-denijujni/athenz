//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// DefaultAdmins - The list of domain administrators.
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class DefaultAdmins {
    public List<String> admins;

    public DefaultAdmins setAdmins(List<String> admins) {
        this.admins = admins;
        return this;
    }
    public List<String> getAdmins() {
        return admins;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DefaultAdmins.class) {
                return false;
            }
            DefaultAdmins a = (DefaultAdmins) another;
            if (admins == null ? a.admins != null : !admins.equals(a.admins)) {
                return false;
            }
        }
        return true;
    }
}
