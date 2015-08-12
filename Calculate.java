import java.lang.Math.*;
/**
	Підключення класу необхідно за необхідності виконання операцій піднесення до ступеня, обчислення кореня і т.ін.
*/
public class Calculate{
	public static void	main(String[] arg){
	int par1;
	int suma, minuss, dobutok, opink, opdekr;
	double stupen;
	String namedilen = "Dilennaj";
	char oneletterA ='1';
	float dilen;
//	double dilen;
	System.out.println("Calculate");
	par1 = Integer.valueOf(arg[0]);
//	par2 = Integer.valueOf(arg[1]);
	Integer par2 = new Integer(arg[1]);
	System.out.println("par1= "+par1);
	System.out.println("par2= "+par2);
	suma = par1 + par2;
	System.out.println("suma= "+suma);
	minuss = par1 - par2;
	System.out.println("minuss= "+minuss);
	dobutok = par1 * par2;
	System.out.println("dobutok= "+dobutok);
/**
	Ділення через створення обєктів 
*/
	Float par21 = new Float(arg[0]);
	Float par22 = new Float(arg[1]);
//	Double par21 = new Double(arg[0]);
//	Double par22 = new Double(arg[1]);
//	double dilen = par21 / par22;
	dilen = par21 / par22;
/**
	Операції піднесення до ступеня, обчислення кореня вимагає імпорту класу java.lang.Math.*;
*/
	System.out.println("abs= "+Math.abs(-2.33));
	System.out.println("stupen= "+Math.pow(par1,par2));		// par1 -число, par2 - ступень
	System.out.println("sqrt= "+Math.sqrt(par2));
/**
	Дія піднесення до ступеня вимагає для результату типу даних double
*/
	stupen = Math.pow(par21,par22);
	System.out.printf("%s %.4f \n", namedilen, dilen);
	par1++;
	System.out.println("inkr= "+par1);
	par2 --;
	System.out.println("dekr= "+par2);
	}
}