package ufba.abstractfactory;

import java.util.Date;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public class criadorDocumentacao {
    private fabricaDocumentacao fabrica;

    public criadorDocumentacao(fabricaDocumentacao fabrica) {
        this.fabrica = fabrica;
    }

    public fabricaDocumentacao getFabrica() {
        return this.fabrica;
    }

    public void setFabrica(fabricaDocumentacao fabrica) {
        this.fabrica = fabrica;
    }

    public Cabecalho geraCabecalho() {
        Cabecalho cabecalho = this.fabrica.criaCabecalho();
        cabecalho.setTitulo("Padroes de projeto");
        cabecalho.setEmpresa("Universidade Federal da Bahia");
        return cabecalho;
    }

    public Corpo geraCorpo() {
        Corpo corpo = this.fabrica.criaCorpo();
        corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
        return corpo;
    }

    public Rodape geraRodape() {
        Rodape rodape = this.fabrica.criaRodape();
        rodape.setData(new Date());
        return rodape;
    }
}
