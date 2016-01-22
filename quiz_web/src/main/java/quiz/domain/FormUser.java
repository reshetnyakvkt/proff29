package quiz.domain;

import javax.persistence.*;
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

    public FormUser() {
    }
}
