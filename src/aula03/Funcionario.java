
package aula03;

public class Funcionario{
@Deprecated
    private int id;
    private String nome;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private Double salario; 
    
    public int getId(){
    return id;
      
            }
    public void setId(int id){
    this.id = id;
            }
  
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}




