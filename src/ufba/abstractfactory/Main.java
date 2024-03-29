package ufba.abstractfactory;

import java.util.Date;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public class Main {
    public Main() {
    }

    public static void main(String[] Args) {
        fabricaDocumentacao fabrica = new fabricaDocumentacaoHTML();
        criadorDocumentacao criador = new criadorDocumentacao(fabrica);
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
