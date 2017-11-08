package org.jqassistant.contrib.java_design.set.rules.immutable;

public class ImplicitlyMutableClass extends MutableSuperClass {

    private String classValue;

    public ImplicitlyMutableClass(String superClassValue, String classValue) {
        super(superClassValue);
        this.classValue = classValue;
    }

    public String getClassValue() {
        return classValue;
    }
}
