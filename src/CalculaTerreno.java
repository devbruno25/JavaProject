/*
- Fazer um programa para ler as medidas a largura e comprimento de um terreno retangular com uma
- casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
- o programa deve mostrar o alor da área do terreno, bem como o valor do preço do terreno, ambos com
- duas casas decimais, conforme exemplo.

 -- Exemplo 1 --
 - Digite a largura do terreno: 10.0
 - Digite o comprimento do terreno: 30.0
 - Digite o valor do metro quadrado: 200.0
 - Area do terreno = 300.00
 - Preço do terreno = 60.000,00

 -- Exemplo 2 --
 - Digite a largura do terreno:12.0
 - Digite o comprimento do terreno: 20.0
 - Digite o valor do metro qudrado: 150.00
 - Area do terreno = 240.00
 - Preço do terreno = 36000.00
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalculaTerreno {
    public static void main(String[] args) {
        double largura, comprimento, valorMetroQua, areaTerreno, valorTerreno;

        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno: "));
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do Terreno: "));
        valorMetroQua = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do metro quadrado: "));

        areaTerreno = largura * comprimento;
        valorTerreno = areaTerreno * valorMetroQua;

        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        String areaFormatada = decimal.format(areaTerreno);
        String valorFormatado = decimal.format(valorTerreno);

        JOptionPane.showMessageDialog(null, "Area do terreno: " + areaFormatada + "\nValor do terreno R$ " + valorFormatado);
    }
}
