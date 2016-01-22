package quiz.domain;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Project proff29
 * Package quiz.domain
 */
@Entity
@Table(name = "Q_ANSWER")
public class Answer {
    @Id
    @SequenceGenerator(name = "sequence_q_answer", sequenceName = "SEQ_Q_ANSWER",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_q_answer")
    @Column(name = "ID")
    private Long id;

    @Column(name = "CREATE_DATE", length = 15)
    private Date createDate;

    @Column(name = "NAME", length = 512)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;

    public Answer() {
        this.createDate = Calendar.getInstance().getTime();
    }

    public Answer(Question question) {
        this();
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}