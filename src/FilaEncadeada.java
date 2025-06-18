public class FilaEncadeada {
    private No first;
    private No last;

    public FilaEncadeada() {
        this.first = null;
        this.last = null;

    }
    public void Enqueue(int dado){
        No novoNo = new No(dado);
        if(first==null){
            first = novoNo;

        }
        else {
            last.next = novoNo;
        }
        last = novoNo;

    }

    public void Show(){
        No temp = first;
        while(temp!=null){
            System.out.print(temp.getDado());
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void Dequeue(){
        if(first==null){
            System.out.println("A fila está vazia!");
        }
        else {
            first = first.next;
            if(first==null){
                last=null;
            }
        }
    }
    }

