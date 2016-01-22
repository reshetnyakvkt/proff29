package quiz.domain;

import javax.persistence.*;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Package quiz.domain
 */
@Entity
@Table(name = "Q_FORM_ACCESS")
public class FormAccess {
    @Id
    @SequenceGenerator(name = "sequence_q_form", sequenceName = "SEQ_Q_FORM",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY/*GenerationType.SEQUENCE*/, generator = "sequence_q_form")
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    private Form form;

    public FormAccess() {
    }

    public FormAccess(User user, Form form) {
        this.user = user;
        this.form = form;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }
}
