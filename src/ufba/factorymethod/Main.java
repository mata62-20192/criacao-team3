package ufba.factorymethod;

import java.util.Date;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public class Main {
    public Main() {
    }

    public static void main(String[] Args) {

        criadorDocumentacaoMarkdown criadorMarkdown = new criadorDocumentacaoMarkdown();

        Cabecalho cabecalho = criadorMarkdown.geraCabecalho();
        Corpo corpo = criadorMarkdown.geraCorpo();
        Rodape rodape = criadorMarkdown.geraRodape();

        cabecalho.setTitulo("Padroes de projeto");
        cabecalho.setEmpresa("Universidade Federal da Bahia");
        corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
        rodape.setData(new Date());

        // ----------------------------------------------------------------------------------
        criadorDocumentacao criador = new criadorDocumentacaoHTML();

        Cabecalho cabecalho = criador.geraCabecalho();
        Corpo corpo = criador.geraCorpo();
        Rodape rodape = criador.geraRodape();

        cabecalho.setTitulo("Padroes de projeto");
        cabecalho.setEmpresa("Universidade Federal da Bahia");
        corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
        rodape.setData(new Date());
        System.out.println(cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput());
    }
}