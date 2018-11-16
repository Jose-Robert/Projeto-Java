public class MedicamentoHomeopatico extends Medicamento implements MedicamentoDinamizado {
    
    private String infoPaciente;
    private String composicaonova = "Medicamento preparados a partir de substâncias extraídas da natureza, provenientes dos reinos mineral, vegetal ou animal.";
    
    public MedicamentoHomeopatico(int codigo, String nomeMed, String princAtiv, String composicao, double preco, String info, String validade, String indicacoes, String contraIndicacoes, String precaucoes, String interacoes, String reacoesAdversas, String posologia, String superdosagem, String infoadd, String infoPaciente) {
        super(codigo, nomeMed, princAtiv, composicao, preco, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd);
        super.setComposicao(composicaonova);
        this.infoPaciente = infoPaciente;
    }
    
    public String getInfoPaciente() {
        return infoPaciente;
    }

    public void setInfoPaciente(String infoPaciente) {
        this.infoPaciente = infoPaciente;
    }
    
    public String toString() {
        return "\n\n\tMedicamento Homeopático\n\nCódigo: " + super.getCodigo() + "\nNome do Medicamento: " + super.getNomeMed() + "\nPrincípio Ativo: " + super.getPrincAtiv() + "\nPreço: " + super.getPreco() + "\nComposição - Ingredientes: " + composicaonova + "\nValidade: " + super.getValidade() + "\nIndicações: " + super.getIndicacoes() + "\nContraindicações: " + super.getContraIndicacoes() + "\nPrecauções: " + super.getPrecaucoes() + "\nInterações: " + super.getInteracoes() + "\nReações Adversas: " + super.getReacoesAdversas() + "\nPosologia - Informações sobre a dosagem: " + super.getPosologia() + "\nSuperdosagem: " + super.getSuperdosagem() + "\nInformações Adicionais: " + super.getInfoadd()+ "\nInformações do Paciente: " + infoPaciente  + "\nMedicamento Dinamizado" +"\n______________________________________________________";
    }
}