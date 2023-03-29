
public class impostoRenda {

	public static void main(String[] args) {
		double salario = 3300;
		double ir;
		double valorImposto;
		if(salario<=2800) {
			ir = 0.075;
			valorImposto = (salario*ir);
			System.out.println("Seu salário é "+salario+" então o valor do imposto é igual a "+valorImposto);
		}else if(salario<=3751){
			ir = 0.15;
			valorImposto = salario*ir;
			System.out.println("Seu salário é "+salario+" então o valor do imposto é igual a "+valorImposto);
		}else {
			ir = 0.225;
			valorImposto = salario*ir;
			System.out.println("Seu salário é "+salario+" então o valor do imposto é igual a "+valorImposto);
		}

	}

}
