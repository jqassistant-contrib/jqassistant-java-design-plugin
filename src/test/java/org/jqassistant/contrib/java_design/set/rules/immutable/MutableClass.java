package org.jqassistant.contrib.java_design.set.rules.immutable;

public class MutableClass extends MutableSuperClass {

    private String classValue;

    public MutableClass(String superClassValue, String classValue) {
        super(superClassValue);
        this.classValue = classValue;
    }

    public void setClassValue(String classValue) {
        this.classValue = classValue;
    }

    public String getClassValue() {
        return classValue;
    }
}
