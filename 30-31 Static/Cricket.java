
import java.util.Scanner;

class Cri_cket{
    int player_no,no_of_innings,no_of_wickets,no_of_notouts,no_of_runs;
    static double avgSum=0.0;
    String player_name;
    static int no_of_players=0;
    double playerAvg=0.0;
    Cri_cket(String player_name,int player_no,int no_of_innings,int no_of_notouts,int no_of_runs,int no_of_wickets){
        this.player_name=player_name;
        this.player_no=player_no;
        this.no_of_innings=no_of_innings;
        this.no_of_wickets=no_of_wickets;
        this.no_of_notouts=no_of_notouts;
        this.no_of_runs=no_of_runs;
       cal_average();
        no_of_players++;
    }
    void cal_average(){
        if(no_of_notouts>=no_of_innings){
            no_of_notouts=no_of_innings-1;
        }
        playerAvg=no_of_runs/(no_of_innings-no_of_notouts)*1.0;
        System.out.println(player_no+"\t\t"+player_name+"\t\t"+playerAvg);
    }
    void display(){
        System.out.println(player_no+"\t\t"+player_name+"\t\t"+no_of_innings+"\t\t"+no_of_notouts+"\t\t"+no_of_wickets+"\t\t"+no_of_runs);
    }
    
    
    static int display(Cri_cket[] D,int id)
	{
		for(int i=0;i<no_of_players;i++)
        		{
		
			if(D[i].player_no==id)
			{
		       
                return i;
			}
		
		
	
		}
			return -1;
	}

  
    
}
public class Cricket
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Players : ");
        int n=sc.nextInt();
        int ch,i=0;
        int player_no,no_of_innings,no_of_wickets,no_of_notouts,no_of_runs;
        String player_name;
        Cri_cket[] players=new Cri_cket[n];
        do{
            System.out.println("1) Add New Player\n2) Display \n3) dispaly single payer details\n4) Average of all the players \n5) Exit\n");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                        for(i=0;i<n;i++)
			{
                            
                            System.out.println("\nPlayer "+(i+1)+": \n");
                            System.out.println("Enter Player Number : ");
                            player_no=sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter Player Name : ");
                            player_name=sc.nextLine();
                            System.out.println("Enter Number of Innings : ");
                            no_of_innings=sc.nextInt();
                            System.out.println("Enter Number of Wickets : ");
                            no_of_wickets=sc.nextInt();
                            System.out.println("Enter Number of Notouts : ");
                            no_of_notouts=sc.nextInt();
                            System.out.println("Enter Runs Scored : ");
                            no_of_runs=sc.nextInt();
                            players[i]=new Cri_cket(player_name,player_no,no_of_innings,no_of_notouts,no_of_runs,no_of_wickets);
                            
                        }
                        
                        
                    break;
                case 2:
                    System.out.println("Player Number\tPlayer Name\tNo. of Innings\tNo. of Not-outs\tno.of Wickets\tno. of Runs");
                    for(int j=0;j<i;j++){
                        players[j].display();
                    }
                    break;
                case 3:
                    System.out.println("Enter player id\n");
                    int id=sc.nextInt();
                     int j=Cri_cket.display(players,id);
                    if(j!=-1)
                       players[j].display();
                    else
                     System.out.println("Not found");
                    
                    break;
                case 4:
                    System.out.println("Player Number\tPlayer Name\tBatting Average");
                    for(int j1=0;j1<i;j1++){
                        players[j1].cal_average();
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while(ch!=5);
        sc.close();
    }
}