import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**

 *
 */

/**
 * @author internous
 *
 */

public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		boolean flag = true ;
       	String str = null ;
    	int ans = 0;
    	int cor = (int)(Math.random()*100) +1;
    	int cnt = 0; //カウンター用
    // 変数宣言
    	System.out.println("数当てゲームです。1から100の中で数字を入力してください！！");
		while(flag){
		cnt++;
           try{
        	BufferedReader br = new BufferedReader(new InputStreamReader (System.in),1);
        // 定型分。文字入力に必要

        	str = br.readLine();
        //値を入力させる
           	ans  =Integer.parseInt(str);
        //文字を数字に変える

           	if(!(1<=ans) || !(ans<=100)){
           		System.out.println("1から100の数値を入力してください");
           	}
           	else if(ans>cor ){
           		System.out.println("もっと小さいです！");
           	}
        //答えより大きい場合
           	else if(ans<cor){
           		System.out.println("もっと大きいです！");
           	}
        //答えより小さい場合
           	else if(ans==cor){
           		if (cnt>6){
           		System.out.println("正解！"+ cnt +" 回もかかったね(笑)");
           		}else if(6 >= cnt && cnt >= 2){
           			System.out.println(cnt +" 回か...なかなかやるな。");
           		}else{
           			System.out.println("一発！！やるね！！");
           		}
           		flag = false;

           	}


        }catch(Exception e){
        	System.out.println("まじめにやってください");
        }


	}

    	}
}
