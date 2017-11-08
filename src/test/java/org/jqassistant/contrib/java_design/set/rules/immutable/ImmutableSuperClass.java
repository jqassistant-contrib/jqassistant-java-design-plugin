package org.jqassistant.contrib.java_design.set.rules.immutable;

public class ImmutableSuperClass {

    private String superClassValue;

    public ImmutableSuperClass(String superClassValue) {
        this.superClassValue = superClassValue;
    }

    public String getSuperClassValue() {
        return superClassValue;
    }
}
