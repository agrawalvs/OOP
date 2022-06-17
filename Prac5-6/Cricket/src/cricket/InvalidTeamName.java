package cricket;


class InvalidTeamName extends Exception{
    int n;
    InvalidTeamName(int n){
        this.n = n;
    }
    
    @Override
    public String toString(){
        if(n==2)
            return "Invalid Team Name found. string contains Special Character";
        else if(n==1)
            return "Invalid Team Name found. string contains Numbers";
        else
            return "Invalid Team Name found. string contains Special Character."
                    +"string contains number";

    }
}
