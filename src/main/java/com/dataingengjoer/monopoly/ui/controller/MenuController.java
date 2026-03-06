package com.dataingengjoer.monopoly.ui.controller;

import com.dataingengjoer.monopoly.ui.navigation.NavigationManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MenuController {
	@FXML private StackPane menu;
	@FXML private Button startButton;

	@FXML
	public void initialize() {
		startButton.setOnAction(e -> NavigationManager.getInstance().navigate("game"));
	}
}
