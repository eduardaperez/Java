public class Calculadora {

    public int Adicao(int valor, int valor2) {
        if (valor >= 0 && valor <= 50) {
            return valor + valor2;
        } else {
            return -1;
        }
    }

    public int Subtracao(int valor, int valor2) {
        if (valor >= 0 && valor <= 50) {
            return valor - valor2;
        } else {
            return -1;
        }
    }

    public int Multiplicacao(int valor, int valor2) {
        if (valor >= 0 && valor <= 50) {
            return valor * valor2;
        } else {
            return -1;
        }
    }

    public int Divisao(int valor, int valor2) {
        if (valor > 0 && valor <= 50) {
            return valor / valor2;
        } else {
            return -1;
        }
    }

    public int Potenciacao(int valor, int valor2) {
        int guarda = valor;
        if (valor >= 0 && valor <= 50) {
            for (int i = 0; i < valor2; i++)
                valor *= guarda;
            return valor;
        } else {
            return -1;
        }
    }

    public int Fatoracao(int valor) {
        if (valor >= 0 && valor <= 50) {
            int resultado = valor;
            for (valor = valor - 1; valor > 1; valor--)
                resultado *= valor;
            return resultado;
        } else {
            return -1;
        }
    }
}
