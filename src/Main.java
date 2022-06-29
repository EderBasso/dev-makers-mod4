import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> agendaGenerics = new ArrayList<>();
        agendaGenerics.add(new Contato("Marcia", "12312412"));
        agendaGenerics.add(new Contato("Nicole", "4483392"));
        agendaGenerics.add(new Contato("Odete", "8234723847"));

        Character letra = 'n';
        filtrarAgendaGenerics(agendaGenerics, t -> t.getNome().toLowerCase().charAt(0) == letra);
    }

    public static <T> void filtrarAgendaGenerics (ArrayList<T> agenda, Predicate<T> tester){
        for (T pessoa : agenda){
            if (tester.test(pessoa)){
                System.out.println(pessoa);
            }
        }
    }
}
