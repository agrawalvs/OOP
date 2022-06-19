package cricket;


class InvalidTeamName extends Exception{
    int n;
    InvalidTeamName(int n){
        this.n = n;
    }
    
    @Override
    public String toString(){
        switch (n) {
            case 2:
                return "Invalid Team Name found. string contains Special Character";
            case 1:
                return "Invalid Team Name found. string contains Numbers";
            case 3:
                return "Invalid Team Name found. string contains Special Character."
                        +"string contains number";
            default:
                break;
        }
        return null;
    }
}
