import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**

 *
 */

/**
 * @author internous
 *
 */

public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 新規作成 File sakuma = new File ("C:\\Users\\internous\\hello.txt"); try{
		 * if(sakuma.createNewFile()){ System.out.println("ファイルの作成に成功しました");
		 * }else{ System.out.println("ファイルの作成に失敗しました"); } }catch(IOException e){
		 * System.out.println("error"); }
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);

		String file;
		String str = null;
		int num;

		Boolean flag = true ;
		while(flag){

		try {
			// ↓ファイルを指定する
	//		System.out.println("ファイル名を入力してください");
	//		file = br.readLine();
	//		File sakuma = new File(file);
			// while(flag){
			System.out.println("テキストファイルプログラムです以下の数字でアクションを選択できます");
			System.out.println("1．新規作成");
			System.out.println("2．上書き");
			System.out.println("3．追記");
			System.out.println("4．読み込み");
			System.out.println("5. 削除");
			System.out.println("100．終了");
			// System.out.println("101．一つ前に戻る");

			str = br.readLine();
			num = Integer.parseInt(str);
			if (num == 1) {
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File sakuma = new File(file);
				if (sakuma.createNewFile()) {// 新規作成のコード
					System.out.println("ファイルの作成に成功しました");
				} else {
					System.out.println("ファイルの作成に失敗しました");
				} // if(sakuma.createNewFile())
				FileWriter fw = new FileWriter(sakuma, false);
				// PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("文章を入力してください");
				String shinki = br2.readLine();
				fw.write(shinki);
				fw.flush();
				fw.close();
			} // if(num == 1)
			else if (num == 2) {// 上書きコードを書く
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File sakuma = new File(file);
				// PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
				if (!sakuma.exists()) {
					System.out.println("ファイルが存在しません。新しくファイルを作成します");
				}
				System.out.println("以下に本文を入力してください");
				FileWriter fw = new FileWriter(sakuma, false);
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String uwagaki = br2.readLine();
			//	System.out.println(sakuma.getPath());
				fw.write(uwagaki);
				fw.flush();
				fw.close();
				// fw.write(uwagaki);
				// fw.flush();
				// fw.close();

			} // else if(num == 2)
			else if (num == 3) {// 追記コードを書く
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File sakuma = new File(file);
				// PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
				if (!sakuma.exists()) {
					System.out.println("ファイルが存在しません。新しくファイルを作成します");
				}
				System.out.println("以下に本文を入力してください");
				FileWriter fw = new FileWriter(sakuma, true);
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String tuiki = br2.readLine();
			//	System.out.println(sakuma.getPath());
				fw.write(tuiki);
				fw.flush();
				fw.close();

			} // else if(num == 3)
			else if (num == 4) {// 読み込みコードを書く
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File sakuma = new File(file);
				// PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
				if (!sakuma.exists()) {
					System.out.println("ファイルが存在しません。");
				}else{
					FileReader filereader = new FileReader(file);
					int re;
					  while((re = filereader.read()) != -1){
					    System.out.print((char)re);
					  }
					  filereader.close();
				}


			}//else if (num == 4)
			else if (num == 5) {// 削除コードを書く
				System.out.println("ファイル名を入力してください");
				file = br.readLine();
				File sakuma = new File(file);
					if (!sakuma.exists()) {
						System.out.println("ファイルが存在しません。削除するものがないんだから無理だよね。");
					} else {
						if(sakuma.delete()){
						System.out.println("削除に成功しました");
						}else{
							System.out.println("拡張子ないファイルは何故か消せないんです。申し訳ない");
						}
					}
				// break;
			} // else if(num == 5)
			else if (num == 100) {
				System.out.println("さようなら.....");
				System.exit(0);
				// 終了コードを書く
				// break;
			}
			/*
			 * else if(num == 101){
			 *
			 * }//else if(num == 101) /*else{
			 * System.out.println("指定された数字を入力してください!"); }//else
			 */
		} catch (Exception e) {
			System.out.println("ちょっと何言ってるかわかりません");

		} // catch
		System.out.println(" ");
		System.out.println("すべての処理が完了しました。お疲れーっす");
		System.out.println("まだ続けるつもりなら　１を、終了するなら０を入力してね");
		try{
		BufferedReader bbr = new BufferedReader(new InputStreamReader(System.in));
		int concon;
		String con = bbr.readLine();
		concon = Integer.parseInt(con);
		if(concon == 0){
			System.out.println("OK、お別れだね。さようなら");
			break;
		}else if(concon == 1){
			System.out.println("まだ物足りないんだね、OK");
		}
		}catch(Exception e){
			System.out.println("ちょっと何言ってるかわかりません");
		}
		}
		System.exit(0);
	}

		// void
		// main(String[]
		// args)
}
