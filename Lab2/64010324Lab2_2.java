import java.util.*;
class Pro2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rand= new Random();
        System.out.print("scissor (0), rock (1), paper (2): ");
        //String[] s={"scissor","rock","paper"};
        String scom="",splayer="";
        int player= in.nextInt();
        int com=rand.nextInt(3);
        if(com==0) scom="scissor";
        else if(com==1) scom="rock";
        else if(com==2) scom="paper";
        if(player==0) splayer="scissor";
        else if(player==1) splayer="rock";
        else if(player==2) splayer="paper";
        if(player<0 || player >2) System.out.println("What are you doing???");
        else if(player==com) System.out.println("The computer is "+scom+". You are "+splayer+" too. It is a draw");
        else if((player+1)%3==com) System.out.println("The computer is "+scom+". You are "+splayer+". You lose");
        else System.out.println("The computer is "+scom+". You are "+splayer+". You won");
    }
}