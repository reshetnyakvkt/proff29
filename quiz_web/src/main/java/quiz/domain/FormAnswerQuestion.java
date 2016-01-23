package quiz.domain;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Package quiz.domain
 */
@Entity
@Table(name = "Q_FORM_ANSWER_QUESTION")
public class FormAnswerQuestion {
    @Id
    @SequenceGenerator(name = "sequence_q_form_answer_question", sequenceName = "SEQ_Q_FORM_ANSWER_QUESTION",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY/*GenerationType.SEQUENCE*/, generator = "sequence_q_form_answer_question")
    @Column(name = "ID")
    private Long id;

    @Column(name = "CREATE_DATE", length = 15)
    private Date createDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private FormUser formUser;

    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;

    @ManyToOne(fetch = FetchType.EAGER)
    private Answer answer;

    public FormAnswerQuestion() {
        this.createDate = Calendar.getInstance().getTime();
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

    public FormUser getFormUser() {
        return formUser;
    }

    public void setFormUser(FormUser formUser) {
        this.formUser = formUser;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
