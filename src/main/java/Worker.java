import bean.Calculator;
import converter.Converter;
import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Operation;
import operations.Subtraction;
import reader.ConsoleReader;
import reader.Reader;
import writer.ConsoleWriter;
import writer.Writer;

/**
 * Используется для вычисления операций
 */
public class Worker {

    Calculator calculator = new Calculator();
    Writer writer = new ConsoleWriter();
    Reader reader = new ConsoleReader();
    Operation operation = null;

    /**
     * Метод вычисления операций
     */
    public void run() {
        setVariables();
        calculate();
        showResult();
    }

    /**
     * Метод ввода требуемых значений
     */
    void setVariables() {
       do{
          writer.showSentencesSelectOperation();
            String selectedOperationInConsole = reader.readString();
            calculator.setOperation(selectedOperationInConsole);
            setOperation();
            if(operation == null){
                System.out.println("Operation is not correct.");
            }
        } while (operation == null);

       try {
           writer.showSentencesInputFirstVariable();
           String selectedFirstVariableInConsoleString = reader.readString();
           double selectedFirstVariableInConsoleDouble = Converter.convertStringToDouble(selectedFirstVariableInConsoleString);
           calculator.setFirstVariable(selectedFirstVariableInConsoleDouble);
       }
       catch(java.lang.NumberFormatException e){
           System.out.println("Not valid the first typed value. It will be convert to 0.");
       }

        try {
        writer.showSentencesInputSecondVariable();
        String selectedSecondVariableInConsoleString = reader.readString();
        double selectedSecondVariableInConsoleDouble = Converter.convertStringToDouble(selectedSecondVariableInConsoleString);
        calculator.setSecondVariable(selectedSecondVariableInConsoleDouble);
        }
        catch(java.lang.NumberFormatException e){
            System.out.println("Not valid the second typed value. It will be convert to 0");
        }

    }

    /**
     * Метод выбора операции
     */
    void setOperation() {
        switch (calculator.getOperation()) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
            default:
                operation = null;
                break;
        }
    }

    /**
     * Метод подсчета результата
     */
    void calculate() {
        double result = operation.calculate(calculator.getFirstVariable(), calculator.getSecondVariable());
        calculator.setResult(result);
    }

    /**
     * Метод вывода результата в консоль
     */
    void showResult() {
        writer.showResult(Converter.convertDoubleToString(calculator.getResult()));
    }
    }
