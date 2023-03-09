import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Instanciando data hora local


        //Data do momento
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        //Data e hora do momento
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);

        //Data e hora do momento com o fuso horario do GMT
        Instant date3 = Instant.now();
        System.out.println(date3);

        //Indicando o formato que deve ser interpretado de data especifico
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date4 = LocalDate.parse("06/05/2001", fmt1);
        System.out.println(date4);
        System.out.println(fmt1.format(date1));

        //COM FUSO HORARIO
      //  DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault()) ;
        //Tranformar data para strintg


    }
}