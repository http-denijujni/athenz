//
// This file generated by rdl 1.5.1. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// Policy - The representation for a Policy with set of assertions.
//
public class Policy {
    public String name;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp modified;
    public List<Assertion> assertions;

    public Policy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public Policy setModified(Timestamp modified) {
        this.modified = modified;
        return this;
    }
    public Timestamp getModified() {
        return modified;
    }
    public Policy setAssertions(List<Assertion> assertions) {
        this.assertions = assertions;
        return this;
    }
    public List<Assertion> getAssertions() {
        return assertions;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Policy.class) {
                return false;
            }
            Policy a = (Policy) another;
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (modified == null ? a.modified != null : !modified.equals(a.modified)) {
                return false;
            }
            if (assertions == null ? a.assertions != null : !assertions.equals(a.assertions)) {
                return false;
            }
        }
        return true;
    }
}
