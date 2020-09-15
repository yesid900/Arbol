package view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IOManager {
	
private static final BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
// método que permite visualizar cualquier tipo de dato y lo hará en modo string
public void showMessage(String message) {
System.out.println(message);
}
// método que permite leer y retornar un dato de tipo String por consola
public String readString(String message) throws IOException {
System.out.print(message);
return br.readLine();
}
// método que permite leer y retornar un dato de tipo int por consola
public int readInt(String message) throws IOException, NumberFormatException {
System.out.print(message);
return Integer.parseInt(br.readLine());
}
// método que permite leer y retornar un dato de tipo long por consola
public long readLong(String message) throws IOException, NumberFormatException {
System.out.print(message);
return Long.parseLong(br.readLine());
}
// método que permite leer y retornar un dato de tipo double por consola
public double readDouble(String message) throws IOException, NumberFormatException {
System.out.print(message);
return Double.parseDouble(br.readLine());
}
// método que permite leer y retornar un dato de tipo float por consola
public float readFloat(String message) throws IOException, NumberFormatException {
System.out.print(message);
return Float.parseFloat(br.readLine());
}
// método que permite leer y retornar un dato de tipo char por consola
public char readChar(String message) throws IOException {
System.out.print(message);
return br.readLine().charAt(0);
}
}
