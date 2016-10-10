package championship;

public interface Evaluable<T> {

    Participant evaluate(T firstValue, T secondValue);

}
