package com.dataingengjoer.monopoly.ui.navigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class Navigation {
	private static final Navigation instance = new Navigation();
	private StackPane root;

	public Navigation(){}

	public void setRoot(StackPane root) {
		this.root = root;
	}

	public void navigate(String path) {
		try {
			String fxml = switch (path) {
				case "game" -> "src/main/resources/com.dataingengjoer.monopoly/ui/screen/GameScreen.fxml";
				case "menu" -> "src/main/resources/com.dataingengjoer.monopoly/ui/screen/MenuScreen.fxml";
				default -> throw new IllegalArgumentException("No path by: " + path);
			};

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/" + path));
			Node view = loader.load();
			root.getChildren().addAll(view);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
