package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.ParoleArrayList;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco;
	long ti;
	long tf;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTempi;


    @FXML
    void doInsert(ActionEvent event) {
    	ti = System.nanoTime();
    	txtResult.setText("");
    	String testo = txtParola.getText();
    	elenco.addParola(testo);
    	for(String si : elenco.getElenco()) {
    		txtResult.appendText(si+"\n");
    	}
    	txtParola.setText("");
    	txtTempi.appendText("Tempo di processo: "+((System.nanoTime()-ti)/1000)+" microsecondi\n");
    }

    @FXML
    void doReset(ActionEvent event) {
    	ti = System.nanoTime();
    	txtResult.setText("");
    	elenco.reset();
    	txtTempi.appendText("Tempo di processo: "+((System.nanoTime()-ti)/1000)+" microsecondi\n");
    }
    

    @FXML
    void doCancella(ActionEvent event) {
    	ti = System.nanoTime();
    	String canc = txtResult.getSelectedText();
    	elenco.remove(canc);
    	txtResult.setText("");
    	for(String si : elenco.getElenco()) {
    		txtResult.appendText(si+"\n");
    	}
    	txtTempi.appendText("Tempo di processo: "+((System.nanoTime()-ti)/1000)+" microsecondi\n");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
