import java.io.BufferedReader;
import java.io.InputStreamReader;
/**

 *
 */

/**
 * @author internous
 *
 */

public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("九九表を作ります");
        try{
        	BufferedReader br = new BufferedReader(new InputStreamReader (System.in),1);
        // 定型分。これからかいてくよーという設定
        	String str = null ;
        	int x = 0;
        	int y = 0;
        // 数値の初期化


        	System.out.println("xの値を入力してください");
        	str = br.readLine();
        //値を入力させる
        	x  =Integer.parseInt(str);
        //文字を数字に変える
        	System.out.println("ｙの値を入力してください");
        	str = br.readLine();
        //値を入力させる
        	y =Integer.parseInt(str);
        //文字を数字に変える
        	    for( int i = 1 ; i <= y  ; i++ ){
        		for( int j = 1 ; j <= x  ; j++ ){
        	    System.out.print( " " + i * j );
        	    if(i*j < 10){ System.out.print("  ");
        	    }else if(i*j >= 10 && i*j <100){
        	    	System.out.print(" ");
        	    }
        		}
        		System.out.println();
        	}
        }
        catch(Exception e){
        	System.out.println("エラー");
        }
	}

}
