package org.kevoree.registry.model;

import org.KevoreeDimension;
import org.KevoreeUniverse;
import org.KevoreeView;
import org.junit.Before;
import org.junit.Test;
import org.kevoree.ContainerNode;
import org.kevoree.ContainerRoot;
import org.kevoree.modeling.api.data.MemoryKDataBase;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * Created by leiko on 14/01/15.
 */
public class KevoreeModelTest {

    private KevoreeDimension dimension;

    @Before
    public void setup() {
        KevoreeUniverse universe = new KevoreeUniverse();
        universe.connect(null);
        universe.setDataBase(new MemoryKDataBase());

        dimension = universe.newDimension();
    }

    @Test
    public void createContainerRoot() {
        KevoreeView view0 = dimension.time(0L);
        ContainerRoot root = view0.createContainerRoot();
        view0.setRoot(root, null);

        assertThat(root).isNotNull();
    }

    @Test
    public void createContainerNode() {
        KevoreeView view = dimension.time(0L);
        ContainerRoot root = view.createContainerRoot();
        view.setRoot(root, null);
        ContainerNode node = view.createContainerNode();
        root.addNodes(node);

        assertThat(root.sizeOfNodes()).isEqualTo(1);
    }

    // TODO: more tests!
}
