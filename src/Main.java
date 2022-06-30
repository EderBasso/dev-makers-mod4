import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Contato> agendaGenerics = new ArrayList<>();
        agendaGenerics.add(new Contato("Marcia", "12312412", true));
        agendaGenerics.add(new Contato("Nicole", "4483392", true));
        agendaGenerics.add(new Contato("Odete", "8234723847", false));

        Character letra = 'n';
        //filtrarAgendaGenerics(agendaGenerics, t -> t.getNome().toLowerCase().charAt(0) == letra);

        agendaGenerics.stream()
                .filter(e -> e.isAtivo())
                .forEach(e -> System.out.println(e));

        var fileReader = new FileReader( "relianceTrendsFashion.csv", StandardCharsets.UTF_8);
        try(BufferedReader reader = new BufferedReader(fileReader)){
            reader.lines()
                    .filter(t -> t.contains("Women"))
                    .filter(t-> t.contains("Fusionwear"))
                    .forEach(l -> {
                        System.out.println("---");
                        Arrays.stream(l.split(","))
                                .forEach(t -> {
                                    System.out.print(t);
                                    System.out.print(" - ");
                                });
                        System.out.println();
                    });
        }
    }

    public static <T> void filtrarAgendaGenerics (ArrayList<T> agenda, Predicate<T> tester){
        for (T pessoa : agenda){
            if (tester.test(pessoa)){
                System.out.println(pessoa);
            }
        }
    }
}
