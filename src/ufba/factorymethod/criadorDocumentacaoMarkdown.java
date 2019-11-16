package ufba.factorymethod;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;

public class criadorDocumentacaoMarkdown extends criadorDocumentacao {
    public criadorDocumentacaoMarkdown() {
    }

    public Cabecalho geraCabecalho() {
        return new CabecalhoMarkdown();
    }

    public Corpo geraCorpo() {
        return new CorpoMarkdown();
    }

    public Rodape geraRodape() {
        return new RodapeMarkdown();
    }
}