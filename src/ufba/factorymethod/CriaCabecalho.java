package ufba.factorymethod;

class CriaCabecalho extends CriadorDocumentacao{

public CriadorDocumentacao CriaCabecalho(TipoDocumento TipoDocumento){

    if (tipoDocumento == TipoDocumento.HTML) {
        cabecalho = new CabecalhoHTML();
    } else {
        cabecalho = new CabecalhoMarkdown();
    }
    return cabecalho.getOutput() ;
}