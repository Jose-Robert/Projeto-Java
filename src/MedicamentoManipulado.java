public class MedicamentoManipulado extends Medicamento{
    
    private String farmManip;
    private String infoPaciente;
    
    public MedicamentoManipulado(int codigo, String nomeMed, String princAtiv, String composicao, double preco, String info, String validade, String indicacoes, String contraIndicacoes, String precaucoes, String interacoes, String reacoesAdversas, String posologia, String superdosagem, String infoadd, String farmManip, String infoPaciente) {
        super(codigo, nomeMed, princAtiv, composicao, preco, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd);
        this.farmManip = farmManip;
        this.infoPaciente = infoPaciente;
    }

    public String getFarmManip() {
        return farmManip;
    }

    public void setFarmManip(String farmManip) {
        this.farmManip = farmManip;
    }

    public String getInfoPaciente() {
        return infoPaciente;
    }

    public void setInfoPaciente(String infoPaciente) {
        this.infoPaciente = infoPaciente;
    }
    
    public String toString() {
        return "\n\n\tMedicamento Manipulado\n\nCódigo: " + super.getCodigo() + "\nNome do Medicamento: " + super.getPrincAtiv() + "\nPrincípio Ativo: " + super.getPrincAtiv() + "\nPreço: " + super.getPreco() + "\nComposição - Ingredientes: " + super.getInfo() + "\nValidade: " + super.getValidade() + "\nIndicações: " + super.getIndicacoes() + "\nContraindicações: " + super.getContraIndicacoes() + "\nPrecauções: " + super.getPrecaucoes() + "\nInterações: " + super.getInteracoes() + "\nReações Adversas: " + super.getReacoesAdversas() + "\nPosologia - Informações sobre a dosagem: " + super.getPosologia() + "\nSuperdosagem: " + super.getSuperdosagem() + "\nInformações Adicionais: " + super.getInfoadd() + "\nFarmacia de Manipulação: " + farmManip + "\nInformações do Paciente: " + infoPaciente +"\n______________________________________________________";
    }
}