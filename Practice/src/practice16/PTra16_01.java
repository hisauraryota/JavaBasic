package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 */
public class PTra16_01 {
    public static void main(String[] args)  {

        /*
        * ★ java.util.Dateクラスを使って、自分の生年月日を「YYYY年MM月DD日」形式で出力してください
        *  ※　他の標準クラスも使って良いです
        */
    	Date birthday = new Date(96,2,9);

    	SimpleDateFormat f = new SimpleDateFormat("YYYY年MM月dd日");
    	System.out.println(f.format(birthday));



    }
}