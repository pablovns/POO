public class Mes {
    public static String getMesPorExtenso(int mes, int codigo) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] meses = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        if (codigo == 1) {
            return meses[mes-1];
        } else if (codigo == 2) {
            return months[mes-1];
        } else {
            return "Não foi possível identificar o mês";
        } 
    }
}