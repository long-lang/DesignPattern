package behavioralPattern.interpreter;

public class ClientClass {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isWomanMarried = getWomanMarriedExpression();
        System.out.println("John is male?  "+ isMale.interpret("John"));
        System.out.println("Julie is a married woman  "+isWomanMarried.interpret("Julie Married"));
    }

    public static Expression getMaleExpression(){
        Expression john = new TerminalExpression("John");
        Expression mike = new TerminalExpression("Mike");
        return new OrExpression(john,mike);
    }

    public static Expression getWomanMarriedExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }
}
