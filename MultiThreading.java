public class MultiThreading implements Runnable{
    int x=0;
    StringBuilder sb=null;
    public MultiThreading(){
        sb = new StringBuilder();
    }
    @Override
    public void run(){
       synchronized(sb){
        try{
            for (int i=1;i<=10;i++){
                sb.append("Producer Appending..."+i);
                Thread.sleep(1000);
            }
            sb.notify();
        }catch(Exception e){}
       }
    }
    public static void main(String[] args) {
        MultiThreading mt =new MultiThreading();
        Thread th = new Thread(mt);
        th.start();
        
    }
}