package bean;

/**
 * Используется для хранения данных
 */
public class Calculator {
    /** Операция в калькуляторе */
    String operation;
    /** Первое число, введенное с клавиатры */
    double firstVariable;
    /** Второе число, введенное с клавиатры */
    double secondVariable;
    /** Полученный результат */
    double result;
    /** Конструктор по умолчанию */
    public Calculator() {
    }
    /** Конструктор с параметрами */
    public Calculator(String operation, double firstVariable, double secondVariable, double result) {
        this.operation = operation;
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.result = result;
    }
    /** Метод get для операции */
    public String getOperation() {
        return operation;
    }
    /** Метод set для операции */
    public void setOperation(String operation) {
        this.operation = operation;
    }
    /** Метод get для первого числа */
    public double getFirstVariable() {
        return firstVariable;
    }
    /** Метод set для первого числа */
    public void setFirstVariable(double firstVariable) {
        this.firstVariable = firstVariable;
    }
    /** Метод get для второго числа */
    public double getSecondVariable() {
        return secondVariable;
    }
    /** Метод set для второго числа */
    public void setSecondVariable(double secondVariable) {
        this.secondVariable = secondVariable;
    }
    /** Метод get для полученного результата */
    public double getResult() {
        return result;
    }
    /** Метод s для полученного результата */
    public void setResult(double result) {
        this.result = result;
    }
}
