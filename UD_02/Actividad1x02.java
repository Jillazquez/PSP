public class Actividad1x02
{
    public static void main(String[] args)
    {
        Tic tic = new Tic();
        Tac tac = new Tac();
        tic.start();
        tac.start();
    }
}

class Tic extends Thread{
    public void run(){
    try{

    for(int i = 0; i < 100; i++)
    {
        System.out.println("TIC");
        Thread.sleep(1000);
    }
    }catch(InterruptedException ie)
    {
        ie.printStackTrace();
    }
    }
}

class Tac extends Thread{

    public void run(){
        try{

        for(int i = 0; i < 100; i++){
            System.out.println("TAC");
            Thread.sleep(1000);
        }

    }catch(InterruptedException ie)
    {
        ie.printStackTrace();
    }
    }
}