
public class temperatura {

	public static void main(String[] args) {
		double graus = 15;
		
		if(graus<15) {
			System.out.println("Hoje está " + graus + "°C, coloque uma blusa");
		}else if(graus<=25) {
			System.out.println("Hoje está com o clima agradável com " + graus + "°C");
		}else {
			System.out.println("Hoje está " + graus + "°C prepare-se para comprar um sorvete!");
		}

	}

}
