package org.jqassistant.contrib.java_design.set.rules.immutable;

public class MutableSuperClass {

    private String superClassValue;

    public MutableSuperClass(String superClassValue) {
        this.superClassValue = superClassValue;
    }

    public String getSuperClassValue() {
        return superClassValue;
    }

    public void setSuperClassValue(String superClassValue) {
        this.superClassValue = superClassValue;
    }
}
