import java.util.*;
class main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rand= new Random();
        System.out.print("scissor (0), rock (1), paper (2): ");
        String[] s=new String[3];
        s[0]="scissor";s[1]="rock";s[2]="paper";
        int player= in.nextInt();
        int com=rand.nextInt(3);
        if(player<0 || player >2) System.out.println("What are you doing???");
        else if(player==com) System.out.println("The computer is "+s[com]+". You are "+s[player]+" too. It is a draw");
        else if((player+1)%3==com) System.out.println("The computer is "+s[com]+". You are "+s[player]+". You lose");
        else System.out.println("The computer is "+s[com]+". You are "+s[player]+". You won");
    }
}