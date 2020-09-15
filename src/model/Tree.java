package model;
public class Tree {
private NodeT root;
public Tree() {
}
//asigna al �rbol el nodo ra�z
public void setRoot(NodeT root) {
this.root = root;
}
//retorna del �rbol el nodo ra�z
public NodeT getRoot() {
return root;
}
// metodo que devuelve si un �rbol est� vacio
public boolean isEmptyTree() {
return (root.isEmpty());
}
// m�todo que recorre un �rbol binario en preorden
public String preorder(NodeT root, String text) {
if(root!=null) {
//primero registra el nodo ra�z
text = text + root.getValue() + " ";
//recorre el subarbol izquierdo
text = preorder(root.getLeft(), text);
//recorre el sub�rbol derecho
text = preorder(root.getRight(), text);
}
return text;
}
public String inorden(NodeT root, String text) {
if(root!=null) {
//recorre el subarbol izquierdo
text = inorden(root.getLeft(), text);
//primero registra el nodo ra�z
text = text + root.getValue() + " ";
//recorre el sub�rbol derecho
text = inorden(root.getRight(), text);
}
return text;
}
// m�todo que recorre un �rbol binario en posorden
public String posorden(NodeT root, String text) {
if(root!=null) {
	text = posorden(root.getLeft(), text);
	text = posorden(root.getRight(), text);
text = text + root.getValue() + " ";
//recorre el subarbol izquierdo

//recorre el sub�rbol derecho

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