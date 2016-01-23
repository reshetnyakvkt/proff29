package quiz.domain;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Package quiz.domain
 */
@Entity
@Table(name = "Q_FORM_USER")
public class FormUser {
    @Id
    @SequenceGenerator(name = "sequence_q_form_user", sequenceName = "SEQ_Q_FORM_USER",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY/*GenerationType.SEQUENCE*/, generator = "sequence_q_form_user")
    @Column(name = "ID")
    private Long id;

    @Column(name = "IS_FINISHED")
    private boolean isFinished;

    @Column(name = "PERC_OF_CORRECT", length = 3)
    private Integer percentOfCorrect;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    private Form form;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "formUser")
    private Set<FormAnswerQuestion> formAnswerQuestionList;

    public FormUser() {
        this.createDate = Calendar.getInstance().getTime();
    }

    public FormUser(User user, Form form) {
        this();
        this.user = user;
        this.form = form;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public Integer getPercentOfCorrect() {
        return percentOfCorrect;
    }

    public void setPercentOfCorrect(Integer percentOfCorrect) {
        this.percentOfCorrect = percentOfCorrect;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Set<FormAnswerQuestion> getFormAnswerQuestionList() {
        return formAnswerQuestionList;
    }

    public void setFormAnswerQuestionList(Set<FormAnswerQuestion> formAnswerQuestionList) {
        this.formAnswerQuestionList = formAnswerQuestionList;
    }
}
