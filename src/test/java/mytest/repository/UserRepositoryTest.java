package mytest.repository;

import mytest.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class UserRepositoryTest {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testName() throws Exception {
        System.out.println("UserRepositoryTest.testName");

    }
}