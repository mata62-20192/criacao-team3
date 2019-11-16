package ufba.factorymethod;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public abstract class criadorDocumentacao {
    public criadorDocumentacao() {
    }

    public abstract Cabecalho geraCabecalho();

    public abstract Corpo geraCorpo();

    public abstract Rodape geraRodape();
}