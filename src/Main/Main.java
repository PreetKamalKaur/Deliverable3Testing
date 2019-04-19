package Main;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {
	ArrayList<card> deck = new ArrayList<card>();
	ArrayList<card> playerPile = new ArrayList<card>();
	ArrayList<card> dealerPile = new ArrayList<card>();
	private FlowPane playerPanel;
	private FlowPane dealerPanel;
	
	int dealerSum =0;
	int playerSum = 0;
		int sum =0;
	

	
	@Override
	public void start(Stage primaryStage) {
		
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 500, 700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("BlackJack");

			dealerPanel = new FlowPane();
			dealerPanel.setAlignment(Pos.CENTER);
			root.setTop(dealerPanel);
			playerPanel = new FlowPane();
			playerPanel.setAlignment(Pos.CENTER);
			root.setCenter(playerPanel);

			FlowPane buttonsPanel = new FlowPane();
			buttonsPanel.setAlignment(Pos.CENTER);
			Button hitButton = new Button("Hit");
			Button stayButton = new Button("Stay");
			buttonsPanel.getChildren().add(hitButton);
			buttonsPanel.getChildren().add(stayButton);
			root.setBottom(buttonsPanel);
			
			InitDeck();
		    dealToDealer();
			dealToPlayer();
			dealToDealer();
			dealToPlayer();
			
			
			hitButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
						dealToPlayer();
					
					if(PlayerIsBusted()){
						JOptionPane.showMessageDialog(null, "Over 21! Game over , Dealer won");
					}
				
					
				} 
			});

			stayButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					System.out.println("Staying");
					if(dealerSum<16) {
						dealToDealer();
					}
					if(dealerSum<16) {
						dealToDealer();
					}
					if(dealerSum<16) {
						dealToDealer();
					}
					if(DealerIsBusted()) {
						
				            JOptionPane.showMessageDialog(null,"dealer's sum Over 21! Game over , Player won");

					}
					
					result();
                    

                }
			});

		
	}
	

	private void result() {
		
			
        
        System.out.println("dealer's total score is "+dealerSum);

		System.out.println("player's total score is " + playerSum);
		if(DealerIsBusted()) {
	        System.out.println("Dealer is busted , Player won");
		}
		if(PlayerIsBusted()) {
			System.out.println("Player is busted , dealer won");
		}
		if ( playerSum < 22 && dealerSum < 22 ) {

                    String res = (playerSum > dealerSum) ? "Player won" : "Dealer won";
        System.out.println(res);
		}
		

	}

	private void InitDeck() {
		String[] suits =new String[] { "hearts", "diamonds", "clubs", "spades" };


		for (String s:suits) {
			for (int i = 1; i < 14; i++) {
				int j = (int)(Math.random()*13)+1;
				int k = (int)(Math.random()*4);
				String l = suits[k];
				
				card c = new card(j, l);
								deck.add(c);
			}
		}
	}
	
	
	public void dealToDealer(){
		card c = deck.remove(0);
		dealerPile.add(c);
		
		DisplayCard(c, dealerPanel);
		int j =0;
		if(c.rank>=10) {
			j =10;
		}
		if(c.rank<10) {
			j=c.rank;
		}
		dealerSum+= j ;
		
	}
	
	private void dealToPlayer(){
		card c = deck.remove(0);
		playerPile.add(c);
		DisplayCard(c, playerPanel);
		int k =0;
		if(c.rank>=10) {
			k =10;
		}
		if(c.rank<10) {
			k=c.rank;
		}
		playerSum+=k;

		
	}
private void DisplayCard(card c, FlowPane panel) {
		
		Image img = new Image("Cards/" + c.GetFileName());
		ImageView viewer = new ImageView(img);
		panel.getChildren().add(viewer);
		viewer.setPreserveRatio(true);
		viewer.setFitWidth(100);
		System.out.println(c.GetFileName());
	}
	private boolean PlayerIsBusted() {
		
		
		
		if (playerSum > 21) {
			return true;
				
		}
		 
		return false;
	}
private boolean DealerIsBusted() {
		
		
		
		if (dealerSum > 21) {
			return true;
				
		}
		 
		return false;
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

}

