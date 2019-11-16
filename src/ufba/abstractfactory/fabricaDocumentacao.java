package ufba.abstractfactory;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public abstract class fabricaDocumentacao {
    public fabricaDocumentacao() {
    }

    public abstract Cabecalho criaCabecalho();

    public abstract Corpo criaCorpo();

    public abstract Rodape criaRodape();
}