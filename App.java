public class App {
    public static void main(String[] args) throws Exception {
        
        Carro c1 = new Carro(1, 
        "cr20", "honda", "civic", 2015, 2012, "honda", "pedro", "civic", 3, 10, 20, 8, 5, "Gasolina", "SP", "Sao Paulo", "Carro", 1, 8, 
        "5214632552", "aser1234", (float)20, 5, 20,true);

        c1.Imprimir();
        
        Caminhao cm = new Caminhao(2, "5236", "aleatorioC", "516651", 2020, 2023, "Honda", "Bianca", "8547", 2, 20, 5, 2158, 362, 
        "Gasolina", "SC", "Curitiba", "Caminhão", 8, 12, 054214610652065", "rsf25632", (float) 20, (float) 10);
    
        cm.Imprimir();

        Onibus o1 = new Onibus(3, "amond2",  "Ônibus", "2020", 2022, 2018, "Mercedes", "Duda", "2003", 55, 22, 3669, 8, 25, "Diesel", "MS", 
        "Dourados", "ônibus", 15, 26, "24565165165561", "hand3211", 012, true, true,false, true);

        o1.Imprimir();

        Motocicleta m1 = new Motocicleta(4, "Harley", "Audi", "VX2315", 2000, 220, "Audi", "Lumara", "VX2315", 3, 66, 55, 3, 22, "Gasolina", "RJ", 
        "Rio de Janeiro", "Motocicleta", 23, 85, "25487965236", "jhgf2587", 13, "AleaotioM");

        m1.Imprimir();

        Aviao a1 = new Aviao(5,  "3315", "AvioNome", "derf", 1968, 1978, "NomeAleatorio", "Latam", "NomeAleatorio33", 6, 215, 302, 15, 18, 
        "oi3", "MS", "Campo Grande", "Aeronave", 2, 52452, 6415, 156165156166552", (float) 60, (float) 60, (float) 02523,51452);

        a1.Imprimir();
    }
}