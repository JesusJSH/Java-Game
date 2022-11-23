import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] choice = new String[]{"","Rock","Paper","Scissors"};
        int computerChoice;
        int playerChoice = 0;
        int numberofComputerWin = 0;
        int numberofPlayerWin = 0;
        String red="\u001B[33m";
        String resetcolour="\u001B[0m";
        do{
            computerChoice= (int) (Math.random()*3+1);
            System.out.print("Enter your choice :");
            playerChoice= integerRead(0,3);
            System.out.print("Computer choice = " + red + choice[computerChoice] + resetcolour);
            System.out.println(" Player choice = " + red + choice[playerChoice] + resetcolour);
            if(playerChoice!=0){
                if(computerChoice==playerChoice){
                    System.out.println("Draw");
                }
                else if(computerChoice==1 && playerChoice==3 || computerChoice==2 && playerChoice==1
                        || computerChoice==3 && playerChoice==2){
                    numberofComputerWin++;
                    System.out.print(red + "Computer Win " + resetcolour);
                    System.out.println(" Score ===> Computer : " + numberofComputerWin+ " -    Player : " + numberofPlayerWin);
                }
                else{
                    numberofPlayerWin++;
                    System.out.print(red + "Player Win " + resetcolour);
                    System.out.println(" Score ===> Computer : " + numberofComputerWin+ " -    Player : " + numberofPlayerWin);
                }
            }
        }
        while(playerChoice!=0);
        if(numberofComputerWin==numberofPlayerWin){
            System.out.println("Draw");
        } else if (numberofComputerWin>numberofPlayerWin) {
            System.out.println("Computer Win");
        }
        else{
            System.out.println("Player Win");
        }
        System.out.println("Last Score ===> Computer : " + numberofComputerWin+ " -    Player : " + numberofPlayerWin);
    }

    private static int integerRead(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int number=0;
        boolean readingOK=false;
        do{
            try{
                number = Integer.parseInt(scan.nextLine());
                readingOK=true;
            }catch(NumberFormatException e){
            }
            if(number<min || number>max || !readingOK){
                System.out.println("Incorrect - Please Re-enter (" + min + " - " + max+") : "  );
            }
        }
        while(!readingOK || number<min || number>max );
        return number;
    }

}
