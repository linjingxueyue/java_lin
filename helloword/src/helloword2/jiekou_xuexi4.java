package helloword2;


interface Singer{
    public int i=0;
    public void sing();
    public void talk();
}

interface SongWriter{
    public int i=1;
    public void write();
    public void talk();
}

interface Zhoujielun extends Singer, SongWriter{
    int i=2;
    public void sing();
    public void write();
    public default void talk(){
        System.out.println(" zhoujielun talk: "+Singer.i+" "+SongWriter.i);
        // i = 3; ����ᱨ��
    }
}


public class jiekou_xuexi4 implements Zhoujielun{
    public static void main(String[] args){
    	jiekou_xuexi4 ift = new jiekou_xuexi4();
        ift.talk();
    }

    public void sing(){

    }

    public void write(){

    }

}