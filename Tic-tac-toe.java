import java.util.*;
public class Main {
    static String board[];
    static String turn;
    static void printboard(){
        System.out.println(board[0]+" | "+board[1]+" | "+board[2]+" | ");
        System.out.println("-----------");
        System.out.println(board[3]+" | "+board[4]+" | "+board[5]+" | ");
        System.out.println("-----------");
        System.out.println(board[6]+" | "+board[7]+" | "+board[8]+" | ");

    }
    static String checkwinner(){
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        for(int i=0;i<9;i++){
            if(Arrays.asList(board).contains(String.valueOf(i))){
                break;
            }
            else if(i==8){
                return "Draw";
            }
        }
        return "Now its "+turn+" ";

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        board=new String[9];
        String value=null;
        turn="X"; //first turn will given to x
        for(int i=0;i<9;i++){
            board[i]=String.valueOf(i);
        }
        printboard();
        int count=0;
        while(count<9){
            System.out.println("Enter where you want to place: ");
            int place=s.nextInt();
            if(board[place]!="X" && board[place]!="O"){
                board[place]=turn;
                printboard();
                count++;
                if(turn=="X") turn="o";
                else turn="X";
            }
            else{
                System.out.println("Already Taken! Please Try different place");
                printboard();
            }
            value=checkwinner();
            System.out.println(value);
            if(value=="X"||value=="O"){
                System.out.println("Winner is "+value);
                break;
            }
        }


    }
}
