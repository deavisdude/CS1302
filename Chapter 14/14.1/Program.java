/*
 * Davis Odom
 * 11/3/15
 * Displays four images in a grid pane
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program extends Application{

	//launches the application
	public static void main(String[] args){
		Application.launch(Program.class);
	}
	
	@Override
	public void start(Stage primaryStage) {
		//make a gridpane and imageViews
		GridPane gridPane = new GridPane();
		ImageView v1 = new ImageView(),
				v2 = new ImageView(),
				v3 = new ImageView(),
				v4 = new ImageView();
		ImageView[] imageViews = {v1,v2,v3,v4};
		//assign the imageviews images
		v1.setImage(new Image("image.jpeg"));
		v2.setImage(new Image("image2.jpeg"));
		v3.setImage(new Image("image3.jpeg"));
		v4.setImage(new Image("image4.jpeg"));
		//populate the gridpane
		int row = 0, col = 0;
		for(int i = 0; i<imageViews.length; i++){
			gridPane.add(imageViews[i], col, row);
			col++;
			if(col > 1){
				col = 0;
				row++;
			}
		}
		//put it all in a scene and show the stage
		primaryStage.setScene(new Scene(gridPane));
		primaryStage.show();
	}

}
