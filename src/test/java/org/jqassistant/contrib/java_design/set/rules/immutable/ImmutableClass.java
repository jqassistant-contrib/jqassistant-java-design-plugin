package org.jqassistant.contrib.java_design.set.rules.immutable;

public class ImmutableClass extends ImmutableSuperClass {

    private String classValue;

    public ImmutableClass(String superClassValue, String classValue) {
        super(superClassValue);
        this.classValue = classValue;
    }

    public String getClassValue() {
        return classValue;
    }
}
