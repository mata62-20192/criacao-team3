package ufba.abstractfactory;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;

public class fabricaDocumentacaoHTML extends fabricaDocumentacao {
    public fabricaDocumentacaoHTML() {
    }

    public Cabecalho criaCabecalho() {
        return new CabecalhoHTML();
    }

    public Corpo criaCorpo() {
        return new CorpoHTML();
    }

    public Rodape criaRodape() {
        return new RodapeHTML();
    }
}
