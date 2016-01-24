package quiz.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Package quiz.domain
 */
@Entity
@Table(name = "Q_QUESTION")
public class Question {
    @Id
    @SequenceGenerator(name = "sequence_q_question", sequenceName = "SEQ_Q_QUESTION",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY/*GenerationType.SEQUENCE*/, generator = "sequence_q_question")
    @Column(name = "ID")
    private Long id;

    @Column (name = "NAME", length = 512)
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @Column (name = "QUESTION_TYPE")
    private EQuiestionType quiestionType;

    @ManyToOne(fetch = FetchType.EAGER)
    private Form form;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "question")
    private Set<Answer> answerList;

    public Question() {
    }

    public Question(Form form, EQuiestionType quiestionType, String name) {
        this.form = form;
        this.quiestionType = quiestionType;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Set<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(Set<Answer> answerList) {
        this.answerList = answerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EQuiestionType getQuiestionType() {
        return quiestionType;
    }

    public void setQuiestionType(EQuiestionType quiestionType) {
        this.quiestionType = quiestionType;
    }
}
