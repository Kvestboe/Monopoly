package com.dataingengjoer.monopoly.ui.controller;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class GameController {
	@FXML private BorderPane game;
	@FXML private StackPane boardContainer;
	@FXML private GridPane boardView;

	@FXML
	public void initialize() {
		NumberBinding squareSize = Bindings.min(
			boardContainer.widthProperty(),
			boardContainer.heightProperty()
		);
		boardView.prefWidthProperty().bind(squareSize);
		boardView.prefHeightProperty().bind(squareSize);
		boardView.maxWidthProperty().bind(squareSize);
		boardView.maxHeightProperty().bind(squareSize);
	}
}
