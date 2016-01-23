package quiz.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Package quiz.domain
 */
@Entity
@Table(name = "Q_USER")
public class User {
    @Id
    @SequenceGenerator(name = "sequence_q_user", sequenceName = "SEQ_Q_USER",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY/*GenerationType.SEQUENCE*/, generator = "sequence_q_user")
    @Column(name = "ID")
    private Long id;

    @Column (name = "LOGIN", length = 25, nullable = false)
    private String login;

    @Column (name = "ADMIN_USER", length = 1)
    private Integer permission;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    private Set<FormAccess> formList;

    public User() {
    }

    public User(String login, Integer permission) {
        this.login = login;
        this.permission = permission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Set<FormAccess> getFormList() {
        return formList;
    }

    public void setFormList(Set<FormAccess> formList) {
        this.formList = formList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", permission=" + permission +
                '}';
    }
}

