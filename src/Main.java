import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso IDE's para Java");
        curso1.setDescricao("Aprenda sobre Eclipse e IntelliJ.");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Security");
        curso2.setDescricao("Aprenda como implementar segurança em uma aplicação através do Spring Security.");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria IDE's Java");
        mentoria.setDescricao("Dicas sobre as IDE's Eclipse e IntelliJ.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Torne-se um desenvolvedor Java!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Aline");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aline:" + dev.getConteudosInscritos());
        System.out.println("Após horas de estudos...");
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos Inscritos Aline:" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Aline:" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

    }
}
