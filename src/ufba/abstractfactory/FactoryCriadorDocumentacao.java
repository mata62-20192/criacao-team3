package ufba.abstractfactory;


class criarModelo{

    public CriadorDocumentacao getCriadorDocumentacao(Cabecalho cabecalho, Rodape rodape) {
        if (sexo.equals(“M”))
            return new Homem(nome);
        if (sexo.equals(“F”))
            return new Mulher(nome);
    }

}

}