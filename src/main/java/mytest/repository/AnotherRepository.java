package mytest.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author blep .
 */
@Repository
public class AnotherRepository {
    @PersistenceContext
    private EntityManager em;

    public void doSomething(){
        System.out.println("AnotherRepository.doSomething");
    }

}
