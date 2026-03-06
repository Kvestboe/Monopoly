package com.dataingengjoer.monopoly.ui.navigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class NavigationManager {
	private static final NavigationManager instance = new NavigationManager();
	private StackPane root;

	private NavigationManager(){}

	public static NavigationManager getInstance() {
		return instance;
	}

	public void setRoot(StackPane root) {
		this.root = root;
	}

	public void navigate(String path) {
		try {
			String fxml = switch (path) {
				case "game" -> "/com.dataingengjoer.monopoly/ui/screen/GameScreen.fxml";
				case "menu" -> "/com.dataingengjoer.monopoly/ui/screen/MenuScreen.fxml";
				default -> throw new IllegalArgumentException("No path by: " + path);
			};

			FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
			Node view = loader.load();
			root.getChildren().setAll(view);

		} catch (Exception e) {
			throw new RuntimeException("Navigation failed for: " + path, e);
		}
	}

}
