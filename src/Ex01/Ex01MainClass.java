package ex01;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//프로젝트 우클릭 자바빌드패스 - 모듈패스에 자바FX 라이브러리 추가
//javaFX 메인클래스 생성
//${javafxCompControls},javafx.fxml
//위에꺼를 메인클래스 아규먼츠에 추가
public class Ex01MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		//parent == 앵커팬을 부모형태로 받아온 것
		Parent root = FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
