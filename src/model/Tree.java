package model;
public class Tree {
private NodeT root;
public Tree() {
}
//asigna al árbol el nodo raíz
public void setRoot(NodeT root) {
this.root = root;
}
//retorna del árbol el nodo raíz
public NodeT getRoot() {
return root;
}
// metodo que devuelve si un árbol está vacio
public boolean isEmptyTree() {
return (root.isEmpty());
}
// método que recorre un árbol binario en preorden
public String preorder(NodeT root, String text) {
if(root!=null) {
//primero registra el nodo raíz
text = text + root.getValue() + " ";
//recorre el subarbol izquierdo
text = preorder(root.getLeft(), text);
//recorre el subárbol derecho
text = preorder(root.getRight(), text);
}
return text;
}
public String inorden(NodeT root, String text) {
if(root!=null) {
//recorre el subarbol izquierdo
text = inorden(root.getLeft(), text);
//primero registra el nodo raíz
text = text + root.getValue() + " ";
//recorre el subárbol derecho
text = inorden(root.getRight(), text);
}
return text;
}
// método que recorre un árbol binario en posorden
public String posorden(NodeT root, String text) {
if(root!=null) {
	text = posorden(root.getLeft(), text);
	text = posorden(root.getRight(), text);
text = text + root.getValue() + " ";
//recorre el subarbol izquierdo

//recorre el subárbol derecho

}
return text;
}
public String treeLeaves(NodeT root, int n, String text) {
if(root!=null) {
text = text + root.getValue() +""+n;
text =  text +treeLeaves(root.getLeft(),n+1, " ");
text =  text +treeLeaves(root.getRight(),n+1, " ");
}
return text;
}
public int levelMax(NodeT root,int num, int level) {
	
	if(root!=null) {
		level = num;
		level = levelMax(root.getLeft(), num+1, level);
		level = levelMax(root.getRight(), num+1, level);
	}

return level;		
}
public int altura(NodeT root,int num, int level) {
	
	if(root!=null) {
		level = num;
		level = altura(root.getLeft(), num+1, level);
		level = altura(root.getRight(), num+1, level);
	}

return level;		
}
}