public class PlanoOperadora {
    public static void main(String [] args) {
        String plano = "M";

        // Controle de fluxo codicional
        //
        // if (plano =="B") {
        //     System.out.println("100 minutos de ligação");
        // } else if (plano == "M") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whats e Instagram grátis");
        // } else if (plano == "T") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whats e Instragram grátis");
        //     System.out.println("5Gb de Youtube");
        // }

        //Switch Case
        
        switch (plano) {
            case "T":{
                System.out.println("5Gb de Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
