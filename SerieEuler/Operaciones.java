import javax.swing.JOptionPane;

public class Operaciones extends SerieEuler{
    
    public double Euler(int n, double valAprox){
        double multi=0;
        for (int i=1; i<n+1 ; i++) {
            multi = multi + (1 /Math.pow(i,2));
        }
        valAprox = (6 * multi);
        valAprox = Math.sqrt(valAprox);
        System.out.println(valAprox);
        return valAprox;
    }

     public double errorRel(double valAprox, double valAnt, String norm){
        error = valAnt - valAprox;
        if(norm.equals("1")){
            error = (error / valAnt) * 100;
        }
        return error;
    }
    
    public double errorVerd(double np, double valAprox,double error, String norm){
        np = Math.PI;
        error = np - valAprox;
        if(norm.equals("2")){
            error = (error / np) * 100;
        }
        return error;
    }

    
    public int numDeCifras(int cifras, double valAprox, double np, double valAnt, String tipo){
        cifras = 0; 
        String Valor = valAprox+"";
        String valorpi = null;
        if(tipo.equals("1")){
        valorpi = valAnt+"";
        }else{
        if(tipo.equals("2")){
        valorpi = np+"";
        }
        }
        for (int i=0; i<valorpi.length(); i++) {
           if (valorpi.charAt(i) != Valor.charAt(i)) {
                i = valorpi.length();
           }
           else {
               cifras++;
           }
        }
        return cifras;
    } 
}
