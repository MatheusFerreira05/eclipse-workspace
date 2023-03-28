
public class nota {

	public static void main(String[] args) {
		int nota = 90;
		
		if(nota<60) {
			System.out.println("Infelizmente sua nota foi " + nota + " , e é insuficiente");
		}else if(nota<=80){
			System.out.println("Sua nota foi " + nota + " está bom, mas dá para melhorar!");
		}else {
			System.out.println("Parabéns sua nota foi excelente!");
		}

	}

}
