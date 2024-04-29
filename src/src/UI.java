import chess.ChessPiece;
import chess.Color;

public class UI {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String WHITE = "\u001B[37m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static final String BLACK_WHITE="\u001B[30;47m";
    public static final String YELLOW_WHITE="\u001B[33;47m";
    public static void printBoard(ChessPiece[][] pieces){

        for (int i =0;i< pieces.length;i++){
            System.out.print(WHITE_BACKGROUND+(8-i)+" "+RESET);
            for(int j=0;j<pieces.length;j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.print(WHITE_BACKGROUND+"  a  b  c  d  e  f  g  h  "+RESET);
    }
    private static void printPiece(ChessPiece piece){
     if(piece==null){
         System.out.print(WHITE_BACKGROUND+"-"+RESET);
     }else{
         if(piece.getColor()== Color.WHITE){
             System.out.print(YELLOW_WHITE+piece+RESET);
            }else{
             System.out.print(BLACK_WHITE+piece+RESET);
         }
     }
        System.out.print(WHITE_BACKGROUND+"  "+RESET);
    }
}
