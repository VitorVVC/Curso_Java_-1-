package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		// Aula UM sobre como Insanciar uma data
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// Formatacão de datas para por exemplo dia/mes/ano para o formato padrão ( ISO
		// 8601 )
		// Converter de string pra data
		/*
		 * DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 * DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //
		 * Data AGORA ( NOW ) LocalDate d01 = LocalDate.now(); LocalDateTime d02 =
		 * LocalDateTime.now(); Instant d03 = Instant.now(); // Declarar uma hora (
		 * parse ) LocalDate d04 = LocalDate.parse("2023-10-08"); LocalDateTime d05 =
		 * LocalDateTime.parse("2023-10-08T13:57:33"); Instant d06 =
		 * Instant.parse("2023-10-08T13:57:33Z"); Instant d07 =
		 * Instant.parse("2023-10-08T13:57:33-03:00"); // Armazena o horário de londres
		 * e printa o mesmo com // 3 horas dps
		 * 
		 * //
		 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format
		 * /DateTimeFormatter.html LocalDate d08 = LocalDate.parse("23/08/2023", fmt1);
		 * LocalDateTime d09 = LocalDateTime.parse("23/08/2023 14:40", fmt2);
		 * 
		 * LocalDate d10 = LocalDate.of(2023, 8, 10); LocalDateTime d11 =
		 * LocalDateTime.of(2023, 10, 8, 14, 40);
		 * 
		 * System.out.println("d01 = " + d01); System.out.println("d02 = " + d02);
		 * System.out.println("d03 = " + d03); System.out.println("d04 = " + d04);
		 * System.out.println("d05 = " + d05); System.out.println("d06 = " + d06);
		 * System.out.println("d07 = " + d07); System.out.println("d08 = " + d08);
		 * System.out.println("d09 = " + d09); System.out.println("d10 = " + d10);
		 * System.out.println("d11 = " + d11);
		 */

		// Aula DOIS formatacao de DATAS

		/*
		 * LocalDate d04 = LocalDate.parse("2023-10-08"); LocalDateTime d05 =
		 * LocalDateTime.parse("2023-10-08T17:00:33"); Instant d06 =
		 * Instant.parse("2023-10-08T17:00:33Z");
		 * 
		 * //
		 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format
		 * /DateTimeFormatter.html DateTimeFormatter fmt1 =
		 * DateTimeFormatter.ofPattern("dd/MM/yyyy"); DateTimeFormatter fmt2 =
		 * DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); DateTimeFormatter fmt3 =
		 * DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault
		 * ()); DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		 * DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		 * 
		 * System.out.println("d04 = "+d04.format(fmt1));
		 * System.out.println("d04 = "+fmt1.format(d04));
		 * System.out.println("d04 = "+d04.format(DateTimeFormatter.ofPattern(
		 * "dd/MM/yyyy")));
		 * 
		 * 
		 * System.out.println("d05 = "+d05.format(fmt1));
		 * System.out.println("d05 = "+d05.format(fmt2));
		 * System.out.println("d05 = "+d05.format(fmt4));
		 * 
		 * System.out.println("d06 = "+fmt3.format(d06));
		 * System.out.println("d06 = "+fmt5.format(d06));
		 */

		// Aula tres

		// Conversão de data global pra local
		/*
		 * LocalDate d04 = LocalDate.parse("2023-10-08"); LocalDateTime d05 =
		 * LocalDateTime.parse("2023-10-08T17:00:33"); Instant d06 =
		 * Instant.parse("2023-10-08T17:00:33Z");
		 * 
		 * LocalDate resultado1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		 * LocalDate resultado2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		 * LocalDateTime resultado3 = LocalDateTime.ofInstant(d06,
		 * ZoneId.systemDefault()); LocalDateTime resultado4 =
		 * LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		 * 
		 * System.out.println("Resultado UM: " + resultado1);
		 * System.out.println("Resultado DOIS: "+resultado2);
		 * System.out.println("Resultado TRES: "+resultado3);
		 * System.out.println("Resultado QUATRO: "+resultado4);
		 * 
		 * // Capturando dados de uma data-hora local
		 * 
		 * System.out.println("D04 DIA: "+ d04.getDayOfMonth());
		 * System.out.println("D04 DIA: "+ d04.getMonthValue());
		 * System.out.println("D04 DIA: "+ d04.getYear());
		 * 
		 * System.out.println("D05 Hora: "+d05.getHour());
		 * System.out.println("D05 Minutos: "+d05.getMinute());
		 */

		// Calculando data-hora
		// A data-hora são imutaveis

		/*
		 * LocalDate d04 = LocalDate.parse("2023-10-08"); LocalDateTime d05 =
		 * LocalDateTime.parse("2023-10-08T17:00:33"); Instant d06 =
		 * Instant.parse("2023-10-08T17:00:33Z");
		 * 
		 * LocalDate pastWeekLocalDate = d04.minusDays(7); // Nova data na semana
		 * passada de localDate LocalDate nextWeekLocalDate = d04.plusDays(7); // Nova
		 * data na prox semana
		 * 
		 * System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		 * System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		 * 
		 * LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); LocalDateTime
		 * nextWeekLocalDateTime = d05.plusDays(7);
		 * 
		 * System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		 * System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		 * 
		 * Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); Instant
		 * nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		 * 
		 * System.out.println("pastWeekInstant: " + pastWeekInstant);
		 * System.out.println("nextWeekInstant: " + nextWeekInstant);
		 * 
		 * // Duracao // Entre LocalDate não é possivel fazer esse calculo pois eles nao
		 * tem tempo // Usamos atTime para isso ou atStartsOfTheDay Duration
		 * localDateDuration = Duration.between(pastWeekLocalDate.atStartOfDay(),
		 * d04.atStartOfDay()); Duration localDateTimeDuration =
		 * Duration.between(pastWeekLocalDateTime, d05); Duration instantDuration =
		 * Duration.between(pastWeekInstant, d06);// Duracao entre as duas datas
		 * Duration instantDuration2 = Duration.between(d06,pastWeekInstant);// Duracao
		 * entre as duas datas
		 * 
		 * System.out.println("localDateDuration days: " + localDateDuration.toDays());
		 * System.out.println("localDateTimeDuration: " +
		 * localDateTimeDuration.toDays()); System.out.println("instantDuration days : "
		 * + instantDuration.toDays()); System.out.println("instantDuration days2 : " +
		 * instantDuration2.toDays());
		 */

		// Treinando LOCAL ( Randomic exercices )

		/*
		 * LocalDateTime tempoAgora = LocalDateTime.now(); DateTimeFormatter
		 * formatandoAgora = DateTimeFormatter.ofPattern("HH:mm:ss");
		 * 
		 * System.out.println("A hora atual é: " + formatandoAgora.format(tempoAgora));
		 */

		// Interessante estrutura para um print da hora atual sem spamm
		/*
		 * DateTimeFormatter formatandoAgora = DateTimeFormatter.ofPattern("HH:mm:ss");
		 * while (true) { LocalDateTime tempoAgora = LocalDateTime.now();
		 * System.out.println("A hora atual é: " + formatandoAgora.format(tempoAgora));
		 * 
		 * try { Thread.sleep(1000); // Aguarda 1 segundo antes de obter o tempo
		 * novamente } catch (InterruptedException e) { e.printStackTrace(); } }
		 */

	}

}
