package org.javaee7.jpa.defaultdatasource;

import org.javaee7.jpa.defaultdatasource.EmployeeDDS;
import org.javaee7.jpa.defaultdatasource.EmployeeBean;
import java.util.List;
import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 * @author Arun Gupta
 */
@RunWith(Arquillian.class)
public class EmployeeBeanTest {

    @Inject
    EmployeeBean bean;

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class)
                .addClasses(EmployeeDDS.class,
                        EmployeeBean.class)
                .addAsResource("META-INF/persistence.xml")
                .addAsResource("META-INF/load.sql");
    }

    @Test
    public void testGet() throws Exception {
        assertNotNull(bean);
        List<EmployeeDDS> list = bean.get();
        assertNotNull(list);
        assertEquals(8, list.size());
        assertFalse(list.contains(new EmployeeDDS("Penny")));
        assertFalse(list.contains(new EmployeeDDS("Sheldon")));
        assertFalse(list.contains(new EmployeeDDS("Amy")));
        assertFalse(list.contains(new EmployeeDDS("Leonard")));
        assertFalse(list.contains(new EmployeeDDS("Bernadette")));
        assertFalse(list.contains(new EmployeeDDS("Raj")));
        assertFalse(list.contains(new EmployeeDDS("Howard")));
        assertFalse(list.contains(new EmployeeDDS("Priya")));
    }

}
