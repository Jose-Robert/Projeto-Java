public class MedicamentoAlopatico extends Medicamento{
    
    private String composicaonova = "Medicamento feito de substâncias processadas, que já passaram por um processo de extração, purificação e síntese.";

    public MedicamentoAlopatico(int codigo, String nomeMed, String princAtiv, String composicao, double preco, String info, String validade, String indicacoes, String contraIndicacoes, String precaucoes, String interacoes, String reacoesAdversas, String posologia, String superdosagem, String infoadd) {
        super(codigo, nomeMed, princAtiv, composicao, preco, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd);
        super.setComposicao(composicaonova);
    }
    
    public String toString() {
        return "\n\n\tMedicamento Alopático\n\nCódigo: " + super.getCodigo() + "\nNome do Medicamento: " + super.getNomeMed() + "\nPrincípio Ativo: " + super.getPrincAtiv() + "\nPreço: " + super.getPreco() + "\nComposição - Ingredientes: " + composicaonova + "\nValidade: " + super.getValidade() + "\nIndicações: " + super.getIndicacoes() + "\nContraindicações: " + super.getContraIndicacoes() + "\nPrecauções: " + super.getPrecaucoes() + "\nInterações: " + super.getInteracoes() + "\nReações Adversas: " + super.getReacoesAdversas() + "\nPosologia - Informações sobre a dosagem: " + super.getPosologia() + "\nSuperdosagem: " + super.getSuperdosagem() + "\nInformações Adicionais: " + super.getInfoadd()+ "\n______________________________________________________";
    }
}