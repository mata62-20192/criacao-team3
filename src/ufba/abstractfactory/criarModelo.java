package ufba.abstractfactory;


class criarModelo{

    public CriadorDocumentacao getCriadorDocumentacao(Cabecalho cabecalho,Corpo corpo,Rodape rodape) {
        if (this.cabecalho =  cabecalho)
            return cabecalho;

        if (this.corpo =  corpo)
            return corpo;

        if (this.Rodape =  Rodape)
            return Rodape;
    }

}