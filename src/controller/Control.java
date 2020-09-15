package controller;

import java.io.IOException;
import model.*;
import view.IOManager;

public class Control {
	IOManager manager = new IOManager();
	private int aux = 0;

	public void init() throws IOException {
		Queue cola = new Queue();
		NodeT n1 = new NodeT();
		NodeT n2 = new NodeT();
		Tree tree = new Tree();
		cola = loadQueue(cola, tree, n1, n2);
		tree = buildTree(tree, cola);
		printPreorder(tree);
		printPos(tree);
		printIn(tree);
		printTreeLeaves(tree);
		level(tree);
		altura(tree);
//printQueue(cola);
	}

//método para construir un árbol
	public Queue loadQueue(Queue s, Tree tree, NodeT n1, NodeT n2) throws IOException {
		String caracter = "";
		String opc;
		int condicion = 0;
		int r = 0;
		NodeT left1 = new NodeT();
		NodeT right1 = new NodeT();
		int abrir = 0;
		String l = "";
		String arbol = manager.readString("Ingrese la lista de arbol sin espacios:");
		for (int i = 0; i < arbol.length(); i++) {
			caracter = arbol.substring(i, i + 1);
			opc = caracter;
			switch (opc) {
			case "(":
				s.push(l);
				s.push(caracter);
				caracter = "";
				l = "";
				break;
			case ",":
				s.push(l);
				s.push(caracter);
				caracter = "";
				l = "";
				break;
			case ")":
				s.push(l);
				s.push(caracter);
				caracter = "";
				l = "";
				break;
			default:
				break;
			}
			l = l + caracter;
		}
		return s;
	}

	public Tree buildTree(Tree tree, Queue cola) throws IOException {
		Node q = new Node();
		q = cola.getHead();
		NodeT x = new NodeT(q.getFrase());
		String car = "";
		cola.pop();
		q = cola.getHead();
		car = q.getFrase();
		x = raiz(x, cola, car, aux);
		tree.setRoot(x);// asigna la raíz del árbol
		return tree;
	}

	public NodeT raiz(NodeT T2, Queue cola, String car, int aux) {
		Node q = new Node();
		NodeT T5 = new NodeT();
		NodeT T3 = new NodeT();
		q = cola.getHead();
		if (car.equals("(")) {
			aux++;
			cola.pop();
			q = cola.getHead();
			T5 = new NodeT(q.getFrase());
			cola.pop();
			q = cola.getHead();
			car = q.getFrase();
			if (car.equals("(")) {
				T5 = raiz(T5, cola, car, aux);
			}
			T2 = asignar(T2, T5);
		}
		q = cola.getHead();
		car = q.getFrase();
		if (car.equals(",")) {
			cola.pop();
			q = cola.getHead();
			T3 = new NodeT(q.getFrase());
			cola.pop();
			q = cola.getHead();
			car = q.getFrase();
			if (car.equals("(")) {
				T3 = raiz(T3, cola, car, aux);
			}
			T2 = asignar2(T2, T3);
		}
		if (aux > 1) {
			cola.pop();
			cola.pop();
			q = cola.getHead();
			car = q.getFrase();
			aux = aux - 1;
		}
		return T2;
	}

	public NodeT asignar(NodeT q, NodeT q2) {
		q.setLeft(q2);
		return q;
	}

	public NodeT asignar2(NodeT q, NodeT q2) {
		q.setRight(q2);
		return q;
	}

	public void printPreorder(Tree tree) {
		manager.showMessage("Recorrido en Preorden");
		String pre = "";
		pre = tree.preorder(tree.getRoot(), pre);
		manager.showMessage(pre);
	}

	public void printIn(Tree tree) {
		manager.showMessage("Recorrido en inorden");
		String pre = "";
		pre = tree.inorden(tree.getRoot(), pre);
		manager.showMessage(pre);
	}

	public void printPos(Tree tree) {
		manager.showMessage("Recorrido en Posorden");
		String pre = "";
		pre = tree.posorden(tree.getRoot(), pre);
		manager.showMessage(pre);
	}

	public void printTreeLeaves(Tree tree) {
		manager.showMessage("Niveles del arbol");
		String pre = "";
		pre = tree.treeLeaves(tree.getRoot(), 0, pre);
		manager.showMessage(pre);
	}

public void level(Tree tree) {
	manager.showMessage("nivel arbol");
	int pre = 0;
	int level = 0;
	level = tree.levelMax(tree.getRoot(), pre, level);
	manager.showMessage("" + level);
}
public void altura(Tree tree) {
	manager.showMessage("altura arbol");
	int pre = 1;
	int level = 0;
	level= tree.altura(tree.getRoot(), pre, level);
	manager.showMessage("" + level);
}
}