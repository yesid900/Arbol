package model;
public class NodeT {
private String value;
 private NodeT left;
 private NodeT right;
 public NodeT() {
 value=null;
 left=right=null;
 }

 public NodeT(String value) {
 this.value = value;
 }
 public void setValue(String value) {
 this.value = value;
 }
 //asigna un nodo izquierdo
 public void setLeft(NodeT left) {
 this.left = left;
 }
 //asigna un nodo derecho
 public void setRight(NodeT right) {
 this.right = right;
 }
 //retorna el valor del nodo
 public String getValue() {
 return value;
 }
 //retornar el nodo izquierdo
 public NodeT getLeft() {
 return left;
 }
 //retornar el nodo derecho
 public NodeT getRight() {
 return right;
 }
 //determina si un nodo es hoja
 public boolean isLeaf(){
 return (left == null && right == null);
 }
 //determina si un nodo es padre
 public boolean isFather(){
 return (left!=null || right !=null);
 }

 public boolean isEmpty(){
 return(value==null);
 }
}