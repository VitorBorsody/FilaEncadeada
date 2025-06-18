//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 FilaEncadeada fila1 = new FilaEncadeada();
 fila1.Enqueue(5);
 fila1.Enqueue(10);
 fila1.Enqueue(15);
 fila1.Show();
 fila1.Dequeue();
 fila1.Show();
 fila1.Dequeue();
 fila1.Show();
    }
}