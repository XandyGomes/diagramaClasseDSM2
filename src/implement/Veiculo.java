package implement;

public abstract class Veiculo implements IVeiculo{
  private Integer velocidade;
  private String placa;
  private String chassi; 
  private Integer ano;

  public static Double calcularValorVenda(Veiculo valor) {
    return null;
  }

  public void ligar(){

  }

  public void desligar(){

  }

  public String getPlaca(){
    return placa;
  }

  public void setPlaca(String placa){
    this.placa = placa;
  }

  public String getChassi(){
    return chassi;
  }

  public void setChassi(String chassi){
    this.chassi = chassi;
  }

  public Integer getAno(){
    return ano;
  }

  public void setAno(Integer ano){
    this.ano = ano;
  }

  public Integer getVelocidade(){
    return velocidade;
  }
  
}
