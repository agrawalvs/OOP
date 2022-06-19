
package cricket;

class Ipl {
    String Team_Name;
    int mplayed;
    int win;
    int lost;
    
    Ipl(String tn, int mp,int w,int l) throws InvalidCountException{
        Team_Name = tn;
        mplayed = mp;
        win = w;
        lost = l;
    }
    
    void register_team() throws InvalidTeamName{
        try{
            if(this.check_string()!=0)
                throw new InvalidTeamName(check_string());
            System.out.println("Team Name is Valid");
        }catch(InvalidTeamName e){
            System.out.println(e);
        }
    }
    
    final void check_count () throws InvalidCountException{
        try{
            if(mplayed != win + lost)
                throw new InvalidCountException(mplayed-win-lost);
            System.out.println("Given Counts are correct");
        }catch(InvalidCountException e){
            System.out.println(e);
        }
    }
    
    void check_Qualification(){
        if(lost*100/mplayed>40)
            System.out.println("Team is not Qualified for Qualifiers");
        else
            System.out.println("Team Qualified for Qualifiers");
    }
    
    int check_string(){
        int sflag=0,nflag=0;
        for (int i = 0; i < Team_Name.length(); i++) {
            if (!Character.isDigit(Team_Name.charAt(i))
                && !Character.isLetter(Team_Name.charAt(i))
                && !Character.isWhitespace(Team_Name.charAt(i))) {

                sflag = 1;
            }
            if (Character.isDigit(Team_Name.charAt(i))) {
                nflag = 1;
            }
            
        }
        if(sflag ==1 && nflag == 1)
            return 3;
        if(sflag == 1)
            return 2;
        if(nflag == 1)
            return 1;
        return 0;
    }
    
    void display() throws InvalidTeamName, InvalidCountException{
        System.out.printf("Team Name: %s\tMatch Played: %d\tWins: %d\tloss:%d\n",Team_Name,mplayed,win,lost);
        check_count();
        register_team();
        check_Qualification();
        System.out.printf("------------------------------------------------"
                + "------------\n\n");
    }
}
