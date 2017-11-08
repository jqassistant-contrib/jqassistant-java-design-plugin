package org.jqassistant.contrib.java_design;

import static com.buschmais.jqassistant.plugin.java.test.matcher.TypeDescriptorMatcher.typeDescriptor;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.jqassistant.contrib.java_design.set.rules.immutable.*;
import org.junit.Test;

import com.buschmais.jqassistant.plugin.java.test.AbstractJavaPluginIT;

/**
 * Tests for the concept java:Immutable.
 */
public class ImmutableIT extends AbstractJavaPluginIT {

    /**
     * Verifies the concept "java:Immutable".
     *
     * @throws java.io.IOException
     *             If the test fails.
     */
    @Test
    public void immutable() throws Exception {
        scanClasses(ImmutableSuperClass.class, ImmutableClass.class, MutableSuperClass.class, MutableClass.class, ImplicitlyMutableClass.class);
        applyConcept("java-design:Immutable");
        store.beginTransaction();
        List<Object> immutables = query("MATCH (i:Immutable) RETURN i").getColumn("i");
        assertThat(immutables, hasItem(typeDescriptor(ImmutableClass.class)));
        assertThat(immutables, hasItem(typeDescriptor(ImmutableSuperClass.class)));
        assertThat(immutables, not(hasItem(typeDescriptor(MutableSuperClass.class))));
        assertThat(immutables, not(hasItem(typeDescriptor(MutableClass.class))));
        assertThat(immutables, not(hasItem(typeDescriptor(ImplicitlyMutableClass.class))));
        store.commitTransaction();
    }
}
