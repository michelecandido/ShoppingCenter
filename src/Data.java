public class Data {
    private int dia, mes, ano;

    public Data (int dia, int mes, int ano) {
        // validação do mês
        if (mes < 1 || mes > 12) {
            System.out.println("Erro! Data alterada para: 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            return;
        }
        else
            this.mes = mes;

        // confere quantos dias têm num mês
        int diasDoMes;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasDoMes = 30;
        }
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            diasDoMes = 31;
        else
            if (ano % 4 == 0)
                diasDoMes = 29;
            else
                diasDoMes = 28;

        // validação do dia
        if (dia < 1 || dia > diasDoMes) {
            System.out.println("Erro! Data alterada para: 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            return;
        }
        else
            this.dia = dia;

        this.ano = ano;
    }

    public int getDia () {
        return dia;
    }

    public int getMes () {
        return mes;
    }

    public int getAno () {
        return ano;
    }

    public void setDia (int dia) {
        this.dia = dia;
    }

    public void setMes (int mes) {
        this.mes = mes;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }

    public String toString () {
        return String.format ("\n%02d/%02d/%d\n", dia, mes, ano);
    }

    public boolean verificaAnoBissexto () {
        return ano % 4 == 0;
    }
}