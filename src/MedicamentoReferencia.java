public class MedicamentoReferencia extends Medicamento{
    
    private String statusPatente;
    
    public MedicamentoReferencia(int codigo, String nomeMed, String princAtiv, String composicao, double preco, String info, String validade, String indicacoes, String contraIndicacoes, String precaucoes, String interacoes, String reacoesAdversas, String posologia, String superdosagem, String infoadd, String statusPatente) {
        super(codigo, nomeMed, princAtiv, composicao, preco, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd);
        this.statusPatente = statusPatente;
    }

    public String getStatusPatente() {
        return statusPatente;
    }

    public void setStatusPatente(String statusPatente) {
        this.statusPatente = statusPatente;
    }
    
    public String toString() {
        return "\n\n\tMedicamento Referência\nStatus da Patente: " + statusPatente +"\n\nCódigo: " + super.getCodigo() + "\nNome do Medicamento: " + super.getNomeMed()+ "\nPrincípio Ativo: " + super.getPrincAtiv() + "\nPreço: " + super.getPreco() + "\nComposição - Ingredientes: " + super.getInfo() + "\nValidade: " + super.getValidade() + "\nIndicações: " + super.getIndicacoes() + "\nContraindicações: " + super.getContraIndicacoes() + "\nPrecauções: " + super.getPrecaucoes() + "\nInterações: " + super.getInteracoes() + "\nReações Adversas: " + super.getReacoesAdversas() + "\nPosologia - Informações sobre a dosagem: " + super.getPosologia() + "\nSuperdosagem: " + super.getSuperdosagem() + "\nInformações Adicionais: " + super.getInfoadd() +"\n______________________________________________________";
    }
}