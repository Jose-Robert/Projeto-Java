public class MedicamentoGenerico extends Medicamento{
    
    private String referencia;
    
    public MedicamentoGenerico(int codigo, String nomeMed, String princAtiv, String composicao, double preco, String info, String validade, String indicacoes, String contraIndicacoes, String precaucoes, String interacoes, String reacoesAdversas, String posologia, String superdosagem, String infoadd, String referencia) {
        super(codigo, nomeMed, princAtiv, composicao, preco, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd);
        this.referencia = referencia;
        super.setNomeMed(super.getPrincAtiv());
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
     public String toString() {
        return "\n\n\tMedicamento Genérico\n\nCódigo: " + super.getCodigo() + "\nNome do Medicamento: " + super.getPrincAtiv() + "\nPrincípio Ativo: " + super.getPrincAtiv() + "\nPreço: " + super.getPreco() + "\nComposição - Ingredientes: " + super.getInfo() + "\nValidade: " + super.getValidade() + "\nIndicações: " + super.getIndicacoes() + "\nContraindicações: " + super.getContraIndicacoes() + "\nPrecauções: " + super.getPrecaucoes() + "\nInterações: " + super.getInteracoes() + "\nReações Adversas: " + super.getReacoesAdversas() + "\nPosologia - Informações sobre a dosagem: " + super.getPosologia() + "\nSuperdosagem: " + super.getSuperdosagem() + "\nInformações Adicionais: " + super.getInfoadd() + "\nReferência: " + referencia + "\n______________________________________________________";
    }
}