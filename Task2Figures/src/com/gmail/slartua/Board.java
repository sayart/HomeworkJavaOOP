package com.gmail.slartua;

public class Board {
	public Shape[] board = new Shape[4];

	public Board(Shape[] board) {
		super();
		this.board = board;
	}

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addFigure(int part, Shape shape) {
		if (board[part - 1] == null && part - 1 >= 0 && part - 1 <= board.length) {
			board[part - 1] = shape;
		} else {
			System.out.println("Error!Can not add a figure");
		}
	}

	public void deleteFigure(int part) {
		if (board[part] != null && part - 1 >= 0 && part - 1 <= board.length) {
			board[part] = null;
		} else {
			System.out.println("Error!Part is not empty or is not exist");
		}
	}

	public double getTotalArea() {
		double area = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
				area = area + board[i].getArea();
			}
		}
		return area;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
				sb.append("Part" + (i + 1) + " " + board[i]);
			} else {
				sb.append("Part" + (i + 1) + " Empty");
			}
			sb.append(System.lineSeparator());
		}
		sb.append("Total Area = " + getTotalArea());

		return sb.toString();
	}

}
