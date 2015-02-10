package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author blep .
 */
@Entity
public class User {
    @Id
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
