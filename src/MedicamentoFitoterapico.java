public class MedicamentoFitoterapico extends Medicamento implements MedicamentoDinamizado{
    
    private String composicaonova = "Medicamento Composto a Base de Plantas.";

    public MedicamentoFitoterapico(int codigo, String nomeMed, String princAtiv, String composicao, double preco, String info, String validade, String indicacoes, String contraIndicacoes, String precaucoes, String interacoes, String reacoesAdversas, String posologia, String superdosagem, String infoadd) {
        super(codigo, nomeMed, princAtiv, composicao, preco, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd);
        super.setComposicao(composicaonova);
    }
    
    public String toString() {
        return "\n\n\tMedicamento Fitoterápico\n\nCódigo: " + super.getCodigo() + "\nNome do Medicamento: " + super.getNomeMed() + "\nPrincípio Ativo: " + super.getPrincAtiv() + "\nPreço: " + super.getPreco() + "\nComposição - Ingredientes: " + composicaonova + "\nValidade: " + super.getValidade() + "\nIndicações: " + super.getIndicacoes() + "\nContraindicações: " + super.getContraIndicacoes() + "\nPrecauções: " + super.getPrecaucoes() + "\nInterações: " + super.getInteracoes() + "\nReações Adversas: " + super.getReacoesAdversas() + "\nPosologia - Informações sobre a dosagem: " + super.getPosologia() + "\nSuperdosagem: " + super.getSuperdosagem() + "\nInformações Adicionais: " + super.getInfoadd()+ "\nMedicamento Dinamizado" +"\n______________________________________________________";
    }
}

