package model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Fichero {
BufferedWriter bw;
BufferedReader br;
//constructor que crea y prepara el fichero para escritura y lectura
public Fichero(String path) throws IOException{
bw = new BufferedWriter(new FileWriter(path));
br = new BufferedReader(new FileReader(path));
}
//método que escribe los datos en el fichero
public void writeFile(String data) throws IOException{
PrintWriter pw = new PrintWriter(bw);
pw.println(data);
}
//método que lee una linea del fichero
public String readFile() throws IOException{
return br.readLine();
}
//método que cierra el fichero de lectura
public void closeRead() throws IOException{
br.close();
}
//método que cierra el fichero de escritura
public void closeWrite() throws IOException{
bw.close();
}
}