package quiz.service;

import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import quiz.dao.*;
import quiz.domain.*;

import java.util.List;
import java.util.Locale;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Package quiz.service
 */
@Service("testService")
@Transactional
public class TestServiceImpl implements TestService {
    public static final Logger log = Logger.getLogger(TestServiceImpl.class);

    @Autowired(required = true)
    private FormDao formDao;

    @Autowired(required = true)
    private FormAccessDao formAccessDao;

    @Autowired(required = true)
    private UserDao userDao;

    @Autowired(required = true)
    private QuestionDao questionDao;

    @Autowired(required = true)
    private AnswerDao answerDao;

    @Autowired(required = true)
    private FormUserDao formUserDao;

    @Autowired(required = true)
    private FormAnswerQuestionDao formAnswerQuestionDao;

    private List<User> userList;
    private List<Form> formList;
    private List<FormAccess> formAccessList;
    private List<Question> questionList;
    private List<Answer> answerList;
    private List<FormUser> formUserList;
    private List<FormAnswerQuestion> formAnswerQuestionList;


    public TestServiceImpl() {
        Locale.setDefault(Locale.ENGLISH);
    }

    @Override
    public void fill(){
        log.info("Start fill()-->");
        if (userDao != null) {
            userList = userDao.findAll();
        } else {
            log.info("fill()/ userDao is null");
        }
        if (formDao != null) {
            formList = formDao.findAll();
        } else {
            log.info("fill()/ formDao is null");
        }
        if (formAccessDao != null) {
            formAccessList = formAccessDao.findAll();
        } else {
            log.info("fill()/ formAccessDao is null");
        }

        if (questionDao != null) {
            questionList = questionDao.findAll();
        } else {
            log.info("fill()/ questionDao is null");
        }

        if (answerDao != null) {
            answerList = answerDao.findAll();
        } else {
            log.info("fill()/ answerDao is null");
        }

        fillFormAccess();

        fillAnswer();

        log.info("<--Finish fill()");
    }

    private void fillUser(){
        if (userList != null){
            for (int i = 0; i < userList.size();  i++){
                userDao.delete(userList.get(i));
            }
            userList.clear();
        }
        User user = new User("Admin", 1);
        userDao.create(user);
        userList.add(user);
        for (int i = 1; i < 10; i++){
            userDao.create(user = new User("User-" + i, 0));
            userList.add(user);
        }

    }

    private void fillForm() {
        if (formList != null){
            for (int i = 0; i < formList.size();  i++){
                formDao.delete(formList.get(i));
            }
            formList.clear();
        }
        Form form;
        for (int i = 1; i < 10 ; i++){
            formDao.create(form = new Form("Тест " + i));
            formList.add(form);
        }
    }

    private void fillFormAccess(){
        if (formAccessList != null){
            for (int i = 0; i < formAccessList.size();  i++){
                formAccessDao.delete(formAccessList.get(i));
            }
            formAccessList.clear();
        }

        fillForm();

        fillUser();

        FormAccess formAccess;
        for (User user : userList) {
            for (Form form : formList) {
                formAccessDao.create(formAccess = new FormAccess(user, form));
                formAccessList.add(formAccess);
            }
        }
    }

    private void fillQuestion() {
        if (questionList != null){
            for (int i = 0; i < questionList.size();  i++){
                questionDao.delete(questionList.get(i));
            }
            questionList.clear();
        }

        Question question;

        for (Form form : formList) {
            int countQuestion = 5 + (int) (Math.round(Math.random() + 1F) * 5);
            for (int i = 1; i <= countQuestion; i++) {
                if (Math.random() > 0.5) {
                    questionDao.create(question = new Question(form, EQuiestionType.MultiAnswer, "Question" + i));
                } else {
                    questionDao.create(question = new Question(form, EQuiestionType.SingleAnswer, "Question" + i));
                }
                questionList.add(question);
            }
        }
    }

    private void fillAnswer() {
        if (answerList != null){
            for (int i = 0; i < answerList.size();  i++){
                answerDao.delete(answerList.get(i));
            }
            answerList.clear();
        }

        fillQuestion();

        Answer answer;
        int countAnswer = 4;
        for (Question question : questionList) {
            for (int i = 1; i <= countAnswer; i++){
                answerDao.create(answer = new Answer(question, "Answer " + i,
                        question.getQuiestionType() == EQuiestionType.SingleAnswer ?
                                (i == 1 ? true : false) :
                                i == 1 ? true : Math.random() > 0.7));
                answerList.add(answer);
            }
        }
    }

    private void fillFormUserList() {
        if (formUserList != null){
            for (int i = 0; i < formUserList.size();  i++){
                formUserDao.delete(formUserList.get(i));
            }
            formUserList.clear();
        }

        FormUser formUser;

        for (User user : userList) {
            for (Form form : formList) {
                formUserDao.create(formUser = new FormUser(user, form));
                formUserList.add(formUser);
            }
        }
    }

    private void fillFormAnswerQuestion() {
        if (formAnswerQuestionList != null){
            for (int i = 0; i < formAnswerQuestionList.size();  i++){
                formAnswerQuestionDao.delete(formAnswerQuestionList.get(i));
            }
            formAnswerQuestionList.clear();
        }
        FormAnswerQuestion formAnswerQuestion;

        for (FormUser formUser : formUserList) {
            for (Question question : questionList) {
                for (Answer answer : answerList) {
                    formAnswerQuestionDao.create(formAnswerQuestion = new FormAnswerQuestion());
                    formAnswerQuestionList.add(formAnswerQuestion);
                }
            }
        }
    }
}
