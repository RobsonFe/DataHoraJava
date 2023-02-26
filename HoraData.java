import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoraData {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		// Data e Hora local.
		LocalDateTime d02 = LocalDateTime.now();
		// Data e hora local com segundos.
		Instant d03 = Instant.now();
		// Data com instanciação.
		
		LocalDate d04 = LocalDate.parse("2023-02-26");
		//Data no formato objeto. 
		LocalDateTime d05 = LocalDateTime.parse("2023-02-26T01:30:26");
		// Data e hora no formato objeto
		Instant d06 = Instant.parse("2023-02-26T01:30:26Z");
		Instant d07 = Instant.parse("2023-02-26T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("26/02/2023", fmt1);
		// Data formatada no formato que usamos no Brasil.
		LocalDateTime d09 = LocalDateTime.parse("26/02/2023 01:30" , fmt2);
		
	
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
	
		
		//Em algumas ocasiões, não precisa colocar na hora de imprimir na tela o "ToString" porque o Java já identifica.
		

	}

}
