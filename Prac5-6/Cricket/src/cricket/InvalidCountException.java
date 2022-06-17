package cricket;

public class InvalidCountException extends Exception {
    int n;
    InvalidCountException(int n){
        this.n = n;
    }
    
    @Override
    public String toString(){
            return "Invalid Count found. match played or win and lost "
                    + "differ by "+ n;
    }
}
