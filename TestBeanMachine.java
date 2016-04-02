//U10416021 張馨容
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class TestBeanMachine{
	//main method
	public static void main(String[] args) {
		//create Thread
    	new Thread() {
            @Override
            //to run BeanMachine.class
            public void run() {
                Application.launch(BeanMachine.class);
            }
        //invoke the start() method to tell the JVM that the thread is ready to run
        }.start();
  	}
}