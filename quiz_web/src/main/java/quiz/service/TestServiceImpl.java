package quiz.service;

import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import quiz.dao.*;
import quiz.domain.*;
import quiz.exception.AuthenticationException;

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

    private List<User> userList;
    private List<Form> formList;
    private List<FormAccess> formAccessList;
    private List<Question> questionList;
    private List<Answer> answerList;


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
            questionDao.create(question = new Question(form));
            questionList.add(question);
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
        for (Question question : questionList) {
            answerDao.create(answer = new Answer(question));
            answerList.add(answer);
        }
    }
}
