package teste;

import implement.Automovel;
import implement.Motocicleta;
import implement.Veiculo;

public class Teste {
  
  public static void main(String[] args) {
    Automovel aut = new Automovel();
    Motocicleta mot = new Motocicleta();

    Veiculo.calcularValorVenda(aut);
    Veiculo.calcularValorVenda(mot);
    
  }

}
