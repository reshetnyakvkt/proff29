package quizful.generics.cloneables;

/**
 * Created by Reshetnyak Viktor on 10.01.2016.
 * Project proff29
 * Package quizful.generics.cloneables
 */
class Copier<T extends Cloneable> {
    public T copy(T param) throws CloneNotSupportedException {
//        return  (T) param.clone();                            //1
        return null;
    }
}