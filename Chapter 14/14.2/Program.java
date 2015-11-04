import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane ticTacToe = new GridPane();
		ImageView[] imageViews = new ImageView[9];
		Random gen = new Random();
		int randomResult;
		int row = 0, col = 0;
		for(int i=0; i<9; i++){
			randomResult = gen.nextInt(3);
			switch(randomResult){
			case 0:
				imageViews[i] = new ImageView(new Image("white.png"));
				break;
			case 1:
				imageViews[i] = new ImageView(new Image("x.png"));
				break;
			case 2:
				imageViews[i] = new ImageView(new Image("o.png"));
				break;
			}
			imageViews[i].setFitHeight(100);
			imageViews[i].setFitWidth(100);
			ticTacToe.add(imageViews[i], col, row);
			col++;
			if(col > 2){
				col = 0;
				row++;
			}
		}
		
		primaryStage.setScene(new Scene(ticTacToe));
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(Program.class);
	}

}
