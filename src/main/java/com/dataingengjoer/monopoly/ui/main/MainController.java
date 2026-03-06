package com.dataingengjoer.monopoly.ui.main;

import com.dataingengjoer.monopoly.ui.navigation.NavigationManager;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class MainController {
	@FXML private StackPane contentRoot;

	public void initialize() {
		NavigationManager.getInstance().setRoot(contentRoot);
		NavigationManager.getInstance().navigate("menu");
	}
}
