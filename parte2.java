public class Main {
    public static void main(String[] args) {

        Auto toyota = new Auto();
        toyota.AumentarRuedas();
        toyota.AumentarRuedas();
        toyota.QuitarRueda();
        System.out.println(toyota.ruedas);

    }
    static class Auto {
        public int ruedas = 4;
        public void QuitarRueda(){
            this.ruedas--;
        }
        public void AumentarRuedas(){
            this.ruedas++;
        }
    }
}