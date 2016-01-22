package quiz.domain;

import javax.persistence.*;
/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Project proff29
 * Package quiz.domain
 */
@Entity
@Table(name = "Q_FORM")
public class Form {
    @Id
    @SequenceGenerator(name = "sequence_q_form", sequenceName = "SEQ_Q_FORM",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY/*GenerationType.SEQUENCE*/, generator = "sequence_q_form")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", length = 255)
    private String name;

    public Form() {
    }

    public Form(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
