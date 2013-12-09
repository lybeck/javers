package org.javers.test.assertion;

import org.fest.assertions.api.AbstractAssert;
import org.javers.model.object.graph.SingleEdge;

/**
 * @author bartosz walacik
 */
public class SingleEdgeAssert extends AbstractAssert<SingleEdgeAssert, SingleEdge> {

    private SingleEdgeAssert(SingleEdge actual) {
        super(actual, SingleEdgeAssert.class);
    }

    public static SingleEdgeAssert assertThat(SingleEdge actual) {
        return new SingleEdgeAssert(actual);
    }

    public SingleEdgeAssert refersToCdoWithId(Object expectedCdoId) {
        Assertions.assertThat(actual.getInReference()).isNotNull();
        Assertions.assertThat(actual.getInReference().getLocalCdoId()).isEqualTo(expectedCdoId);
        return this;
    }

    public NodeAssert andTargetNode() {
        Assertions.assertThat(actual.getInReference()).isNotNull();
        return NodeAssert.assertThat(actual.getInReference());
    }
}
