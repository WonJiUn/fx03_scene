package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{

	@FXML private Button loginBtn;
	@FXML private TextField idField;
	@FXML private PasswordField pwField;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loginBtn.setOnMouseClicked(e->{
			checkDB();
		});
		
	}
	public void checkDB() {
		
		MyDB db = new MyDB();
	
		String inputId = idField.getText();
		String inputPw = pwField.getText();
		
		//inputId.getText().isEmpty()
		if(inputId.equals("")) {
			msgBox("아이디를 입력해주세요");
			idField.requestFocus(); 	//포커스를 맞춰줌
		}else if(inputPw.equals("")) {
			msgBox("비밀번호를 입력해주세요");
			pwField.requestFocus();
		}else {
			int i = db.DBvalue(inputId, inputPw);
			if(i == 1) {
				msgBox("로그인 성공!");
			}else {
				msgBox("로그인 실패");
			}
		}
		
	}
	public void msgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}

}
