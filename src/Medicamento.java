/**
 *
 * @author Junior
 */
public class Medicamento {
    
    private int codigo;
    private String nomeMed;
    private String princAtiv;
    private String composicao;
    private double preco;
    private String info;
    private String validade;
    private String indicacoes;
    private String contraIndicacoes;
    private String precaucoes;
    private String interacoes;
    private String reacoesAdversas;
    private String posologia;
    private String superdosagem;
    private String infoadd;

    public Medicamento(int codigo,String nomeMed, String princAtiv, String composicao, double preco, String info, String validade, String indicacoes, String contraIndicacoes, String precaucoes, String interacoes, String reacoesAdversas, String posologia, String superdosagem, String infoadd) {
        this.codigo = codigo;
        this.nomeMed = nomeMed;
        this.princAtiv = princAtiv;
        this.composicao = composicao;
        this.preco = preco;
        this.info = info;
        this.validade = validade;
        this.indicacoes = indicacoes;
        this.contraIndicacoes = contraIndicacoes;
        this.precaucoes = precaucoes;
        this.interacoes = interacoes;
        this.reacoesAdversas = reacoesAdversas;
        this.posologia = posologia;
        this.superdosagem = superdosagem;
        this.infoadd = infoadd;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public String getPrincAtiv() {
        return princAtiv;
    }

    public void setPrincAtiv(String princAtiv) {
        this.princAtiv = princAtiv;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getIndicacoes() {
        return indicacoes;
    }

    public void setIndicacoes(String indicacoes) {
        this.indicacoes = indicacoes;
    }

    public String getContraIndicacoes() {
        return contraIndicacoes;
    }

    public void setContraIndicacoes(String contraIndicacoes) {
        this.contraIndicacoes = contraIndicacoes;
    }

    public String getPrecaucoes() {
        return precaucoes;
    }

    public void setPrecaucoes(String precaucoes) {
        this.precaucoes = precaucoes;
    }

    public String getInteracoes() {
        return interacoes;
    }

    public void setInteracoes(String interacoes) {
        this.interacoes = interacoes;
    }

    public String getReacoesAdversas() {
        return reacoesAdversas;
    }

    public void setReacoesAdversas(String reacoesAdversas) {
        this.reacoesAdversas = reacoesAdversas;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getSuperdosagem() {
        return superdosagem;
    }

    public void setSuperdosagem(String superdosagem) {
        this.superdosagem = superdosagem;
    }

    public String getInfoadd() {
        return infoadd;
    }

    public void setInfoadd(String infoadd) {
        this.infoadd = infoadd;
    }
    
    

    public String toString() {
        return "\n\n\tMedicamento de Codigo: " + codigo + "\n\nNome do Medicamento: " + nomeMed + "\nPrincípio Ativo: " + princAtiv + "\nPreço: " + preco + "\nComposição - Ingredientes: " + info + "\nValidade: " + validade + "\nIndicações: " + indicacoes + "\nContra Indicações: " + contraIndicacoes + "\nPrecauções: " + precaucoes + "\nInterações: " + interacoes + "\nReações Adversas: " + reacoesAdversas + "\nPosologia - Informações sobre a dosagem: " + posologia + "\nSuper Dosagem: " + superdosagem + "\nInformações Adicionais: " + infoadd+ "\n____________________________________________________________";
    }

}