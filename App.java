package ibu.edu.homework1;
import java.util.Scanner;
public class App{

	public static void main(String[] args) {
	
		Stack<String> operators = new Stack<String>();
		Stack<Double> values = new Stack<Double>();
		Scanner reader = new Scanner(System.in);
		String exp = reader.nextLine();
		String[] expression = exp.split("\\s+");
		
		for (int i=0; i<expression.length; i++) {

			switch( expression[i]) {
			case ("("):
				break;
			case "+":
				operators.push(expression[i]);
				break;
			case "-":
				operators.push(expression[i]);
				break;
			case "*":
				operators.push(expression[i]);
				break;
			case "/":
				operators.push(expression[i]);
				break;
			case "%":
				operators.push(expression[i]);
				break;
			case ")":
				String op = operators.pop();
				Double value = values.pop();
				if (op.equals("+"))
					value = values.pop() + value;
				else if(op.equals("-"))
					value = values.pop() - value;
				else if(op.equals("*"))
					value = values.pop() * value;
				else if(op.equals("/"))
					value = values.pop() / value;
				else if(op.equals("%"))
					value = values.pop() % value;
				values.push(value);
				break; 
			default:
				values.push(Double.parseDouble(expression[i]));
				break;
		}
	}
		System.out.println(values.pop());
	}

}
